import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
    Picker picker = new Picker();
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

	  ArrayList<Car> cars = new ArrayList<Car>();

		for (int i = 0; i < GlobalVariables.numberOfVehicles; i++) {
			Car car = new Car(i);
      cars.add(car);
    }

    boolean added = true;
    boolean foundbonus = false;
    int carSelector = 0;
    while(added){
      do{
        added = false;
        foundbonus = false;
        for(int i = 0; i < GlobalVariables.numberOfVehicles; i++) {
          while (true) {
				    int pick = picker.best(cars.get(i), GlobalVariables.listOfJobs);
            if(!picker.wasBonus){break;}
				    if (pick == -1) {
					    break;
				    } else {
              added = true;
              foundbonus = true;
					    cars.get(i).schedule(GlobalVariables.listOfJobs.get(pick));
					    GlobalVariables.listOfJobs.remove(pick);
				    }
			    }
        }
      } while(foundbonus);
      for(int i = 0; i < GlobalVariables.numberOfVehicles; i++) {
        if(added){break;}
        while (true) {
		    int pick = picker.best(cars.get(i), GlobalVariables.listOfJobs);
  		    if (pick == -1) {
  			    break;
  		    } else {
            added = true;
  			    cars.get(i).schedule(GlobalVariables.listOfJobs.get(pick));
				    GlobalVariables.listOfJobs.remove(pick);
            break;
			    }
		    }
      }
    }

    for(int i = 0; i < GlobalVariables.numberOfVehicles; i++) {
      OutputWriter.write(cars.get(i).orders);
    }

		OutputWriter.out.close();
	}

}
