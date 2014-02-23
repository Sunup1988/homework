package homework1;
import java.util.Scanner;
public class personal_tax {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入15300");
		int n=scanner.nextInt();
		int tax;
		if(n<=500){
			tax=n*5/100;

		}else if(n<=2000){
			tax=(n-500)*10/100+500*5/100;
		}else if(n<=5000){
			tax=(n-2000)*15/100+(2000-500)*10/100+500*5/100;
		}else if(n<=20000){
			tax=(n-5000)*20/100+(5000-2000)*15/100+(2000-500)*10/100+500*5/100;
		}else{
			tax=(n-20000)*25/100+(20000-5000)*20/100+(5000-2000)*15/100+(2000-500)*10/100+500*5/100;
		}
		System.out.println("他该交的所得税是"+tax);
	}

}
