package chapter5.mydate;

public class MyDateTest {

	
//	정보은닉 - 날짜의 유효성을 검증하는 프로그램을 구현해 보세요.
//	다음과 같은 MyDate 클래스가 있습니다.
//	
//	day, month, year 변수는 private으로 선언합니다.
//	각 변수의 getter, setter를 public으로 구현합니다.
//	MyDate(int day, int month, int year) 생성자를 만듭니다.
//	public boolean isValid() 메서드를 만들어 날짜가 유효한지 확인합니다.
//	MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 확인합니다.
	
	
	
	
	public static void main(String[] args) {
	
		MyDate date1 = new MyDate(40, 2, 2000);
		System.out.println(date1.dateInfo());	// 값이 들어갔는지 확인
		System.out.println(date1.isValid());	// valid 체크
		
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.dateInfo());	// 값이 들어갔는지 확인
		System.out.println(date2.isValid());	// valid 체크

		MyDate date3 = new MyDate(32, 15, 2006);
		System.out.println(date3.dateInfo());	// 값이 들어갔는지 확인
		System.out.println(date3.isValid());	// valid 체크
		
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
