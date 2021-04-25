
public class Exam_18 {
	public static void main(String[] ar) throws Exception {
		String str = new String("Hello Java");
		char a = str.charAt(6); //특정 위치 번째 문자 출력
		System.out.println("a =" + a);
		
		boolean b = str.endsWith("v");
		System.out.println("b =" + b);
		
		boolean c = str.equalsIgnoreCase("hello java"); //대소문자 구분 무시
		System.out.println("c =" + c);
		
		byte[] d = str.getBytes("ISO8859_1");
		for(int i = 0; i < d.length; ++i) {
			System.out.print((char)d[i] + "\t");
		}
		System.out.println();
		System.out.println("o의 위치 = " + str.indexOf("o")); //0번부터 숫자를 샘
		System.out.println("문자 개수 = " + str.length()); //띄어쓰기 포함, 0번부터 숫자를 샘
		boolean e = str.startsWith("h"); //대소문자 구분함
		System.out.println("e =" + e);
		
		System.out.println("6~10 = " + str.substring(6,10));
		System.out.println(str.toUpperCase()); //전부 대문자 만들기
		
		String str1 = "            sadfasdf          ";
//		System.out.println("    asdf asdf asdf a    sdd d      ".trim());
		System.out.println(str1.trim()); // 첫 시작띄어쓰기 제거
		
		String str2 = "ABCD";
		str2.substring(2,3);
		System.out.println(str2);
		
		
		
		StringBuffer str3 = new StringBuffer("ABCD"); //스트링 버퍼는 자기 자신을 변화시킴
		str3.append("E"); 
		System.out.println(str3); 
	}
}
