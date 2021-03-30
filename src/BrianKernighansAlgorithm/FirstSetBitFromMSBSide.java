package BrianKernighansAlgorithm;

import java.util.Scanner;

public class FirstSetBitFromMSBSide {
    public static void main(String ...args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number : ");
        int num = sc.nextInt();
        while(num!=0){
            if(num%2==1){
                count++;
            }
            num/=2;
        }
        System.out.println("No of Set Bits are : "+count);
    }
}
