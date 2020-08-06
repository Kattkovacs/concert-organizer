package com.katt.app;

public class OutdoorConcert extends Concert {
    private final int CHANCE_OF_RAIN = 30;
    private boolean canceled;

    public OutdoorConcert(Band mainBand) {
        super(mainBand);
        setCapacity(5000);
        setDuration(2);
        setBeerPrice(800);
        this.canceled = isCanceled();
        this.soldTickets = calculateSoldTickets();
    }

    public boolean isCanceled(){
        return RANDOM.nextInt(100)<CHANCE_OF_RAIN;
    }

    @Override
    public int calculateTicketIncome() {
        if (canceled) return 0;
        return super.calculateTicketIncome();
    }

    @Override
    public int calculateBarIncome() {
        if (canceled) return 0;
        return super.calculateBarIncome();
    }
}
