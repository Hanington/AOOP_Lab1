public class Bus extends Vehicle {
    private String bodyStyle;
    private int numberOfSeats;
    private String engineType;
    private String usage;

    public Bus(String make, String model, String type, int productionYear, String bodyStyle, int numberOfSeats, String engineType, String usage) {
        super(make, model, type, productionYear); // Constructor chaining
        this.bodyStyle = bodyStyle;
        this.numberOfSeats = numberOfSeats;
        this.engineType = engineType;
        this.usage = usage;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo(); // Calling Vehicle's displayInfo
        System.out.println("Body Style: " + bodyStyle + "Number of Seats: " + numberOfSeats + "Engine Type: " + engineType + ", Plane Use: " + usage);
        System.out.println("*******************************************************************");
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String engineType) {
        this.bodyStyle = bodyStyle;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }
}
