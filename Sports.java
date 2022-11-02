class Sportsperson {
    String name, sport;
    int age;

    public Sportsperson (String name, String sport, int age) {
        this.name = name;
        this.sport = sport;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " +name);
        System.out.println("Sport: " +sport);
        System.out.println("Age: " +age);
    }
}

class Athlete extends Sportsperson {
    int events;

    public Athlete(String name, int age, int events) {

        super(name, "Athlete", age);
        this.events = events;
    }

    public int getEvents() {
        return events;
    }

    public void setEvents(int events) {
        this.events = events;
    }

    void displayDetails() {

        System.out.println("Name:" +name);
        System.out.println("Sport:" +sport);
        System.out.println("No. of Events:" +events);
        System.out.println("Age:" +age);
    }
}

class Hockey extends Sportsperson {
    int goals;

    public Hockey(String name, int age, int goals) {

        super(name, "Hockey", age);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    void displayDetails() {

        System.out.println("Name:" +name);
        System.out.println("Sport:" +sport);
        System.out.println("No. of Goals:" +goals);
        System.out.println("Age:" +age);
    }
}

public class Sports {
    public static void main (String [] args){
        Sportsperson p1 = new Athlete("Gautam", 30, 20);
        p1.displayDetails();
        Sportsperson p2 = new Hockey("Ram", 27, 17);
        p2.displayDetails();
    }
}
