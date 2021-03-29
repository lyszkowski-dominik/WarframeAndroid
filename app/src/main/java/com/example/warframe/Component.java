package com.example.warframe;

import java.util.List;

public class Component {
    String name;
    List<String> dropFrom;
    String rarity;

    public Component(String name,String rarity, List<String> dropFrom) {
        this.name = name;
        this.dropFrom = dropFrom;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public List<String> getDropFrom() {
        return dropFrom;
    }

    public String getRarity() {
        return rarity;
    }
}
