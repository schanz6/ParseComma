// This program  parse int or double with numbers with commas in it


public class ParseComma
{

 public static double Double(String stringValue)
 {
  
	boolean point = false;// used to seperate number after decimal
	double before =0;// number before decimal 
	double after = 0;//number after 
	int aftercount =0;//langth of after for devision 
	int i=0;
	int sign =1;
	//Check for negative
	if(stringValue.charAt(0) == '-')
	{
	    i++;
	    sign = -1;
	}
	
	
	for(;i<stringValue.length();i++)
	{
	   //skips comma
	   if(stringValue.charAt(i) == ',')
	   {
		   continue;
	   }
           //skips point and switches from before to after		
	   if(stringValue.charAt(i) == '.')
	   {
	   	   // if there is already a point it throws exception 
		   if(point)
		   {
		   	 throw new NumberFormatException();
		   }
		   point = true;
		   
		   continue;
           }
         	//throws error if character is not a number
          if(stringValue.charAt(i)<48||stringValue.charAt(i)>57)
          {
	          throw new NumberFormatException();
	  }
	      // adds to eithor before or after point total
	  if(point)
	  {
	   	   after = (after*10)+ (stringValue.charAt(i)-48); 
	   	   aftercount++;
		
	  }
	  else
	  {
	   	 before = (before*10)+ (stringValue.charAt(i)-48);   
	  }
	}
	// make the after a decimal 
	for(int j=0;j<aftercount;j++)
	{
		after = after/10;
	}
		
	
	return sign*(before + after);
	
    }
    // comments are the same as above
  public static int Integer(String stringValue)
  {
  
	
	int number =0;
	int i =0;
	int sign =1;
	
	if(stringValue.charAt(0) == '-')
	{
	    i++;
	    sign = -1;
	}
	
	
	
	for(;i<stringValue.length();i++)
	{
	
	   if(stringValue.charAt(i)== ',')
	   {
		   continue;
	   }
         	
	   if(stringValue.charAt(i)<48||stringValue.charAt(i)>57)
	   {
	           throw new NumberFormatException();
	   }
	   
	     number = (number*10)+ (stringValue.charAt(i)-48);   
	 }
	   
	 return sign*number;
  }
}
		
	


