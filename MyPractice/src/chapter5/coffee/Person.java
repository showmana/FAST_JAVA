package chapter5.coffee;

public class Person {

//	객체 간 협력 - 출근길 커피 사기
//	아침 출근길에 김 졸려 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다.
//	이 피곤 씨는 콩다방에서 4,500원을 내고 라떼를 사 마셨습니다.
//	객체 간의 협력 강의를 참고하여 객체 지향 방법으로 구현해 보세요.

//	
//	Person,
//	
//	커피숍
//	-별다방, 콩다방
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
			System.out.println(name + " 님이 " + money + " 으로 " + message);
		}

	}

	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.brewing(4500);
		if (message != null) {
			this.setMoney(this.getMoney() - money);
			System.out.println(name + " 님이 " + money + " 으로 " + message);
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}