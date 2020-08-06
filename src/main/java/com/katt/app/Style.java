package com.katt.app;

import java.util.Random;

public enum Style {
    JAZZ,
    POP,
    ROCK;
    private static final Random RANDOM = new Random();

    public static Style getRandomStyle() {
        Style[] styles = Style.values();
        return styles[RANDOM.nextInt(styles.length)];
    }
}
