public class Main{
    public static void main(String[] args) {
        Car corolla = new Car("Toyota", "Corolla", "Saloon", 2019, 4, "Petrol");
        Car mercedes = new Car("Mercedes", "C200", "Hatchback", 2020, 5, "Electric");
        Car nissan = new Car("Nissan", "NP200", "Van", 2016, 7, "Diesel");
        Car bmw = new Car("Bmw", "X5", "SUV", 2017 , 4, "Diesel");
        Car rav4 = new Car("Toyota", "Rav4", "SUV", 2019, 4, "Diesel");

        Motorbike aceTuff = new Motorbike("Honda", "Ace Tuff", "Off-Road", 2023, 124, "Petrol");
        Motorbike gsx = new Motorbike("Suzuki", "GSX-R750", "Naked", 2014, 749, "Petrol");
        Motorbike tracer = new Motorbike("Yamaha", "900 GT", "Touring", 2020, 847, "Petrol");
        Motorbike panigale = new Motorbike("Ducati", "1199", "Sports", 2018, 1103, "Petrol");
        Motorbike ninja = new Motorbike("Kawasaki", "Ninja 400", "Sports", 2022, 399, "Petrol");

        Plane boeing777 = new Plane("Boeing", "777-200LR", "Wide-body Airliner", 1993, 317, 2, "Commercial");
        Plane boeing787 = new Plane("Boeing", "787-8 Dreamliner", "Wide-body Airliner", 2007, 248, 2, "Commercial");
        Plane airbusa321 = new Plane("Airbus", "a321neo", "Narrow-body jet airliner", 2012, 244, 2, "Commercial");
        Plane phenom = new Plane("Embraer", "Phenom 300", "Light business jet", 2009, 8, 1, "Personal");
        Plane antanov = new Plane("Antanov", "An-26", "Transport aircraft", 1970, 40, 2, "Cargo");

        Bus tourrider = new Bus("Mercedes", "Tourrider", "Motor-coach", 2023, "Single-decker rigid bus",60, "Diesel", "Commercial");
        Bus spacedream = new Bus("Nissan", "Space Dream", "Coach", 1988, "Double-decker bus", 80, "Diesel", "Commercial");
        Bus citaro = new Bus("Mercedes", "Citaro", "Integral", 2020, "Single-decker low-floor", 58, "Electric", "Public Transport");
        Bus coaster = new Bus("Toyota", "Coaster", "Minibus", 2021,"Single-decker", 30, "Petrol", "Tour");
        Bus aeroking = new Bus("Mitsubishi", "Aero King", "Coach", 2010, "Double Decker", 58, "Diesel", "Tour");

        corolla.displayVehicleInfo();
        mercedes.displayVehicleInfo();
        nissan.displayVehicleInfo();
        bmw.displayVehicleInfo();
        rav4.displayVehicleInfo();

        aceTuff.displayVehicleInfo();
        gsx.displayVehicleInfo();
        tracer.displayVehicleInfo();
        panigale.displayVehicleInfo();
        ninja.displayVehicleInfo();

        boeing777.displayVehicleInfo();
        boeing787.displayVehicleInfo();
        airbusa321.displayVehicleInfo();
        phenom.displayVehicleInfo();
        antanov.displayVehicleInfo();

        tourrider.displayVehicleInfo();
        spacedream.displayVehicleInfo();
        citaro.displayVehicleInfo();
        coaster.displayVehicleInfo();
        aeroking.displayVehicleInfo();
    }
}