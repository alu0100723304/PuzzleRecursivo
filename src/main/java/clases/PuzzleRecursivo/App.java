package clases.PuzzleRecursivo;

import java.util.ArrayList;

/**
 * Cuerpo Principal.
 * @author Joel Perez Ramos
 */
public class App 
{
    public static void main( String[] args ) {
		Puzzle P = new Puzzle();
		ArrayList<String> miS = new ArrayList<String>();
		ArrayList<String> miU = new ArrayList<String>();

		miU.add("a");
		miU.add("b");
		miU.add("c");
		// miU.add("d");

		P.PuzzleSolve(3, miS, miU);
    }
}
