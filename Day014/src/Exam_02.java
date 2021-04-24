import java.io.*;
abstract class AA {
	private int x;
	public abstract void aaa();
	public void disp() {
		//내용 정의부
	}
}
class BB extends AA{
	public void aaa() {
		System.out.println("BBB");
		
	}
}

class CC extends AA {
	public void aaa() {
		System.out.println("CCC");
	}
}
public class Exam_02 {
	public void main (String[] ar) throws Exception {
		BB bp = new BB();
		CC cp = new CC();
		AA ap= new BB(); // BBB
		AA ap1 = new CC(); // CCC
		
		InputStream is = new FileInputStream(new File("aaa.txt"));
	}
}
