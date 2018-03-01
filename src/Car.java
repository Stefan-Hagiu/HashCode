import java.util.ArrayList;

public class Car {

	public int index;
	public int time;
	public int posx;
	public int posy;
	public ArrayList<JobDataStructure> orders;

	public Car(int _index) {
		this.index = _index;
		this.posx = 0;
		this.posy = 0;
		this.time = 0;
    this.orders = new ArrayList<JobDataStructure>();
	}

	public void schedule(JobDataStructure r) {
		int arrivalT = this.time + Math.abs(this.posx - r.startingX) + Math.abs(this.posy - r.startingY);
		int destinationT = Math.max(arrivalT, r.earliestStart) + r.totalDistance;
		this.posx = r.finishX;
		this.posy = r.finishY;
		this.time = destinationT;
		orders.add(r);
	}

}
