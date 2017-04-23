
public class Tree {

	public int id;
	// ga��zie
	public Tree l;
	public Tree r;

	// konstruktor drzewa/ga��zi - ka�da nowa ga���/drzewo jest wierzcho�kiem w
	// momencie utworzenia obiektu
	public Tree(int id) {
		this.id = id;
		l = null;
		r = null;
	}

}

class Solution {

	public Tree root;

	public int solution(Tree root, int id) {

		// Funkcja startuje od korzenia na poziomie 0.
		return solutionHelper(root, id, 0);

	}

	/*
	 * Funkcja pomocnicza. Je�li id r�wna si� id w�z�a funkcja zwraca poziom =
	 * 0. Je�li nie zachodzi r�wno��, funkcja rekurencyjnie sprawdza lew� i
	 * praw� odnog� na kolejnym poziomie.
	 */

	public int solutionHelper(Tree root, int id, int level) {

		// je�li nie istnieje w�ze� funkcja zwraca -1
		if (root == null) {
			return -1;
		}

		if (root.id == id) {
			return level;
		}

		int nextLevel = solutionHelper(root.l, id, level + 1);
		if (nextLevel >= 0) {
			return nextLevel;
		}

		nextLevel = solutionHelper(root.r, id, level + 1);
		return nextLevel;

	}

}