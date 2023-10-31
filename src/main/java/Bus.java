import java.util.ArrayList;

public class Bus {

    private String destination;

    private ArrayList<Person> passengers;

    private int capacity;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.passengers = new ArrayList<>();
        this.capacity = capacity;
    }

    public ArrayList<Person> getPassengers() {
        return passengers;
    }

//    public void addPerson(Person person) {
//        this.passengers.add(person);
//    }

    public void addPerson(Person person) {
        if (this.getPassengerListSize() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public int getPassengerListSize(){
        return this.passengers.size();
    }

    public void removePerson(Person person) {
        this.passengers.remove(person);
    }



}
