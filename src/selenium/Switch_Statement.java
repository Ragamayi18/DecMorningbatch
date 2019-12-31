package selenium;

public class Switch_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		    String course= "Datascience";
		    switch(course.toUpperCase())
		    {
		    case    "QTP":
		    	System.out.println("course is available");
		    	 break;
		    case      "SELENIUM":
		    	System.out.println("course is available");
		    	break;
		    case     "DATASCIENCE":
		    	System.out.println("course is available");
		    	break;
		    	default:
		    		    System.out.println("course is not available");
		    	    
		    		   break;
		    }
	}

}
