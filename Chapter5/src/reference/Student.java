package reference;

public class Student {

	int studentID;
	String studentName;
	
	Subject korea;        //Student Ÿ���� instance�� �����ϸ� SubjectŸ���� korea ��ü�� �����ȴ�.
	Subject math;         //Student Ÿ���� instance�� �����ϸ� SubjectŸ���� math ��ü�� �����ȴ�.
	
	
	
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
		System.out.println(studentName + " �л��� ���� : " + total);
	}
	
}
