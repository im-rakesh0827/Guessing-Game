import java.util.Scanner;
public class Project{
    public static void main(String arg[]){
        int myNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int guessNumber=0;
        do{
            System.out.print("Guess a number (1-100) : ");
            guessNumber = sc.nextInt();
            if(myNumber==guessNumber){
                System.out.println("\nWOOHOO : Correct Number @Winner ");
                break;
            }else if(guessNumber>myNumber){
                System.out.println("Your number is too large : ");
            }else if(guessNumber<myNumber && guessNumber>0){
                System.out.println("Your number is too small : ");
            }else if(guessNumber<0){
                System.out.println("You Missed : ");
            }
        }while(guessNumber>=0);
        System.out.println("My Number : "+myNumber);
    }
    
}
