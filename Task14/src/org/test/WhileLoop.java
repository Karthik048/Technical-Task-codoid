package org.test;

public class WhileLoop {
	public static void main(String[] args) {
		int i=0;
		while (i<10) {
			if (i==5) {
				System.out.println("Breaking Of Loop");
				break;
			}
			System.out.println(i);
		  i++;
		  }
	
	     i=0;
	     while (i<10) {
	    	 i++;
	    	 if (i%2 == 0) {
	    		
				System.out.println(i);
				continue;
			}
	     }  
       }

}
