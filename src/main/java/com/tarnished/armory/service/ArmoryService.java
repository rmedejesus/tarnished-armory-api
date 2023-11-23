package com.tarnished.armory.service;

import com.tarnished.armory.data.dto.ArmoryDto;
import com.tarnished.armory.repository.ArmoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArmoryService implements IArmoryService {
    @Autowired
    private ArmoryRepository repository;

    @Override
    public ArmoryDto getArmory(String endPoint, String name, String version) {
        return repository.getArmory(endPoint, name, version);
    }

    @Override
    public ArmoryDto[] getArmories(String endPoint, String version) {
        return repository.getArmories(endPoint, version).toArray(new ArmoryDto[0]);
    }
}
