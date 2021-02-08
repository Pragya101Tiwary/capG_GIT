import java.util.Scanner;

public class LearningGIT {
	
	private static void gitMethod(int number){
		if(number>0) {
			for(int iter=0; iter<number; iter++) {
				System.out.print("Learning phase: " + iter + "\t");
			}
		}
	}

	public static void main(String[] args) {
		gitMethod(new Scanner(System.in).nextInt());
		
	}
	
}
