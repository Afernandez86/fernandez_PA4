/*
Create a separate class called 'Application' that contains a main method which illustrates
the use of 'DuplicateRemover' by calling both the 'remove' and 'write' methods.

Your input file must be called 'problem1.txt' and your
output file must be called 'unique_words.txt'.

 */

package com.jetbrains;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException
    {
        //creates 'duplicateRemover' object from 'DuplicateRemover' class
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        //input file called 'problem1.text'
        duplicateRemover.remove("problem1.txt");

        //outputFile called 'unique_words.txt'
        duplicateRemover.write("unique_words.txt");
    }
}
