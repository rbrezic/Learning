package edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {
	public static void main(String[] args) {
		
		int br1,br2,br3,max;
		
		br1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj")); 
		br2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj")); 		
		br3 = Integer.parseInt(JOptionPane.showInputDialog("Unesite treci broj")); 
		 
		if (br1>br2 & br1>br3) {
			max=br1;
			System.out.println(max); 
		}else if (br2>br1 & br2>br3) {
			max=br2;
			System.out.println(max); 
		}
		else {
			max=br3;
			System.out.println(max); 
		}
			
		
			
	}

}
