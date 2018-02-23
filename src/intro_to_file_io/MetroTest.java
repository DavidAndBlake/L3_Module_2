package intro_to_file_io;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class MetroTest {
	busStops metro = new busStops();

	 @Test
	    public void test1() {
	    ArrayList<int[]> list = new ArrayList<int[]>();
	    list.add(new int[] {10,0});
	    list.add(new int[] {3,5});
	    list.add(new int[] {2,5});
	    assertEquals(5, metro.countPassengers(list));
	    }



}
