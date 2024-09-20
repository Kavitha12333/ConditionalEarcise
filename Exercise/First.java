package Exercise;
//write a java progaram to get a number from the user and print whether it is positive or negative
// input number:35;
// expect:number in positive
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
      Scanner kavi=new Scanner(System.in);
      System.out.print("enter number:");//this is optional
      int input=kavi.nextInt();
      if(input>0){
        System.out.println("number is positive");
      } 
      else if(input<0){
        System.out.println("number is negative");
      }
      else{
        System.out.println("non");
      }
    }
    
}
