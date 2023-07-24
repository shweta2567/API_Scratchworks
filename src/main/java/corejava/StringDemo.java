package corejava;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sting literal ==it will not create another obj ,it will refer to it
		String s="hello";
		String a="hello";
		//string class creates new object every time in memory
		String a1=new String("hello");
		//strings are immutable=orginal string not will be changed 
		
		//stringbuffer and stringbuilder: They are mutable
		StringBuffer sb=new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(2, "she");
		System.out.println(sb);
		sb.replace(5, 7, "aa");
		System.out.println(sb);
		sb.deleteCharAt(12);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		
		//stringbuilder is not thread safe .
		//It is non synchronized and it is faster 
		System.out.println(a.equals(s));  //it will check the content 
		System.out.println(a==s); //it will check the  object reference 
		
	}

}
