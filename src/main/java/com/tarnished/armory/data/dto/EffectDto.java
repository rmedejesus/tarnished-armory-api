package com.tarnished.armory.data.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public record EffectDto(
        String attribute,
        Double value,
        String model,
        String type,
        String[] conditions,
        Double valuePvp,
        Double tickInterval
) { }
