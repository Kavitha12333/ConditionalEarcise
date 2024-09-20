package Exercise;
//write a java program that reads a floating-point number and prints "zoro"
//if the number is zero.otherwise,print"positive" or"negative".add "small"if 
//the absolute value of the number is less than1,or "large" if it exeeds 1,000,000.
//input:25 
import java.util.Scanner;
public class Third {
 Scanner in =new Scanner(System.in);
double input=in.nextDouble();
if(input>0){
    if(input<1){
        System.out.println("positive small number");
    }
    else if(input>10000000){
        System.out.println("positive large number");
    }
    else
    {
        System.out.println("Positive number");
    }
}
else if (input < 0)
{
    if (Math.abs(input) < 1)
    {
        System.out.println("Negative small number");
    }
    else if (Math.abs(input) > 1000000)
    {
        System.out.println("Negative large number");
    }
    else
    {
        System.out.println("Negative number");
}
}