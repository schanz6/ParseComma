// This program  parse int or double with numbers with commas in it


public class ParseComma{

 public static double parseDoubleComma(String s){
  
	boolean point = false;// used to seperate number after decimal
	double before =0;// number before decimal 
	double after = 0;//number after 
	int aftercount =0;//langth of after for devision 
	int i=0;
	int sign =1;
	//Check for negative
	if(s.charAt(0) == '-'){
	    i++;
	    sign = -1;
	}
	
	
	for(;i<s.length();i++){
	   //skips comma
	   if(s.charAt(i)== ','){
		   continue;
		}
           //skips point and switches from before to after		
	   if(s.charAt(i)=='.'){
		   point = true;
		   continue;
         	}
         	// if not a number returns 0
         	//help if you know how to return error
         	if(s.charAt(i)<48||s.charAt(i)>57){
	   	   return 0;
	        }
	      // adds to eithor before or after 
	   if(point){
	   	   after = (after*10)+ (s.charAt(i)-48); 
	   	   aftercount++;
		
		
	            }
	   else{
	   	 before = (before*10)+ (s.charAt(i)-48);   
	   }
	}
	// make the after a decimal 
	for(int j=0;j<aftercount;j++){
		after = after/10;
	}
		
	
	return sign*(before + after);
	
    }
    // comments are the same as above
  public static int parseIntComma(String s){
  
	
	int number =0;
	int i =0;
	int sign =1;
	
	if(s.charAt(0) == '-'){
	    i++;
	    sign = -1;
	}
	
	
	
	for(;i<s.length();i++){
	
	   if(s.charAt(i)== ','){
		   continue;
		}
         	
	   if(s.charAt(i)<48||s.charAt(i)>57){
			return 0;
	        }
	   
	     number = (number*10)+ (s.charAt(i)-48);   
	   }
	   
	   return sign*number;
	}
	
		
	

}
