package chapter5.coffee;

public class Person {

//	��ü �� ���� - ��ٱ� Ŀ�� ���
//	��ħ ��ٱ濡 �� ���� ���� 4,000���� ���� ���ٹ濡�� �Ƹ޸�ī�븦 �� ���̽��ϴ�.
//	�� �ǰ� ���� ��ٹ濡�� 4,500���� ���� �󶼸� �� ���̽��ϴ�.
//	��ü ���� ���� ���Ǹ� �����Ͽ� ��ü ���� ������� ������ ������.

//	
//	Person,
//	
//	Ŀ�Ǽ�
//	-���ٹ�, ��ٹ�
	private String name;
	private int money;

	public Person(String name, int money) {
		this.name = name;
		this.setMoney(money);
	}

	public void buyStarCoffee(StarCoffee sCoffee, int money) {
		String message = sCoffee.brewing(4000);
		if (message != null) {
			this.setMoney(this.getMoney() - money);
			System.out.println(name + " ���� " + money + " ���� " + message);
		}

	}

	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if (message != null) {
			this.setMoney(this.getMoney() - money);
			System.out.println(name + " ���� " + money + " ���� " + message);
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}