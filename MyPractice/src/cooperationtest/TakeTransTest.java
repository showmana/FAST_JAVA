package cooperationtest;

public class TakeTransTest {

	public static void main(String[] args) {
		//edward tax 10000
		Student studentK = new Student("±è", 10000);
		Student studentL = new Student("ÀÌ", 15000);
		Student studentP = new Student("¹Ú", 20000);
		Student studentG = new Student("±Ç", 30000);
		Student studentC = new Student("ÃÖ", 50000);
		Student studentE = new Student("Edward", 20000);      // Edward °´Ã¼»ý¼º
		
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		Bus bus400 = new Bus(400);
		Bus bus500 = new Bus(500);
		
		Subway subwayBlue = new Subway(1);
		Subway subwayGreen = new Subway(2);
		Subway subwayOrange = new Subway(3);
		Subway subwaySky= new Subway(4);
		Subway subwayPurple = new Subway(5);
		
		Taxi taxi0001 = new Taxi(0001);
		
		studentK.takeBus(bus100);
		studentL.takeBus(bus500);
		studentC.takeBus(bus400);
		studentK.takeBus(bus200);
		studentG.takeBus(bus300);
		studentK.takeBus(bus200);
		studentP.takeBus(bus300);
		studentG.takeBus(bus500);
		studentP.takeBus(bus200);
		studentK.takeBus(bus100);
		studentL.takeSubway(subwayGreen);
		studentC.takeSubway(subwayBlue);
		studentL.takeSubway(subwayOrange);
		studentK.takeSubway(subwaySky);
		studentP.takeSubway(subwayPurple);
		studentC.takeSubway(subwaySky);
		studentP.takeSubway(subwayPurple);
		studentC.takeSubway(subwayGreen);
		studentG.takeSubway(subwayOrange);
		studentP.takeSubway(subwaySky);
		studentL.takeSubway(subwaySky);
		studentE.takeTaxi(taxi0001);
		
		System.out.println("=================================================");
		System.out.println("[Student]");
		System.out.println("=================================================");
		studentK.showInfo();
		studentL.showInfo();
		studentP.showInfo();
		studentG.showInfo();
		studentC.showInfo();
		studentE.showInfo();
		System.out.println("=================================================");
		System.out.println("[Bus]");
		System.out.println("=================================================");
		bus100.showBusInfo();
		bus200.showBusInfo();
		bus300.showBusInfo();
		bus400.showBusInfo();
		bus500.showBusInfo();
		System.out.println("=================================================");
		System.out.println("[Subway]");
		System.out.println("=================================================");
		subwayBlue.showSubwayInfo();
		subwayGreen.showSubwayInfo();
		subwayOrange.showSubwayInfo();
		subwaySky.showSubwayInfo();
		subwayPurple.showSubwayInfo();
		System.out.println("=================================================");
		System.out.println("[Taxi]");
		System.out.println("=================================================");
		taxi0001.showTaxiInfo();
	}

}
