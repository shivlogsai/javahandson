import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		double a,b,result;
		int Operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Arithmetic calculator program");
		System.out.print("\n");
		System.out.println("Enter the first number");
		a = sc.nextDouble();
		System.out.println("Enter the second number");
		b = sc.nextDouble();
		System.out.println("Enter the operator[1.Addition(+) ; 2.Subtraction(-) ; 3.Multiplication(*) ; 4.Division(/)] :");
		Operator = sc.nextInt();
		
		switch(Operator){
		case 1:
			result = a+b;
			System.out.println(a+"+"+b+"="+result);
			break;
		case 2:
			result = a-b;
			System.out.println(a+"-"+b+"="+result);
			break;
			
		case 3:
			result = a*b;
			System.out.println(a+"*"+b+"="+result);
			break;
			
		case 4:
			result = a/b;
			System.out.println(a+"/"+b+"="+result);
			break;
			
		default:
			System.out.println("Invalid Input");
			break;
			
			
		
		}
		
		
	}

}
