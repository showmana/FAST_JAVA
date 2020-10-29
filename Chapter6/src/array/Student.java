package array;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;

	ArrayList<Subject> subjectList;

//	ArrayList<subject> subjectList;     <== 이걸 왜 만드느냐?? 과목은 여러가지가 있을 수 있기 때문 (?)	
//	이때 subjectList는 그냥 쓸 수 있는게 아니라. 생성을 해줘야하는데

//	일반적으로 Student constructor 에서 생성하는 경우가 많다.
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
	}

//	학생 인스턴스가 생성될 때 마다 해당 학생이 어떤 과목을 수강하는지 추가를 해줘야 할 것이다.
	public void addSubject(String name, int score) {
//	<String> 과 달리 <Subject>같은 임의의 클래스 타입은 객체를 하나하나 따로따로 생성해주어야
//		add. 등의 ArrayList 메소드드를 이용할 수 있다.
		Subject subject = new Subject(name, score);

//		이렇게 생성해준 객체를 subjectList에 하나하나 추가해준다.
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;

		for (Subject subject : subjectList) { // 얘는 향상된 for 문이다. subjectList ArrayList를 모두 출력해준다. (일반적인
												// for(i=0;i<subjectList.length();i++)와 동일한 기능)
			total += subject.getScore();
			System.out.println(studentName + " 학생의" + subject.getName() + " 과목의 성적은 " + subject.getScore() + "점 입니다.");
		}
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
		
		if(total!=0 || total<0)
		System.out.println(studentName + " 학생의 평균은 " + total/subjectList.size() + "점 입니다.");
		else {
			System.out.println(studentName + " 학생의 평균은 " + 0 + "점 입니다.");	
		}
		
	}

	public void showStudentSubjectInfo() {
		for (Subject subject : subjectList) { // 얘는 향상된 for 문이다. subjectList ArrayList를 모두 출력해준다. (일반적인
												// for(i=0;i<subjectList.length();i++)와 동일한 기능)
			System.out.println(studentName + " 학생은 " + subject.getName() + "을(를) 수강합니다.");
		}
		System.out.println(studentName + " 학생의 총 강의수는 " + subjectList.size() + "개 입니다.");
	}
}
