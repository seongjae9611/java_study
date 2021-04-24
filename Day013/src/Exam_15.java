class FFFF {
	public void aaa() {
		System.out.println("AAA");
	}
	public void bbb() {
		System.out.println("BBB");
	}
}
class HHHH extends FFFF {
	public void bbb() {
		System.out.println("CCC");
	}
	public void ccc() {
		System.out.println("DDD");
	}
}

public class Exam_15 {
	public static void main(String[] ar) {
		FFFF fp = new FFFF(); //aaa(), bbb()
		HHHH hp = new HHHH(); //aaa(), HHHH.bbb(), ccc()
		hp.aaa();
		hp.bbb();
		hp.ccc();
		FFFF ap = new HHHH(); //aaa(), HHHH.bbb()
		ap.aaa();
		ap.bbb();
	}
}
