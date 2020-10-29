package array;

import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;

	ArrayList<Subject> subjectList;

//	ArrayList<subject> subjectList;     <== �̰� �� �������?? ������ ���������� ���� �� �ֱ� ���� (?)	
//	�̶� subjectList�� �׳� �� �� �ִ°� �ƴ϶�. ������ ������ϴµ�

//	�Ϲ������� Student constructor ���� �����ϴ� ��찡 ����.
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
	}

//	�л� �ν��Ͻ��� ������ �� ���� �ش� �л��� � ������ �����ϴ��� �߰��� ����� �� ���̴�.
	public void addSubject(String name, int score) {
//	<String> �� �޸� <Subject>���� ������ Ŭ���� Ÿ���� ��ü�� �ϳ��ϳ� ���ε��� �������־��
//		add. ���� ArrayList �޼ҵ�带 �̿��� �� �ִ�.
		Subject subject = new Subject(name, score);

//		�̷��� �������� ��ü�� subjectList�� �ϳ��ϳ� �߰����ش�.
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;

		for (Subject subject : subjectList) { // ��� ���� for ���̴�. subjectList ArrayList�� ��� ������ش�. (�Ϲ�����
												// for(i=0;i<subjectList.length();i++)�� ������ ���)
			total += subject.getScore();
			System.out.println(studentName + " �л���" + subject.getName() + " ������ ������ " + subject.getScore() + "�� �Դϴ�.");
		}
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
		
		if(total!=0 || total<0)
		System.out.println(studentName + " �л��� ����� " + total/subjectList.size() + "�� �Դϴ�.");
		else {
			System.out.println(studentName + " �л��� ����� " + 0 + "�� �Դϴ�.");	
		}
		
	}

	public void showStudentSubjectInfo() {
		for (Subject subject : subjectList) { // ��� ���� for ���̴�. subjectList ArrayList�� ��� ������ش�. (�Ϲ�����
												// for(i=0;i<subjectList.length();i++)�� ������ ���)
			System.out.println(studentName + " �л��� " + subject.getName() + "��(��) �����մϴ�.");
		}
		System.out.println(studentName + " �л��� �� ���Ǽ��� " + subjectList.size() + "�� �Դϴ�.");
	}
}
