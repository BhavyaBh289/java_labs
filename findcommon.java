import java.util.Scanner;

public class findcommon {
    public static void main (String[] args){
        int  [] arr1 = getData.getData();
        int  [] arr2 = getData.getData();
        for (int i : arr1){
            for (int j :arr2){
                if (i ==j){
                    System.out.print(i+" ");
                }
            }
        }
    }
}

class getData {
    public static int[] getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre the size of array");
        int size = sc.nextInt();
        System.out.println("enter the elements in your array:");
        int[] arr= new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter "+(i+1)+" element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("numbers are");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " " );
        }
        return arr;
    }
}

