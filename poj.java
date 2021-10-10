import java.util.Scanner;

public class Demo{
    public static void main(string[] args){

    Scanner scan=new Scanner(System.in);
    System.out.print("Enter first number:");
    int no1=scan.nextInt();
    System.out.print("Enter second number:");
    int no2=scan.nextInt();
    scan.close();
    int add=no1+no2;
    System.out.print("output= "+add);
    }
}