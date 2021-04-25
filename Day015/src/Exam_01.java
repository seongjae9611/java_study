class A extends Thread { //단일상속
	public void run() { //main method 이다.
		System.out.println("A");
	}
}
class B extends Thread {
	public void run() { //main method 이다.
		System.out.println("B");
	}
}

class C extends Object implements Runnable { //다중상속
	public void run() { //main method 이다.
		System.out.println("C");
	}
}


public class Exam_01 {
	public static void main(String[] ar) {
		System.out.println("main Start");
		A ap = new A();
		B bp = new B();
		C cp = new C();
		
		
//		ap.run();  //method 호출
//		bp.run();  //method 호출
		Thread th = new Thread(cp);
		
		ap.start(); //Thread 호출 <-준비가 다 된 시점에 실행 별개로 진행됨 (하나의 데이터에서 여러개의 작업하는 것 처럼 보일 수 있음) 
		bp.start(); //Thread 호출 <- 준비가 다 된 시점에 실행 별개로 진행됨 (하나의 데이터에서 여러개의 작업하는 것 처럼 보일 수 있음)
		th.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.print(i);
			if (i%10 == 0) System.out.println();
			else System.out.print("\t");
		}
		
	}
}
