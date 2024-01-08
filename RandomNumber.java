import java.util.*;

class RandomNumber
{
    public static void main(String [] args)
    {
       int gameNum;
    do
       {
         Random rand=new Random();
         Scanner sc=new Scanner(System.in);
         int randomNum = rand.nextInt(101);
         int score=5;
         System.out.println("You have 5 chances to guess the number.\nYou can score a maximum of 5 points.");
         System.out.println();
         for(int i=1;i<=5;i++)
         {
             System.out.println("Enter your guess:");
             int guess=sc.nextInt();
             
             if(guess==randomNum)
             { System.out.println("Congratulations! You have guessed correct");
              System.out.println("Your score is"+score);
              break;
            }
             else if(guess<randomNum)
              { System.out.println("Too low, It is a wrong guess");
                System.out.println();
                score--;}
             else
              {
                System.out.println("Too high, It is a wrong guess");
                System.out.println();
                score--;
              }
         }
        if(score==0)
         {System.out.println("You have completed all the chances but could not guess the correct number.\nYour score is 0\nCorrect number is "+randomNum);}

         System.out.println("\nDo you want to play again?\nPress 1 to play again.\nPress 0 to exit.");
         gameNum=sc.nextInt();
        }while(gameNum==1);
    

}
}