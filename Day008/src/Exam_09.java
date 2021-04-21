import java.io.*;
public class Exam_09 {
	public static void main(String[] ar) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		int[] jumin = new int[14];
		
		System.out.print("이름 = ");
		name = in.readLine();
		System.out.print("주민번호 = ");
		for (int i = 0; i < jumin.length; ++i) {
			jumin[i] = System.in.read() - 48;
		}
		
		int hap = 0;
		int cre = 2;
		for(int i = 0; i <= 12; ++i) {
			if(i == 6) continue;
			hap += jumin[i] * cre;
			cre++;
			if (cre == 10) cre = 2;
			
		}
		
//		hap += jumin[0] * 2;
//		hap += jumin[1] * 3;
//		hap += jumin[2] * 4;
//		hap += jumin[3] * 5;
//		hap += jumin[4] * 6;
//		hap += jumin[5] * 7;
//		
//		hap += jumin[7] * 8;
//		hap += jumin[8] * 9;
//		hap += jumin[9] * 2;
//		hap += jumin[10] * 3;
//		hap += jumin[11] * 4;
//		hap += jumin[12] * 5;
		
		float temp = (int)(hap / 11.0f) * 11.0f + 11.0f - hap;
		float temp1 = temp - (int)(temp / 10.0f) * 10.0f;
		if(temp1 == jumin[13]) {
			System.out.println("올바른 주민번호");
		}
		else {
			System.out.println("잘못된 주민번호");
		}
		
		System.out.println();
		System.out.println("name : " + name);
		System.out.print("jumin : ");
		for(int i = 0; i <jumin.length; ++i) {
			if(i == 6) {
				System.out.print("-");
				continue;
			}
			System.out.print(jumin[i]);
		}
	}
}
