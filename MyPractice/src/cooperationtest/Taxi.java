package cooperationtest;

public class Taxi {

	int taxiNum;
	int passengerCount;
	int money;

	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showTaxiInfo() {
		System.out.println(taxiNum + "�� �ý��� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�.");
	}
}
