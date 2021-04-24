class AA {
	int x = 100;
}
class BB extends AA {
	int y = 200;
}
class CC extends BB {
	BB bp = new BB();
	int z = 300;
	
}

public class Exam_02 {
	public static void main(String[] ar) {
		AA ap = new AA();
		BB bp = new BB();
		CC cp = new CC();
		System.out.println("y = " + cp.z);
		System.out.println("y = " + cp.y);
		System.out.println("x = " + bp.x);
	}
}
