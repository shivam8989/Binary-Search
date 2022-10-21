package array;
import java.util.*;
public class binary_search {
    public static int binary_search(int arr[],int key){
        int start = 0 , last = arr.length-1;
        while(start <= last){// only one element
            int mid = (start +last)/2;
            if(arr[mid] == key ){
                return mid;
            }else if(arr[mid]<key){
                start = mid + 1;

            }else{
                last = last - 1 ;
            }

        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr the size of array");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter the elements in array");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element to be searched");
        int n = sc.nextInt();
        int ans  = binary_search(arr,n);
        if(ans == -1){
            System.out.println("Element not found // not present in array");
        }else{
            System.out.println("The element present at index "+ans+","+n);
        }
    }

}