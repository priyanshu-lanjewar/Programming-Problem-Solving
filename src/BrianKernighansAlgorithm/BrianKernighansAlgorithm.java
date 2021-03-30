package BrianKernighansAlgorithm;
import java.util.Scanner;
public class BrianKernighansAlgorithm {
    public static void main(String ...args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number : ");
        int num = sc.nextInt();
        while(num>0){
            num = num & (num-1);
            count++;
        }
        System.out.println("No of Set Bits are : "+count);
    }
}
