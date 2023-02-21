package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class CarOwnerTest {

    private static final String JOHN_DOE = "John Doe";
    private Car car;
    private CarOwner carOwner;

    @Test
    public void getName() {
        
        assertEquals(JOHN_DOE, carOwner.getName());
    }
    @Before
    public void extracted() {
        carOwner = new CarOwner(JOHN_DOE, car);
    }
    @Before
    public void setUp() {
        car = new Car("Beetle");
    }

}