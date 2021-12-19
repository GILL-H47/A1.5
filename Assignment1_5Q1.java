import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;
/** ***************************************************
 *  Name:           Harmeet Gill
 *  Class:          CS30S
 * 
 *  Assignment:     A1.5 Q1
 * 
 *  Description:    Generates 1000 numbers
 * 
 *************************************************************/

public class Assignment1_5Q1 {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        final int MAX = 1000;

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        int Random = 0;

        // a new line character that works on every computer system

        String nl = System.lineSeparator();

        // ***** objects *****

        Random r = new Random();          // Number Generator

        //Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Harmeet Gill" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1_5 Q1" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        fout.print(banner);

        // ***** Get Input *****

        // prompt for input
        // read input from keyboard
        // echo input back to console window

        // ***** Main Processing *****

        for(int i = 0; i < MAX; i++){

            Random = (r.nextInt(50) +1);

            // print random numbers
            System.out.println(Random);
            fout.println(Random);

        }

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        fout.close();
    } // end main 

} // end FormatTemplate