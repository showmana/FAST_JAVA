package chapter5.coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person kim = new Person("Kim", 20000);
		Person Lee = new Person("Lee", 20000);
		
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		
		kim.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		kim.buyBeanCoffee(beanCoffee, Menu.BEANAMERICANO);
		kim.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		
		Lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		Lee.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		Lee.buyStarCoffee(starCoffee, Menu.STARAMERICANO);
		
		System.out.println(kim.getMoney());
		System.out.println(Lee.getMoney());
		
	}

}




//Kim ����4000���� �� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�
//Lee ����4500������ �ٹ� �󶼸� �����߽��ϴ�
