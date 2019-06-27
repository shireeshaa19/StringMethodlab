package Stringlab;

public class camelCase {

	public static void main(String[] args) {
		tocamelCase("welcome to my video");

	}
	public static void tocamelCase(String phrase){
		String result ="";
		if(phrase.length() ==0){
			 System.out.println(result);
		}
		char first = phrase.charAt(0);
  	  char firsttoUppercase = Character.toUpperCase(first);
  	  System.out.println(result + firsttoUppercase);
  	for(int i = 1; i < phrase.length() ;i++){
  		char current = phrase.charAt(i);
		  char previous = phrase.charAt(i-1);
		 if(previous == ' '){
			 char currenttoUppercase = Character.toUpperCase(current);
			 System.out.println(result + currenttoUppercase);
		  } else {
			  char currenttolowercase = Character.toLowerCase(current);
			  System.out.println(result + currenttolowercase);
		  }
  		
  	}
  	System.out.println(result);
 }
	
}
