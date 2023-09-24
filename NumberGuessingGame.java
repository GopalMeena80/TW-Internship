
import java.util.Scanner;


public class NumberGuessingGame
{
    public static void numbergamecodingPart()
    {
        int count=0;
        System.out.println("You have 5 chance to guess the number");
        for(int i=1; i<=5; i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a guess number between 1 to 100 ");
            int uservalue=sc.nextInt();
            
            int computervalue=(int) (Math.random()*100);
            System.out.println(computervalue);
            
            if(computervalue>uservalue)
            {
                System.out.println("The Guess number is smaller");
            }
            else if(uservalue>computervalue)
            {
                System.out.println("The Guess number is greater");
            }
            else
            {
                System.out.println("OOhhOO!, your Number is correct. You Win the Game!");
                count++;
            }
        }
        System.out.println("Your Score is : "+count+"/5");
    }
    public static void main(String[] args)
    {
        numbergamecodingPart();
    }
}
