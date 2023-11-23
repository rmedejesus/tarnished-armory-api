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
public class ArmoryEntity {

    @SerializedName("full_hex_id")
    public String fullHexId;
    @SerializedName("id")
    public Long id;
    @SerializedName("name")
    public String name;
    @SerializedName("summary")
    public String summary;
    @SerializedName("description")
    public List<String> description;
    @SerializedName("is_tradable")
    public boolean isTradable;
    @SerializedName("price_sold")
    public Long priceSold;
    @SerializedName("rarity")
    public String rarity;
    @SerializedName("icon")
    public Long icon;
    @SerializedName("max_held")
    public Long maxHeld;
    @SerializedName("max_stored")
    public Long maxStored;
    @SerializedName("locations")
    public List<LocationEntity> locations;
    @SerializedName("remarks")
    public List<String> remarks;
    @SerializedName("category")
    public String category;
    @SerializedName("effects")
    public List<EffectEntity> effects;
    @SerializedName("status_effects")
    public Map<String, Long> statusEffects;
    @SerializedName("is_buffable")
    public boolean isBuffable;
    @SerializedName("is_l1_guard")
    public boolean isL1Guard;
    @SerializedName("allow_ash_of_war")
    public boolean allowAshOfWar;
    @SerializedName("attack_attributes")
    public List<String> attackAttributes;
    @SerializedName("behavior_variation_id")
    public Long behaviorVariationId;
    @SerializedName("default_skill_id")
    public Long defaultSkillId;
    @SerializedName("requirements")
    public Map<String, Long> requirements;
    @SerializedName("sp_consumption_rate")
    public Double spConsumptionRate;
    @SerializedName("upgrade_costs")
    public List<Long> upgradeCosts;
    @SerializedName("upgrade_material")
    public String upgradeMaterial;
    @SerializedName("weight")
    public Double weight;
    @SerializedName("affinity")
    public Map<String, AffinityEntity> affinity;
    @SerializedName("absorptions")
    public Map<String, Double> absorptions;
    @SerializedName("altered")
    public String altered;
    @SerializedName("icon_female")
    public Long iconFemale;
    @SerializedName("resistances")
    public Map<String, Long> resistances;
    @SerializedName("default_affinity")
    public String defaultAffinity;
    @SerializedName("possible_affinities")
    public List<String> possibleAffinities;
    @SerializedName("skill_id")
    public Long skillId;
    @SerializedName("hint")
    public String hint;
    @SerializedName("products")
    public List<String> products;
    @SerializedName("fp_cost")
    public Long fpCost;
    @SerializedName("fp_cost_extra")
    public Long fpCostExtra;
    @SerializedName("sp_cost")
    public Long spCost;
    @SerializedName("sp_cost_extra")
    public Long spCostExtra;
    @SerializedName("slots_used")
    public Long slotsUsed;
    @SerializedName("hold_action")
    public String holdAction;
    @SerializedName("is_weapon_buff")
    public boolean isWeaponBuff;
    @SerializedName("is_shield_buff")
    public boolean isShieldBuff;
    @SerializedName("is_horseback_castable")
    public boolean isHorsebackCastable;
    @SerializedName("summon_quantity")
    public Long summonQuantity;
    @SerializedName("abilities")
    public List<String> abilities;
    @SerializedName("summon_name")
    public String summonName;
    @SerializedName("hp_cost")
    public Long hpCost;
    @SerializedName("conflicts")
    public List<String> conflicts;
    @SerializedName("availability")
    public String availability;
    @SerializedName("is_consumed")
    public boolean isConsumed;
    @SerializedName("is_ladder_usable")
    public boolean isLadderUsable;
    @SerializedName("is_horseback_usable")
    public boolean isHorsebackUsable;
    @SerializedName("damage")
    public Map<String, Long> damage;
}
