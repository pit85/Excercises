
public class Tree {

	public int id;
	// ga³êzie
	public Tree l;
	public Tree r;

	// konstruktor drzewa/ga³êzi - ka¿da nowa ga³¹Ÿ/drzewo jest wierzcho³kiem w
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
	 * Funkcja pomocnicza. Jeœli id równa siê id wêz³a funkcja zwraca poziom =
	 * 0. Jeœli nie zachodzi równoœæ, funkcja rekurencyjnie sprawdza lew¹ i
	 * praw¹ odnogê na kolejnym poziomie.
	 */

	public int solutionHelper(Tree root, int id, int level) {

		// jeœli nie istnieje wêze³ funkcja zwraca -1
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