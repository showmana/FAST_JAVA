package array;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {

//		1. student 클래스로부터 student(int studentID, String studentName) 생성자를 이용해 Student(1001, "Lee")  인스턴스를 하나 생성한다.
//		해당 객체는 		
		
//		this.studentID = studentID;
//		this.studentName = studentName;
//		subjectList = new ArrayList<Subject>();
		
//		위 로직을 타게되고 studentID = 1001,  studentName = "Lee" 멤버 변수를 가지고
//		새로운 ArrayList()를 하나 만드는데 이 때 ArrayList의 타입은 <Subject>가 되고 이는  subjectList 변수에 저장된다.
//		Subject 객체는
//		private String name;
//		private int score;    두 가지 멤버 변수를 가지고
//		
//		public Subject(String name, int score) {
//			this.name = name;
//			this.score = score;
//		}  과목명, 점수를 입력받는 생성자가 있다.
		
		
		Student studentLee = new Student(1001, "Lee");
//		Student의 인스턴스인 studentLee를 생성한다. 이 때 파라미터값 1001, "Lee"는 각각 StudentID, studentName이 되고
//		subject 객체도  하나 생성되어 subjectList항목에 추가된다.   ?????
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 91);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 80);
		
		Student studentCho = new Student(1003, "Cho");
		
		
		
//		출력되는 부분
		studentLee.showStudentSubjectInfo();
		studentLee.showStudentInfo();
		System.out.println("==================================== ");
		studentKim.showStudentSubjectInfo();
		studentKim.showStudentInfo();
		System.out.println("==================================== ");		
		studentCho.showStudentSubjectInfo();
		studentCho.showStudentInfo();
	}
}