import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.Exception;
/*
 * Thanks goes to Paul Gestwicki for his suggestion on a cross-platform unit testing procedure for capturing system
 * output.
 * Original source here: http://paulgestwicki.blogspot.com/2011/03/unit-testing-javas-systemout-output.html
 */

public class ProblemSet01Test {

    static ByteArrayOutputStream baos;

    @Before
    public void setUp() throws Exception {
        baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }

    @After
    public void tearDown() throws Exception {
        baos.flush();
        baos.reset();
        baos.close();
    }

    @Test
    public void testHelloWorld(){
        try{
            String fileName = "helloWorldExample.in.txt";
            ProblemSet01.helloWorld(fileName);
            baos.flush();
            String whatWasPrinted = new String(baos.toByteArray());
            String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 2, linesOfOutput.length);
            assertEquals("Incorrect first line of output.","Hello, Jesse.", linesOfOutput[0]);
            assertEquals("Incorrect second line of output.", "Hello, Taylor.", linesOfOutput[1]);
            baos.reset();
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            fileName = "helloWorld.in.txt";
            ProblemSet01.helloWorld(fileName);
            baos.flush();
            whatWasPrinted = new String(baos.toByteArray());
            linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines.", 4275, linesOfOutput.length);
            assertEquals("Failed for a case of a multi-word first name.", "Hello, PATRICIA.", linesOfOutput[1]);
            assertEquals("Failed for a case of a hyphenated first name.", "Hello, LINDA-JANE.", linesOfOutput[2]);
            assertEquals("Failed for a case of a multi-word first name.", "Hello, ALLYN.", linesOfOutput[linesOfOutput.length-1]);
            baos.reset();
        }
        catch (Exception e){
            e.printStackTrace();
            fail("Exception during program execution thrown.");
        }

    }

    @Test
    public void testTriangularNumbers() throws Exception{
        try {
            String fileName = "triangularNumbersExample.in.txt";
            ProblemSet01.triangularNumbers(fileName);
            baos.flush();
            String whatWasPrinted = new String(baos.toByteArray());
            String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 4, linesOfOutput.length);
            assertEquals("Incorrect first line of output.", "1 = 1", linesOfOutput[0]);
            assertEquals("Incorrect second line of output.", "2 = 3", linesOfOutput[1]);
            assertEquals("Incorrect third line of output.", "5 = 15", linesOfOutput[2]);
            assertEquals("Incorrect third line of output.", "10 = 55", linesOfOutput[3]);
            baos.reset();
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            
            fileName = "triangularNumbers.in.txt";
            ProblemSet01.triangularNumbers(fileName);
            baos.flush();
            whatWasPrinted = new String(baos.toByteArray());
            linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 746, linesOfOutput.length);
            assertEquals("Incorrect first line of output.", "107 = 5778", linesOfOutput[0]);
            assertEquals("Incorrect line of output.", "81 = 3321", linesOfOutput[13]);
            assertEquals("Incorrect line of output.", "171 = 14706", linesOfOutput[745]);
        }
        catch (Exception e){
            e.printStackTrace();
            fail("Exception during program execution thrown.");
        }
    }

    @Test
    public void testMario(){
        try{

            String fileName = "marioExample.in.txt";
            ProblemSet01.mario(fileName);
            baos.flush();
            String whatWasPrinted = new String(baos.toByteArray());
            String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 6, linesOfOutput.length);
            assertEquals("Incorrect bottom of the pyramid for N = 4.", "#####", linesOfOutput[linesOfOutput.length-1]);
            assertEquals("Incorrect top of the pyramid for N = 2.", " ##", linesOfOutput[0]);
            baos.reset();
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            fileName = "mario.in.txt";
            ProblemSet01.mario(fileName);
            baos.flush();
            whatWasPrinted = new String(baos.toByteArray());
            linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 8, linesOfOutput.length);
            assertEquals("Incorrect bottom of the pyramid for N = 8.", "#########", linesOfOutput[linesOfOutput.length-1]);
            assertEquals("Incorrect top of the pyramid for N = 8.", "       ##", linesOfOutput[0]);
        }
        catch (Exception e){
            e.printStackTrace();
            fail("Exception during program execution thrown.");
        }

    }

    @Test
    public void testUrlify(){
        try{
            String fileName = "urlifyExample.in.txt";
            ProblemSet01.urlify(fileName);
            baos.flush();
            String whatWasPrinted = new String(baos.toByteArray());
            String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 2, linesOfOutput.length);
            assertEquals("Incorrect first line of output.", "Mr%20John%20Smith", linesOfOutput[0]);
            assertEquals("Incorrect second line of output.", "Who%20let%20the%20dogs%20out", linesOfOutput[1]);
            baos.reset();
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            fileName = "urlify.in.txt";
            ProblemSet01.urlify(fileName);
            baos.flush();
            whatWasPrinted = new String(baos.toByteArray());
            linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 3, linesOfOutput.length);
            assertEquals("Incorrect line of output.", "hungry%20hungry%20hippos", linesOfOutput[0]);
            assertEquals("Incorrect last line of output.", "two%20%20spaces", linesOfOutput[2]);
            baos.reset();

        }

        catch (Exception e){
            e.printStackTrace();
            fail("Exception during program execution thrown.");
        }
    }

    @Test
    public void testFourOneOne(){
        try{
            String fileName = "fourOneOneExample.in.txt";
            ProblemSet01.fourOneOne(fileName);
            baos.flush();
            String whatWasPrinted = new String(baos.toByteArray());
            String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 2, linesOfOutput.length);
            assertEquals("Incorrect first line of output.", "12 numbers, 8 evens (66.67%)", linesOfOutput[0]);
            assertEquals("Incorrect second line of output.", "4 numbers, 2 evens (50.00%)", linesOfOutput[1]);
            baos.reset();
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            fileName = "fourOneOne.in.txt";
            ProblemSet01.fourOneOne(fileName);
            baos.flush();
            whatWasPrinted = new String(baos.toByteArray());
            linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines.", 1, linesOfOutput.length);
            assertEquals("Failed for a case with the same number of evens and odds.", "4 numbers, 2 evens (50.00%)", linesOfOutput[0]);
            baos.reset();

        }
        catch (Exception e){
            e.printStackTrace();
            fail("Exception during program execution thrown.");
        }
    }

    @Test
    public void testPokemon(){
        try{
            String fileName = "pokemonExample.in.txt";
            ProblemSet01.pokemon(fileName);
            baos.flush();
            String whatWasPrinted = new String(baos.toByteArray());
            String[] linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Printed an incorrect number of lines to output.", 2, linesOfOutput.length);
            assertEquals("Incorrect first line of output.", "Complete set obtained at 1.", linesOfOutput[0]);
            assertEquals("Incorrect second line of output.", "Complete set obtained at 2.", linesOfOutput[1]);
            baos.reset();
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            fileName = "pokemon.in.txt";
            ProblemSet01.pokemon(fileName);
            baos.flush();
            whatWasPrinted = new String(baos.toByteArray());
            linesOfOutput = whatWasPrinted.split(System.getProperty("line.separator"));
            assertEquals("Incorrect line of output.", "Complete set obtained at 1.", linesOfOutput[0]);
            baos.reset();
        }
        catch (Exception e){
            e.printStackTrace();
            fail("Exception during program execution thrown.");
        }
    }



}