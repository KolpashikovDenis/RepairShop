package ru.denis.javafast.repairshop.equipment;

import ru.denis.javafast.repairshop.CommonClasses.Equipment;

public class Pump extends Equipment{
    private boolean isImpellerBroken;
    private int nRepairLabor;

    public Pump(String name, boolean isShaftBroken, boolean isBearingBroken, boolean isImpellerBroken) {
        super(name);

        this.isShaftBroken = isShaftBroken;
        this.isBearingBroken = isBearingBroken;
        this.isImpellerBroken = isImpellerBroken;
    }

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
}
