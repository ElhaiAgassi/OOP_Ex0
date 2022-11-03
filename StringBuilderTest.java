
import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;

public class StringBuilderTest {


    /**
     * test1- testing the stringbuilder we make combined with undo.
      */

    @Test
    void test1() {
       MyStringBuilder sb = new MyStringBuilder();
        sb.append("");
        sb.undo();
        assertEquals(sb,"");
        sb.append("to be or not to be");
        assertEquals(sb, "to be or not to be");
        sb.replace(3,5,"eat");
        assertEquals(sb,"to eat or not to be");
        sb.delete(0,2);
        assertEquals(sb,"eat or not to be");
        sb.undo();
        assertEquals(sb,"to eat or not to be");

    }

    /**
     * test2 - testing the stringbuilder we make combined with undo.
     */

    @Test
    void test2() {
        MyStringBuilder sb1 = new MyStringBuilder();
        sb1.append("take me to church");
        sb1.insert(17," I'll worship like a dog");
        assertEquals(sb1,"take me to church I'll worship like a dog");
        sb1.undo();
        assertEquals(sb1,"take me to church");
        sb1.undo();
        assertEquals(sb1,"take me to church I'll worship like a dog");
        sb1.delete(31,35);
        assertEquals(sb1,"take me to church I'll worship a dog");


    }
}


