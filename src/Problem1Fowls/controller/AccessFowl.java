package Problem1Fowls.controller;

import Problem1Fowls.model.ComputeFowl;

public class AccessFowl extends ComputeFowl {
    public static void main(String[] args) {
        System.out.println("The many ways to buy with 100 yuan: ");

        ComputeFowl fowl = new ComputeFowl();
        fowl.compute();
    }
}
