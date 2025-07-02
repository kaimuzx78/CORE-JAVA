package box4;
public class Imposter {

    static {
        System.out.println("Static no 1");
    }
    
    static {
        System.out.println("Static No 2");
    }

    Imposter() {
        System.out.println("Constructor Start");
    }

    public static void main(String[] args) {
        System.out.println("Main Start.");
        Imposter obj = new Imposter(); 
    }
    

    static {
        System.out.println("StatiC 3");
    }
}