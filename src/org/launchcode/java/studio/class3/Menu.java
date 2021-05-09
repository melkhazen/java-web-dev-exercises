package org.launchcode.java.studio.class3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Menu {

    public static ArrayList<String> menuItems = new ArrayList<>(Arrays.asList("Meat Loaf", "Broccoli", "cake"));
    public static   ArrayList<String> description = new ArrayList<>(Arrays.asList("meat and veggies", "stemmed veggies", "chocolate cake"));
    public static  ArrayList<Double> price = new ArrayList<>(Arrays.asList(9.0, 7.0, 3.0));
    public static ArrayList<String> category = new ArrayList<>(Arrays.asList("main course", "Appetizer", "dessert"));
    public static  SimpleDateFormat update = new SimpleDateFormat("MM/dd/yyyy");
    public static Date date = new Date();
    public static  String updatedDate = update.format(date);


    public Menu(ArrayList<String> menuItems, ArrayList<String> description, ArrayList<Double> price, ArrayList<String> category, String updatedDate) {
        this.menuItems = menuItems;
        this.description = description;
        this.price = price;
        this.category = category;
        this.updatedDate = updatedDate;
    }


    public static void printMenu(){
        for (Integer i = 0; i < menuItems.size(); i++){
            System.out.println("item: " + menuItems.get(i) + " | description: " + description.get(i) + " | price: " + price.get(i) + " | category: " + category.get(i) + " | date: " + updatedDate);
        }
    }

    public static ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public static void setMenuItems(ArrayList<String> menuItems) {
        Menu.menuItems = menuItems;
    }

}
