package com.tarnished.armory.data.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public record LocationDto(
        String summary
) { }
