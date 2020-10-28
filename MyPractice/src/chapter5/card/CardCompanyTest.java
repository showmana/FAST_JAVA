package chapter5.card;

public class CardCompanyTest {
	public static void main(String[] args) {
		
//		System.out.println(CardCompany.getInstance());

		CardCompany samsung = CardCompany.getInstance();  	// �̱��� ����
		CardCompany lg = CardCompany.getInstance();
//		System.out.println(CardCompany.getInstance());
		
		Card myCard = samsung.createCard();  // �޼ҵ忡�� Card ���� 
		Card yourCard = lg.createCard();
		
		System.out.println(myCard.getCardNumber());  //10001 ���
		System.out.println(yourCard.getCardNumber());  //10002 ���
		
		
		myCard.say_nick("fool");
		
		
	}
}