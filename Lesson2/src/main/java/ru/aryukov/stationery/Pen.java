package ru.aryukov.stationery;

/**
 * Created by olega on 18.01.17.
 */
public class Pen extends AbstractStationery{
    /**
     * Data.
     */
    private int price;
    private String name;

    /**
     * Constructor.
     * @param price
     * @param name
     */
    public Pen(int price, String name){
        this.price = price;
        this.name = name;
    }

    /**
     * Gette for price.
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (price != pen.price) return false;
        return name.equals(pen.name);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "This Pen" +
                " have a price: " + price +
                " and name: '" + name + '\'';
    }
}
