package ru.denis.javafast.repairshop.CommonClasses;

public class Equipment {
    protected String name;
    protected int costOfRepairs;
    protected boolean isShaftBroken;
    protected boolean isBearingBroken;

    public Equipment(String name){
        this.name = name;
        this.costOfRepairs = 0;
    }
}
