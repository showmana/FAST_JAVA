package chapter6;

import java.util.ArrayList;

public class Student {

//	Student 클래스는
//	멤버 변수(=인스턴스 변수, 속성 다 같은말) : int 타입의 studentID , String 타입의 studentName, ArrayList<Book> 타입의 bookList를 가진다.

	int studentID;
	String studentName;
	ArrayList<Book> bookList;
	
//	Student(int studentID, String studentName) 생성자를 이용해 생성할 경우
//	studentID, studentName을 입력받고
//	bookList에 새로운 ArrayList<Book>() 객체를 하나 생성하고 보유한다.
	public Student(int studentID, String studentName){
		this.studentID= studentID;
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
//	Student 클래스는 리턴타입이 없는 addBook() 메소드를 가진다.
//	이 메소드는 String title, String author를 파라메터로 입력받으면서
//	Book 타입의 book 인스턴스 하나 생성하는데
//	이 때 Book클래스에 정의된 setTitle() 메소드에 의해 title값이 book 인스턴스의 title값이 된다.
//	author인자 역시 마찬가지원리로 author값으로 입력된다.
//	또 book인스턴스의 BookList ArrayList<Book> 배열에 추가된다.
	
	public void addBook(String title, String author) {
		Book book = new Book();
		
		book.setTitle(title);
		book.setAuthor(author);
		bookList.add(book);
	}
	
	public void showStudentInfo()
	{
		System.out.print( studentName + " 학생이 읽은 책은 : ");
				
		for(Book book : bookList){
			System.out.print(book.getTitle() + " ");
		}		
		System.out.println("입니다");
	}
	
}
