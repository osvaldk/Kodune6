package com.company;

public class SystemTest {

    public static void main(String[] args) {

        Banana b1 = new Indian(0.3, 9, "Wild", 3.95, 17);
        Banana b2 = new Cavendish(0.1, 8, "Cavendish", 1.05);
        Banana b3 = new Indian(0.2, 7, "Wild", 3.95, 10);
        Banana b4 = new Cavendish(0.6, 6, "Cavendish", 1.05);
        Banana b5 = new Indian(0.05, 5, "Wild", 3.95, 5);
        Banana b6 = new Indian(0.23, 4, "Wild", 3.95, 15);
        Banana b7 = new Cavendish(0.26, 3, "Cavendish", 1.05);
        Banana b8 = new Indian(0.24, 2, "Wild", 3.95, 25);
        Banana b9 = new Indian(0.18, 5, "Wild", 3.95, 26);
        Banana b10 = new Indian(0.31, 6, "Wild", 3.95, 45);

        Banana [] collection = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};

        for (Banana b : collection) {
            System.out.println(b);
            if (b instanceof Indian)
                System.out.println("Curve: " + ((Indian)b).getCurve() + "°");
        }

    }
}
