
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
			System.out.println("ã�� �� �����ϴ�.");
		}
		
		System.out.println("pi = " + Math.PI);
		
		float f = 3.5f;
		System.out.println(Math.ceil(f));  //�ø�	�� ����
		System.out.println(Math.round(f)); //�ݿø�	����
		System.out.println(Math.floor(f)); //����	��Ƽ������
		
		System.out.println(Math.pow(2, 3)); // 2�� 3��
		
		System.out.println(Math.random()); // 0���� 1������ ���� 1�� �ȳ���
		System.out.println((int) (Math.random() * 11)); //0���� 10������ ���� 11�� �ȳ���
	}
}
