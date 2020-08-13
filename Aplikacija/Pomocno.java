package edunova;

import javax.swing.JOptionPane;

public class Pomocno {
	public static boolean ucitajLogickuVrijednost(String poruka) {
		while(true) {
			try {
				return Boolean.parseBoolean(JOptionPane.showInputDialog(poruka));
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
		
	}
	public static int ucitajBroj(String poruka) {
		while(true) {
			try {
				return Integer.parseInt(
						JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
		public static int ucitajBroj(String poruka,int i) {
			while(true) {
				try {
					return Integer.parseInt(
							JOptionPane.showInputDialog(poruka,i));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Krivi unos");
				}
			}
	}
	public static String ucitajString(String poruka,String trenutno) {
		String s;
		while(true) {
			s=JOptionPane.showInputDialog(poruka,trenutno);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;
			}
			return s;
		}
	}
	public static String ucitajString(String poruka) {
		String s;
		while(true) {
			s=JOptionPane.showInputDialog(poruka);
			if(s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Obavezan unos");
				continue;
			}
			return s;
		}
	}


}
