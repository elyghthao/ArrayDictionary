import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);

        //delete below this later
        dict.remove(4);
//        dict.remove(2);
        dict.remove(7);
        dict.remove(4);
        System.out.println(dict);


    }

    @Test
    public void remove() {
        // homework

        //empty dictionary
        //returns false
        ArrayDictionary test1 = new ArrayDictionary(5) ;
        assertFalse(test1.remove(7));

        //key exists in a dictionary that has no collision
        //returns true
        ArrayDictionary test2 = new ArrayDictionary(5);
        test2.add(0,45);
        test2.add(1,56);
        test2.add(2,3);
        test2.add(3,7);
        test2.add(4,1);
        assertTrue(test2.remove(2));

        //key does not exists in dictionary that has no collision
        //returns false
        ArrayDictionary test3 = new ArrayDictionary(5);
        test3.add(0,45);
        test3.add(1,56);
        test3.add(2,3);
        test3.add(3,7);
        test3.add(4,1);
        assertFalse(test2.remove(7));

        //key exists in a dictionary that has collision, key is in the collision
        //returns true
        ArrayDictionary test4 = new ArrayDictionary(5);
        test4.add(2,3);
        test4.add(7,25);
        assertTrue(test4.remove(7));

        //key exists in a dictionary that has collision, key is not in the collision
        //returns false
        ArrayDictionary test5 = new ArrayDictionary(5);
        test5.add(2,3);
        test5.add(7,25);
        assertFalse(test4.remove(12));

        //key does not exists in a dictionary that has collision
        //returns false
        ArrayDictionary test6 = new ArrayDictionary(5);
        test5.add(2,3);
        test5.add(7,25);
        assertFalse(test4.remove(1));

    }

    @Test
    public void contains() {
        // homework
        assertTrue(false);  // place holder
    }
}