package corejava;



	public class StaticVar {

		String name;

		 String address="ban";

		 String city="DELHI";

		StaticVar(String name, String address,String city)

		{

		this.name= name;  // this.name = refers to the instant variable

		this.address=address;

		this.city=city;

		}

		public void getaddress()

		{

		System.out.println(address+"  "+ city);

		}



		public static void main(String[] args)

		{

		// TODO Auto-generated method stub

		StaticVar obj= new StaticVar("Mohan","saritavihar","lol");

		StaticVar obj1= new StaticVar("ram","akshardham","Bangalore");
		StaticVar obj2= new StaticVar("Mohan","kanpur199","kanpur");

		obj.getaddress();

		obj1.getaddress();
obj2.getaddress();


		}



		}