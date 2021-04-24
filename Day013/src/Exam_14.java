class CCCC {
	int x = 100;
	int y = 200;
}
class DDDD extends CCCC {
	int y = 300;
	int z = 400;
}
public class Exam_14 {
	public static void main(String[] ar) {
		CCCC cp = new CCCC();   // x,y 
		DDDD dp = new DDDD();   //x, DDDD.y, z
		System.out.println("dp.x = " + dp.x);
		System.out.println("dp.y = " + dp.y);
		
		CCCC ap = new DDDD();   //x, CCCC.y
		System.out.println("ap.x = " + ap.x);
		System.out.println("ap.y = " + ap.y);
	}
}
