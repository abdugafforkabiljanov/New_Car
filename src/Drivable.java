package OOP;

public interface Drivable {
    void startEngine();
    void stopEngine();
    void accelerate(int nextSpeed);
    void brake(int nextSpeed);
    void getMaxSpeed(int maxSpeed);
}
