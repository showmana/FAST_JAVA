package chapter6;

import java.util.ArrayList;

public class StudentTest {


	private static Subject eng;

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addBook("태백산맥1", "조정래");
		studentLee.addBook("태백산맥2", "조정래");
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addBook("토지1", "박경리");
		studentKim.addBook("토지2", "박경리");
		studentKim.addBook("토지3", "박경리");
		
		Student studentCho = new Student(1003, "Cho");
		
		studentCho.addBook("해리포터1", "조앤 롤링");
		studentCho.addBook("해리포터2", "조앤 롤링");
		studentCho.addBook("해리포터3", "조앤 롤링");
		studentCho.addBook("해리포터4", "조앤 롤링");
		studentCho.addBook("해리포터5", "조앤 롤링");
		studentCho.addBook("해리포터6", "조앤 롤링");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
		
		
		
		ArrayList<String> subjectTestArray = new ArrayList<String>();
		
		
		subjectTestArray.add("0");
		subjectTestArray.add("1");
		subjectTestArray.add("2");
		subjectTestArray.add("3");
		subjectTestArray.add("4");
		subjectTestArray.add("5");
		subjectTestArray.add("6");
		subjectTestArray.add("7");
		
		System.out.println(subjectTestArray.get(0));
		System.out.println(subjectTestArray.get(1));
		System.out.println(subjectTestArray.get(2));
		System.out.println(subjectTestArray.get(3));
		System.out.println(subjectTestArray.get(4));
		System.out.println(subjectTestArray.get(5));
		System.out.println(subjectTestArray.get(6));
		System.out.println(subjectTestArray.get(7));
		                   
	}                      
}

//	문제
// 어느 학교에 학생이 3명 있습니다. 각 학생마다 읽은 책을 기록하고 있습니다.
// Student 클래스를 만들고 각 학생마다 읽은 책을 Student 클래스 내에 ArrayList를 생성하여 관리하도록 합니다.
// 다음과 같이 출력되도록 Student, Book, StudentTest 클래스를 만들어 실행하세요.



//  출력되어야할 값
//	Lee 학생이 읽은 책은 : 태백산맥1 태백산맥2 입니다.
//	Kim 학생이 읽은 책은 : 토지1 토지2 토지3 입니다.
//	Cho 학생이 읽은 책은 : 해리포터1 해리포터2 해리포터3 해리포터4 해리포터5 해리포터6 입니다.

//	ArrayList new ArrayList<>()