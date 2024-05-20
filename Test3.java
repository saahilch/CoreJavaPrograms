import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// for reading
		// c scanf("%d",&no1);
		// cpp cin>>no1;

		// in java to accept input from console
		// use Scanner class
		// import java.util.Scanner

		Scanner sc;
		sc = new Scanner(System.in);// parameter constr

		int no1, no2, no3;
		System.out.println("enter No1:");
		no1 = sc.nextInt();// read int value and assign it to no1

		System.out.println("Enter No2:");
		no2 = sc.nextInt();
		
		no3=no1+no2;
		System.out.println("Add="+no3);
		
		sc.close();
		
		
	}

}
