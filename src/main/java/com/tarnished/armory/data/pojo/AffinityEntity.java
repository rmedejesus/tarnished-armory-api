package com.tarnished.armory.data.pojo;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Data
public class AffinityEntity {

    @SerializedName("correction_attack_id")
    public Long correctionAttackId;
    @SerializedName("correction_calc_id")
    public Map<String, Long> correctionCalcId;
    @SerializedName("damage")
    public Map<String, Long> damage;
    @SerializedName("full_hex_id")
    public String fullHexId;
    @SerializedName("guard")
    public Map<String, Long> guard;
    @SerializedName("id")
    public Long id;
    @SerializedName("reinforcement_id")
    public Long reinforcementId;
    @SerializedName("resistance")
    public Map<String, Long> resistance;
    @SerializedName("scaling")
    public Map<String, Double> scaling;
    @SerializedName("status_effect_overlay")
    public List<Map<String, Long>> statusEffectOverlay;
    @SerializedName("status_effects")
    public Map<String, Long> statusEffects;
}
