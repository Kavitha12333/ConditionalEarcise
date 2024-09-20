package Exercise;
//write a java pragram that takes three numbers from the user and prints the gratest number
// input the 1st number:25 second number:78 third number:87
// expect:the greatest:87
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
   Scanner kushi=new Scanner(System.in);
 
 System.out.print("enter num1:");
   int num1=kushi.nextInt(); 
   System.out.print("enter num2:");
   int num2=kushi.nextInt(); 
   System.out.print("enter num3:");
   int num3=kushi.nextInt(); 

   if(num1>num2 && num1>num3){
    
    System.out.println("the gratest:"+num1);
   } 
  else if(num2>num1 && num2>num3){
    
    System.out.println("the gratest:"+num2);
   }  
   else if(num3>num1 && num3>num2){
    
    System.out.println("the gratest:"+num3);
   } 
    }
    
}
