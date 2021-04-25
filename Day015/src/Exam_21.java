import java.util.*;
public class Exam_21 {
	public static void main(String[] ar) {
//		ArrayList al = new ArrayList();
//		al.add("aaa");
//		al.add("bbb");
//		al.add("ccc");
		
		ArrayList<String> al = new ArrayList();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		
//		for(int i = 0; i < al.size(); ++i) {
//			String imsi = (String)al.get(i);
//			System.out.println(imsi);
//		}
		
//		for(Object o: al) {
//			System.out.println((String)o);
//		}
		
		for(String o : al) {
			System.out.println(o);
		}
		
		String[] str = new String[]{"abc", "def", "ghi"};
		for(String s: str) {
			System.out.println(s);
		}
	}
}
