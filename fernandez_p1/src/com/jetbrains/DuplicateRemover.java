/*
Create a utility class called 'DuplicateRemover'.

Create an instance method called 'remove' that takes a single parameter called 'dataFile'
(representing the path to a text file) and uses a Set of Strings to eliminate
duplicate words from dataFile.

The unique words should be stored in an instance variable called 'uniqueWords'.

Create an instance method called 'write' that takes a single parameter called 'outputFile'
(representing the path to a text file) and writes the words contained in uniqueWords to the
file pointed to by outputFile.

The output file should be overwritten if it already exists, and created if it does not exist.
 */

package com.jetbrains;

//imports used
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class DuplicateRemover
{
    //array list to store 'uniqueWords'
    ArrayList<String> uniqueWords = new ArrayList<String>();

    //instance method 'remove' with one parameter 'dataFile"
    public void remove(String dataFile) throws IOException
    {
        //eliminate duplicate words
        BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile));
        String line1 = bufferedReader.readLine();

        //loop that eliminates duplicate words using a set of strings
        while(line1 != null)
        {
            String tempWords[] = line1.split(" ");
            for(String words : tempWords)
            {
                if(!uniqueWords.contains(words))   uniqueWords.add(words);
            }
            line1 = bufferedReader.readLine();
        }
        bufferedReader.close();
    } //end 'remove' method

    //instance method 'write' with one parameter 'outputFile'
    public void write(String outputFile) throws FileNotFoundException
    {
        //writes words contained in 'uniqueWords' to file pointed to by outputFile
        PrintWriter printWriter = new PrintWriter(outputFile);
        for(String words : uniqueWords)
        {
            printWriter.println(words);
        }
        printWriter.close();
    } // end 'write' method

} //end 'DuplicateRemover' class
