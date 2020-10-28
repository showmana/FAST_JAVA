package chapter5.card;

public class CardCompany {

	// CardCompany는 instance 객체를 기본으로 가지고 있다.
	// 이 인스턴스는 private static이다. (외부접근이 불가능하고 static 즉, 정적 값이라는 것)
	
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}         //

	// getInstance()로 값을 가져올 수 있다.
	public static CardCompany getInstance() {
		if( instance == null )
			instance = new CardCompany();
		return instance;
	}// instance 값이 null이면 CardCompany의 instance를 하나 새롭게 생성한다.(존재유무 확인용 메소드라고 볼 수 있음.)
	// null이 아니면 당연히 instance를 그대로 반환해 줌.	


	// CardCompany는 Card 타입을 반환하는 createCard() 메소드를 가지고 있다.
	// 이 함수는 Card타입 객체를 하나 생성하고 반환한다.
	
	public Card createCard() {
		
		Card card = new Card();
		return card;		
	}
	
	
}