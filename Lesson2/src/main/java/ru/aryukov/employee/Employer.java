package ru.aryukov.employee;

import ru.aryukov.stationery.AbstractStationery;

import java.util.ArrayList;

/**
 * Created by olega on 18.01.17.
 */
public class Employer {
    private String deparment;
    private String name;
    private ArrayList<AbstractStationery> noviceSet;

    public Employer(String department, String name, ArrayList<AbstractStationery> set){
        this.deparment = department;
        this.name = name;
        this.noviceSet = set;
    }

    public String getDeparment() {
        return deparment;
    }

    public String getName() {
        return name;
    }

    public ArrayList<AbstractStationery> getNoviceSet() {
        return noviceSet;
    }

    public void addStationery(AbstractStationery something){
        if(something!=null) {
            noviceSet.add(something);
        }else {
            System.out.println("Please choose real thing");
        }
    }
}
