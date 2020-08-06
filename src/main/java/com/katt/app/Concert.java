package com.katt.app;

import java.util.Random;

public abstract class Concert {
    private Band mainBand;
    private Band warmUpBand;
    private int capacity;
    private Style style;
    private double duration;
    private int ticketPrice;
    private int beerPrice;
    protected static final Random RANDOM = new Random();
    protected int soldTickets;

    public Concert(Band mainBand) {
        this.mainBand = mainBand;
        this.style = mainBand.getStyle();
        this.warmUpBand = mainBand.getWarmUpBand();
        this.ticketPrice = calculateTicketPrice();
    }

    public int calculateTicketPrice(){
        return RANDOM.nextInt(3001)+12000;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setBeerPrice(int beerPrice) {
        this.beerPrice = beerPrice;
    }

    public int calculateSoldTickets(){
        int percentage = RANDOM.nextInt(11)+70;
        if (RANDOM.nextInt(5) != 0) return capacity;
        return capacity/100*percentage;
    }

    public int calculateTicketIncome(){
        return soldTickets*ticketPrice;
    }

    public int calculateBarIncome(){
        int pints = (int) (duration*2);
        return soldTickets*pints*beerPrice;
    }

}
