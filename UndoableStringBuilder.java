import java.util.EmptyStackException;
import java.util.Stack;

public class UndoableStringBuilder {
    /**
     * @author Elhai Agassi & Danielle Musai
     */
      StringBuilder the_string;
      Stack<String> memory;

    public UndoableStringBuilder() {
        the_string = new StringBuilder();
        memory = new Stack<>();
    }
    @Override
    public String toString(){ return this.the_string.toString();}

    /**
     * Returns an Image object that can then be painted on the screen.
     * The url argument must specify an absolute. The name
     * argument is a specifier that is relative to the url argument.
     * <p>
     * Causes this character sequence to be replaced by the reverse of the sequence.
     * This method always returns immediately, whether the
     * image exists. When this applet attempts to draw the image on
     * the screen, the data will be loaded. The graphics primitives
     * that draw the image will incrementally paint on the screen.
     * <p> </p>
     * appends the specified string to this character sequence
     *
     * @param str an absolute URL giving the base location of the image
     * @return the string after action
     * @see StringBuilder
     *
     * </p>
     * /*
     */

    public StringBuilder append(String str) {
            memory.add(this.the_string.append(str).toString());
            return the_string;
        }

    /**
     * Removes the characters in a substring of this sequence. The substring begins
     * at the specified start and extends to the character at index
     * end - 1 or to the end of the sequence if no such character exists.
     * If start is equal to end, no changes are made.
     * StringIndexOutOfBoundsException - if start is negative,greater than length(), or greater than end.
     *
     * @param start - the first number
     * @param end   - the second number
     * @return what we get from those numbers
     */

    public StringBuilder delete(int start, int end) throws Exception {
        if (0 > start || start > the_string.length() || start > end) {
            throw new Exception("out of bound");
        } else {
            memory.add(the_string.delete(start, end).toString());
            return the_string;
        }
    }

    /**
     * Inserts the string into this character sequence.
     * StringIndexOutOfBoundsException - if the offset is invalid.
     *
     * @param offset - the first number
     * @param str    - the string who get into this sentense
     * @return - what we get from the combination those two.
     */

    public StringBuilder insert(int offset, String str) throws Exception {
        if (the_string.length() - 1 < offset) {
            throw new Exception("out of bound");
        } else {
            memory.add(the_string.insert(offset, str).toString());
            return the_string;
        }
    }
    /**
     * Replaces the characters in a substring of this sequence with characters in
     * the specified String. The substring begins at the specified start and
     * extends to the character at index end - 1 or to the end of the sequence if
     * no such character exists. First the characters in the substring are removed
     * and then the specified String is inserted at start. (This sequence will be
     * lengthened to accommodate the specified String if necessary).
     * StringIndexOutOfBoundsException - if start is negative, greater than length(), or greater than end.
     * @param start - the first number
     * @param end   - the second number
     * @return - what we get from those two numbers.
     */

    public StringBuilder replace(int start, int end, String str) throws Exception {
        if (0 > start || start > the_string.length() || start > end) {
            throw new Exception("out of bound");
        } else {
            memory.add( this.the_string.replace(start, end, str).toString());
            return the_string;
        }
    }


        /**
         * Causes this character sequence to be replaced by the reverse of the
         * sequence.
         *
         * @return - reverse character sequence.
         */

    public StringBuilder reverse() {
        memory.add(the_string.reverse().toString());
        return the_string;
    }

    /**
     * undo allows users to correct their mistakes and also to try out different aspects of the
     * application without risk of repercussions. At minimum, an undo/redo mechanism should provide
     * users with the ability to: Unexecute (undo) the last action they just performed.
     * Re-execute (redo) the last undone action
     */

    public void undo() {
        try {
            this.memory.pop();
            this.the_string = new StringBuilder();
            this.the_string.append(this.memory.peek());
        }
        catch (EmptyStackException e) {
            System.out.println("Empty Stack");
        }
    }

    public static void main(String[] args) throws Exception {

        UndoableStringBuilder usb = new UndoableStringBuilder();
        usb.append("to be or not to be");
        System.out.println(usb);
        usb.replace(3, 5, "eat");
        System.out.println(usb);
        usb.replace(17, 19, "eat");
        System.out.println(usb);
        usb.reverse();
        System.out.println(usb);
        System.out.println();
        usb.undo();
        System.out.println(usb);
        usb.undo();
        System.out.println(usb);
        usb.undo();
        System.out.println(usb);
    }
}