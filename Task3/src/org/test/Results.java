package org.test;

public class Results extends Rank {

@Override
	public void karthikMark() {
		System.out.println("Karthik Rank: 1st");
		
	}
    private void ajithRank() {
		System.out.println("Ajith Rank: 3rd");

	}

 public static void main(String[] args) {
	 Results s=new Results();
	 s.karthikMark();
	 s.vijayRank();
	 s.ajithRank();
}
}
	
