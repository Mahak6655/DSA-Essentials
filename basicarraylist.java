package Arraylist;

import java.util.*;
public class basicarraylist {

    //Arraylist Operation
    public static void arrayListOperation(ArrayList<Integer> arraylist){
        
        //Add element - O(1);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);

        //Get element - O(1)
        System.out.println(arraylist.get(2));

        //Remove element - O(n)
        arraylist.remove(2);

        //Set element at index - O(n);
        arraylist.set(2, 10);

        //contains element - O(n) return - true or false
        System.out.println(arraylist.contains(11));
        System.out.println(arraylist.contains(1));

    }

    //Arraylist size
    public static int sizeOfArrayList(ArrayList <Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        return list.size();
    }

    //Arraylist Print
    public static void printArraylist(ArrayList<Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        printArraylist(list);
    }
}