package is.hi.hbv202g.ass6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class CarTest {
    private static final String BEETLE = "Beetle";
    private Car car;

    @Test
    public void getNameOfCar() {
        
        Car car=this.car;
        assertEquals(BEETLE, car.getName());
    }
    @Before
    public void setUp() {
        this.car = new Car(BEETLE);
    }

}
