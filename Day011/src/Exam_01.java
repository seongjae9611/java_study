class Exam_01_Sub{
	private int w;
	private int x;
	private int y;
	private int z;
	public Exam_01_Sub() {
		this.w = 0;
		this.x = 100;
		this.y = 200;
		this.z = 300;
	}
	public Exam_01_Sub(int x) {
		this();
		this.x = x;
	}
	public Exam_01_Sub(int x, int y) {
		this(x);
		this.y = y;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void disp() {
		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
	}
}
public class Exam_01 {
	public static void main(String[] ar) {
		Exam_01_Sub es1 = new Exam_01_Sub();
		Exam_01_Sub es2 = new Exam_01_Sub();
		
		es1.setXY(10, 20);
		
//		Exam_01_Sub es = new Exam_01_Sub();
//		es.disp(); // x= 100, y = 200
//		es.setXY(10, 20);
////		es.disp(); // x= 10, y = 20
//		
//		Exam_01_Sub es1 = new Exam_01_Sub(); //x = 100, y = 200
//		Exam_01_Sub es2 = new Exam_01_Sub(10); //x = 10, y = 200
//		Exam_01_Sub es3 = new Exam_01_Sub(20, 30); //x = 20, y = 30
		
		
	}
}
