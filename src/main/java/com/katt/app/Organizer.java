package com.katt.app;

public class Organizer {
    private Concert[] concerts = new Concert[10];
    private Band[] bands = new Band[10];

    public Organizer() {
        generateBands();
        generateConcerts();
        generateWarmUpBands();
    }

    public void generateBands(){
        for (int i = 0; i < bands.length; i++) {
            bands[i] = new Band();
        }
    }

    public Band selectBandForStyle(Style style){
        for (Band band: bands) {
            if(band.getStyle().equals(style)) return band;
        }
        return null;
    }

    public void generateWarmUpBands(){
        for (int i = 0; i < bands.length; i++) {
            bands[i].setWarmUpBand(selectBandForStyle(bands[i].getStyle()));
        }
    }



    public void generateConcerts(){
        int randomIndex = Concert.RANDOM.nextInt(bands.length);
        for (int i = 0; i < concerts.length; i++) {
            int randomConcert = Concert.RANDOM.nextInt(3)+1;
            switch (randomConcert) {
                case 1:
                    concerts[i] = new OutdoorConcert(bands[randomIndex]);
                    break;
                case 2:
                    concerts[i] = new Festival(bands[randomIndex]);
                    break;
                case 3:
                    concerts[i] = new IndoorConcert(bands[randomIndex]);
            }
        }
    }

    public int calculateTotalProfit(){
        int totalProfit = 0;
        for (Concert concert: concerts) {
            totalProfit += concert.calculateBarIncome()
                    + (concert.calculateTicketIncome()*0.4);
        }
        return totalProfit;
    }

    public void printTotalProfit(){
        System.out.println(calculateTotalProfit());
    }


}
