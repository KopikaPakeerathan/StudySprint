package studysprint;
import java.util.Scanner;

public class StudySprint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name? ");
		String name= input.nextLine();
		System.out.println("Hello " + name + ",");
		System.out.println("   Welcome to StudySprint!");
		
		System.out.print("How many hours you can study Today? ");
		int studyMinutes = input.nextInt();
		
		System.out.println("What assignment you will work on?");
		String assignmentName = input.nextLine();
		System.out.println("Your study time: "+ studyMinutes + " minutes");
		
		if (studyMinutes>=25) {
			System.out.println("Work on " + assignmentName + "Start with a 25-minute study session.");
			System.out.println("Then take a short break.") ;
		}
		else if (studyMinutes>0) {
			System.out.println("Work on " + assignmentName + "for" + studyMinutes + "minutes");
		}
		else {
			System.out.println("Please enter a study time greater than 0.");
		}
		 
	
	input.Close();
	}

}
