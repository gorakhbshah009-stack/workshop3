package week3;

// Program 6: Lamp class with turnOn() and turnOff() methods

class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Lamp is turned ON.  Status: " + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Lamp is turned OFF. Status: " + isOn);
    }
}

public class Program6 {
    public static void main(String[] args) {

        Lamp myLamp = new Lamp();

        myLamp.turnOn();
        myLamp.turnOff();
        myLamp.turnOn();
    }
}
