// The "Typer" class.
import java.awt.*;
import hsa.Console;
import hsa.*;
import java.lang.Math;

public class Typer
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console (38,195);
	String line;
	c.setTextColor(Color.green);
	c.setTextBackgroundColor(Color.black);
	char key = ' ';
	TextInputFile input = new TextInputFile("code.txt");
	c.fillRect(0,0,1600,800);
	while (!input.eof())
	{
	    key = c.getChar();
	    line = input.readLine();
	    c.println(line);
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Typer class
