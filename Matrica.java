package edunova;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Matrica {
	public static void main(String[] args) {
		int i,j;
		int r=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka"));
		int s=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
		int[][] matrica= new int[r][s];
		
		for(i=0;i<r;i++) {
			for(j=0;j<s;j++) {
			}
			
			}
		
		for(i=0;i<10;i++) {
		System.out.println(Arrays.toString(matrica[i]));
		}
	}

}
