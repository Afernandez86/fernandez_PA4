/*
Create a separate class called 'Application' that contains a main method
which illustrates the use of 'DuplicateCounter' by calling both the 'remove'
and 'write' methods.

Your input file must be called 'problem2.txt' and your output file must be
called 'unique_word_counts.txt'.
 */

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException
    {
        // uses 'DuplicateCounter' to call 'count' and 'write' methods
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        // uses the 'count' method
        duplicateCounter.count("problem2.txt");

        // uses the 'write' method
        duplicateCounter.write("unique_word_counts.txt");

    } //end 'main' method
} // end 'Application' class
