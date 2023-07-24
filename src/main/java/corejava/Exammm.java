package corejava;

import java.util.Arrays;
import java.util.Scanner;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Exammm {
	
	
	/*void add()     Adding Method
	{
		int b=2;
		int a=1;
		System.out.println(a+b);
	}*/
	
	public static void main(String[] args)
	{
		/*// TODO Auto-generated method stub
		int num=45;
		int flag=0;
		for(int i=3;i<=num;i++) 
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag=flag+1;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
			else
			{
				flag=0;
			}
			
			
		}*/
		//@SuppressWarnings("resource")
		/*Prac obj=new Prac();     //Adding two numbers
		obj.add(); */
		
		/*int n = 0;           //Print sum of first N natural Numbers
		int sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			sum+=i;
			
			i++;
		}
		System.out.println(sum);  */
		
		/*int n=0;                Print Odd numbers from 0 to N
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i=i+2)
				
		{
			System.out.println(i);
		}*/
		/*int n=0;             //Print Even numbers from 0 to N
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<=n;i=i+2)
				
		{
			System.out.println(i);
		
		}*/
		/*int n=0,sum=0;               // Print Odd numbers from 0 to N
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
	for(int i=1;i<=n;i=i+2)

				
		{
			sum+=i;
			
		}
		System.out.println(sum);
}
		else
		{
		for(int i=0;i<=n;i=i+2)
			
		{
			sum+=i;
		
		}
		System.out.println(sum);
		
		}	*/
		
		/*int a,b,c;                             // Finding the greatest of 3 numbers 
		System.out.println("Enter a number");

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter another number");
		b=sc.nextInt();
		System.out.println("Enter another number");
		c=sc.nextInt();
		if(a>b &&a>c)
		{
			System.out.println("A is greater"+a);
			
		}
		else if(b>a &&b>c)
		{
			System.out.println("B is greater"+b);
		}
		else {
			System.out.println("C is greater "+c);
		}
*/
		//Find Factorial of a Number
//		int n;
//		int fact=1;
//		System.out.println("Enter a number");
//
//		Scanner sc=new Scanner(System.in);
//		n=sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
		//Count the number of Digits 
		/*int n;
		int count=0;
		System.out.println("Enter a number");

		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);*/
		
		//Print Multiplication Table 
		/*int n;
		
		System.out.println("Enter a number");

		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		*/
		//calculate Tax of a Salary 
		/*int sal;
		double tax;
		
		System.out.println("Enter a Salary");

		Scanner sc=new Scanner(System.in);
		sal=sc.nextInt();
		if(sal<10000)
		{
			System.out.println(sal+"No Tax");
		}
		else if(sal>10000 && sal<=100000) {
			tax=sal*0.10;
			System.out.println(sal+" "+tax);
		}
		else {
			tax=sal*0.20;
			System.out.println(sal+" "+tax);
			
		}*/
		
		//Swap of two numbers
		/*int a,b,temp=0;                             // Finding the greatest of 3 numbers 
		System.out.println("Enter a number");

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter another number");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);*/
		
		
		/*int a,b;                             // Finding the greatest of 3 numbers 
		System.out.println("Enter a number");

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter another number");
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);*/
		
		/*char ch,ch2 = 0 ;
		System.out.println("Enter any character");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch>='A'  && ch<='Z')
		{
			
			ch2=Character.toLowerCase(ch);
			System.out.println(ch2);
		}
		else {
			
			
			ch2=Character.toUpperCase(ch);
			System.out.println(ch2);
		}*/
		
		/*int y;
		System.out.println("Enter any Year ");
		Scanner sc =new Scanner(System.in);
		y=sc.nextInt();
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.println("Leap Year");
		}*/
		
		//find the reverse Number 
		/*int n,r;
		System.out.println("Enter any number ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
		*/
		
		//Sum of Digits
//		int n,r,sum=0;
//		System.out.println("Enter any number ");
//		Scanner sc =new Scanner(System.in);
//		n=sc.nextInt();
//		while(n>0)
//		{
//			r=n%10;
//			sum=sum+r;
//			n=n/10;
//			
//		}
//		System.out.println(sum);
		
		//Program for Palindrome or not 
		
		/*int n,r,s=0;
		System.out.println("Enter any number ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int c = n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(s==c) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a Palindrome ");
		}
		*/
		//Program for Armstrong number
		//input number 153------> (1*1*1+5*5*5+3*3*3=153)
		/*int n,arm=0,rem;
		System.out.println("Enter any Number");
		//System.out.println("Enter any number ");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		int c=n;
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm)
		{
			System.out.println("Armstrong Number ");
		}
		else {
			System.out.println("Not a armstrong Number ");
		}
	*/
		//Find the square root of a number
		/*
		int n;
		System.out.println("Enter any Number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		double m=Math.sqrt(n);
		System.out.println("Square root of"+n+"is"+m); */
		
		//Number is prime or not 
		 /*int n,j=0;
		 System.out.println("Enter any Number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				j++;
			}
		}
		if(j==2) {        //DIVISBLE BY ITS OWN NUMBER AND NUMBER GIVEN 
		
			System.out.println("Prime Number ");
		}
		else {
			//j=0;
			System.out.println("Not a prime");
		}
		*/
		
		//Print Prime Numbers with the given ranges 
		/*int n1,n2,j;
		System.out.println("Enter the given Numbers ");
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			for( j=2; j<=i;j++)
			{
				if(i%j==0)
				
					break;
				
			}
			if(i==j) 
				System.out.println(j+" ");
			        
		}   */

	//Printimg Array Elements	
//		int a[]= {1,2,3,4,5,};
//		for(int i=4;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
	
		/*// Sum of Array Elements 
	int a[]=new int[5];
	int sum=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Array");
	for (int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Array Elements ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
		sum+=a[i];
	}
	System.out.println(sum);
	
	*/
		//Program to search Element in Array 
		/*int a[]=new int[5];
		int n,count = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		System.out.println("Enter the Search Element ");
		n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Item Found");
		}
		else
		{
			System.out.println("Item not found ");
		}*/
		
		//Program to find the average of an array Elements 
		
		/*int a[]=new int[5];
		int sum=0;
		int x,y;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			sum+=a[i];
		}
		System.out.println(sum);
		x=a.length;
		y=sum/x;
		System.out.println(y);
	*/
		
		//Print array in ascending order 
		/*int a[]=new int[5];
		int temp = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array");
		for (int i=0;i<a.length;i++)   //running loop printing User array elements
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements ");
		for(int i=0;i<a.length;i++)       
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}*/
	//Print Array in Descending Order 
		/*int a[]=new int[5];
		int temp = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Array");
		for (int i=0;i<a.length;i++)   //running loop printing User array elements
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array Elements ");
		for(int i=0;i<a.length;i++)       
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}*/
		//Sort the array using array methods
	
		/*int a[]=new int[5];
		int a1[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
			
		}
		Arrays.sort(a1);    //sort() is a static method that's why calling by a Class name 
		System.out.println("Enter Array 2");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		*/
		//equals method
		/*int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		Arrays.sort(a);
		System.out.println("Enter Array 2");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		boolean c=Arrays.equals(a,b);
		
		System.out.println(c);
		
		*/
		// Difference between "==" and equals()
		/*int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		//if(Arrays.equals(a, b)) //It will check the values of the array 
		if(a==b)         //It will check the reference of diff arrays 
		{
			System.out.println("Both are equals ");
		}
		else {
			System.out.println("Both are not equals ");
		}
		
		
		//Maximum Element n the array 
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Maximum Number is "+max)
		
				//Minimum Element in the Array 
		/*int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("Maximum Number is "+min);*/
		
		
		/*Star patern *
					  * * 
					  * * *
					  * * * * */
		
		/*int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");*/
		
/*		   * 
		  * *
		 * * *
		* * * *     */
		/*int i,j,k;
		for(i=1;i<=5;i++)  //this loops for total no of rows
		{
			for(j=5;j>i;j--)   //this loops for left side space 
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {       //this loops for * print  acc to rows //For columns ow many no of elements in on row 
				System.out.print("* ");
			}
			System.out.print("\n");
		
		}*/
		
		
		//Printing pattern 
		/*1
		12
		123
		1234*/
		/*int n=5;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("\n");
	}*/
	
		//Print character pattern 
		/*char  i,j;
		for( i='A';i<='E';i++)
		{
			for(j='A';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("\n");

		}
		
		*/
		
		
		//Diamond Pattern 
		
		/*int i,j,k;
		for(i=1;i<=5;i++)  //this loops for total no of rows
		{
			for(j=5;j>i;j--)   //this loops for left side space 
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++) {       //this loops for * print  acc to rows //For columns ow many no of elements in on row 
				System.out.print("* ");
			}
			System.out.print("\n");
		
		}
		
		for(i=4;i>=1;i--)  //this loops for total no of rows
		{
			for(j=5;j>i;j--)   //this loops for left side space 
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++) {       //this loops for * print  acc to rows //For columns ow many no of elements in on row 
				System.out.print("* ");
			}
			System.out.print("\n");
		
		}*/
		
	//Print Fibonacci Series
		
		/*int n;
		int a=0,b=1,c;
		System.out.println("ENter the term");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
					b=c;
		}
		*/
		//sum of 2D array 
		/*int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Matrix Data");
		for(int i=0;i<2;i++)  //rows       //giving output to first matrix 
		{
			for(int j=0;j<2;j++)   //columns
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second Matrix ");  //giving output to second Matrix
		for(int i=0;i<2;i++)  //rows
		{
			for(int j=0;j<2;j++)   //columns 
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix");  //Printing the user given Values 
		for(int i=0;i<2;i++)  //rows
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("Second  Matrix");  //Printing the user given Values 
		for(int i=0;i<2;i++)  //rows
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("Sum of Matrix");  //Printing the sum of Matrix 
		for(int i=0;i<2;i++)  //rows
		{
			for(int j=0;j<2;j++) //columns
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println("\n");
		}
		*/
		
		//Transpose of a Matrix 
//		
		
}
	
}

