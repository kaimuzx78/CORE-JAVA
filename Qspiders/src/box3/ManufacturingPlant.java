package box3;

class nano {
    String color;
    int price;
    double mil;

    nano() { // Constructor
        System.out.println("Inside Nano Constructor");
    }
}

public class ManufacturingPlant {
    public static void main(String[] args) {
        System.out.println("Main Start");

        nano n1 = new nano(); // OBJ1
        System.out.println("------------");
        nano n2 = new nano(); // OBJ2

        System.out.println("Main End!");
    }
}
