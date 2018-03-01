import java.util.Scanner;

public class InputReader {

	public static void read(String fileName) {
		Scanner sc = new Scanner(fileName);

		GlobalVariables.maxX = sc.nextInt();
		GlobalVariables.maxY = sc.nextInt();
		GlobalVariables.numberOfVehicles = sc.nextInt();
		GlobalVariables.numberOfJobs = sc.nextInt();
		GlobalVariables.bonus = sc.nextInt();
		GlobalVariables.totalSteps = sc.nextInt();

		for (int i = 0; i < GlobalVariables.numberOfJobs; i++) {
			GlobalVariables.listOfJobs.add(new JobDataStructure(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
					sc.nextInt(), sc.nextInt(), i));
		}
	}

}
