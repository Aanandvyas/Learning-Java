package Objects;

class Bicycle {
    private String color;
    private int gear;
    private int speed;

    public Bicycle(String color, int gear, int speed) {
        this.color = color;
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getGear() {
        return gear;
    }

    public int setGear(int gear) {
        return this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }
}

class MountainBike extends Bicycle {
    private int Height;
    private int tireWidth;

    public MountainBike(String color, int gear, int speed, int Height, int tireWidth) {
        super(color, gear, speed);
        this.Height = Height;
        this.tireWidth = tireWidth;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public int getHeight() {
        return Height;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }
}

public class Object {
    public static void main(String[] args) {
        Bicycle byc1 = new Bicycle("Blue", 4, 20);
        Bicycle byc2 = new Bicycle("Green", 5, 13);

        byc1.applyBrake(4);
        byc1.speedUp(6);
        byc1.setGear(3);
        System.out.println("Speed: " + byc1.getSpeed() + ", Color: " + byc1.getColor() + ", Gear: " + byc1.getGear());

        byc2.applyBrake(3);
        byc2.setColor("Red");
        System.out.println("Speed: " + byc2.getSpeed() + ", Color: " + byc2.getColor() + ", Gear: " + byc2.getGear());

        MountainBike mbyc = new MountainBike("Green", 8, 31, 6, 20);
        mbyc.setColor("White");
        mbyc.speedUp(6);
        mbyc.setGear(4);
        mbyc.setTireWidth(23);
        mbyc.applyBrake(4);

        System.out.println("Speed: " + mbyc.getSpeed() + ", Color: " + mbyc.getColor() + ", Gear: " + mbyc.getGear()
                + ", TireWidth: " + mbyc.getTireWidth());
    }
}
