package corejava.a7.poly;

public class AutoPromotion {
//	public void print(float f) {
//		System.out.println("Float :" + f);
//	}
//
//	public void print(int f) {
//		System.out.println("INt :" + f);
//	}
//
//	public static void main(String[] args) {
//		AutoPromotion ap = new AutoPromotion();
//		ap.print(100);
//		ap.print(123.45f);
//	}
	
//	INt :100
//	Float :123.45
	
//	public void print(float f) {
//		System.out.println("Float :" + f);
//	}
//
//	public static void main(String[] args) {
//		AutoPromotion ap = new AutoPromotion();
//		ap.print(100);
//		ap.print(123.45f);
//	}
	
//	Float :100.0
//	Float :123.45

	
	public void print(long l) {
		System.out.println("Long :" + l);
	}

	public void print(float f) {
		System.out.println("Float :" + f);
	}

	public static void main(String[] args) {
		AutoPromotion ap = new AutoPromotion();
		ap.print(100);
		ap.print(123.45f);
	}
	
//	Long :100
//	Float :123.45

	
}
