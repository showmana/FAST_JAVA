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




//Kim 님이4000으로 별 다방 아메리카노를 구입했습니다
//Lee 님이4500으로콩 다방 라떼를 구입했습니다
