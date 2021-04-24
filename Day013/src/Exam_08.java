class GG {
	public void aaa() {
		System.out.println("GG");
	}
}
class JJ extends GG {
	public void aaa() {
		super.aaa();
		System.out.println("JJ");
	}
}
public class Exam_08 {
	public static void main(String[] ar) {
		GG gp = new GG();
		gp.aaa();
		
		JJ jp = new JJ();
		jp.aaa();
	}
}
