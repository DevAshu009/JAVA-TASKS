import java.util.Scanner;

class Game{

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int MyNumber = ((int)(Math.random()*100));
        int UserNumber;
        boolean User = false;
        int count = 1;
        do
         {
           System.out.print("Guess Number(1-100):");
           UserNumber = sc.nextInt();
            if(UserNumber == MyNumber){
                System.out.println("Congratulation..... U GUESS CORRECT NUMBER :\t STEP : " + count);
                User = true;

            }
            else if(UserNumber > MyNumber){
                System.out.println("Your Number is to large.");
            }
            else{
                System.out.println("Your Number is to small.");
            }

           count++;
         } while(UserNumber >= 0 && User == false);
        
    }
}