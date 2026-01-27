package Arrays.easyArrays;
import java.lang.reflect.Array;
import java.util.*;
public class easyArray {
    //Reverse array
    public static void reverseArray(int arr[],int start,int end){
    while (start < end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
    }
}
    //Print Array
    public static void printArray(int arr[]){
        for(int val : arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    //1. Largest Element
    public static int largestElement(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //2.Second Largest
    public static int secondlargest(int arr[]){
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int secondLar = 0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] != largest){
                secondLar = arr[i];
                break;
            }else{
                secondLar = -1;
            }
        }
        return secondLar;
    }

    //second largest second Approach
    public static int secondLargestsecond(int arr[]){
        int largest = -1;
        int seclar = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                seclar=largest;
                largest = arr[i];
            }
        else if(arr[i]>seclar && arr[i]!=largest){
                seclar=arr[i];
            }
        }
        return seclar;
    }
    //3. Array sorted or not
    public static boolean arraySorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    //4. remove duplicate from sorted array
    public static void removeDuplicate(int arr[]){
        int i=0;
        int j=i+1;
        while (j<arr.length) {
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                int temp = arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }

    //5. left rotate by one place 
    public static void leftRotateOnePlace(int arr[]){
        int first = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
    }

    //6. left rotate by d place
    public static int[] rotateByDPlace(int arr[],int d){
        int n = arr.length;
        if(n==0 && d==0) return arr;

        d = d%n;
        //rotate by left direction in d place
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);

        //rotate by right direction 
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);

        return arr;
    }

    //7. Move zeroes at end
    public static int []moveZeroesAtEnd(int arr[]){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
            if(j==-1) return arr;
            for(int i=j+1;i<arr.length;i++){
                if(arr[i]!=0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
            return arr;
        }

    //8. Missing number
    public static int missingNumber(int arr[]){
        int n = arr.length;
        int s2=0;
        int sum = (n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            s2+=arr[i];
        }
        return sum-s2;
    }

    //9. maximum consecutive ones
    public static int consecutivOnes(int arr[]){
        int max = 0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
            }else{
                max = Math.max(max, count);
                count=0;
            }
        }
        // for case when array ends with 1s
        max = Math.max(max, count);
        return max;
    }

    // 10. Find the number that appears once, and the other numbers twice
    public static int appearOnes(int arr[]){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
    }
}
