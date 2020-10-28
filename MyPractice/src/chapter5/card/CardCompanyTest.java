package chapter5.card;

public class CardCompanyTest {
	public static void main(String[] args) {
		
//		System.out.println(CardCompany.getInstance());

		CardCompany samsung = CardCompany.getInstance();  	// 싱글톤 패턴
		CardCompany lg = CardCompany.getInstance();
//		System.out.println(CardCompany.getInstance());
		
		Card myCard = samsung.createCard();  // 메소드에서 Card 생성 
		Card yourCard = lg.createCard();
		
		System.out.println(myCard.getCardNumber());  //10001 출력
		System.out.println(yourCard.getCardNumber());  //10002 출력
		
		
		myCard.say_nick("fool");
		
		
	}
}