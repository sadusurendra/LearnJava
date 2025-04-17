package corejava6.abstraction;

public class BMWFiveSeries extends BMW {

	public BMWFiveSeries() {
		System.out.println("Constructor Five series");
	}
	
	@Override
	void acceleration() {
		System.out.println("Five series acceleration");
	}

	@Override
	void speed() {
		
	}

}
