package com.directi.training.ocp.exercise;

public abstract class Ressource {
    private int ressouceID;
    public abstract void markSlotFree(int resourceId);
    public abstract void markSlotBusy(int resourceId);
    public abstract int findFreeSlot();

}
