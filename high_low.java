import java.util.Scanner;


public class high_low{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter the elements in your array:");
        int[] arr= new int[size];
        for(int i=0; i<size; i++){
            System.out.println("enter "+(i+1)+" element:");
            arr[i] = sc.nextInt();
        }
        int high = arr[0];
        int low = arr[0];
        for(int n:arr){
            if (n>high){
                n = high;
            }
            if (n<low){
                n = low;
            }
        }

    }
}
