package constructor;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("�̼���");
		//studentLee.studentName = "�̼���";
		studentLee.address = "����";
		
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "������");
		
		//studentKim.studentName = "������";
		//studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		//System.out.println(studentLee);
		//System.out.println(studentKim);
	}
}
