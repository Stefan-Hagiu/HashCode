
public class Main {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.exit(1);
		}
		InputReader.read(args[0]);

		OutputWriter.write(args[1]);
	}

}
