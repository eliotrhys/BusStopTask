import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop myBusStop;
    Person fred;
    Bus myBus;

    @Before
    public void before(){
        myBusStop = new BusStop("Castle Terrace");
        fred = new Person();
        myBus = new Bus("Candyland", 10);

    }

    @Test
    public void canAddPersonToQueue(){
        myBusStop.addPerson(fred);
        assertEquals(1, myBusStop.personCount());
    }
}
