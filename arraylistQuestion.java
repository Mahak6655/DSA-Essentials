package Arraylist;

import java.util.*;
public class arraylistQuestion {

    //Conatiner with most water
    public static int storeWater(ArrayList<Integer>height){
        int maxWater =0;
        int lp =0;
        int rp = height.size()-1;

        while (lp<rp) {
            //calculate Water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currentWater = ht*width;
            maxWater = Math.max(maxWater, currentWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    //pair sum 1
    public static boolean pairSum(ArrayList<Integer>list,int t){
        int lp =0;
        int rp = list.size()-1;

        while (lp<rp) {
            if(list.get(lp)+list.get(rp) == t){
                return true;
            }
            else if(list.get(lp)+list.get(rp) < t){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    //pair Sum -2 sorted & rotated array 

    public static boolean pairSum2(ArrayList<Integer>list,int t){
        int breakPoint = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                breakPoint=i;
                break;
            }
        }
        int lp = breakPoint+1; //smallest element
        int rp = breakPoint;

        while (lp!=rp) {
            //case 1 
            if(list.get(lp)+list.get(rp) == t){
                return true;
            }else if(list.get(lp)+list.get(rp) < t){
                lp = (lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list, 24));
    }
}
