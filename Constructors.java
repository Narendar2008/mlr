class DefaultConstructorExample {
    int number;
    String name;

    public static void main(String[] args) {
        DefaultConstructorExample obj = new DefaultConstructorExample();
        System.out.println("Number: " + obj.number + ", Name: " + obj.name);
    }
}

class ParameterizedConstructorExample {
    int number;
    String name;

    // Parameterized constructor
    public ParameterizedConstructorExample(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void display() {
        System.out.println("Number: " + number + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        ParameterizedConstructorExample obj = new ParameterizedConstructorExample(42, "Alice");
        obj.display();
    }
}


class CopyConstructorExample {
    int number;
    String name;

    // Parameterized constructor
    public CopyConstructorExample(int number, String name) {
        this.number = number;
        this.name = name;
    }

    // Copy constructor
    public CopyConstructorExample(CopyConstructorExample obj) {
        this.number = obj.number;
        this.name = obj.name;
    }

    public void display() {
        System.out.println("Number: " + number + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        CopyConstructorExample obj1 = new CopyConstructorExample(10, "Bob");
        CopyConstructorExample obj2 = new CopyConstructorExample(obj1);
        obj2.display();
    }
}


class NoArgConstructorExample {
    int number;
    String name;

    // No-argument constructor
    public NoArgConstructorExample() {
        this.number = 0;
        this.name = "Default Name";
    }

    public void display() {
        System.out.println("Number: " + number + ", Name: " + name);
    }
}
