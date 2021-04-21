import java.io.*;
public class Exam_06 {
	public static void main(String[] ar) throws IOException {
		if(ar.length !=1) {
			System.out.println("Usage : java Exam_06 인원수");
			System.exit(0);
		}
		int inwon = Integer.parseInt(ar[0]);
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] name = new String[inwon];
		
		for(int i = 0; i < name.length; ++i) {
			System.out.print(i + "번째 사람 이름 = " );
			name[i] = in.readLine();	
		}
		
		
//		System.out.print("1번째 사람 이름 = " );
//		name[1] = in.readLine();
//		
//		System.out.print("2번째 사람 이름 = " );
//		name[2] = in.readLine();
		
		System.out.println();
		for(int i = 0; i < name.length; ++i) {
			System.out.println(i + "번쨰 사람 이름 : "+ name[i]);
		}
	}
}
