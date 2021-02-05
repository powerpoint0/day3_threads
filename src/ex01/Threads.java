
public class Threads implements Runnable{
	EggHen eghen;
	Thread thread;
	private String word;
	private int count;

	Threads(String word, int count, EggHen eggHen){
		thread = new Thread(this, word);
		this.word = word;
		this.count = count;
		this.eghen = eggHen;
		thread.start();
	}

	@Override
	public void run() {
		if (thread.getName().compareTo("Egg") == 0) {
			for (int i = 1; i <= count; i++) {
				eghen.egg(true);
				eghen.egg(false);
			}
		}
		else {
			for (int i = 1; i <= count; i++) eghen.hen(true);
				eghen.hen(false);
		}
	}

}