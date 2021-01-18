import java.util.Scanner;


public class aufgaben2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2.1
		double menge ;
		menge = 2;
		System.out.println("Menge = " + menge  );	
		
		// 2.2
		System.out.println("3/17 = " + 3 / 17  );
		
		// 2.3
		double bruch = 1.0 / 7;
		System.out.println("Bruch = " + bruch  );
			
		// 2.4
		double pi = Math.PI;
		System.out.println("Pi = " + pi  );
		
		// 2.5
		double dsqrt2 = Math.sqrt(2);
		System.out.println("dsqrt2 = " + dsqrt2  );
		int isqrt2 = (int) Math.sqrt(2);
		System.out.println("dsqrt2 = " + isqrt2  );	
		
		// 2.6
		double dd = 4.3;
		int id = (int) dd;  // Explicit casting needed
		System.out.println("id = " + id );	
		dd = id;  // Casting not needed
		System.out.println("dd = " + dd );	
		
		// 2.7
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = s.nextLine();
		System.out.println("Eingabe war: = " + str  );	
		
		// 2.8
		System.out.print("Enter string:");
		str = s.nextLine();
		int a = Integer.parseInt(str);
		System.out.println("Eingabe war: = " + a  );			
		
		// 2.9
		System.out.print("Enter string:");
		str = s.nextLine();
		double d = Double.parseDouble(str);
		System.out.println("Eingabe war: = " + d  );	
		
		//
		int za = 100;
		int zb = 200;
		System.out.println("za=" + za + "   zb=" + zb  );	
		int tmp = zb;
		zb = za;
		za = tmp;
		System.out.println("za=" + za + "   zb=" + zb  );	
				
	}

}
