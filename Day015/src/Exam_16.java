
public class Exam_16 {
	public static void main(String[] ar) {
		Boolean bool1 = new Boolean(false);
		Boolean bool2 = new Boolean("true");
		Boolean bool3 = Boolean.FALSE;
		Boolean bool4 = Boolean.valueOf(false);
		Boolean bool5 = Boolean.valueOf("true");
		
		System.out.println("bool2 = " + bool2.booleanValue());
		
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		
		try {
			Class c1 = Class.forName("Exam_14");
			System.out.println(c1.getMethods());
		}catch(ClassNotFoundException ee) {
			System.out.println("찾을 수 없습니다.");
		}
		
		System.out.println("pi = " + Math.PI);
		
		float f = 3.5f;
		System.out.println(Math.ceil(f));  //올림	롱 정수
		System.out.println(Math.round(f)); //반올림	정수
		System.out.println(Math.floor(f)); //내림	인티저정수
		
		System.out.println(Math.pow(2, 3)); // 2의 3승
		
		System.out.println(Math.random()); // 0에서 1사이의 랜덤 1은 안나옴
		System.out.println((int) (Math.random() * 11)); //0에서 10사이의 랜덤 11은 안나옴
	}
}
