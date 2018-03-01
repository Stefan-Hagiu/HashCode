import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputWriter {
	public static void write(String fileName) {
		try {
			PrintWriter out = new PrintWriter(fileName);
			for (int i = 0; i < GlobalVariables.numberOfJobs; i++) {
				out.print(i + " ");
				for (int j = 0; j < Car.orders.size(); j++) {
					out.print(GlobalVariables.listOfJobs.get(Car.orders.get(j)) + " ");
					out.println();
				}
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
