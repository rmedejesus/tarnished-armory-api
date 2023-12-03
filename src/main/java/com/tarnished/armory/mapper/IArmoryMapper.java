package com.tarnished.armory.mapper;

import com.tarnished.armory.data.dto.ArmoryDto;
import com.tarnished.armory.data.pojo.ArmoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface IArmoryMapper {
    IArmoryMapper INSTANCE = Mappers.getMapper(IArmoryMapper.class);
    ArmoryDto entityToDto(ArmoryEntity armory);
    List<ArmoryDto> entityToDto(List<ArmoryEntity> armory);
}
