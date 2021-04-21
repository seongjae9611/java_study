
public class Exam_02 {
	public static void view_star(int x, int y) {
		for (int j = 0; j < y; ++j) {
			for(int i = 0; i < x; ++i)
				System.out.print("*");
		}
		System.out.println("*");
	}
	public static void main(String[] ar) {
		view_star(2, 5);
		System.out.println("나성재");
		view_star(3, 3);
		view_star(2, 10);
		System.out.println("다성재");
		System.out.println("라성재");
		view_star(4, 7);
	}
}
