package chapter6;

import java.util.ArrayList;

public class StudentTest {


	private static Subject eng;

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addBook("�¹���1", "������");
		studentLee.addBook("�¹���2", "������");
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addBook("����1", "�ڰ渮");
		studentKim.addBook("����2", "�ڰ渮");
		studentKim.addBook("����3", "�ڰ渮");
		
		Student studentCho = new Student(1003, "Cho");
		
		studentCho.addBook("�ظ�����1", "���� �Ѹ�");
		studentCho.addBook("�ظ�����2", "���� �Ѹ�");
		studentCho.addBook("�ظ�����3", "���� �Ѹ�");
		studentCho.addBook("�ظ�����4", "���� �Ѹ�");
		studentCho.addBook("�ظ�����5", "���� �Ѹ�");
		studentCho.addBook("�ظ�����6", "���� �Ѹ�");
		
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

//	����
// ��� �б��� �л��� 3�� �ֽ��ϴ�. �� �л����� ���� å�� ����ϰ� �ֽ��ϴ�.
// Student Ŭ������ ����� �� �л����� ���� å�� Student Ŭ���� ���� ArrayList�� �����Ͽ� �����ϵ��� �մϴ�.
// ������ ���� ��µǵ��� Student, Book, StudentTest Ŭ������ ����� �����ϼ���.



//  ��µǾ���� ��
//	Lee �л��� ���� å�� : �¹���1 �¹���2 �Դϴ�.
//	Kim �л��� ���� å�� : ����1 ����2 ����3 �Դϴ�.
//	Cho �л��� ���� å�� : �ظ�����1 �ظ�����2 �ظ�����3 �ظ�����4 �ظ�����5 �ظ�����6 �Դϴ�.

//	ArrayList new ArrayList<>()