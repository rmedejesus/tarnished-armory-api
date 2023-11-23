package com.tarnished.armory.data.pojo;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class LocationEntity {

    @SerializedName("summary")
    public String summary;
}
