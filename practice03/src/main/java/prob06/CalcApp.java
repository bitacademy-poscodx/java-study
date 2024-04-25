package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt( tokens[ 0 ] );
			int rValue = Integer.parseInt( tokens[ 2 ] );
			
			Arith arith = null;
			switch( tokens[ 1 ] ) {
				case "+" : {
					arith = new Add();
					break;
				}
				case "-" : {
					Sub sub = new Sub();
					sub.setValue( lValue, rValue );
					int result = sub.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				case "*" : {
					Mul mul = new Mul();
					mul.setValue( lValue, rValue );
					int result = mul.calculate();
					System.out.println( ">> " + result );
					
					break;					
				}
				case "/" : {
					Div div = new Div();
					div.setValue( lValue, rValue );
					int result = div.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				default :  {
					System.out.println( ">> 알 수 없는 연산입니다.");
				}
			}
			
			if(arith != null) {
				arith.setValue(a, b);
				arith.calculate();
			}
		}
		
		scanner.close();

	}

}
