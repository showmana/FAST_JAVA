package reference;

public class Student {

	int studentID;
	String studentName;
	
	Subject korea;        //Student 타입의 instance를 생성하면 Subject타입의 korea 객체도 생성된다.
	Subject math;         //Student 타입의 instance를 생성하면 Subject타입의 math 객체도 생성된다.
	
	
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		
	}



	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}



	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
		
	}



	public void showStudentSocre() {
		int total = korea.score + math.score; 
		System.out.println(studentName + " 학생의 총점 : " + total);
	}
	
}
