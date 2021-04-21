import java.io.*;
public class Exam_05 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int su1 = 0, su2= 0, su3 = 0;
		
		System.out.print("su1 = ");
		su1 = Integer.parseInt(in.readLine());
		System.out.print("su2 = ");
		su2 = Integer.parseInt(in.readLine());
		System.out.print("su3 = ");
		su3 = Integer.parseInt(in.readLine());
		
		if(su2 >= su1 && su2 >= su3) {
			int imsi = su1;
			su1 = su2;
			su2 = imsi;
		}
		else if (su3 >= su1 && su3 >= su2) {
			int imsi = su1;
			su1 = su3;
			su3 = imsi;
		}
		
		if(su3 > su2) {
			int imsi = su2;
			su2 = su3;
			su3 = imsi;
		}
		System.out.println(su1 + ">=" + su2 + ">=" + su3);
	}
}
