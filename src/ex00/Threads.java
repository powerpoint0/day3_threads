public class Threads extends Thread {
	private String word;
	private int count;

	Threads(String word, int count){
		this.word = word;
		this.count = count;
	}

	@Override
	public void run() {
		for (int i = 1; i <= count ; i++) {
			System.out.println(word);
			try {
				sleep(10);
			} catch (Exception e) {}
		}
	}
}
