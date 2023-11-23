package com.tarnished.armory.service;

import com.tarnished.armory.data.dto.ArmoryDto;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public interface IArmoryService {
    public ArmoryDto getArmory(String endPoint, String name, String version) throws ExecutionException, InterruptedException, IOException;
    public ArmoryDto[] getArmories(String endPoint, String version) throws ExecutionException, InterruptedException, IOException;

}
