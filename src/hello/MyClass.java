package hello;

import java.util.Random;

public class MyClass {
	Random rnd = new Random();
	
	//���� ������ 1000���� �����ִ� �޼ҵ�
	public int coin(int money) {
		money += 1000;
		System.out.println("����� ����? " + money);
		return money;
	}
	
	public int coin2(int money) {
		money += 2000;
		System.out.println("����� ����? " + money);
		return money;
	}
	
	public int coin3(int money) {
		money += 3000;
		System.out.println("����� ����? " + money);
		return money;
	}
	
	public int randomCoin(int money) {
		money += rnd.nextInt(1000)+1;
		System.out.println("����� ����? " + money);
		return money;
	}
}
