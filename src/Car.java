public class Car {

  public int intex;
  public int time;
  public int posx;
  public int posy;
  public ArrayList<JobDataStructure> orders;

	public Car(_index) {
    this.index = _index;
		this.posx = 0;
		this.posy = 0;
		this.time = 0;
	}

  public schedule(JobDataStructure r) {
    int arrivalT = this.time + Math.abs(this.posx - r.startingX) + Math.abs(this.posy - r.startingY);
    int destinationT = Math.max(arrivalT, r.earliestStart) + r.totalDistance;
    this.posx = r.finishX;
    this.posy = r.finishY;
    this.time = destinationT;
    orders.add(r);
  }

  public printOrders() {
    // orders???
  }

}
