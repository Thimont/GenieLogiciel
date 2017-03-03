import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by flori on 03/03/2017.
 */
public class MyDateTest {

    private MyDate date1;
    private MyDate date2;
    private MyDate date3;
    private MyDate date4;
    private MyDate date5;
    private MyDate date6;

    @org.junit.Before
    public void setUp() throws Exception {
        date1 = new MyDate(14, 7, 2008);
        date2 = new MyDate(29, 12, 1997);
        date3 = new MyDate(32, 4, 2000);
        date4 = new MyDate(31, 12, 3999);
        date5 = new MyDate(31, 12, 1999);
        date6 = new MyDate(29, 2, 2000);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        date1 = null;
        date2 = null;
        date3 = null;
        date4 = null;
        date5 = null;
        date6 = null;
    }

    @org.junit.Test
    public void isMyDate() throws Exception {
        assertNotNull(date1);
        assertNotNull(date2);
        assertNotNull(date3);
        assertNotNull(date4);
        assertNotNull(date5);
        assertNotNull(date6);
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
        boolean checked5 = date5.checkData();
        assertTrue(checked5);
        boolean checked6 = date6.checkData();
        assertTrue(checked6);
    }

    @org.junit.Test
    public void isNextedDay() throws Exception {
        ArrayList<MyDate> myDates = new ArrayList<>(4);

        myDates.add(date1.nextDay());
        myDates.add(date2.nextDay());
        myDates.add(date5.nextDay());
        myDates.add(date6.nextDay());

        ArrayList<MyDate> myDatesExpected = new ArrayList<>(4);

        myDatesExpected.add(new MyDate(15, 7, 2008));
        myDatesExpected.add(new MyDate(30, 12, 1997));
        myDatesExpected.add(new MyDate(1, 1, 2000));
        myDatesExpected.add(new MyDate(1, 3, 2000));

        for(int i = 0, j = 0; i < myDatesExpected.size() && j < myDates.size(); i++, j++) {
            assertEquals(myDatesExpected.get(i).getDay(), myDates.get(j).getDay());
            assertEquals(myDatesExpected.get(i).getMonth(), myDates.get(j).getMonth());
            assertEquals(myDatesExpected.get(i).getYear(), myDates.get(j).getYear());
        }
    }
}