import java.util.*;
import java.text.*;
public class Exam_19 {
	public static void main(String[] ar) {
		Date d = new Date();
		System.out.println("d = " + d);
		System.out.println("year = " + d.getYear());
		System.out.println("month = " + d.getMonth() + 1);
		System.out.println("date = " +d.getDate());
		System.out.println("hour = " + d.getHours());
		System.out.println("minute = " + d.getMinutes());
		System.out.println("second = " + d.getSeconds());
		
		System.out.println();
		
		Calendar ca = Calendar.getInstance();
		System.out.println("ca = " + ca);
		System.out.println("year = " + ca.get(Calendar.YEAR));
		System.out.println("month = " + ca.get(Calendar.MONTH));
		System.out.println("date = " + ca.get(Calendar.DAY_OF_MONTH));
		System.out.println("hour = " + ca.get(Calendar.HOUR_OF_DAY));
		System.out.println("minute = " + ca.get(Calendar.MINUTE));
		System.out.println("seocond = " + ca.get(Calendar.SECOND));
		
		System.out.println();
		
		Date dd = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd- HH:mm:ss");
		String str = format.format(dd);
		System.out.println("str = " + str);
	}
}
