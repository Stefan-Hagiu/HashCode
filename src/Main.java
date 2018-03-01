
public class Main {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.exit(1);
		}
		InputReader.read(args[0]);

    for(i = 0; i < GlobalVariables.numberOfVehicles; i++) {
      Car car = new Car(i);
      while(true){
        int pick = Picker.best(car, GlobalVariables.listOfJobs);
        if(pick == -1) {
          break;
        } else {
          car.schedule(GlobalVariables.listOfJobs[pick])
          GlobalVariables.listOfJobs.remove(pick);
        }
      }
      // print car :)
    }

		OutputWriter.write(args[1]);
	}

}
