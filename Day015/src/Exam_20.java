import java.util.*;

public class Exam_20 {
	public static void main(String[] ar) {
//		String str = "aaa,bbb,ccc,ddd,eee,fff:ggg:hhh:iii";
		String str = "aaa@bbb.com";
//		StringTokenizer stk = new StringTokenizer(str, ",:");
		StringTokenizer stk = new StringTokenizer(str, "@.:");
		
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}
}
