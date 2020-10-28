package chapter5.card;

public class Card {
//카드 회사가 있다.
//	카드 회사는 유일한 객체이고, 이 회사에서는 카드를 발급하면 항상 고유번호가 자동으로 생성된다.
//	10001부터 시작하여 카드가 생성될 때마다 10002, 10003 식으로 증가된다.
//	다음 코드가 수행되도록 Card 클래스와 CardCompany 클래스를 구현하라. => CardCompanyTest
	
//	외부에서 접근할 수 없는 int타입 cardNumber를 멤버 변수로 가진다.
//	외부에서 접근할 수 없는 정적변수 int타입 serialNum를 멤버 변수로 가진다.
	private int cardNumber;
	private static int serialNum = 10000;
	
//	접근제한자가 없고(defalt), constructor가 없는 Card() 생성자 정의.
//	생성되는 즉시 serialNum값이 1증가.
	
	Card() {
		serialNum++;
		setCardNumber(serialNum);
	}

//	getCardNumber() 메소드를 호출해서 cardNumber의 값을 외부에서 호출할 수 있다.
	public int getCardNumber() {
		return cardNumber;
	}

//	setCardNumber함수에 serialNum값을 던저줌. => 해당 Card 객체의 CardNumber값에 serialNum값이 입력된다.
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void say_nick(String nick) {
		if("fool".equals(nick)) {
			return;
		}
		System.out.println("나의 별명은 " + nick + " 입니다.");
	}
}