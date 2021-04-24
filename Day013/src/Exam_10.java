class OO {
	public void aaa() {
		System.out.println("OO");
	}
}
class PP extends OO {
	public void aaa() {
		System.out.println("PP");
	}
}
public class Exam_10 {
	public void main(String[] ar ) {
		PP pp = new PP();
		pp.aaa();
	}
}
