class AA{
	int a = 100;
	int b = 200;
	int c = 300;
	
	void aaa() {
		System.out.println(a + " : " + b + " : " + c);
	}
}

class BB {
	int a = 500;
	char b = 'A';
}

public class Exam_02 {
	public static void main(String[] ar) {
		AA ap = new AA();
		BB bp = new BB();
		System.out.println("ap.a = " + ap.a);
		System.out.println("bp.a = " + bp.a);
		System.out.println("ap.b = " + ap.b);
		System.out.println("ap.c = " + ap.c);
		ap.aaa();
	}
}
