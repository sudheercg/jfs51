package interfaceimplementations.anonymousclasses;
public class Main {
    public static void main(String[] args) {

        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from Anonymous Class");
            }
        };

        g.sayHello();
    }
}