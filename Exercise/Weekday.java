 package Exercise;
 //take a number from the user and generate an integer between 1 and 7 it displays the weekday name
 //input number:3
//  expected:wednesday
import java.util.Scanner;

class Weekday {

    public static void main(String[] args){
Scanner weeak=new Scanner(System.in);
System.out.print("enter number:");
int day=weeak.nextInt();
System.out.println(weeakdays(day));
    }
    public static String weeakdays(int day){
        String dayname="";
        switch(day){
            case 1:dayname="monday";
            break;
            case 2:dayname="tu";
            break;
            case 3:dayname="we";
            break;
            case 4:dayname="thu";
            break;
            case 5:dayname="fri";
            break;
            case 6:dayname="sa";
            break;
            case 7:dayname="sunday";
            break;
            default:dayname="invalid";
        }
        return dayname;

    }
}