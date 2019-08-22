import java.util.Scanner;

public class NumberGuessingGame
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				Scanner difficultyInput = new Scanner(System.in);
				Scanner choiceInput = new Scanner(System.in);

				System.out.println("What is your name?");
				String name = userInput.nextLine();

				System.out.println("What range of numbers would you like to guess from?");

				int difficulty = difficultyInput.nextInt();
				int randomNumber = (int) (Math.random() * difficulty);
				System.out.println("Awesome choice! Now try and guess the number I am thinking of");

				int counter = 0;
					{
						counter++;
					}

				boolean stillGuessing = true;

				while (stillGuessing)
					{
						Scanner numberInput = new Scanner(System.in);
						int guess = numberInput.nextInt();

						if (guess > randomNumber)
							{
								System.out.println("That is too high!");
							} else if (guess < randomNumber)
							{
								System.out.println("That is too low!");
							} else
							{
								System.out.println("That is correct!");
								stillGuessing = false;
							}
					}
				System.out.println("Would you like to play again?");
				String choice = choiceInput.nextLine();
				if (choice.equals("Yes"))
					{

					} else if (choice.contentEquals("No"))
					{
						System.out.println("Have a great day!");
					}

			}

	}
