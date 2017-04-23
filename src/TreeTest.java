
public class TreeTest {

	public static void main(String[] args) {

		Solution tree = new Solution();

		try {

			tree.root = new Tree(1);
			tree.root.l = new Tree(3);
			tree.root.r = new Tree(4);
			tree.root.r.l = new Tree(5);
			tree.root.r.r = new Tree(7);
			tree.root.r.r.l = new Tree(12);
			tree.root.r.l.l = new Tree(8);
			tree.root.r.l.l.l = new Tree(9);
			tree.root.r.l.l.r = new Tree(10);

			/*
			Nieprawid≥owy wÍze≥ tree.root.r.r.r.r.r.r = new Tree(11);
			 */

			for (int i = 1; i <= 15; i++) {

				int level = tree.solution(tree.root, i);
				if (level >= 0) {
					System.out.println("Poziom wÍz≥a o id=" + i + " wynosi " + level + ".");
				} else {
					System.out.println("WÍze≥ o id=" + i + " nie istnieje.");
				}

			}

		} catch (NullPointerException e) {

			System.out.println("èle skonstruowane drzewo binarne.");
		}

	}

}
