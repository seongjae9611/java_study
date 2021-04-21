import java.io.*;
public class Exam_08 {
	public static void main(String[] ar) throws IOException {
		int su = 0;
		int year = 0;
		String str = "";
		
		
		System.out.print("주민번호의 7번째 자리 = ");
		su = System.in.read() - 48;
		
		switch(su) {
		case 9 : case 0 : year = 1800; break;
		case 1 : case 2 : year = 1900; break;
		case 3 : case 4 : year = 2000; break;
		default : year = -1;
		}
		
		switch(su % 2) {
		case 0: str = "여성"; break;
		case 1: str = "남성"; break;
		}
		
		
		if(year == -1) {
			System.out.println("잘못 입력 하셨습니다.");
		}
		else {
			System.out.println("당신은 " + year + "년대 " + str +"이십니다.");
		}
	}
}
