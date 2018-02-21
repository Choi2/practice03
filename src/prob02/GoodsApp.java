package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		System.out.println("실행 결과 :");
		for(int i = 0; i < COUNT_GOODS; i ++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int stock = scanner.nextInt();
			goods[i] = new Goods(name, price, stock);
		}
		
		for(Goods good : goods) {
			good.show();
		}
		
		scanner.close();
	}
}
