import java.io.*;
public class Exam_13 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] comp = new int[3];
		boolean bool = false;
		for(int i = 0; i < comp.length; ++i) {
			do {
				bool = false;
				comp[i] = (int)(Math.random() * 10);
				for(int j = 0; j < i; ++j) {
					if(comp[i] == comp[j]) bool = true;
				}
			}while(bool);
			System.out.print(comp[i] + "\t");
		}
		
		int[] my = new int[3];
		int count = 0;
		int strike = 0, ball = 0;
		while(true) {
			System.out.print("세개수를 연속적으로 입력 = ");
			for(int i = 0; i < my.length; ++i) {
				my[i] = System.in.read() - 48;
			}
			System.in.read();
			System.in.read();
			for(int i = 0; i<my.length; ++i) {
				for(int j = 0; j < comp.length; ++j) {
					if(my[i] == comp[j]) {
						if(i == j) strike++;
						else ball++;
					}
				}
			}
			count++;
			if(strike == 3) break;	
		}
		System.out.println(count + "번쨰에 맞추셨습니다.");
	}
}
