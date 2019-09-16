package com.company;

public abstract class DrumFactory {
    protected abstract DrumSet buildSet(String modelName);

    protected void orderSet(DrumSet model) {
        System.out.println("Pack the " + model.getClass().getSimpleName() + " drum set");
        System.out.println("Ship out " + model.getClass().getSimpleName() + "!");
    }
}