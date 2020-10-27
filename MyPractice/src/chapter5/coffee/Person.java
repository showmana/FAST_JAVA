package chapter5.coffee;

public class Person {

//	��ü �� ���� - ��ٱ� Ŀ�� ���
//	��ħ ��ٱ濡 �� ���� ���� 4,000���� ���� ���ٹ濡�� �Ƹ޸�ī�븦 �� ���̽��ϴ�.
//	�� �ǰ� ���� ��ٹ濡�� 4,500���� ���� �󶼸� �� ���̽��ϴ�.
//	��ü ���� ���� ���Ǹ� �����Ͽ� ��ü ���� ������� ������ ������.

	
	
	
//	1. ��� ���� ����
//	��� ��ü�� �̸��� �����Ѵ�.
	private String name;
//	��� ��ü�� ���� ���� �ִ�.	
	private int money;

// 2. ������ �����
//	������ ��� ��ü�� 2���� ������ �޾Ƽ� �����Ѵ�.
//	a. �̸��� �޴´�.
//	b. ���� �޴´�.
	public Person(String name, int money) {
		this.name = name;
		this.setMoney(money);
	}

//	3. �޼ҵ� �����
//	a. ��� ��ü���� ��ŸĿ�ǿ� ��Ŀ�ǿ��� Ŀ�Ǹ� �� �� �ִ�.

	//	��. ��ŸĿ�ǿ��� Ŀ�Ǹ� �� ���� buyStarCoffee �޼ҵ带 ȣ���ϴµ�
	//  ��. �� �� StarCoffe Ÿ���� sCoffee, �׸��� money�� �ʿ���Ѵ�.
	//	��. money�� 4000�� ��, ��ŸĿ�� �Ƹ޸�ī�밡 �ֹ��ǰ�	
	
	
	
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