package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Banana {
    private double weight;
    private int ripeness;
    private String sort;
    private double kiloPrice;

    public Banana(double weight, int ripeness, String sort, double kiloPrice) {
        this.weight = weight;
        this.ripeness = ripeness;
        this.sort = sort;
        this.kiloPrice = kiloPrice;
    }

    public double getWeight() {
        return weight;
    }

    public int getRipeness() {
        return ripeness;
    }

    public String getSort() {
        return sort;
    }

    public double getKiloPrice() {
        return kiloPrice;
    }

    public abstract double shelfLife();

    public abstract double fullPrice();

    @Override
    public String toString() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return "Banana{" +
                "weight=" + weight +
                ", ripeness=" + ripeness +
                ", sort='" + sort + '\'' +
                ", kiloPrice=" + kiloPrice +
                ", the shelf life of the bananas is " + shelfLife() + " days" +
                " and the total cost is " + formatter.format(fullPrice())+ "€" +
                '}';
    }
}
