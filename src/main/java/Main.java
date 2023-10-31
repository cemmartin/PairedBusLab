public class Main {

    public static void main(String[] args) {

        Person keith = new Person("Keith");
        System.out.println(keith.getName());

        Bus bus1 = new Bus("Portobello", 50);
        Bus bus2 = new Bus("Currie", 40);
        Person morag = new Person("Morag");
        Person jack = new Person("Jack");

        bus1.addPerson(morag);
        bus1.addPerson(jack);

        System.out.println(bus1.getPassengerListSize());
        bus1.removePerson(jack);
        System.out.println(bus1.getPassengerListSize());



    }
}
