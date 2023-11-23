package com.tarnished.armory.data.pojo;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class EffectEntity {

    @SerializedName("attribute")
    public String attribute;
    @SerializedName("value")
    public Double value;
    @SerializedName("model")
    public String model;
    @SerializedName("type")
    public String type;
    @SerializedName("conditions")
    public List<String> conditions;
    @SerializedName("value_pvp")
    public Double valuePvp;
    @SerializedName("tick_interval")
    public Double tickInterval;
}
