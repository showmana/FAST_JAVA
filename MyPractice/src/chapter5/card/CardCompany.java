package chapter5.card;

public class CardCompany {

	// CardCompany�� instance ��ü�� �⺻���� ������ �ִ�.
	// �� �ν��Ͻ��� private static�̴�. (�ܺ������� �Ұ����ϰ� static ��, ���� ���̶�� ��)
	
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {}         //

	// getInstance()�� ���� ������ �� �ִ�.
	public static CardCompany getInstance() {
		if( instance == null )
			instance = new CardCompany();
		return instance;
	}// instance ���� null�̸� CardCompany�� instance�� �ϳ� ���Ӱ� �����Ѵ�.(�������� Ȯ�ο� �޼ҵ��� �� �� ����.)
	// null�� �ƴϸ� �翬�� instance�� �״�� ��ȯ�� ��.	


	// CardCompany�� Card Ÿ���� ��ȯ�ϴ� createCard() �޼ҵ带 ������ �ִ�.
	// �� �Լ��� CardŸ�� ��ü�� �ϳ� �����ϰ� ��ȯ�Ѵ�.
	
	public Card createCard() {
		
		Card card = new Card();
		return card;		
	}
	
	
}