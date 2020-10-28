package chapter5.card;

public class Card {
//ī�� ȸ�簡 �ִ�.
//	ī�� ȸ��� ������ ��ü�̰�, �� ȸ�翡���� ī�带 �߱��ϸ� �׻� ������ȣ�� �ڵ����� �����ȴ�.
//	10001���� �����Ͽ� ī�尡 ������ ������ 10002, 10003 ������ �����ȴ�.
//	���� �ڵ尡 ����ǵ��� Card Ŭ������ CardCompany Ŭ������ �����϶�. => CardCompanyTest
	
//	�ܺο��� ������ �� ���� intŸ�� cardNumber�� ��� ������ ������.
//	�ܺο��� ������ �� ���� �������� intŸ�� serialNum�� ��� ������ ������.
	private int cardNumber;
	private static int serialNum = 10000;
	
//	���������ڰ� ����(defalt), constructor�� ���� Card() ������ ����.
//	�����Ǵ� ��� serialNum���� 1����.
	
	Card() {
		serialNum++;
		setCardNumber(serialNum);
	}

//	getCardNumber() �޼ҵ带 ȣ���ؼ� cardNumber�� ���� �ܺο��� ȣ���� �� �ִ�.
	public int getCardNumber() {
		return cardNumber;
	}

//	setCardNumber�Լ��� serialNum���� ������. => �ش� Card ��ü�� CardNumber���� serialNum���� �Էµȴ�.
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void say_nick(String nick) {
		if("fool".equals(nick)) {
			return;
		}
		System.out.println("���� ������ " + nick + " �Դϴ�.");
	}
}