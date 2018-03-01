import java.util.ArrayList;

public class Picker {

  public static int best(Car car, ArrayList<JobDataStructure> rides) {
    int max = -1;
    int pick = -1;
    for(rideIndex = 0; rideIndex < rides.size(); rideIndex++)
    {
      score = gain(car, rides[rideIndex]);
      if(score > max)
      {
        max = score;
        pick = rideIndex;
      }
    }
    return pick;
  }

  gain(Car car, JobDataStructure ride)
  {
    int arrivalT = car.time + Math.abs(car.posx - ride.startingX) + Math.abs(car.posy - ride.startingY);
    destinationT = Math.max(arrivalT, ride.earliestStart) + ride.totalDistance;
    if(destinationT > ride.latestFinish)
    {
      return 0;
    }
    if(arrivalT <= ride.earliestStart)
    {
      score = GlobalVariables.bonus;
    }
    score = score + ride.totalDistance;
    return score / (destinationT - car.time);
  }

}
