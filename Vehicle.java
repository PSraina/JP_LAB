public interface Vehicle {
    void NumberOftyres();

    public static void main (String [] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bicycle();
        Vehicle v3 = new AutoRickshaw();
        Vehicle v4 = new Bike();
        v1.NumberOftyres();
        v2.NumberOftyres();
        v3.NumberOftyres();
    }
}

class Car implements Vehicle {
    public void NumberOftyres() {
        System.out.println("Number of Tyres in Car: " + 4);
    }
}

class Bicycle implements Vehicle {
    public void NumberOftyres() {
        System.out.println("Number of Tyres in Bicycle: " + 2);
    }
}

class AutoRickshaw implements Vehicle {
    public void NumberOftyres() {
        System.out.println("Number of Tyres in AutoRickshaw: " + 3);
    }
}

class Bike implements Vehicle {
    public void NumberOftyres() {
        System.out.println("Number of Tyres in Bike: " +2);
    }
}
