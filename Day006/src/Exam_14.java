
public class Exam_14 {
	public static void main(String[] ar) {
//		for(int i = 65; i<=90; ++i) {
//			System.out.print((char)i);
//		}
		for(char i = 'A'; i <= 'Z' ; ++i) {
			System.out.print(i + " : ");
			for(int j = 0;  j < i -65; ++j) {
				System.out.print(" ");
			}
			for(char c = i; c <='Z' - (i-65); ++c) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
