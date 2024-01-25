public class Motorbike extends Vehicle {
    private int displacement;
    private String engineType;

    public Motorbike(String make, String model, String type, int productionYear, int displacement, String engineType) {
        super(make, model, type, productionYear); // Constructor chaining
        this.displacement = displacement;
        this.engineType = engineType;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo(); // Calling Vehicle's displayInfo
        System.out.println("Bike Displacement(CCs): " + displacement + ", Engine Type: " + engineType);
        System.out.println("*******************************************************************");
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}