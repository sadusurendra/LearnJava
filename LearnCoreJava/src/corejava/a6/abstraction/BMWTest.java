package corejava.a6.abstraction;

public class BMWTest {

	public static void main(String[] args) {
//		BMW b= new BMW();
//		BMWFiveSeries bf = new BMW();

		BMWThreeSeries bt = new BMWThreeSeries();
		bt.acceleration();
		bt.commonFunc();

		BMWFiveSeries bf = new BMWFiveSeries();
		bf.acceleration();
		bf.commonFunc();

		BMW bf1 = new BMWFiveSeries();

		bf1.acceleration();
		bf1.commonFunc();

	}

}
