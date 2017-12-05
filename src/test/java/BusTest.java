import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus myBus;
    Person fred;
    Person johnny;

    @Before
    public void before(){
        myBus = new Bus("Candyland", 10);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, myBus.passengerCount());
    }

    @Test
    public void addPassenger(){
        myBus.addPassenger(fred);
        assertEquals(1, myBus.passengerCount());
    }

    @Test
    public void busCapacityFull(){
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        assertEquals(10, myBus.passengerCount());
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        myBus.addPassenger(fred);
        assertEquals(10, myBus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        myBus.addPassenger(fred);
        myBus.removePassenger();
        assertEquals(0, myBus.passengerCount());
    }

}
