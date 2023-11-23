package com.tarnished.armory.data;

public enum Endpoint {
    ALL("all"),
    AMMO("ammo"),
    ARMAMENTS("armaments"),
    ARMOR("armor"),
    ASHES_OF_WAR("ashes-of-war"),
    BOLSTERING_MATERIALS("bolstering-materials"),
    CORRECTION_ATTACK("correction-attack"),
    CORRECTION_GRAPH("correction-graph"),
    CRAFTING_MATERIALS("crafting-materials"),
    GESTURES("gestures"),
    INFO("info"),
    KEYS("keys"),
    REINFORCEMENTS("reinforcements"),
    SHOP("shop"),
    SPELLS("spells"),
    SPIRIT_ASHES("spirit-ashes"),
    TALISMANS("talismans"),
    TOOLS("tools");

    private final String displayName;
    Endpoint(String displayName) {

        this.displayName = displayName;
    }

    public String displayName() { return displayName; }
}
