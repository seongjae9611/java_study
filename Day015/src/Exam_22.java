import java.util.*;
public class Exam_22 {
	public static void main(String[] ar) {
//		ArrayList al = new ArrayList();
		ArrayList<Integer> al = new ArrayList();
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		
//		for(int i = 0; i < al.size(); ++i) {
//			Integer a = (Integer)al.get(i);
//			int aa = a.intValue();
//			System.out.println(aa);
//		}
		int sum = 0;
		for(Integer a : al) {
			sum += a;
		}
		System.out.println("sum = " + sum);
		
	}
}
