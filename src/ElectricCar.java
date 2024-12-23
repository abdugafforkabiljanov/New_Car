package OOP;

class ElectricCar extends Car implements Drivable {

    public ElectricCar(String name, String color, int year, int speed) {
        super(name, color, year, speed);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " avtomobili harakatni boshladi");
    }

    @Override
    public void stopEngine() {
        System.out.println(getName() + " avtomobili harakatni to'xtatdi");
    }

    @Override
    public void accelerate(int nextSpeed) {
        System.out.println(getSpeed() + " tezlikdagi mashina " + nextSpeed + " tezlikka chiqdi");
    }

    @Override
    public void brake(int nextSpeed) {
        System.out.println(getSpeed() + " tezlikdagi mashina " + nextSpeed + " tezlikkacha tushdi");
    }

    @Override
    public void getMaxSpeed(int maxSpeed) {
        System.out.println("Ushbu avtomobilning maximal tezligi: " + maxSpeed);
    }
}