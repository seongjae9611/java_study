import java.util.*;
abstract class ABCD {
	public abstract void disp();
}
class AB extends ABCD {
	public void disp() {
		System.out.println("AB");
	}
}
class CD extends ABCD {
	public void disp() {
		System.out.println("CD");
	}
}

public class Exam_13 {
	public static void main(String[] ar) {
		AB a = new AB();
		CD b = new CD();
		//String c = new String("C");
		
		HashSet hs = new HashSet();
		hs.add(a);
		hs.add(b);
		//hs.add(c);
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			ABCD obj = (ABCD)it.next();
			obj.disp();
		}
	}
}
