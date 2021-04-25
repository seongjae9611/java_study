import java.util.*;
import java.text.*;
class AAA extends Thread {
	public void run() {
		while(true) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
			Date d = new Date();
			String str = format.format(d);
			System.out.println("현재시간 : " + str);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
}
public class Exam_03 {
	public static void main(String[] ar) {
		System.out.println("Main Start");
		AAA ap = new AAA();
		ap.setDaemon(true);
		ap.start();
		try {
			ap.join(5000);
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		System.out.println("Main End");
	}
}
