package com.DS1.OOP.Extras0;
import java.util.Scanner;

class Items implements Cloneable {
    String[] item;

    Items(String[] item) {
        this.item = item;
    }
    
    public Object clone() throws CloneNotSupportedException {
        Items list = (Items) super.clone();

        list.item = new String[list.item.length];
        for (int i=0; i<list.item.length; i++){
            list.item[i] = this.item[i];
        }
        return list;
    }
    // spaced out the items in the string to string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < item.length; i++) {
            sb.append(item[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

}

class Customer implements Cloneable {
    String name;
    Items item;

    Customer(String name, Items item) {
        this.name = name;
        this.item = item;
    }

    public void setName(String name) {
        this.name = name;
    }

    // get items from the customer
    public Items getItems() {
        return item;
    }
    public Customer clone() throws CloneNotSupportedException {
        Customer obj = (Customer) super.clone();
        obj.item = (Items) item.clone();
        return obj;
    }
    public String toString() {
        return name + " " + item;
    }

}
public class Fclass {
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of items
        String[] itm = new String[n];
        for(int i = 0; i < n; i++){
            itm[i] = sc.next(); // list of items
        }
        var c1 = new Customer("naresh", new Items(itm));
        Customer c2 = c1.clone();
        c2.getItems().item[0] = sc.next();   //Update first item of c2
        c2.setName("suresh"); //Update name of c2
        System.out.println(c1);
        System.out.println(c2);
    }
}
