import java.util.*;
public class main {
	public static void main(String[] args){
		int randomNumber = (int)(Math.random()* (21-1)) + 1;
		System.out.println("WELCOME TO THE GAME\n YOU HAVE TO GUESS A NUMBER FROM 1 TO 20\n You only have 3 attempts\n GOOD LUCK!!!!");
		
		int attempts = 3;
		while(true){
			if(attempts == 0){
				System.out.println("YOU LOST, THE NUMBER WAS " + randomNumber);
				break;
			}
			System.out.println("Guess the number:");
			Scanner sc = new Scanner(System.in);
			
			int guess = sc.nextInt();

			if(guess > randomNumber){
				System.out.println("you guessed high");
				attempts--;
			}else if(guess < randomNumber){
				System.out.println("you guessed low");
				attempts--;
			}else{
				System.out.println("YOU GUESSED IT RIGHT, THE NUMBER WAS " + randomNumber);
				break;
			}
		}
	}
}
