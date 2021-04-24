class TT {
	protected int x = 100;
	
}
class RR extends TT {
	int y = 300;
}
class WW extends TT {
	int z = 400;
}
public class Exam_12 {
	public static void main(String[] ar) {
		TT rp = new RR();
		System.out.println("rp.x = " + rp.x);
//		System.out.println("rp.y = " + rp.y);
		
		TT wp = new WW();
		System.out.println("wp.x = " + wp.x);
//		System.out.println("wp.x = " + wp.z);
	}
}
