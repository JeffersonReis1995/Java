package princiFib;
import java.util.Scanner;


public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("numero");
		int y=0;
		int x=1;
		int j=0;
		int n =sc.nextInt();
		int count=3;
		
		while (count<=n) {
			 j=y+x;
			 y=x;
			 x=j;
			 
			 count++;
			 int p=sc.nextInt();
			 if( y<p && p<=j) {;
			 System.out.println("Está dentro da sequência:");}
			 else
			 {System.out.println("Não está dentro da sequência");
			 
			}
		}
		sc.close();
	}
	

}
