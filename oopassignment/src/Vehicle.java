public class Vehicle {

    private String make;
    private String model;
    private String type;
    private int productionYear;

    //Constructor
    public Vehicle(String make, String model, String type, int productionYear) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.productionYear = productionYear;
    }

    public void displayVehicleInfo(){
        System.out.println("Vehicle Make: " + make + ", Model: " + model + ", Type: " + type + ", Production Year: " +productionYear);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
