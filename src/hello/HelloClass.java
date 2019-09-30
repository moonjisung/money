package hello;

public class HelloClass {

	public static void main(String[] args) {
		int money = 0;
		
		MyClass mc = new MyClass();
		money = mc.coin(money);
		money = mc.coin2(money);
		money = mc.coin3(money);
		money = mc.randomCoin(money);
		System.out.println("³»µ·Àº ? " + money);
	}
}