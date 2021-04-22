import java.io.*;
public class Exam_09 {
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private int num;
	private int num1;
	private String[][]name;
	public Exam_09(String floor, String room) {
		in = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(floor); //Ãþ
		num1 = Integer.parseInt(room); //¹æ
		name = new String[num][num1];
	}
	
	public void process() throws IOException {
		while(true) {
			System.out.print("1.Åõ¼÷ 2.Åð½Ç 3.ÀüÃ¼º¸±â 4.Á¾·á = ");
			int x = System.in.read() - 48;
			System.in.read();
			System.in.read();
			if ( x== 1) {
				int a = 0;
				int b = 0;
				do {
					System.out.print("¸î Ãþ¿¡ Åõ¼÷ = ");
					a = Integer.parseInt(in.readLine());
				} while( a < 0 || a >= num);
				
				do {
					System.out.print("¸î¹ø ¹æ¿¡ Åõ¼÷ = ");
					b = Integer.parseInt(in.readLine());
				} while( b < 0 || b >= num1);
				System.out.print("Åõ¼ö°´ ÀÌ¸§ = ");
				name[a][b] = in.readLine();
			}
			else if (x == 2) {
				int a = 0;
				int b = 0;
				do {
					System.out.print("¸î Ãþ¿¡¼­ Åð½Ç = ");
					a = Integer.parseInt(in.readLine());
				} while( a < 0 || a >= num);
				do {
					System.out.print("¸î¹ø ¹æ¿¡¼­ Åð½Ç = ");
					b = Integer.parseInt(in.readLine());
				} while( b < 0 || b >= num || name[a][b] == null);
				name[a][b] = null;
				
			}
			else if (x == 3) {
				for(int j = 0; j <name.length; ++j) {
					System.out.println(j + "Ãþ");
					for(int i = 0; i<name[j].length; ++i) {
						System.out.print(i + "¹ø¹æ Åõ¼÷°´ : " + name[j][i]);
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
				System.err.println("Àß¸ø ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");				
			}
			System.out.println();	
		}
	}
	
	public static void main(String[] ar) throws IOException {
		if(ar.length !=2) {
			System.err.println("Usage : java Exam_13 ÃþÀÇ°³¼ö, ¹æÀÇ °³¼ö");
			System.exit(0);
		}
		
		Exam_09 ex = new Exam_09(ar[0], ar[1]);
		ex.process();
		
		System.out.println("½Ã½ºÅÛ Á¾·á");
		
	}
}
