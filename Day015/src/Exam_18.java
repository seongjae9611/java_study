
public class Exam_18 {
	public static void main(String[] ar) throws Exception {
		String str = new String("Hello Java");
		char a = str.charAt(6); //Ư�� ��ġ ��° ���� ���
		System.out.println("a =" + a);
		
		boolean b = str.endsWith("v");
		System.out.println("b =" + b);
		
		boolean c = str.equalsIgnoreCase("hello java"); //��ҹ��� ���� ����
		System.out.println("c =" + c);
		
		byte[] d = str.getBytes("ISO8859_1");
		for(int i = 0; i < d.length; ++i) {
			System.out.print((char)d[i] + "\t");
		}
		System.out.println();
		System.out.println("o�� ��ġ = " + str.indexOf("o")); //0������ ���ڸ� ��
		System.out.println("���� ���� = " + str.length()); //���� ����, 0������ ���ڸ� ��
		boolean e = str.startsWith("h"); //��ҹ��� ������
		System.out.println("e =" + e);
		
		System.out.println("6~10 = " + str.substring(6,10));
		System.out.println(str.toUpperCase()); //���� �빮�� �����
		
		String str1 = "            sadfasdf          ";
//		System.out.println("    asdf asdf asdf a    sdd d      ".trim());
		System.out.println(str1.trim()); // ù ���۶��� ����
		
		String str2 = "ABCD";
		str2.substring(2,3);
		System.out.println(str2);
		
		
		
		StringBuffer str3 = new StringBuffer("ABCD"); //��Ʈ�� ���۴� �ڱ� �ڽ��� ��ȭ��Ŵ
		str3.append("E"); 
		System.out.println(str3); 
	}
}
