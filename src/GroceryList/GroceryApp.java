package GroceryList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GroceryApp {
    private static ArrayList<GroceryItem> dairyList = new ArrayList<>();
    private static ArrayList<GroceryItem> fruitList = new ArrayList<>();
    private static ArrayList<GroceryItem> meatList = new ArrayList<>();
    private static ArrayList<GroceryItem> snackList = new ArrayList<>();
    private static ArrayList<GroceryItem> vegetableList = new ArrayList<>();


    public static void main(String[] args) {

   //call addItem method to prompt user to see if they want to add an item

addItem();

        // allow users to filter results by 1 category

        // allow to edit list of items

        //for edit I would have them pick the category
        //Have them enter a correction amount.
        //for instance if they had 5 beef (in the meat category) and want it to be 2 they would
        //choose meats, enter beef, quantity -3
        //then on all entries i would search for matching name
        //and update the qty accordingly. likewise if they chose meat, added beef 5, it would
        //add 5 to beef and end up with beef 10 in the position

        //change prompt from would you like to add an item, yes or no
        //to would you like to add, edit, or finalize (a/e/f)
        //i didn't like this way, instead, have them pick a category
        //then show items from the category with numbers next to them
        //have them enter the number of the grocery item in the list
        //ask then to renter the name
        //ask them to renter the quantity
        //save in the position that they chose



    }


    private static void finalList () {

        // print out each array list in alphabetical order of category and print the category name as a header
        if(dairyList.size()>0) {
            System.out.println("Dairy");

            // organize list alphabetically by item
            Collections.sort(dairyList, new SortGroceryItemByNameIgnoreCase());
            //print this list
            for (int i = 0; i < dairyList.size(); i++) {
                System.out.printf("\t%-14s %d%n",dairyList.get(i).name,dairyList.get(i).quantity);
            }
        }
        if(fruitList.size()>0) {
            System.out.println("Fruit");
            // organize list alphabetically by item
            Collections.sort(fruitList, new SortGroceryItemByNameIgnoreCase());
            //print this list
            for (int i = 0; i < fruitList.size(); i++) {
                System.out.printf("\t%-14s %d%n",fruitList.get(i).name , fruitList.get(i).quantity);
            }
        }
        if(meatList.size()>0) {
            System.out.println("Meat");
            // organize list alphabetically by item
            Collections.sort(meatList, new SortGroceryItemByNameIgnoreCase());
            //print this list
            for (int i = 0; i < meatList.size(); i++) {
                System.out.printf("\t%-14s %d%n", meatList.get(i).name ,meatList.get(i).quantity);
            }
        }
        if(snackList.size()>0) {
            System.out.println("Snacks");
            // organize list alphabetically by item
            Collections.sort(snackList, new SortGroceryItemByNameIgnoreCase());
            //print this list
            for (int i = 0; i < snackList.size(); i++) {
                System.out.printf("\t%-14s %d%n",snackList.get(i).name , snackList.get(i).quantity);
            }
        }
        if(vegetableList.size()>0) {
            System.out.println("Vegetables");
            // organize list alphabetically by item
            Collections.sort(vegetableList, new SortGroceryItemByNameIgnoreCase());
            //print this list
            for (int i = 0; i < vegetableList.size(); i++) {
                System.out.printf("\t%-14s %d%n",vegetableList.get(i).name ,vegetableList.get(i).quantity);
            }
        }



        // remember to include quantity for each item




    }

    private static void addItem () {
        // prompt if user wants to make a grocery list
        System.out.println("Would you like to add an item to your grocery list? (Y/N)");
        // get user input in a variable
        Scanner scanner = new Scanner(System.in);
        String shouldMakeList = scanner.nextLine();

        // if yes prompt if they would like to enter a new item
        if (shouldMakeList.equalsIgnoreCase("y")) {
            // there should be 3 prompts
            // Given an ordered list of grocery categories to choose from
            System.out.println();
            System.out.println("1. Dairy");
            System.out.println("2. Fruit");
            System.out.println("3. Meat");
            System.out.println("4. Snacks");
            System.out.println("5. Vegetables");

            //get the value entered by the user so we know which category to work with
            System.out.println("Enter an option (1, 2, 3, 4, 5):");
            int groceryCategory = scanner.nextInt();

            //  prompt user to Enter the name of the item.
            System.out.println("Name of grocery item");
            scanner.nextLine();
            //store entered name
            String groceryItemName = scanner.nextLine();
            //  prompt user to Enter how many of the item.
            System.out.println("How many would you like to add to your list?");
            //store entered quantity
            int groceryItemQuantity = scanner.nextInt();
            //we have everything we need to make a grocery item to add to a list, let's make the item
            GroceryItem food = new GroceryItem(groceryItemName, groceryItemQuantity);
            //Which list should i store the food item in
            if (groceryCategory == 1) {
                dairyList.add(food);
            }
            else if (groceryCategory == 2) {
                fruitList.add(food);
            }
            else if (groceryCategory == 3) {
                meatList.add(food);
            }
            else if (groceryCategory == 4) {
                snackList.add(food);
            }
            else if (groceryCategory == 5) {
                vegetableList.add(food);
            }
                addItem();
        }// if no show final list and exit
        else {
            finalList();
            System.out.println("\n\nThank you, goodbye.");
        }







        //arraylist ordering example
//        ArrayList<String> myList = new ArrayList<>();
//        myList.add("Chicken");
//        myList.add("beef");
//        myList.add("Bison");
//        myList.add("Apples");
//        myList.add("Zebra");
//        myList.add("Emu");
//        System.out.println("Not sorted");
//        for(int i=0;i<myList.size();i++)
//        {
//            System.out.println(myList.get(i));
//        }
//
//        Collections.sort(myList, new SortIgnoreCase());
//        System.out.println("Sorted");
//        for(int i=0;i<myList.size();i++)
//        {
//            System.out.println(myList.get(i));
//        }




//
//
//        ArrayList<GroceryItem> myGroceries = new ArrayList<>();
//        GroceryItem g1 = new GroceryItem("grated parmesan",1);
//        GroceryItem g2 = new GroceryItem("zebra", 5);
//        GroceryItem g3 = new GroceryItem("beef",4);
//
//        myGroceries.add(g1);
//        myGroceries.add(g2);
//        myGroceries.add(g3);
//        System.out.println("Not sorted");
//        for(int i = 0;i<myGroceries.size();i++)
//        {
//            System.out.println(myGroceries.get(i).name);
//        }
//
//
//        Collections.sort(myGroceries, new SortGroceryItemByNameIgnoreCase());
//        System.out.println("Sorted");
//        for(int i = 0;i<myGroceries.size();i++)
//        {
//            System.out.println(myGroceries.get(i).name);
//        }













    }

    public static class GroceryItem{
        private String name="";
        private int quantity = 0;
        public GroceryItem(String name, int quantity) {
            //set name to what was sent in
            this.name = name;
            //set quantity
            this.quantity = quantity;
        }

        //return the name of the grocery item we are currently operating on
        public String getName() {
            return name;
        }

        // Set the name for the grocery item but this is not necessary since I set it in the constructor
        public void setName(String c) {
            this.name = c;
        }
        //return the qty we are currently operating on
        public int getQuantity() {
            return quantity;
        }

        // Set the qty of the grocery item
        public void setQuantity(int c) {
            this.quantity = c;
        }

    }
    public static class SortIgnoreCase implements Comparator<Object> {
        public int compare(Object o1, Object o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        }
    }


    public static class SortGroceryItemByNameIgnoreCase implements Comparator<GroceryItem> {
        public int compare(GroceryItem o1, GroceryItem o2) {
            String s1 = (String) o1.name;
            String s2 = (String) o2.name;
            return s1.toLowerCase().compareTo(s2.toLowerCase());
        }
    }
}
