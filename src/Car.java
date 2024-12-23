package OOP;

abstract class Car {
    private String name;
    private String color;
    private int year;
    private int speed;

    public Car(String name, String color, int year, int speed) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
