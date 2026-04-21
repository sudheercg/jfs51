package interfaceimplementations.innerclasses;


public class Main {

    class InnerGreeting implements Greeting {
        public void sayHello() {
            System.out.println("Hello from Inner Class");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        Greeting g = obj.new InnerGreeting();
        g.sayHello();
    }
}