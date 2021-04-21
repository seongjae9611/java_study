import java.io.*;
public class Exam_04 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2 = 0;
		
		System.out.print("su1 = ");
		su1 = Integer.parseInt(in.readLine());
		System.out.print("su2 = ");
		su2 = Integer.parseInt(in.readLine());
		
		if(su1 > su2) {
			System.out.println("su1 은 su2보다 큰 수입니다.");
		}
		else if (su2 > su1) {
			System.out.println("su2는 su1보다 큰 수 입니다.");
		}
		else
			System.out.println("su1과 su2는 같은 수 입니다.");
	}
}
