public class MyStringBuilder {
/*
    Appends the specified string to this character sequence.
*/

    public StringBuilder append(String str) {
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
    }

    /*
        Inserts the string into this character sequence.
    */

    public StringBuilder insert(int offset, String str) {

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
    public StringBuilder replace(int start, int end, String str)

    /*
        Causes this character sequence to be replaced by the reverse of the sequence.
    */
    public StringBuilder reverse() {
    }

    public static void undo() {
    }

}
