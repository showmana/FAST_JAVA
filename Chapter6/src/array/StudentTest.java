package array;

import java.util.ArrayList;

public class StudentTest {

	public static void main(String[] args) {

//		1. student Ŭ�����κ��� student(int studentID, String studentName) �����ڸ� �̿��� Student(1001, "Lee")  �ν��Ͻ��� �ϳ� �����Ѵ�.
//		�ش� ��ü�� 		
		
//		this.studentID = studentID;
//		this.studentName = studentName;
//		subjectList = new ArrayList<Subject>();
		
//		�� ������ Ÿ�Եǰ� studentID = 1001,  studentName = "Lee" ��� ������ ������
//		���ο� ArrayList()�� �ϳ� ����µ� �� �� ArrayList�� Ÿ���� <Subject>�� �ǰ� �̴�  subjectList ������ ����ȴ�.
//		Subject ��ü��
//		private String name;
//		private int score;    �� ���� ��� ������ ������
//		
//		public Subject(String name, int score) {
//			this.name = name;
//			this.score = score;
//		}  �����, ������ �Է¹޴� �����ڰ� �ִ�.
		
		
		Student studentLee = new Student(1001, "Lee");
//		Student�� �ν��Ͻ��� studentLee�� �����Ѵ�. �� �� �Ķ���Ͱ� 1001, "Lee"�� ���� StudentID, studentName�� �ǰ�
//		subject ��ü��  �ϳ� �����Ǿ� subjectList�׸� �߰��ȴ�.   ?????
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 91);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 80);
		
		Student studentCho = new Student(1003, "Cho");
		
		
		
//		��µǴ� �κ�
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