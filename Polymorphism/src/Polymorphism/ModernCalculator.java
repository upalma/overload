package Polymorphism;

public class ModernCalculator extends Calculator { //Rum time
    //@overrides
	public int areaOfLand(int a, int b, int c, int d) {
		int total= a+b+c+d-1;
		return total;
	}
	//@overrides
		public int areaOfLand(int a, int b, int c) {
			int total= a+b+c+2;
			return total;
	}

}
