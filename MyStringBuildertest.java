import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStringBuildertest {

    UndoableStringBuilder sb = new UndoableStringBuilder();

    @Test
    void append()  {
        sb.undo();
        assertEquals("", sb.toString());
        assertEquals("to do list", sb.append("to do list").toString());
        assertEquals("to do list checked!",  sb.append(" checked!").toString());
        sb.undo();
        assertEquals("to do list", sb.toString());
        sb.undo();
        assertEquals("", sb.toString());
    }

    @Test
    void delete() throws Exception {
        assertEquals("to be or not to be", sb.append("to be or not to be").toString());
        assertEquals("be or not to be",sb.delete(0,3).toString());
        sb.undo();
        assertEquals("to be or not to be", sb.toString());

    }

    @Test
    void insert() throws Exception {
        sb.append("to do or not to do");
        assertEquals("to go to sleep do or not to do", sb.insert(2, " go to sleep").toString());
        sb.undo();
        assertTrue(true, "to be or not to be");
        sb.undo();
        assertEquals("", sb.toString());
    }

    @Test
    void replace() throws Exception {
        sb.append("to be or not to be");
        assertEquals("to eat or not to be", sb.replace(3, 5, "eat").toString());
        sb.replace(17, 19, "eat");
        assertTrue(true, "to eat or not to eat");
        sb.undo();
        sb.undo();
        sb.undo();
        assertEquals("", sb.toString());
    }

    @Test
    void reverse() {
        sb.append("to eat or not to eat");
        sb.reverse();
        assertEquals("tae ot ton ro tae ot", sb.toString());
        sb.reverse();
        assertEquals("to eat or not to eat", sb.toString());
        sb.undo();
        sb.undo();
        assertTrue(true,"to eat or not to eat");

    }


    @Test
    void exceptionTesting() throws Exception {
        sb.append("to be or not to be");
        assertThrows(Exception.class,() -> sb.replace(20,23,"eat"),"out of bound");
        sb.insert(17,"ee");
        assertEquals("to be or not to beee",sb.toString());
        assertThrows(Exception.class,() -> sb.insert(24, "!"),"out of bound");
        assertThrows(Exception.class, ()-> sb.delete(25,26), "start is greater then the string length");
        assertThrows(Exception.class,() -> sb.delete(-1, 0), "start is negative");
    }
}

