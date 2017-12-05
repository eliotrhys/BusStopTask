import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String inputDestination, int inputCapacity){
        this.destination = inputDestination;
        this.capacity = inputCapacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Person person){
        if (this.passengers.size() < this.capacity)
        {
            this.passengers.add(person);
        }
        else
            {
                System.out.println("Nope!");
        }
    }

    public Person removePassenger(){
        return this.passengers.remove(0);
    }


}
