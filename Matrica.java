package edunova;

import javax.swing.JOptionPane;

public class Matrica {
	public static void main(String[] args) {
		int i,j,r,s;
		
		r=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka:")); // unosenje redova
		s=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca:")); // unosenje stupaca
		
		int[][] matrica= new int[r][s];
		int k=1, ls=0, ds=s-1, gr=0, dr=r-1; 			//k = elementi od 1 pa nadalje // "-1" zbog toga sto krecem od 0
		 while(k<=r*s)									//ukupan broj elemenata																
	        {
			 											//ls = lijevi stupci u matrici
			 	for(i=ds;i>=ls;i--) 					//ds = desni stupci u matrici				
	            {										//gr = gornji redovi u matrici
	                matrica[dr][i]=k++;					//dr = donji redovi u matrici
	            } 
	            for(j=dr-1;j>=gr;j--)  									
	            {
	                matrica[j][ls]=k++; 
	            }
	            for(i=ls+1;i<=ds;i++) 								
	            {
	                matrica[gr][i]=k++; 
	            }

	            for(j=gr+1;j<=dr-1;j++)  									
	            {
	                matrica[j][ds]=k++; 
	            }

	            
	            dr--;		//u smjeru
	            ls++; 		//kazaljke 
	            gr++;    	//na
	            ds--;  		// satu
	            				
	        }
		 
		 
 System.out.println("Matrica:");
	           for(i=0;i<r;i++)
	                {
	                    for(j=0;j<s;j++)
	                        {
	                            System.out.print(matrica[i][j]+ "\t"); 
	                        }
	                 System.out.println();
	                }
	}

}

