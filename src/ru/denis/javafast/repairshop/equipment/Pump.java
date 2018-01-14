package ru.denis.javafast.repairshop.equipment;

public class Pump {
    private boolean isShaftBroken;
    private boolean isBearingBroken;
    private boolean isImpellerBroken;

    private int nRepairLabor;

    public Pump(boolean isShaftBroken, boolean isBearingBroken, boolean isImpellerBroken) {
        this.isShaftBroken = isShaftBroken;
        this.isBearingBroken = isBearingBroken;
        this.isImpellerBroken = isImpellerBroken;
    }

    public boolean isShaftBroken() {
        return isShaftBroken;
    }

    public void setShaftBroken(boolean shaftBroken) {
        isShaftBroken = shaftBroken;
    }

    public boolean isBearingBroken() {
        return isBearingBroken;
    }

    public void setBearingBroken(boolean bearingBroken) {
        isBearingBroken = bearingBroken;
    }

    public boolean isImpellerBroken() {
        return isImpellerBroken;
    }

    public void setImpellerBroken(boolean impellerBroken) {
        isImpellerBroken = impellerBroken;
    }
}
