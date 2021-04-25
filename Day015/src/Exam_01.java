class A extends Thread { //���ϻ��
	public void run() { //main method �̴�.
		System.out.println("A");
	}
}
class B extends Thread {
	public void run() { //main method �̴�.
		System.out.println("B");
	}
}

class C extends Object implements Runnable { //���߻��
	public void run() { //main method �̴�.
		System.out.println("C");
	}
}


public class Exam_01 {
	public static void main(String[] ar) {
		System.out.println("main Start");
		A ap = new A();
		B bp = new B();
		C cp = new C();
		
		
//		ap.run();  //method ȣ��
//		bp.run();  //method ȣ��
		Thread th = new Thread(cp);
		
		ap.start(); //Thread ȣ�� <-�غ� �� �� ������ ���� ������ ����� (�ϳ��� �����Ϳ��� �������� �۾��ϴ� �� ó�� ���� �� ����) 
		bp.start(); //Thread ȣ�� <- �غ� �� �� ������ ���� ������ ����� (�ϳ��� �����Ϳ��� �������� �۾��ϴ� �� ó�� ���� �� ����)
		th.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.print(i);
			if (i%10 == 0) System.out.println();
			else System.out.print("\t");
		}
		
	}
}
