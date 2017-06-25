import java.util.Scanner;
public class Calculate {
	public static void main(String[] arg){
		Scanner read=new Scanner(System.in);
		try{
		Calculate2 calc=new Calculate2();
		String exit="no";
		while(!exit.equals("yes")){
			calc.clearres();
			System.out.println("Enter 1 value");
			int first=Integer.valueOf(read.next());
			System.out.println("Enter 2 value");
			int second=Integer.valueOf(read.next());
			calc.mult(first, second);
			System.out.println("result"+calc.getres());
			System.out.println("do u want exit?");
			exit=read.next();
		
		}
	} finally{read.close();}

	}
}