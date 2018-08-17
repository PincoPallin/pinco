package SE2_TestPackage;

public class Test_Modulo {

	public static void main(String[] args) {
		
		int x = 991;
		int produkt = 1;
		
		while(x != 0) {
			produkt = produkt * (x % 10);
			x = x/10;
		}
		
		System.out.println(produkt);
	}

}
  