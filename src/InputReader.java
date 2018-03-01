import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class InputReader {

	public static void read(String fileName) {
		try {
			Scanner sc = new Scanner(new File(fileName));

			GlobalVariables.maxX = sc.nextInt();
			GlobalVariables.maxY = sc.nextInt();
			GlobalVariables.numberOfVehicles = sc.nextInt();
			GlobalVariables.numberOfJobs = sc.nextInt();
			GlobalVariables.bonus = sc.nextInt();
			GlobalVariables.totalSteps = sc.nextInt();

			for (int i = 0; i < GlobalVariables.numberOfJobs; i++) {
				GlobalVariables.listOfJobs.add(new JobDataStructure(sc.nextInt(), sc.nextInt(), sc.nextInt(),
						sc.nextInt(), sc.nextInt(), sc.nextInt(), i));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
