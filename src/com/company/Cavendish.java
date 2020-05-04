package com.company;

public class Cavendish extends Banana {

    public Cavendish(double weight, int ripeness, String sort, double kiloPrice) {
        super(weight, ripeness, sort, kiloPrice);
    }

    @Override
    public double shelfLife() {
        int ripe = 10;
        return ripe - getRipeness();
    }

    @Override
    public double fullPrice() {
        if (getWeight() > 0.2)
            return getKiloPrice() * this.shelfLife() * 0.95;

        return getKiloPrice() * this.shelfLife();
    }

}
