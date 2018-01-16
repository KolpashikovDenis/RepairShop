package ru.denis.javafast.repairshop.equipment;

public class Reducer {
    private boolean isShaftBroken;
    private boolean isBearingBroken;
    private boolean isImpellerBroken;

    private int nRepairLabor;

    public boolean isShaftBroken() {
        return isShaftBroken;
    }

    public void setShaftRepair(boolean shaftRepair) {
        isShaftBroken = !shaftRepair;
    }

    public boolean isBearingBroken() {
        return isBearingBroken;
    }

    public void setBearingRepair(boolean bearingRepair) {
        isBearingBroken = !bearingRepair;
    }

    public boolean isImpellerBroken() {
        return isImpellerBroken;
    }

    public void setImpellerRepair(boolean impellerRepair) {
        isImpellerBroken = !impellerRepair;
    }

    public Reducer(boolean isShaftBroken, boolean isBearingBroken, boolean isImpellerBroken) {

        this.isShaftBroken = isShaftBroken;
        this.isBearingBroken = isBearingBroken;
        this.isImpellerBroken = isImpellerBroken;
    }
}
