import java.util.Scanner;
public class TestIf {

	public static void main(String[] args) {

             
		
            
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter RollNO");
            int no=sc.nextInt();
		
            System.out.println("name:");
            String name=sc.next();//next) is used to read string
		
		    System.out.println("Total Marks:");
		    int total=sc.nextInt();
		     
		    
//		    if(total>80) {
//		    System.out.println(" A+ ");
//		    }
		  
		    
//		    if(total>80) {
//			    System.out.println(" A+ ");
//			    }
//		    else
//		    {
//		    	System.out.println(" A ");
//		    }
		    
		    if(total>80)
		    	System.out.println("A+");
		    else if(total> 70 && total<=80)
		    	System.out.println("A");
		    else if(total<=70 && total>60)
		    	System.out.println("B");
		    else
		    	System.out.println("C");
		    
		    System.out.println("No "+no+"   Name "+name+"   Total="+total);
		    
		    
		 //accept boolean value
		    boolean status;
		    System.out.println("Read true or false ");
		    status=sc.nextBoolean();
		    System.out.println("Entered Value:"+status);
		    
		    //read char value from user
		    System.out.println("--Do You want To Continue (Y/N)");
		    char ch;
		    ch=sc.next().charAt(0);
		    
		    System.out.println("Choice:"+ch);
		
		    if(ch=='Y')
		    	System.out.println("Save changes..and go for next");
		    else
		    	System.out.println("Exit");
		    
		    

	}

}
