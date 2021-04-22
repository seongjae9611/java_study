class Exam_02_Sub {
	private String name;
	private double don;
	private static float iyul;
	static {
		iyul = 0.05f;
	}
	public static void setIyul(float iyul) {
		Exam_02_Sub.iyul = iyul;
	}
	
	public Exam_02_Sub(String name, double don, float iyul) {
		this.name = name;
		this.don = don;
		Exam_02_Sub.iyul = iyul;
	}
	public void disp() {
		System.out.println("name : " + this.name);
		System.out.println("don : " + this.don);
		System.out.println("iyul : " + Exam_02_Sub.iyul);
	}
	
}

public class Exam_02 {
	public static void main(String[] ar) {
		Exam_02_Sub es = new Exam_02_Sub("A", 1000.0, 0.07f);
		es.disp();
		System.out.println();
		
		Exam_02_Sub es1 = new Exam_02_Sub("B", 1000.0, 0.03f);
		System.out.println();
		es.disp();
		es1.disp();
		
		Exam_02_Sub es2 = new Exam_02_Sub("C", 1000.0, 0.05f);
		System.out.println();
		es.disp();
		es1.disp();
		es2.disp();
	}
}
