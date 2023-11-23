package com.tarnished.armory.data.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;
@JsonInclude(JsonInclude.Include.NON_NULL)
public record AffinityDto(
        Long correctionAttackId,
        Map<String, Long>correctionCalcId,
        Map<String, Long> damage,
        String fullHexId,
        Map<String, Long> guard,
        Long id,
        Long reinforcementId,
        Map<String, Long> resistance,
        Map<String, Double> scaling,
        Map[] statusEffectOverlay,
        Map<String, Long> statusEffects
) { }
