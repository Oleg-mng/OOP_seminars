import java.util.ArrayList;

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
    }

    public void Helper() {
        // Родители помогают получить высшее образование детям
    }
    public void Study() {
        // Родители помогают получить высшее образование детям
    }
    public void DiscussInGroup() {
        // Чат с общением по разным веткам родителей (линия папы и линия мамы)
    }
    public void Journey() {
        // Чат для совместных поездок
    }
}

