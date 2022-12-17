import java.util.ArrayList;

import static java.awt.geom.Arc2D.OPEN;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> family = new ArrayList<>();
        family.add(new Brother());
        family.add(new Sister());
        family.add(new Mother());
        family.add(new Father());
        family.add(new GrandMaPa());
        family.add(new GrandPaPa());
        family.forEach(System.out::println);
//        Sister.Study (1);
    }

    public void Helper() {
        // Родители помогают получить высшее образование детям
    }

    public void Study(int n) {
        // Родители помогают получить высшее образование детям
            if (n == Learnability.OPEN)
                System.out.println("Learn is opened");
            else if (n == Learnability.CLOSED)
                System.out.println("Learn is closed");
            else
                System.out.println("is invalid");
        }


    public void DiscussInGroup() {
        // Чат с общением по разным веткам родителей (линия папы и линия мамы)
    }

    public void Journey() {
        // Чат для совместных поездок
    }

}

