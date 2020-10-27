package cooperationtest;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {	//½ÂÂ÷
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "¹ø ÁöÇÏÃ¶ÀÇ ½Â°´Àº " + passengerCount +"¸í ÀÌ°í, ¼öÀÔÀº " + money +"ÀÔ´Ï´Ù.");
	}
}
