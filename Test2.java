
public class Test2 {

	public static void main(String[] args) {
		System.out.println("---Main Starts------");
		System.out.println("---Basic Operations----");
		
		int no1;
		System.out.println("no1");//no1
		//System.out.println(no1);//Compile Error:Java compiler doesn't allow accessing of un initialized data members.
		no1=60;
		System.out.println(no1);//60
		System.out.println("No1="+no1);//No1=60
		System.out.println(no1+"   is value stored in No1");
		
		int no2=40;
		int no3=no1+no2;
		System.out.println("Add=no3");//Add=no3
		System.out.println("Add="+no3);//Add=100
		System.out.println(no1+"+"+no2+"="+no3);//60+40=100
		
		byte b1=110;
		byte b2=126;
		byte b3;
	//	b3=b1+b2;//compile time error:
		int b4=b1+b2;
		System.out.println("b3="+b4);
		
		System.out.println("----End Of  Main--------");
	}
	
	
	
}
