package edunova;

import javax.swing.JOptionPane;

public class Matrica {
	public static void main(String[] args) {
		int i,j,r,s;
		
		r=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redaka:")); // unosenje redova
		s=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca:")); // unosenje stupaca
		
		int[][] matrica= new int[r][s];
		int k=1, stupac1=0, stupac2=s-1, red1=0, red2=r-1; 			//k = elementi od 1 pa nadalje
		 while(k<=r*s)
	        {
			 
			 	for(i=stupac2-1;i>=stupac1+1;i--) 
	            {
	                matrica[red2][i]=k++;
	            } 
	            for(j=red2;j>=red1;j--) 
	            {
	                matrica[j][stupac1]=k++; 
	            }
	            for(i=stupac1+1;i<=stupac2;i++)
	            {
	                matrica[red1][i]=k++; 
	            }

	            for(j=red1+1;j<=red2;j++) 
	            {
	                matrica[j][stupac2]=k++; 
	            }

	            
	            
	            stupac1++;
	            red1++;
	            stupac2--;
	            red2--;
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

