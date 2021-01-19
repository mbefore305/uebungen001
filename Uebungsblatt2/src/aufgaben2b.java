import javax.swing.*;

public class aufgaben2b {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2.1 
		/*
		String str;
		str = JOptionPane.showInputDialog("Enter number:");
		
		double wert = Double.parseDouble(str);
		
		System.out.println("Zahl: " + wert + "   Reziproke Zahl: " + 1.0/wert  );	
		*/ 
		
		System.out.println("Fahrenheit:      0   Celsius: " + getFahrenheit(0)  );
		System.out.println("Fahrenheit:   -100   Celsius: " + getFahrenheit(-100)  );
		System.out.println("Fahrenheit:    -10   Celsius: " + getFahrenheit(-10)  );
		System.out.println("Fahrenheit:     10   Celsius: " + getFahrenheit(10)  );
		System.out.println("Fahrenheit:    100   Celsius: " + getFahrenheit(100)  );

		System.out.println("Abstand 1 1 2 2 "  + getDistance(1,1,2,2)  );
		System.out.println("Abstand 1 10 2 20 "  + getDistance(1,10,2,20)  );
	
		System.out.println("Random  1 10: "  + getDoubleRandom(1,10)  );
		System.out.println("Random  1 10: "  + getDoubleRandom(1,10)  );
		System.out.println("Random  1 100: "  + getDoubleRandom(1,100)  );

		System.out.println("Random  1 100: "  + getIntRandom(1,100)  );
		System.out.println("Random  1 100: "  + getIntRandom(1,100)  );
		System.out.println("Random  1 100: "  + getIntRandom(1,100)  );
	}

	public static double getFahrenheit(double celsius) {
		return (celsius * 9.0/5.0) + 32.0;
	}
	
	public static double getDistance(double x1, double y1, double x2, double y2) {
		return( Math.sqrt( Math.pow(x1-x2,2) + Math.pow(y1 - y2,2 )   ) ) ;
	}
	
	public static double getDoubleRandom(double min, double max) {
		return ( Math.random() * ((max - min) + 1) + min ); 
	}
	
	public static int getIntRandom(int min, int max) {
		return ( (int) (Math.random() * ((max - min) + 1) + min ) ); 
	}
}
