import javax.swing.*;

public class aufgaben2b {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2.1 
		String str;
		str = JOptionPane.showInputDialog("Enter number:");
		
		double wert = Double.parseDouble(str);
		
		System.out.println("Zahl: " + wert + "   Reziproke Zahl: " + 1.0/wert  );	
				 
	}

}
