package com.katt.app;

public class Festival extends Concert{
    public Festival(Band mainBand) {
        super(mainBand);
        setCapacity(8000);
        setDuration(6);
        setBeerPrice(1000);
        this.soldTickets = calculateSoldTickets();
    }
}
