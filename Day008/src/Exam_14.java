import java.io.*;
public class Exam_14 {
	public static void main(String[] ar) throws IOException {
		if(ar.length !=1) {
			System.err.println("Usage : java Exam_13 ���� ����");
			System.exit(0);
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(ar[0]);
		String[] name = new String[num];
		
		while(true) {
			System.out.print("1.���� 2.��� 3.��ü���� 4.���� = ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if ( x== 1) {
				int a = 0;
				do {
					System.out.print("��� �濡 ���� = ");
					a = Integer.parseInt(in.readLine());
				} while( a < 0 || a >= num);
				System.out.print("������ �̸� = ");
				name[a] = in.readLine();
			}
			else if (x == 2) {
				int a = 0;
				do {
					System.out.print("��� �濡�� ��� = ");
					a = Integer.parseInt(in.readLine());
				} while( a < 0 || a >= num || name[a] == null);
				name[a] = null;
				
			}
			else if (x == 3) {
				for(int i = 0; i<name.length; ++i) {
					System.out.print(i + "���� ������ : " + name[i]);
					if(i % 3 == 2) System.out.println();
					else System.out.print("\t");
				}
				System.out.println();
			}
			else if (x == 4) {
				break;
			}
			else {
				System.err.println("�߸� �Է��ϼ̽��ϴ�.");				
			}
			System.out.println();	
		}
		System.out.println("�ý��� ����");
		
	}
}
