
public class Exam_04 {
	public static void main(String[] ar) {	
		Exam_03 ex = new Exam_03();; // x = 10, y = 20
		Exam_03 ex1 = new Exam_03(100); // x = 100, y = 20
		Exam_03 ex2 = new Exam_03(100, 200); //x = 100, y = 200
		
		ex.disp();
		ex1.disp();
		ex2.disp();
	}
}
