
import java.util.Scanner;


public class ATMInterface 
{
    
    public static void main(String[] args) 
    {
        
        int count=0;
        int currentbalance=50000;
        
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please Choose any one option!");  
            System.out.println("1. Deposit");
            System.out.println("2. Credit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
             
            int a=sc.nextInt();
            
            if(a==1)
            {
                System.out.println("Please Enter Amount!");
                int d=sc.nextInt();
                currentbalance=currentbalance-d;
                System.out.println("Available balance"+currentbalance);
                
                System.out.println("Do you want to continue!");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int e=sc.nextInt();
                if(e==1)
                {
                    count++;
                }
                else
                {
                    System.out.println("Thank You!");
                }
            }
            if(a==2)
            {
                System.out.println("Please Enter Amount!");
                int b=sc.nextInt();
                currentbalance=currentbalance+b;
                System.out.println("Available balance : "+currentbalance);
                
                System.out.println("Do you want to continue!");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int e=sc.nextInt();
                if(e==1)
                {
                    count++;
                }
                else
                {
                    System.out.println("Thank You!");
                }
            }
            if(a==3)
            {
                System.out.println("Available balance : "+currentbalance);
                
                System.out.println("Do you want to continue!");
                System.out.println("1. Yes");
                System.out.println("2. No");
                int e=sc.nextInt();
                if(e==1)
                {
                    count++;
                }
                else
                {
                    System.out.println("Thank You!");
                }
            }
            if(a==4)
            {
                System.out.println("Thank you!");
            }
        }while(count!=0);
    }
}

