package com.company;

import factories.DWDrumFactory;
import products.DWDesign;

public class Main {

    public static void main(String[] args) {
        DWDrumFactory drumFactory = new DWDrumFactory();

        DrumSet drumSet  = drumFactory.buildSet("Design");
        drumFactory.orderSet(drumSet);
    }
}
