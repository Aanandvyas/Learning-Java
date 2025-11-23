package Interface;

// TODO: Create an interface called Machine with one method: String start()
interface Machine {
    String start();
}

// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface
abstract class Appliance implements Machine {
    protected String name;
    public Appliance(String name) {
        this.name = name;
    }
}

// TODO: Create a class Fan that:
// - Extends Appliance
class Fan extends Appliance {
    public Fan(String name) {
        super(name);
    }

    @Override
    public String start() {
        String msg = "Fan is running";
        System.out.println(msg);
        return msg;
    }
}

// TODO: Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliance {
    public WashingMachine(String name) {
        super(name);
    }

    @Override
    public String start() {
        String msg = "Washing Machine is operating";
        System.out.println(msg);
        return msg;
    }
}


public class Exercise {
    public static void main(String[] args) {
        // TODO: Create objects of Fan and WashingMachine using interface references
        // TODO: Print the result of start() for each object
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");
        
        fan.start();
        washer.start();
        
    }
}