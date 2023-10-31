import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person passengers;

    @Before
    public void before() {passengers = new Person("John");
    }

    @Test
    public void hasName(){
        assertEquals("John", passengers.getName());
    }

    @Test
    public void addPerson(){
        assertEquals(2, passengers.addPer);
    }
}
