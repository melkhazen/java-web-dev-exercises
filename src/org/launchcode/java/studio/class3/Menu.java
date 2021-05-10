package org.launchcode.java.studio.class3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    public static ArrayList<String> menuItems = new ArrayList<>(Arrays.asList("Meat Loaf", "Broccoli", "cake"));
    public static ArrayList<String> description = new ArrayList<>(Arrays.asList("meat and veggies", "stemmed veggies", "chocolate cake"));
    public static ArrayList<Double> price = new ArrayList<>(Arrays.asList(9.0, 7.0, 3.0));
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

    public static void addItems(){
        Scanner input = new Scanner(System.in);
        System.out.println("do you want to add an item?");
        String answer = input.nextLine();
        if (answer.equals("yes")){
            System.out.println("Enter an item: ");
            String item = input.nextLine();
            menuItems.add(item);
            System.out.println("Enter a description: ");
            String descript = input.nextLine();
            description.add(descript);
            System.out.println("Enter a price: ");
            Double priceing = input.nextDouble();
            price.add(priceing);
            System.out.println("Enter a category: ");
            String catgry = input.nextLine();
            category.add(catgry);
            input.close();
            Menu.printMenu();
        }else {
            Menu.printMenu();
        }
    }

    public static ArrayList<String> getMenuItems() {
        return menuItems;
    }

    public static ArrayList<Double> getPrice() {
        return price;
    }

    public static ArrayList<String> getCategory() {
        return category;
    }

    public static ArrayList<String> getDescription() {
        return description;
    }

    public static SimpleDateFormat getUpdate() {
        return update;
    }

    public static void setMenuItems(ArrayList<String> menuItems) {
        Menu.menuItems = menuItems;
    }

    public static void setPrice(ArrayList<Double> price) {
        Menu.price = price;
    }

    public static void setDate(Date date) {
        Menu.date = date;
    }

    public static void setCategory(ArrayList<String> category) {
        Menu.category = category;
    }

    public static void setDescription(ArrayList<String> description) {
        Menu.description = description;
    }

    public static void setUpdate(SimpleDateFormat update) {
        Menu.update = update;
    }
}
