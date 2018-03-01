
public class JobDataStructure {
	private int startingX, startingY;
	private int finishX, finishY;
	private int earliestStart;
	private int latestStart;
	private int latestFinish;

	public JobDataStructure(int _startingX, int _startingY, int _finishX, int _finishY, int _earliestStart,
			int _latestFinish) {
		startingX = _startingX;
		startingY = _startingY;
		finishX = _finishX;
		finishY = _finishY;
		earliestStart = _earliestStart;
		latestFinish = _latestFinish;
	}
}
