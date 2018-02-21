package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1076.2);
		double millionWon = CurrencyConverter.toKRW(100);
		double millionDollar = CurrencyConverter.toDollar(1000000);
		
		System.out.println("실행결과");
		System.out.println("백만원은 " + millionDollar + "입니다." );
		System.out.println("백달러은 " + millionWon + "입니다." );
	}

}
