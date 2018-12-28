import java.io.*;
import java.util.*;
class Arthematic
{
public static void main(String args[])
     { 
       Scanner input=new Scanner(System.in);
       System.out.println("a=");
       int a=input.nextInt();
       System.out.println("n=");
       int n=input.nextInt();
       System.out.println("d=");
       int d=input.nextInt();
       int l=(n*d)+a-1;
       int sum=((a+l)*n)/2;
       System.out.println("the arthematic progression is"+sum);
      }
}
