package homework1;
import java.util.Scanner;
public class Zhongjiang {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ����");
		int a=scanner.nextInt();
		int b=a%10;
		if(b==2||b==4){
			System.out.println("��ϲ����һ�Ƚ�");
		}else if(b==3||b==5||b==7){
			System.out.println("��ϲ���ж��Ƚ�");
		}else {
				System.out.println("лл���������´�����");
			}
		}
	}


