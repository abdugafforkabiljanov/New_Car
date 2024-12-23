package OOP;

public class Main {
    public static void main(String[] args) {
        Drivable sportcar = new SportCar("Ferrari" , "sariq" , 2021 , 100);
        Drivable truck = new Truck("MAN" , "Qora" , 2020 , 130);
        Drivable electriccar = new ElectricCar("Tesla" , "Oq" , 2022 , 150);
        // SportCar sportCar = new SportCar("Ferrari" , "sariq" , 2021 , 320);
        // Truck Truck = new Truck("MAN" , "Qora" , 2020 , 130);
        sportcar.startEngine();
        sportcar.stopEngine();
        sportcar.accelerate(150);
        sportcar.brake(50);
        sportcar.getMaxSpeed(320);
        truck.startEngine();
        truck.stopEngine();
        truck.accelerate(150);
        truck.brake(100);
        truck.getMaxSpeed(160);
        sportcar.stopEngine();
        sportcar.stopEngine();
        sportcar.accelerate(170);
        sportcar.brake(80);
        sportcar.getMaxSpeed(180);

    }
}
