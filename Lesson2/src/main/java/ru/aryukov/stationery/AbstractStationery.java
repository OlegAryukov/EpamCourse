package ru.aryukov.stationery;

/**
 * Created by olega on 18.01.17.
 */
public abstract class AbstractStationery {
    int price;
    String name;
    public abstract int getPrice();
    public abstract String getName();
}
