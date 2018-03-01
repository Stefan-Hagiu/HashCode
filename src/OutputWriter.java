import java.io.PrintWriter;
import java.util.ArrayList;

public class OutputWriter {
	public static PrintWriter out;

	public static void write(ArrayList<JobDataStructure> data) {
		out.write(data.size() + " ");
		for (int i = 0; i < data.size(); i++) {
			out.write(data.get(i).index + " ");
		}
		out.write("\n");
		out.flush();
	}
}
