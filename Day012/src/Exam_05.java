class Inner3 {
	public void aaa() {
		System.out.println("aaa");	
	}
	public void bbb() {
		System.out.println("bbb");	
	}
	public void ccc() {
		System.out.println("ccc");	
	}
}

public class Exam_05 {
	public static void main(String[] ar) {
		final int x = 100;
		Inner3 in = new Inner3() {
			public void bbb() {
				System.out.println("x = " + x);
				System.out.println("ddd");
				ddd();
			}
			public void ddd() {
				System.out.println("ddd");
			}
		};
		in.aaa();
		in.bbb();
		in.ccc();
	}
}
