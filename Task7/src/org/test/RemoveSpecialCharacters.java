package org.test;

public class RemoveSpecialCharacters {
	 public static void main(String[] args) {
	        String s = "I! am@ #Karthik$^ &";
	        String regex = "[^a-zA-Z0-9\\s]";
	        String remove = s.replaceAll(regex, "");
	        System.out.println("Original string: " + s);
	        System.out.println("Character Remove String : " + remove);
}
}
