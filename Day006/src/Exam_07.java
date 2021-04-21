import java.io.*;
public class Exam_07 {
	public static void main(String[] ar) throws IOException {
//		int su1 = 0;
		char su1 = 0;
		
		System.out.print("su1 = ");
//		su1 = System.in.read() - 48;
		su1 = (char)System.in.read();
		
		switch(su1) {
		case '0' : System.out.println("당신은 서울 출생이시군요"); break;
		case '1' : System.out.println("당신은 경기, 인천 출생이시군요"); break;
		case '9' : System.out.println("당신은 제주도 출생이시군요"); break;
		
		default : System.out.println("잘못 입력하셨습니다."); //else
		}
	}
}

