public class EggHen {
	String state;

	synchronized void egg(boolean running){
		if(!running) {
			state = "Egg";
			notify();
			return;
		}
		System.out.println("Egg");
		state = "Egg";
		notify();
		try {
			while(!state.equals("Hen"))
				wait();
		}
		catch (InterruptedException e) {
			System.out.println("прерывание потока");
		}
	}
	synchronized void hen(boolean running){
		if(!running) {
			state = "Hen";
			notify();
			return;
		}
		System.out.println("Hen");
		state = "Hen";
		notify();
		try {
			while(!state.equals("Egg"))
				wait();
		}
		catch (InterruptedException e) {
			System.out.println("прерывание потока");
		}
	}
}
