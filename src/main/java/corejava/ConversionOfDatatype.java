package corejava;

public class ConversionOfDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//convert string to int
		String s="200";
		int t=Integer.parseInt(s);
		System.out.println(s+100);
		System.out.println(t+100);
		
		//convert int to string
		int i=200;
		String s1=String.valueOf(i);
		System.out.println(i+100);
		System.out.println(s1+100);
		
		//covert string to long 
		String s2="9074465";
		long l=Long.parseLong(s2);
		System.out.println(l);
	
		
		//convert String to float 
		String s3="23.6";
		float f=Float.parseFloat("23.6");
		System.out.println(s3);
		
		//convert String to double
		String s4="23.6";
		double d=Double.parseDouble(s4);
		System.out.println(d);


	}

}
