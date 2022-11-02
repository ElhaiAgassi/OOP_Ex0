import java.util.Stack;

public class MyStringBuilder {
    /*
        Appends the specified string to this character sequence.
    */
    StringBuilder the_string;
    Stack<StringBuilder> memory;


    public MyStringBuilder() {
        the_string = new StringBuilder();
        memory = new Stack<>();
    }


    public StringBuilder append(String str) {
        memory.add(the_string);
        return the_string.append(str);
    }
    /*
        Removes the characters in a substring of this sequence. The substring begins
    */

    /*
        at the specified start and extends to the character at index
        end - 1 or to the end of the sequence if no such character exists.
        If start is equal to end, no changes are made.
    */
    public StringBuilder delete(int start, int end) {
        memory.add(the_string);
        return the_string.delete(start, end);
    }

    /*
        Inserts the string into this character sequence.
    */

    public StringBuilder insert(int offset, String str) {
        memory.add(the_string);
        return the_string.insert(offset, str);
    }

    /*
        Replaces the characters in a substring of this sequence with characters in
    */

    /*
        the specified String. The substring begins at the specified start and
        extends to the character at index end - 1 or to the end of the sequence if
        no such character exists. First the characters in the substring are removed
        and then the specified String is inserted at start. (This sequence will be
        lengthened to accommodate the specified String if necessary).
    */
    public StringBuilder replace(int start, int end, String str) {
        memory.add(the_string);
        return the_string.replace(start, end, str);
    }

    /*
        Causes this character sequence to be replaced by the reverse of the sequence.
    */
    public StringBuilder reverse() {
        memory.add(the_string);
        return the_string.reverse();
    }

    public void undo() {
        this.the_string = memory.pop();
    }

}
