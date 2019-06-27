package Stringlab;

public class StringLab {

	public static void main(String[] args) {
		
		Capitalize("blazes");
		wheresWaldo("Striped Waldo!");
		reverse("happy");
		firstThingsFirst("tree", "pine");
		soLong("bean","pea");
		afterMath("She aced the mathematics test!");
		tocamelCase("desert survival skills");
		// indexof and substring
		afterMath("My floor mat is so keen!");
		letterize("java");
		
	
		
		         
        
	}
    public static void Capitalize(String Word){
    	String firstName = Word.substring(0, 1).toUpperCase();
    	String lastName = Word.substring(1).toLowerCase();
    	System.out.println(firstName + lastName);
    
}
    public static void wheresWaldo(String phrase){
    	 System.out.println(phrase.indexOf("Waldo!"));
         
    }
    public static void firstThingsFirst(String a, String b){
    	if(a.compareTo(b) >0) {
    		System.out.println(b + " " + a);
    		
    		}else if (a.compareTo(b)< 0){
    		System.out.println(a + " " + b);
    	}
    	
     	
    }
    public static void reverse(String s){
    	String ans = new StringBuilder(s).reverse().toString();
    	System.out.println(ans);
    }

    public static void soLong(String a, String b){
    	if (a.length() > b.length()) {
    		System.out.println(a);
    	} else if (a.length() < b.length()){
    		System.out.println(b);
    	} else if (a.length() == b.length()){
    		System.out.println(a + " " + b);
    	}
  
    }
  
    
    public static void afterMath(String phrase){
    	int str1 = phrase.indexOf("math");

        if (str1 >= 0) {

            System.out.println(phrase.substring(str1));
            
        } else {

            System.out.println("dud");
        }
     
    	}
       
      public static void letterize(String word){
	 
	 for (int i = 0; i < word.length(); i++) {
	     System.out.println(word.charAt(i));
	 }
	 
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
    	  
      }
     

}
