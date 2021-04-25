class AA extends Thread {
	public void run() {
		System.out.println("\nAA Start");
		System.out.println("count =" + Thread.activeCount());
		System.out.println("cur Thread = " + Thread.currentThread());
		Thread[] th = new Thread[2]; 
		Thread.enumerate(th);
		for(int i = 0; i<th.length; ++i) {
			System.out.println("ii = " + th[i]);
		}
		
		System.out.println("AA end \n");
	}
}

public class Exam_02 {
	public static void main(String[] ar) {
		System.out.println("main Start");
		int x = Thread.activeCount();
		System.out.println("count = " + x);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException ee) {}
//		System.out.println("cur Thread = " + Thread.currentThread());
		AA ap = new AA();
		ap.setPriority(Thread.MIN_PRIORITY);
		ap.setDaemon(true);
		ap.start();
//		ap.interrupt();
//		Thread.currentThread().interrupt();
		
		
		for (int i = 0; i < 100; ++i) {
			System.out.print("i = " + i);
			if (i % 10 == 0) System.out.println();
			else System.out.print("\t");
		}
	}
}
