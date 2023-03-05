package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

// Prototype pattern
public class Map implements Prototype{

    /*
    *
    *
    * It implements the Prototype interface
    * It demonstrates how the Prototype pattern can be used to create new instances of an object that have the same state as an existing instance, without having to duplicate the code to create the object.
    * The clone() method in the Map class creates a new instance of the Map class and copies the countries list into it. This way, you can create new instances of the Map class that have the same countries list as an existing instance, without having to manually copy the list.
    *
    * */

    // region Prototype Implementation
    private List<String> countries;

    public Map(List<String> countries) {
        this.countries = countries;
    }

    public Map() {
        countries= new ArrayList<>();
    }

    public List<String> getMapList() {
        return countries;
    }

    public  void loadMap() {
        countries.add("Pakistan");
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("Canada");
    }

    public  Object clone() {
        List<String> listOfCountries = new ArrayList<>(this.countries);
        return new Map(listOfCountries);
    }

    // endregion Prototype Implementation
}

class Main
{
    public static void main(String[] args){

        Map maps = new Map(); // Initialize the map
        maps.loadMap();       // Load the map

        Map map1=(Map) maps.clone(); // Clone the map
        Map map2=(Map) maps.clone(); // Clone the map

        List<String> list= map1.getMapList(); // Get the list of countries
        list.add("China");                   // Add a country to the list

        List<String> list2 = map2.getMapList(); // Get the list of countries

        list2.remove("UK"); // Remove a country from the list

        // Print the list of countries

        System.out.println("Map List = "+maps.getMapList());

        // Print the list of countries with addition "China"
        System.out.println("List = "+list);
        // Print the list of countries with removal of "UK"
        System.out.println("List 2 = "+list2);
    }

}