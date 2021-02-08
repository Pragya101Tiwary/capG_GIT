import java.util.Scanner;

public class LearningGIT {
	
	private static void gitMethod(int number){
		if(number/2==0) {
			for(int iter=0; iter<number; iter+=2) {
				System.out.print("Learning phase: " + iter + "\t");
				System.out.println("Learning phase: " + iter + "\tComplete");
			}
		}
		else
			System.out.println("\n\tWe accept only even numbers.");
	}

	public static void main(String[] args) {
		gitMethod(new Scanner(System.in).nextInt());
		
	}
	// Last comment just to make some changes.
}
