package interfaceimplementations.lambdaexpressions;
public class Main {
    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello from Lambda");

        g.sayHello();
    }
}