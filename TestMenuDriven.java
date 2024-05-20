import java.util.Scanner;

public class TestMenuDriven {

	public static void main(String[] args) {

		System.out.println("1:prime num 2: sum of series 3: exit");

		int ch, num;
		Scanner sc = new Scanner(System.in);
boolean result=false;
		do {
			System.out.println("Enter Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter Number:");
                  num=sc.nextInt();//15
                 for(int i=2;i<num;i++)//2 3  4       
                 {
                	 if(num%i==0) {
                		//System.out.println("Not Prime"); 
                		result=false;
                		break;
                	 }
                	 else
                	 {result=true;
                		// System.out.println("Prime");
                	 }
                 }
                 if(result==true)
                	 System.out.println("Prime");
                 else
                	 System.out.println("Not Prime");
                  
				break;
			case 2:
				break;

			}

		} while (ch != 3);

	}

}
