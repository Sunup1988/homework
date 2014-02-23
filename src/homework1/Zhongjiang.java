package homework1;
import java.util.Scanner;
public class Zhongjiang {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个数");
		int a=scanner.nextInt();
		int b=a%10;
		if(b==2||b==4){
			System.out.println("恭喜您中一等奖");
		}else if(b==3||b==5||b==7){
			System.out.println("恭喜您中二等奖");
		}else {
				System.out.println("谢谢您，请您下次再来");
			}
		}
	}


