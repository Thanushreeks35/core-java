class Microwave {
static boolean isConnected;
static int minTemperature;
static int maxTemperature = 7;
static int currentTemperature ;
public static boolean onOroff(){
	System.out.println("Starting of the onOroff");
	if(isConnected == false){
		isConnected = true;
		System.out.println("The Microwave is Turned on...");
	}else if(isConnected == true){
	     isConnected = false;
		System.out.println("The Microwave is Turned off...");
	}
	System.out.println("End of the onOroff");
	return isConnected;
}
 public static void increaseTemperature(){
	System.out.println("Start of increaseTemperature");
	if(isConnected == true){
		if(currentTemperature < maxTemperature){
			currentTemperature = currentTemperature +1 ;
			System.out.println("The current Temperature is "+ currentTemperature);
		}
		else{
			System.out.println("Max Temperature is reached");
			}
	}else{
		System.out.println("Turn on the Microwaver");
	}
	System.out.println("End of increaseTemperature");
	}
	public static void decreaseTemperature(){
	System.out.println("Start of decreaseTemperature");
	if(isConnected == true){
		if(currentTemperature > minTemperature){
			currentTemperature = currentTemperature -1 ;
			System.out.println("The current Temperature is "+ currentTemperature);
		}
		else{
			System.out.println("Min Temperature is reached");
			
			}
	}else{
		System.out.println("Turn on the Microwave");
	}
	System.out.println("End of decreaseTemperature");
	}
	
}
