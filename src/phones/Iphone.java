package phones;

public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	String ring = getRingTone();
    	return ring;
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlocked phone";
    }
    @Override
    public void displayInfo() {
        // your code here 
    	System.out.println("IPhone " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery."); 
    }
}

