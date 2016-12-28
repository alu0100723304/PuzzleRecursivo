package clases.PuzzleRecursivo;

import java.util.ArrayList;

/**
 * Puzzle Recursivo.
 * @author Joel Perez Ramos
 */
public class Puzzle {
	/**
	 * Metodo Recursivo para resolver el problema.
	 * @param K
	 * @param S
	 * @param U
	 */
	public void PuzzleSolve(int K, ArrayList<String> S, ArrayList<String> U) {
		for (int e = 0; e < U.size(); e++) {
			S.add(U.get(e));
			U.remove(e);

			if (K == 1) {
				System.out.print("{ ");
				for (int j = 0; j < S.size(); j++) {
					System.out.print(S.get(j));
				}
				System.out.println(" }");
			}

			else {
				PuzzleSolve(K - 1, S, U);
			}
			U.add(e, S.get(S.size() - 1));
			S.remove(S.size() - 1);
		}
	}
}
