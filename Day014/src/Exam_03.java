interface AAA {
	public static int w = 0;
	public static final int x = 100;
	public final int y = 200;
	public int z = 300;
	public abstract void aaa();
	public void bbb();
	void ccc();
//	void ddd() {} (�������Ǻ� �Ұ���)
	public static class  Inner{
		
	}
	
}
// interface���� ����� final�̰� static�̴�.

public class Exam_03 {
	public static void main(String[] ar) {
//		AAA.w = 10;
//		AAA.x = 10;
//		AAA.y = 10;
//		AAA.z = 10;
//		AAA ap = new AAA();
		System.out.println("w = " + AAA.w);
		System.out.println("x = " + AAA.x);
		System.out.println("y = " + AAA.y);
		System.out.println("z = " + AAA.z);
	}
}
