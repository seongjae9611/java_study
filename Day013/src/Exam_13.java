class AAAA {
	public String toString() {
		return "AAAA";
	}
}
class BBBB {
	public String toString() {
		return "BBBB";
	}
}
public class Exam_13 {
	public static void main(String[] ar) {
		Object[] obj = new Object[2];
		obj[0] = new AAAA();
		obj[1] = new BBBB();
		
		for (int i = 0; i < obj.length; ++i) {
			System.out.println("obj[" + i + "] =" + obj[i]);
		}
	}
}
