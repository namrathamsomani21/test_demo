

	



 class Bank{
	 float getRateOfInterest() {
			return 6.7f;
		}
}
	
	class SBI extends Bank
	{

		@Override
		float getRateOfInterest() {
			return 7.0f;
		}
	}
	class HDFC extends Bank{

		@Override
		float getRateOfInterest() {
			return 6.8f;
		}
		
	}
	class ICICI extends Bank{

		@Override
		float getRateOfInterest() {
			return 6.9f;
		}
		
	}

	public class MethodOverridingDemo {

	public static void main(String[] args) {
SBI obj=new SBI();
System.out.println("Rate of interest of HDFC is "+obj.getRateOfInterest());

//Dynamic binding assigning child class to parent class
Bank obj1= new HDFC(); 

System.out.println("rate of interest of ICICI1 is "+obj1.getRateOfInterest());
	}

}
