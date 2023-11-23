package com.tarnished.armory.repository;

import com.google.gson.*;
import com.tarnished.armory.data.Endpoint;
import com.tarnished.armory.data.dto.ArmoryDto;
import com.tarnished.armory.data.pojo.ArmoryEntity;
import com.tarnished.armory.mapper.IArmoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.server.ResponseStatusException;

import java.io.*;
import java.util.*;


@Repository
public class ArmoryRepository {

    @Autowired
    private ResourceLoader resourceLoader;

    public ArmoryDto getArmory(String endPoint, String name, String version) {

        ArmoryEntity entity = null;

        var endPointValue = Arrays.stream(Endpoint.values())
                .filter(e -> e.name().equalsIgnoreCase(endPoint))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Endpoint Not Found"));

        String collectionName = endPointValue.displayName();
        String filePath = String.format("classpath:static/gamedata/%s/%s.json", version, collectionName);

        String query = name.contains("_") ? name.replaceAll("_", " ") : name;

        Gson gson = new GsonBuilder().serializeNulls().create();

        try {
            final Resource resource = resourceLoader.getResource(filePath);
            Reader reader = new InputStreamReader(resource.getInputStream());

            String data = FileCopyUtils.copyToString(reader);
            JsonElement tree = JsonParser.parseString(data);
            JsonObject document = tree.getAsJsonObject();

            Map<String, JsonElement> entrySet = document.asMap();

            entity = gson.fromJson(entrySet.get(query), ArmoryEntity.class);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Not Found");
        }

        return IArmoryMapper.INSTANCE.entityToDto(entity);
    }

    public List<ArmoryDto> getArmories(String endPoint, String version) {

        List<ArmoryEntity> entities = new ArrayList<>();

        var endPointValue = Arrays.stream(Endpoint.values())
                .filter(e -> e.name().equalsIgnoreCase(endPoint))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Endpoint Not Found"));

        String collectionName = endPointValue.displayName();
        String filePath = String.format("classpath:static/gamedata/%s/%s.json", version, collectionName);

        Gson gson = new GsonBuilder().serializeNulls().create();

        try {
            final Resource resource = resourceLoader.getResource(filePath);
            Reader reader = new InputStreamReader(resource.getInputStream());

            String data = FileCopyUtils.copyToString(reader);

            JsonElement tree = JsonParser.parseString(data);
            JsonObject document = tree.getAsJsonObject();
            for (Map.Entry<String, JsonElement> element : document.entrySet()) {
                ArmoryEntity entity = gson.fromJson(element.getValue().toString(), ArmoryEntity.class);
                entities.add(entity);
            }

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Not Found");
        }

        return IArmoryMapper.INSTANCE.entityToDto(entities);
    }
}
