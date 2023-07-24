package corejava;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
//
//	}
		
		
		//fibnocci series
//		int a=0;
//		int b=1;
//		int sum=0;
//		int i=1;
//		while(i<9) {
//			sum=a+b;
//			System.out.println(sum);
//			a=b;
//			b=sum;
//			i++;
//		}
		//sum of the array
//		int[] a= {1,2,3,4,5};
//		int sum=sumArray(a);
//		System.out.println(sum);
		
		//multiplication of 2 number without multiplication operator 
//		int result=multiply(5,10);
//		System.out.println(result);
		
		//max diff bet any adjacent index in array
//		int[] a= {1,4,8,15,17};
//		int max=0;
//		for(int i=0;i<a.length-1;i++)
//		{
//			if(a[i+1]-a[i]>max)
//			{
//				max=a[i+1]-a[i]; 
//			}
//		}
//		System.out.println(max);
		
		//compare same indexes of 2 different arrays and create another array for matching values 
		
//		int a[]= {1,4,5,7};
//		int b[]= {6,4,3,7};
//		ArrayList<Integer> a1=new ArrayList<Integer>();
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==b[i]) {
//				a1.add(a[i]);
//			}
//		}
//		Object[] c=a1.toArray();
//		for(Object ob:c) {
//			System.out.println(ob);
//		}
		//sort the array in ascending and decending order 
//		 int a[]= {2,6,1,4,9};
//		 int temp;
//		 for(int i=0;i<a.length;i++) {
//			 for(int j=i+1;j<a.length;j++) {
//				 if(a[i]>a[j]) {
//					 temp=a[i];
//					 a[i]=a[j];
//					 a[j]=temp;
//				 }
//			 }
//		 }
//		 for(int i=0; i<a.length;i++) {
//			 System.out.println(a[i]);
//		 }
		 
		 //find the largest number in the array
//		int a[]= {1,4,5,8,9};
//		int max=a[0];
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println(max);
		
		
		//swap the variables 
		
		//int a=4;
		//int b=5;
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a+" "+b);
		
		//without temp variable
		//a=a+b;
		//b=a-b;
		//a=a-b;
		//System.out.println(a+" "+b);
		
		//check if number is prime or not 
//		int val=31;
//		boolean flag=false;
//		for(int i=2;i<val/2;i++) {
//			if(val%i==0) {
//				flag=true;
//				break;
//				
//			}
//		}
//		if(flag) 
//			System.out.println("It is not prime");
//		
//		else
//			System.out.println("It is prime");
		
//		int n=10,temp=0;
//		for(int i=1;i<=n;i++) {
//			for(int j=2;j<i-1;j++) {
//				if(i%j==0)
//				{
//					temp=temp+1;
//				}
//			}
//			if(temp==0) {
//				System.out.println(i);
//			}
//			else
//				temp=0;
//		}
		//find smallest and largest number in multi dimensional
		
//		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
//		int min=abc[0][0];
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++) {
//				if(abc[i][j]<min) {
//					min=abc[i][j];
//				}
//			}
//		}
//		System.out.println(min);
		
		//reverse a string  and check if it is palindrome or not
//		String s="madam";
//		String t="";
//		for(int i=s.length()-1;i>=0;i--) {
//			//System.out.print(s.charAt(i));
//			t=t+s.charAt(i);
//			
//		}
//		System.out.println(t);
//		if(s.equalsIgnoreCase(t)) {
//		
//		
//			System.out.println("It is palindrome");
//		}
		
		//eliminates duplicates and print unique numbers in array
		
//		int a[]= {4,5,5,5,4,6,6,8,9,6,4};
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		for(int i=0;i<a.length;i++)
//		{
//			int k=0;
//			if(!arr.contains(a[i]))
//			{
//				arr.add(a[i]);
//				k++;
//				for(int j=i+1;j<a.length;j++)
//				{
//					if(a[i]==a[j]) {
//						k++;
//					}
//				}
//				System.out.println(a[i]+"is repeated"+k);
//				if(k==1)
//					System.out.println("is unique is"+a[i]);
//			}
//			
//		}
		
		//count character occurences in a string
//		int count=counOccurences("aajan",'a');
//		System.out.println(count);
		
		//reverse a number
		
//		int a=243;
//		int reverse=0;
//		while(a!=0)
//		{
//			int digit=a%10;
//			reverse=digit+reverse*10;
//			a=a/10;
//		}
//		System.out.println(reverse);
		
		
		//pyramid pattern
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				//System.out.print("\t");
			}
			System.out.println();
		}
	}
	//count character occurences in a string
//	private static int counOccurences(String word, char character) {
//		// TODO Auto-generated method stub
//		int count=0;
//		for(int i=0;i<word.length();i++) {
//			if(word.charAt(i)==character)
//			{
//				count++;
//			}
//		}
//		return count;
//	}

	//sum of the array
	
//	public static int sumArray(int[] a) {
//		int sum=0;
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//			sum+=a[i];
//		}
//		return sum;
//		
//	}
	
	//multiplication of 2 number without multiplication operator 
//	public static int multiply(int i,int j) {
//		int k=1;
//		int sum=0;
//		while(k<=j) {
//			sum=sum+i;
//			k++;
//		}
//		return sum;
//	}
}

