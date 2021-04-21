
public class Exam_12 {
	public static void main(String[] ar) {
		int tot = 0;
		for(int i=1; i<=10; ++i) {
			if (i % 2 == 0) {
				tot += i;
			}
		}
		System.out.println("tot = " + tot);
	}
}
