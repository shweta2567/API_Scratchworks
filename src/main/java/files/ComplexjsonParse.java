package files;

import io.restassured.path.json.JsonPath;

public class ComplexjsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js =new JsonPath(payload.CoursePrice());
		
		//print no of courses returned by api
		int count = js.getInt("courses.size()");
		System.out.println(count);
		//print purchase amount 
		int amount =js.getInt("dashboard.purchaseAmount");
		System.out.println(amount);
		//print the title of first course
		String title = js.get("courses[0].title");
		System.out.println(title);
		//print all courses title and thier respectice prices if dyanmic json is reurned from api
		for(int i=0; i<count; i++) {
			String coursetitles = js.get("courses["+i+"].title");
			System.out.println(coursetitles);
			//String price = js.get("courses["+i+"].price");
			//if u want to print in sys out convert it into string
			//System.out.println(price);
			//second way
			System.out.println(js.get("courses["+i+"].price").toString());
			
			//PRINT  rpa no of copies
			for(int j=0; j<count; j++) {

				String coursetitle = js.get("courses["+j+"].title");
				if(coursetitle.equalsIgnoreCase("RPA")) {
					int copies = js.get("courses["+j+"].copies");
					System.out.println(copies);
					break;
				}
				
				
			}
		}
		

	}

}
