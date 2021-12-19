import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;

/** ***************************************************
 *  Name:           Harmeet Gill
 *  Class:          CS30S
 * 
 *  Assignment:     A1.5
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class Assignment1_5Q2 {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        final int FINALINT = 50;               // Fianl Int
        final int MAX = 1000;                  // Amount of numbers that are in array

        // ***** variables *****

        int counter = 0;                       // Counter

        int [] frequency = new int [FINALINT];
        int [] numbers = new int [MAX];        // Array

        String prompt1 = "";

        int sip = 0;                           // variable that stores input prompt
        int specificnum = 0;                   // finds the 

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        BufferedReader fin = null;      // input buffer

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        try{
            fin = new BufferedReader(new FileReader("outfile"));
        } // end try
        catch(FileNotFoundException e){
            System.out.println("file not found");
            fin = null;
        } // end catch

        //BufferedReader fin = new BufferedReader(new FileReader("outfile.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Harmeet Gill" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  A1.5 Q2" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** Get Input *****

        // prompt for input
        // read input from keyboard
        // echo input back to console window

        // ***** Main Processing ***** 

        // ***** Print Formatted Output *****

        // strin = fin.readLine();
        // while(strin != null){
            // System.out.println(strin);
        // }// end while

        for (strin = fin.readLine();strin != null;strin = fin.readLine()) {
            //Loading the array
            numbers[counter] = Integer.parseInt(strin);

            counter++;
        }

        for(int i = 0; i < counter; i++){
            frequency[numbers[i] - 1]++;
        }//end of for loop

        for(int i = 0; i < FINALINT; i++){
            System.out.println(i+1+ ":"+frequency[i]);
        }//end of for loop

        //asking user for any ranges to see
        prompt1 = "Would you like to see any fq of any number, Yes for next question "; 

        System.out.println(prompt1 + nl + nl);
        sip = scanner.nextInt();

        for(int i = 0; i < FINALINT; i++){
            specificnum = frequency[sip - 1];
        }
        //printing out specific range number
        System.out.println(sip + " had a frequency of " + specificnum + nl + nl);

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");

        // **** close io buffers *****

        //fin.close();
        //fout.close();
    } // end main 

} // end fromattemplate
