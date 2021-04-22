import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exam_18 {
	public static void main(String[] ar) throws IOException {
		if(ar.length !=2) {
			System.err.println("Usage : java Exam_13 ���ǰ���, ���� ����");
			System.exit(0);
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(ar[0]); //��
		int num1 = Integer.parseInt(ar[1]); //��
		String[][]name = new String[num][num1];
		
		while(true) {
			System.out.print("1.���� 2.��� 3.��ü���� 4.���� = ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if ( x== 1) {
				int a = 0;
				int b = 0;
				do {
					System.out.print("�� ���� ���� = ");
					a = Integer.parseInt(in.readLine());
				} while( a < 0 || a >= num);
				
				do {
					System.out.print("��� �濡 ���� = ");
					b = Integer.parseInt(in.readLine());
				} while( b < 0 || b >= num1);
				System.out.print("������ �̸� = ");
				name[a][b] = in.readLine();
			}
			else if (x == 2) {
				int a = 0;
				int b = 0;
				do {
					System.out.print("�� ������ ��� = ");
					a = Integer.parseInt(in.readLine());
				} while( a < 0 || a >= num);
				do {
					System.out.print("��� �濡�� ��� = ");
					b = Integer.parseInt(in.readLine());
				} while( b < 0 || b >= num || name[a][b] == null);
				name[a][b] = null;
				
			}
			else if (x == 3) {
				for(int j = 0; j <name.length; ++j) {
					System.out.println(j + "��");
					for(int i = 0; i<name[j].length; ++i) {
						System.out.print(i + "���� ������ : " + name[j][i]);
						if(i % 3 == 2) System.out.println();
						else System.out.print("\t");
					}
					System.out.println();
				}	
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
