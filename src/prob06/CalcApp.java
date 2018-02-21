package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int operand[] = new int[2];

		while (true) {
			System.out.print(">>");
			String expression = scanner.next();
			if(expression.equals("quit")) {
				break;
			}
			String tmpOperand = "";
			char operator = 0;

			for (int i = 0; i < expression.length(); i++) {
				if(expression.charAt(i) >= 48 && expression.charAt(i) <= 57) {
					tmpOperand += expression.charAt(i);
				} else {
					operand[0] = Integer.parseInt(tmpOperand);
					tmpOperand = "";
					operator = expression.charAt(i);
				}
			}
			
			operand[1] = Integer.parseInt(tmpOperand);
			System.out.print(">>");
			switch (operator) {
			case '+':
				Add add = new Add();
				add.setValue(operand[0], operand[1]);
				System.out.println(add.calculate());
				break;
			case '-':
				Sub sub = new Sub();
				sub.setValue(operand[0], operand[1]);
				System.out.println(sub.calculate());
				break;
			case '*':
				Mul mul = new Mul();
				mul.setValue(operand[0], operand[1]);
				System.out.println(mul.calculate());
				break;
			case '/':
				Div div = new Div();
				div.setValue(operand[0], operand[1]);
				System.out.println(div.calculate());
				break;
			}
			
		}

	}

}
