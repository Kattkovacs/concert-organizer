package com.katt.app;

public class IndoorConcert extends Concert{
    public IndoorConcert(Band mainBand) {
        super(mainBand);
        setCapacity(3000);
        setDuration(1.5);
        setBeerPrice(600);
        this.soldTickets = calculateSoldTickets();
    }
}
