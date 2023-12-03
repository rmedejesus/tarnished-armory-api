package com.tarnished.armory.controller;

import com.tarnished.armory.data.dto.ArmoryDto;
import com.tarnished.armory.service.ArmoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/v1")
public class ArmoryController {
    @Autowired
    private ArmoryService service;

    @CrossOrigin()
    @RequestMapping (value="/{endPoint}", method = RequestMethod.GET)
    public ArmoryDto[] getArmories(@PathVariable("endPoint") String endPoint, @RequestParam(name = "version") String version) {

        ArmoryDto[] armories = service.getArmories(endPoint, version);

        if (armories.length > 0) {
            return armories;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Armories Not Found");
        }
    }

    @CrossOrigin()
    @RequestMapping (value="/{endPoint}/{name}", method = RequestMethod.GET)
    public ArmoryDto getArmory(@PathVariable("endPoint") String endPoint, @PathVariable("name") String name, @RequestParam(name = "version") String version) {

        ArmoryDto armory = service.getArmory(endPoint, name, version);

        if (armory != null) {
            return armory;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Armory Not Found");
        }
    }
}
