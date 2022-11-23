import java.util.*;
public class RunAnimal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog d = new Dog();
        Cat c = new Cat();
        Bird b = new Bird();

        System.out.println("Choose an Animal: Press B for Bird, D for Dog, and C for Cat.");
        String input = scan.next();

        if(input.equalsIgnoreCase("d")){
            d.eat();
            d.sleep();
            d.sound();
        }else if(input.equalsIgnoreCase("c")){
            c.eat();
            c.sleep();
            c.sound();
        }else if(input.equalsIgnoreCase("b")){
            b.eat();
            b.sleep();
            b.sound();
        }else{
            System.out.println("Invalid Input");
        }
        scan.close();
    }
}