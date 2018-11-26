package builder;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if(args[0].equals("plain")) {
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
		}else {
			usage();
			System.exit(0);
		}
		TextBuilder textbuilder = new TextBuilder();
		Director director = new Director(textbuilder);
		director.construct();
		String result = textbuilder.getResult();
		System.out.println(result);
	}
	public static void usage() {
		System.out.println("Usage: java Main plain");
	}
}
