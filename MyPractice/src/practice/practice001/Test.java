package practice.practice001;

public class Test {

    int a;  // °´Ã¼º¯¼ö a

    public void vartest(Test test) {
        test.a++;
    }

    public static void main(String[] args) {
        Test myTest = new Test();
        myTest.a = 1;
        myTest.vartest(myTest);
        System.out.println(myTest.a);
    }
}