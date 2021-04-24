class FF {
	private int x;
	private int y;
	public void setXY(int x) {
		this.x = x;
		this.y = 100;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class HH extends FF{
	public void setXY(int x) {
		
	}
}

public class Exam_07 {
	public static void main(String[] ar) {
		FF fp = new FF();
		fp.setXY(100,200);
	}

}
