package Interface;

interface Bicycle {
    void setSpeed(int value);
    void setColor(String value);
}

class Tejas implements Bicycle{
    private int speed;
    private String color;

    public Tejas(int speed,String color){
        this.speed =speed;
        this.color = color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setColor(String color){
        this.color = color;
    }
    public int getSpeed(){
        return speed;
    }
    public String getColor(){
        return color;
    }
}

public class Demo {
    public static void main(String[] args) {
        Tejas bike = new Tejas(32,"Yellow");
        bike.setColor("Red");
        bike.setSpeed(29);

        System.out.println("Color: "+bike.getColor()+", Speed: "+bike.getSpeed());
    }
}
