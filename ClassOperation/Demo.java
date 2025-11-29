package ClassOperation;

class HelloWorld{
    String message;
    void printHelloMessage(String name){
        message ="Hello "+name;
        System.out.println(message);
    }
}

class Demo {
    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        obj.printHelloMessage("ved");
    }
}
