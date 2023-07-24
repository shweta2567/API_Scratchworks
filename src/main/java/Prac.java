import java.net.InetAddress;
import java.net.UnknownHostException;

//interface Info{
//			public void display();
//		}
// class Prac implements Info {
//
//	public static void main(String[] args) {
//		
//		
//		Prac p=new Prac();
//		p.display();
//	}
//	public void display()
//	{
//		System.out.println("Hello world");
//		
		
		public  class Prac  {
			public static void main(String[] args) {
				//to perform garbage collection
//				Runtime rs=Runtime.getRuntime();
//				System.out.println("Free memory n JVM before garbage collection="+rs.freeMemory());
//				rs.gc();
//				System.out.println("Free memory in JVM after Garbage collection="+rs.freeMemory());
		// TODO Auto-generated method stub
				
				//get ip address
				
				//System.out.println(InetAddress.getLocalHost());
				
				//output:  Shweta/192.168.1.37
				
				//print * program
//		int row=10;
//		for(int i=0; i<row; i++)   
//		{   
//		for(int j=0; j<=i; j++)   
//		{   
//		System.out.print("* ");   
//		}   
//		System.out.println();  
//		}
		
		//reverse of a number
//		int n=123,reverse=0;
//		while(n!=0) {
//			reverse=reverse *10;
//			reverse=reverse+n%10;
//			n=n/10;
//		}
//		System.out.println(reverse);
		
		//prime no or not
		
		//Prime number
				/*int n=100,temp=0;
				int k=0;
				for(int i=2;i<=n;i++) {   //outer loop for total number to take prime number from it
					for(int j=2;j<i-1;j++)
					{
						if(i%j==0)
						{
							temp++;
						}
					}
					if(temp==0)
					{    k++;
						System.out.println(i);
						
					}
					else {
						temp=0;
					}
					
				}
				
				System.out.println("Total number of prime number is " +k);*/
		
		//reverse a string
//		String s="mom",reverse="";
//		for(int i=s.length()-1;i>=0;i--) {
//			reverse=reverse+s.charAt(i);
//			//System.out.println("reverse of  a string " + reverse);
//		}
//		System.out.println("reverse of  a string " + reverse);
		
		//palindrome or not
				String s="mom",reverse="";
				for(int i=s.length()-1;i>=0;i--) {
					reverse=reverse+s.charAt(i);
					//System.out.println("reverse of  a string " + reverse);
				}
			System.out.println("reverse of  a string " + reverse);
				
				//palindrome or not
//		
//spilt of a string
//		String s="java string spilt method by techno";
//		String[] words=s.split(" ");
//		for(String w:words) {
//			System.out.println(w);
//		}
		//convert char to lowercase
//		String s="TECHNOLOGY SHWETA IS A GIRL";
//		String w=s.toLowerCase();
//		System.out.println(w);
		
		//find length ,concatenate and replace string in java program
//		String s="java programming",t="",u="";
//		int n;
//		n=s.length();
//		System.out.println("No of characters = "+n);
//		//replace characters in a string
//		t=s.replace("java","python");
//		System.out.println(s);
//		System.out.println(t);
//		
	//concatenate the string with another string 
//		u=s.concat(" is fun");
//		System.out.println(s);
//		System.out.println(u);
		
		//create interface
		
}
}
