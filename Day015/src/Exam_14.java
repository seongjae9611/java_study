import java.util.*;

class EF {
	
}
class GH {
	
}

public class Exam_14 {
	public static void main(String[] ar) {
		EF a = new EF();
		GH b = new GH();
		String c = new String("C");
		
		Hashtable ht = new Hashtable();
		ht.put("EF", a);
		ht.put("GH", b);
		ht.put("ST", c);
		
//		Enumeration enu = ht.elements();
//		while(enu.hasMoreElements()) {
//			Object obj = enu.nextElement();
//			System.out.println("obj = " + obj);
//		}
		
//		Object obj = ht.get("EF");
		
		Enumeration enu = ht.keys();
		while (enu.hasMoreElements()) {
			String name = (String)enu.nextElement();
			Object obj = ht.get(name);
			System.out.println(name + "-->" + obj);
		}
	}
}
