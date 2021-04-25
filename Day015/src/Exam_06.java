class O {
	public void aaa() throws Exception {
		throw new Exception("aaa()");
	}
	public void bbb() throws Exception{
		aaa();
	}
}

public class Exam_06 {
	public static void main(String[] ar) throws Exception {
		O op = new O();
		op.bbb();
	}
}
