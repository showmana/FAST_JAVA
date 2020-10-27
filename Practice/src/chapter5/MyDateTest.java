package chapter5;


public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(0, 1, 2000);
		System.out.println(date1.dateInfo());	// 값이 들어갔는지 확인
		System.out.println(date1.isValid());
		
		
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.dateInfo());	// 값이 들어갔는지 확인
		System.out.println(date2.isValid());
		
		
		MyDate date3 = new MyDate(22, 44, 2006);
		System.out.println(date3.dateInfo());	// 값이 들어갔는지 확인
		System.out.println(date3.isValid());
		
		
		MyDate date4 = new MyDate(33, 10, 2006);
		System.out.println(date4.dateInfo());	// 값이 들어갔는지 확인
		System.out.println(date4.isValid());
		
		
		MyDate date5 = new MyDate(2, 10, 2006);
		System.out.println(date5.dateInfo());	// 값이 들어갔는지 확인
		System.out.println(date5.isValid());
	}
}
