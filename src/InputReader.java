import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class InputReader {

	public static void read(String fileName) {
		BufferedReader sc = new BufferedReader(new FileReader(fileName));

		GlobalVariables.maxX = sc.read()
		GlobalVariables.maxY = sc.read();
		GlobalVariables.numberOfVehicles = sc.read();
		GlobalVariables.numberOfJobs = sc.read();
		GlobalVariables.bonus = sc.read();
		GlobalVariables.totalSteps = sc.read();

		for (int i = 0; i < GlobalVariables.numberOfJobs; i++) {
			GlobalVariables.listOfJobs.add(new JobDataStructure(sc.read(), sc.read(), sc.read(), sc.read(),
					sc.read(), sc.read(), i));
		}
	}

}
