package phones;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	String ringTone = getRingTone();
    	return ringTone;
    }
    @Override
    public String unlock() {
        // your code here
    	return "Phone Unclocked";
    }
    @Override
    public void displayInfo() {
        // your code here  
    	System.out.println("Galaxy " + getVersionNumber()+" from "+getCarrier()+" has " + getBatteryPercentage()+ "%battery");
    }
}

