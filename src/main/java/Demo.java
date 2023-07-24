
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// Sample data to validate
		int[] dataToValidate = {2, 4, 6, 8, 10};

		// Condition to check
		int conditionToCheck = 2;

		// Loop through the data and validate the condition
		for (int data : dataToValidate) {
		    if (data % conditionToCheck != 0) {
		        System.out.println("Fail");
		        break;
		    }
		    else {
		        System.out.println("Pass");
		    }
		}
		

	}

}
