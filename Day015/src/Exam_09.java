import java.io.PrintStream;
import java.io.PrintWriter;

class MyException extends Exception {

	public MyException(String s) {
		super(s);
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "my=message : " + super.getMessage();
	}
}

public class Exam_09 {
	public static void main(String[] ar) {
		try {
			throw new MyException("Test ¿¹¿Ü");
		}catch(MyException e) {
			System.out.println("message = " + e.getMessage());
		}
	}
}
