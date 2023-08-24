class Mixer {
static boolean isConnected;
static int minSpeed;
static int maxSpeed = 4;
static int currentSpeed ;
public static boolean onOroff(){
	System.out.println("Starting of the onOroff");
	if(isConnected == false){
		isConnected = true;
		System.out.println("The mixer is Turned on...");
	}else if(isConnected == true){
	     isConnected = false;
		System.out.println("The mixer is Turned off...");
	}
	System.out.println("End of the onOroff");
	return isConnected;
}
 public static void increaseSpeed(){
	System.out.println("Start of increaseSpeed");
	if(isConnected == true){
		if(currentSpeed < maxSpeed){
			currentSpeed = currentSpeed +1 ;
			System.out.println("The current speed is "+ currentSpeed);
		}
		else{
			System.out.println("Max speed is reached");
			}
	}else{
		System.out.println("Turn on the mixer");
	}
	System.out.println("End of increaseSpeed");
	}
	public static void decreaseSpeed(){
	System.out.println("Start of decreaseSpeed");
	if(isConnected == true){
		if(currentSpeed > minSpeed){
			currentSpeed = currentSpeed -1 ;
			System.out.println("The current speed is "+ currentSpeed);
		}
		else{
			System.out.println("Min speed is reached");
			
			}
	}else{
		System.out.println("Turn on the mixer");
	}
	System.out.println("End of decreaseMixer");
	}
	
}
