package chapter5.mydate;

public class MyDateTest {

	
//	�������� - ��¥�� ��ȿ���� �����ϴ� ���α׷��� ������ ������.
//	������ ���� MyDate Ŭ������ �ֽ��ϴ�.
//	
//	day, month, year ������ private���� �����մϴ�.
//	�� ������ getter, setter�� public���� �����մϴ�.
//	MyDate(int day, int month, int year) �����ڸ� ����ϴ�.
//	public boolean isValid() �޼��带 ����� ��¥�� ��ȿ���� Ȯ���մϴ�.
//	MyDateTest Ŭ�������� ������ MyDate ��¥�� ��ȿ���� Ȯ���մϴ�.
	
	
	
	
	public static void main(String[] args) {
	
		MyDate date1 = new MyDate(40, 2, 2000);
		System.out.println(date1.dateInfo());	// ���� ������ Ȯ��
		System.out.println(date1.isValid());	// valid üũ
		
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.dateInfo());	// ���� ������ Ȯ��
		System.out.println(date2.isValid());	// valid üũ

		MyDate date3 = new MyDate(32, 15, 2006);
		System.out.println(date3.dateInfo());	// ���� ������ Ȯ��
		System.out.println(date3.isValid());	// valid üũ
		
		MyDate date4 = new MyDate(2, 16, 2016);
		System.out.println(date4.dateInfo());
		System.out.println(date4.isValid());
		
		MyDate date5 = new MyDate(5, 1, 2020);
		System.out.println(date5.dateInfo());
		System.out.println(date5.isValid());
		
		MyDate date6 = new MyDate(2, 29, 2236);
		System.out.println(date6.dateInfo());
		System.out.println(date6.isValid());
		

		
	}
}
