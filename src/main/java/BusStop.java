import java.util.ArrayList;
import java.util.Queue;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String inputName){
        this.name = inputName;
        this.queue = new ArrayList<>();
    }

    public int personCount(){
        return this.queue.size();
    }


    public void addPerson(Person person) {
        this.queue.add(person);
    }
}
