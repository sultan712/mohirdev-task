package uz.pdp;

public class Main {
    public static void main(String[] args) {

        MathFunctions math = new MathFunctions();

        System.out.println("Add int: " + math.add(5, 3));
        System.out.println("Add double: " + math.add(5.5, 2.2));

        System.out.println("Sub int: " + math.sub(10, 4));
        System.out.println("Sub double: " + math.sub(10.5, 3.5));

        System.out.println("Multiply int: " + math.multiply(4, 3));
        System.out.println("Multiply double: " + math.multiply(2.5, 4.0));

        System.out.println("Div int: " + math.div(10, 2));
        System.out.println("Div double: " + math.div(9.0, 3.0));

        System.out.println("Abs int: " + math.abs(-7));
        System.out.println("Abs double: " + math.abs(-5.5));

        System.out.println("Pow int: " + math.pow(4));
        System.out.println("Pow double: " + math.pow(2.5));
    }
}

