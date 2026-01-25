
package sortingOne;

import java.util.*;

public class sorting {

    //Selection sort :Repeatedly selects the smallest element from the unsorted part and moves it to the front.
    public static void selectionSort(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int min = i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    //Bubble Sort: Repeatedly swaps adjacent elements if they are in the wrong order, bubbling the largest to the end
    public static void  bubbleSort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int flag = 0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }

    //Insertion Sort: Builds the sorted array one element at a time by inserting each element into its correct position.
    public static void insertionSort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

   // Merge Sort: Divides the array into halves, sorts them recursively, and merges the sorted halves
    public static void merge(int arr[],int low ,int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left<=mid && right<=high) {
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }
        while (arr[left]<=mid) {
            temp.add(arr[left++]);
        }
        while (arr[right]<=high) {
            temp.add(arr[right++]);
        }

        //again copy
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }

    public static void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    //Quick Sort: Picks a pivot, partitions the array around it, and recursively sorts the partitions.
    public static int partition(int arr[],int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low; j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
        }
        return i+1;
    }
    public static void quickSort(int arr[],int low , int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    //main function
    public static void main(String[] args) {
        int arr[] = {1,12,34,24,5};


        //for printing values after sort
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
