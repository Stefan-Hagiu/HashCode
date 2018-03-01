
public class JobDataStructure {
	public int startingX, startingY;
	public int finishX, finishY;
	public int earliestStart;
	public int latestStart;
	public int latestFinish;
	public int totalDistance;
	public int isDoable;

	public JobDataStructure(int _startingX, int _startingY, int _finishX, int _finishY, int _earliestStart,
			int _latestFinish) {
		startingX = _startingX;
		startingY = _startingY;
		finishX = _finishX;
		finishY = _finishY;
		earliestStart = _earliestStart;
		latestFinish = _latestFinish;
		isDoable = 1;

		totalDistance = Math.abs(startingX - finishX) + Math.abs(startingY - finishY);
		if (totalDistance > latestFinish - earliestStart) {
			isDoable = 0;
		}
		latestStart = latestFinish - totalDistance;
	}
}
