package chapter6;

import java.util.ArrayList;

public class Student {

//	Student Ŭ������
//	��� ����(=�ν��Ͻ� ����, �Ӽ� �� ������) : int Ÿ���� studentID , String Ÿ���� studentName, ArrayList<Book> Ÿ���� bookList�� ������.

	int studentID;
	String studentName;
	ArrayList<Book> bookList;
	
//	Student(int studentID, String studentName) �����ڸ� �̿��� ������ ���
//	studentID, studentName�� �Է¹ް�
//	bookList�� ���ο� ArrayList<Book>() ��ü�� �ϳ� �����ϰ� �����Ѵ�.
	public Student(int studentID, String studentName){
		this.studentID= studentID;
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
//	Student Ŭ������ ����Ÿ���� ���� addBook() �޼ҵ带 ������.
//	�� �޼ҵ�� String title, String author�� �Ķ���ͷ� �Է¹����鼭
//	Book Ÿ���� book �ν��Ͻ� �ϳ� �����ϴµ�
//	�� �� BookŬ������ ���ǵ� setTitle() �޼ҵ忡 ���� title���� book �ν��Ͻ��� title���� �ȴ�.
//	author���� ���� �������������� author������ �Էµȴ�.
//	�� book�ν��Ͻ��� BookList ArrayList<Book> �迭�� �߰��ȴ�.
	
	public void addBook(String title, String author) {
		Book book = new Book();
		
		book.setTitle(title);
		book.setAuthor(author);
		bookList.add(book);
	}
	
	public void showStudentInfo()
	{
		System.out.print( studentName + " �л��� ���� å�� : ");
				
		for(Book book : bookList){
			System.out.print(book.getTitle() + " ");
		}		
		System.out.println("�Դϴ�");
	}
	
}
