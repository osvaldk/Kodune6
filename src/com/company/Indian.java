package com.company;

public class Indian extends Banana {
    private double curve;


    public Indian(double weight, int ripeness, String sort, double kiloPrice, double curve) {
        super(weight, ripeness, sort, kiloPrice);
        this.curve = curve;
    }

    public void setCurve(double curve) {
        this.curve = curve;
    }

    public double getCurve() {
        return curve;
    }

    @Override
    public double shelfLife() {
        double ripe = 10.0;
        return (ripe - getRipeness()) / 2;
    }

    @Override
    public double fullPrice() {
        if (getWeight() > 0.2)
            return getKiloPrice() * this.shelfLife() * 0.95;

        return getKiloPrice() * this.shelfLife();
    }
}
