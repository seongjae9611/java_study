class Exam_03_Sub {
	private final double pi;
	public Exam_03_Sub(double pi) {
		this.pi = 0;
	}
		
	public void setPi (double pi) {
//		this.pi = pi;
	}
	public double getPi() {
		return pi;
	}
}
public class Exam_03 {
	public static void main(String[] ar) {
		Exam_03_Sub es = new Exam_03_Sub(2);
		es.setPi(3.141592);
		System.out.println("pi = " + es.getPi());
		
		final int x = 100;
		System.out.println("x = " + x);
		
	}
}
