import java.util.Scanner;
public class guessGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the 'Guess the number' game!");
        int ran_num=(int)(Math.random()*100+1),guess_num,no_of_guesses=0;
        do{
            System.out.println("Enter your guess between 1 to 100:");
            guess_num=sc.nextInt();
            no_of_guesses++;
            if(guess_num<ran_num){
                System.out.println("The number is greater than "+guess_num);
            }
            else if(guess_num>ran_num){
                System.out.println("The number is smaller than "+guess_num);
            }
        }while(guess_num!=ran_num);
        System.out.println("Congratulations! You guessed the number in "+no_of_guesses+" attempts.");
        System.out.println("Thanks for playing!");
        sc.close();
    }
}