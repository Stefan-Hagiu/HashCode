import java.util.ArrayList;

public class Picker {

  public boolean wasBonus;

  public Picker(){
  }

	public int best(Car car, ArrayList<JobDataStructure> rides) {
		double max = 0;
		int pick = -1;
		double score = 0;
		for (int rideIndex = 0; rideIndex < rides.size(); rideIndex++) {
			score = gain(car, GlobalVariables.listOfJobs.get(rideIndex));
			if (score > max) {
				max = score;
				pick = rideIndex;
			}
		}
    this.wasBonus = max > 1;
		return pick;
	}

	public double gain(Car car, JobDataStructure ride) {
		int arrivalT, destinationT;
		double score = 0;

		arrivalT = car.time + Math.abs(car.posx - ride.startingX) + Math.abs(car.posy - ride.startingY);
		destinationT = Math.max(arrivalT, ride.earliestStart) + ride.totalDistance;
		if (destinationT > ride.latestFinish) {
			return 0;
		}
		if (arrivalT <= ride.earliestStart) {
			score = GlobalVariables.bonus;
		}
		score = score + ride.totalDistance;
		return score / (destinationT - car.time);
	}

}
