import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Runner myRunner = new Runner();// 
		Student[] classB3 = new Student[10];
		myRunner.fillsStudentArray(classB3);
		// we need a test - did the array fill properly?
		for( int i = 0; i <classB3.length; i++){
			System.out.println("index " + i + " for Student: " + classB3[i].getFullName());
		
		}
		myRunner.pickRandomStudent(classB3);
		

	}
	private void fillsStudentArray(Student[] B3) {
		// when all done we want a student [] with all members of this b3 class --full name is first+last--		
		B3[0] = new Student("J.T. Blankenship");
		B3[1] = new Student("Dylan Ward");
		B3[2] = new Student("Donovan Wright");
		B3[3] = new Student("Jake Glick");
		B3[4] = new Student("James Baker");
		B3[5] = new Student("Heather Schone");
		B3[6] = new Student("Egzona Rexhepi");
		B3[7] = new Student("Connor Figal");
		B3[8] = new Student("Ryan Brooks");
		B3[9] = new Student("Alex Johnston");
		
	}

	private void pickRandomStudent(Student[] B3) {
		while (true){
		for( int i = 0; i <1; i++){
			int index = new Random().nextInt(B3.length);
			Student randomWord = B3[index];
		
			Scanner scanner = new Scanner(System.in);
			
				System.out.println("would you like to randomize? yes or no");
				String question = scanner.nextLine();
				if (question.equals("yes")){
					System.out.println("\n random selection -- " + randomWord.getFullName().split(""));
				}
				if (question.equals("no")){
					System.out.println("BYE!");
					System.exit(0);
				}			
				
					
				}
				
				
			}
			
		
		}
		
	
	}

	


