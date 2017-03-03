import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by flori on 03/03/2017.
 */
public class MyDateTest {

    private MyDate date1;
    private MyDate date2;
    private MyDate date3;
    private MyDate date4;

    @org.junit.Before
    public void setUp() throws Exception {
        date1 = new MyDate(14, 7, 2008);
        date2 = new MyDate(29, 12, 1997);
        date3 = new MyDate(32, 4, 2000);
        date4 = new MyDate(31, 12, 3999);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        date1 = null;
        date2 = null;
        date3 = null;
        date4 = null;
    }

    @org.junit.Test
    public void isMyDate() throws Exception {
        assertNotNull(date1);
        assertNotNull(date2);
        assertNotNull(date3);
        assertNotNull(date4);
    }

    @org.junit.Test
    public void isCheckedData() throws Exception {
        boolean checked1 = date1.checkData();
        assertTrue(checked1);
        boolean checked2 = date2.checkData();
        assertTrue(checked2);
        boolean checked3 = date3.checkData();
        assertFalse(checked3);
        boolean checked4 = date4.checkData();
        assertFalse(checked4);
    }

    @org.junit.Test
    public void isNextedDay() throws Exception {

    }
}