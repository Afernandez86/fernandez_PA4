/*
Create a class called 'DuplicateCounter'.

Create an instance method called 'count' that takes a single
parameter called 'dataFile' (representing the path to a text file)
and uses a Map of Strings to count how many times each word occurs
in 'dataFile'.

The counts should be stored in an instance variable called
'wordCounter'.

Create an instance method called 'write' that takes a single
parameter called 'outputFile' (representing the path to a
text file) and writes the contents of 'wordCounter' to the file
pointed to by 'outputFile'.

The output file should be overwritten if it already exists, and
created if it does not exist.
 */

//imports used
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

class DuplicateCounter
{
    // count stored in 'wordCounter'
    Map<String, Integer> wordCounter = new HashMap<String, Integer> ();

    //method 'count' with single parameter 'dataFile'
    public void count(String dataFile) throws IOException
    {
        // Map of Strings count how many times each word occurs in 'dataFile'
        BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile));
        String line1 = bufferedReader.readLine();
        while(line1 != null)
        {
            String tempWords[] = line1.split(" ");
            for(String words : tempWords)
            {
                if (!wordCounter.containsKey(words))
                {
                    wordCounter.put(words, 1);
                }
                else
                {
                    int count = wordCounter.get(words);
                    wordCounter.put(words, count + 1);
                }
            }
            line1 = bufferedReader.readLine();
        }
        bufferedReader.close();
    } //end 'count' method

    //method 'write' with one parameter 'outputFile'
    public void write(String outputFile) throws FileNotFoundException
    {
        //writes 'wordCounter' into the file pointed to by 'outputFile'
        PrintWriter printWriter = new PrintWriter(outputFile);
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet())
        {
            printWriter.println(entry.getKey() + " : " + entry.getValue());
        }
        printWriter.close();
    } //end 'write' method

} //end 'DuplicateCounter' class
