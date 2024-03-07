package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    private Ressource ressource = null;

    public ResourceAllocator(Ressource ressource){
        this.ressource = ressource;
    }

    public int allocate() {
        int resourceId = ressource.findFreeSlot();s
        ressource.markSlotBusy(resourceId);
        return resourceId;
    }
    public void free(int resourceId) {
        ressource.markSlotFree(resourceId);
    }
}
