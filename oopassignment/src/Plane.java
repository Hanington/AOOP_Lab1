public class Plane extends Vehicle {
    private int numberOfSeats;
    private int requiredPilots;
    private String usage;

    public Plane(String make, String model, String type, int productionYear, int numberOfSeats, int requiredPilots, String usage) {
        super(make, model, type, productionYear); // Constructor chaining
        this.numberOfSeats = numberOfSeats;
        this.requiredPilots = requiredPilots;
        this.usage = usage;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo(); // Calling Vehicle's displayInfo
        System.out.println("Number of Seats: " + numberOfSeats + "Number of Pilots Required: " + requiredPilots + ", Plane Use: " + usage);
        System.out.println("*******************************************************************");
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getRequiredPilots() {
        return requiredPilots;
    }

    public void setRequiredPilots(int requiredPilots) {
        this.requiredPilots = requiredPilots;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
