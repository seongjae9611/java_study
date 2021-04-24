class F {
	protected int x = 100;
	protected int y = 200;
}
class H extends F{
	private int x = 300;
	private int y = 400;
	public void disp() {
		System.out.println("x = " + x);
		System.out.println("y = " + super.y);
	}
}

public class Exam_06 {
	public static void main(String[] ar) {
		H hp = new H();
		hp.disp();
	}
}
