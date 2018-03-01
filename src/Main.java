import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.exit(1);
		}
		InputReader.read(args[0]);

		try {
			OutputWriter.out = new PrintWriter("output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OutputWriter.write(args[1]);
	}

}
