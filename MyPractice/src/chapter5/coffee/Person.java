package chapter5.coffee;

public class Person {

//	객체 간 협력 - 출근길 커피 사기
//	아침 출근길에 김 졸려 씨는 4,000원을 내고 별다방에서 아메리카노를 사 마셨습니다.
//	이 피곤 씨는 콩다방에서 4,500원을 내고 라떼를 사 마셨습니다.
//	객체 간의 협력 강의를 참고하여 객체 지향 방법으로 구현해 보세요.

	
	
	
//	1. 멤버 변수 선언
//	사람 객체는 이름이 존재한다.
	private String name;
//	사람 객체는 돈을 갖고 있다.	
	private int money;

// 2. 생성자 만들기
//	각각의 사람 객체는 2개의 생성자 받아서 생성한다.
//	a. 이름을 받는다.
//	b. 돈을 받는다.
	public Person(String name, int money) {
		this.name = name;
		this.setMoney(money);
	}

//	3. 메소드 만들기
//	a. 사람 객체들은 스타커피와 빈커피에서 커피를 살 수 있다.

	//	ㄱ. 스타커피에서 커피를 살 때는 buyStarCoffee 메소드를 호출하는데
	//  ㄴ. 이 때 StarCoffe 타입의 sCoffee, 그리고 money를 필요로한다.
	//	ㄷ. money가 4000일 때, 스타커피 아메리카노가 주문되고	
	
	
	
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