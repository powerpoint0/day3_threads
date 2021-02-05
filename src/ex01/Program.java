
public class Program {
	public static void main(String[] args) {
		int count = 0;

		try {
			if (args.length != 1)
				throw new  RuntimeException(" Invalid input ");
			String countCheck = args[0].substring(0, 8);
			if (!countCheck.equals("--count="))
				throw new  RuntimeException(" Invalid input ");
			count = Integer.parseInt(args[0].substring(8));
		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
			System.exit(-1);
		}

		EggHen eggHen = new EggHen();
		Threads thread1 = new Threads("Egg", count, eggHen);
		Threads thread2 = new Threads("Hen", count, eggHen);

		try {
			thread1.thread.join();
			thread2.thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
