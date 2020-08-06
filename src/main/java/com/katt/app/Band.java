package com.katt.app;

import java.util.Random;

public class Band {
    private Band warmUpBand;
    private final String name;
    private Style style;
    private static final String[] bandNames = {"One", "Two", "Three", "Four", "Five"};
    private static final Random RANDOM = new Random();

    public Band() {
        this.name = randomizeBandName();
        this.setStyle(Style.getRandomStyle());
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String randomizeBandName(){
        return bandNames[RANDOM.nextInt(bandNames.length)];
    }

    public Style getStyle() {
        return this.style;
    }

    public Band getWarmUpBand() {
        return warmUpBand;
    }

    public void setWarmUpBand(Band warmUpBand) {
        this.warmUpBand = warmUpBand;
    }
}
