import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner console = new Scanner (System.in);
		
		String choice = console.nextLine();
		
		if (isValid(choice))  {
			int aIChoice = (int) (Math.random()*3);
			int personChoice = getVal (choice);
			System.out.println("You picked "+choice);
			System.out.println("The computer picked "+getAIChoice(aIChoice));
			System.out.println("You "+didPersonWin(personChoice, aIChoice));
		}
		else {
			System.out.println("That is not a valid input!");
		}
		
		console.close();
	}
	
	public static String getAIChoice (int x)  {
		if (x == 0)  {
			return "rock";
		}
		if (x == 1)  {
			return "paper";
		}
		return "scissors";
	}
	public static String didPersonWin (int pChoice, int computerChoice)  {
		if (pChoice == 0)  {
			if (computerChoice != 1)  {
				if (computerChoice != 0)  {
					return "WIN";
				}
				return "Tie";
			}
			return "Loose";
		}
		if (pChoice == 1) {
			if (computerChoice != 2)  {
				if (computerChoice != 1)  {
					return "WIN";
				}
				return "Tie";
			}
			return "Loose";
		}
		if (pChoice == 2)  {
			if (computerChoice != 0)  {
				if (computerChoice !=2)  {
					return "WIN";
				}
				return "Tie";
			}
			return "Loose";
		}
		return "IDK";
	}
	
	public static boolean isValid (String string)  {
		if (string.equalsIgnoreCase ("rock"))  {
			return true;
		}
		if (string.equalsIgnoreCase("paper"))  {
			return true;
		}
		if (string.equalsIgnoreCase("scissors"))  {
			return true;
		}
		return false;
			
	}

	public static int getVal (String string) {
		if (string.equalsIgnoreCase("rock"))  {
			return 0;
		}
		if (string.equalsIgnoreCase("paper"))  {
			return 1;
		}
		else {
			return 2;
		}
		
	}
}