import java.io.*;
public class Exam_06 {
	public static void main(String[] ar) throws IOException {
		if(ar.length !=1) {
			System.out.println("Usage : java Exam_06 �ο���");
			System.exit(0);
		}
		int inwon = Integer.parseInt(ar[0]);
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] name = new String[inwon];
		
		for(int i = 0; i < name.length; ++i) {
			System.out.print(i + "��° ��� �̸� = " );
			name[i] = in.readLine();	
		}
		
		
//		System.out.print("1��° ��� �̸� = " );
//		name[1] = in.readLine();
//		
//		System.out.print("2��° ��� �̸� = " );
//		name[2] = in.readLine();
		
		System.out.println();
		for(int i = 0; i < name.length; ++i) {
			System.out.println(i + "���� ��� �̸� : "+ name[i]);
		}
	}
}
