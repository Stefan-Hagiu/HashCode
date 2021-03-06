import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.exit(1);
		}
		InputReader.read(args[0] + ".in");

		try {
			OutputWriter.out = new PrintWriter(args[0] + ".out");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < GlobalVariables.numberOfVehicles; i++) {
			Car car = new Car(i);
			while (true) {
				int pick = Picker.best(car, GlobalVariables.listOfJobs);
				if (pick == -1) {
					break;
				} else {
					car.schedule(GlobalVariables.listOfJobs.get(pick));
					GlobalVariables.listOfJobs.remove(pick);
				}
			}
			OutputWriter.write(car.orders);
		}

		OutputWriter.out.close();
	}

}
