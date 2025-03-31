import java.util.Arrays;
import java.util.LinkedList;

class Point {
	public Point() {
	}

	public Point(Point p) {
		this.row = p.row;
		this.col = p.col;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d, %d)", row, col);
	}

	public int row;
	public int col;

};

public class StepsToZero {

	public static int[][] updateMatrix(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;
		LinkedList<Point> board = new LinkedList<Point>();

		int[][] ans = new int[rows][cols];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				if (mat[row][col] == 0) {
					ans[row][col] = 0;
					Point p = new Point();
					p.row = row;
					p.col = col;
					board.add(p);
				} else {
					ans[row][col] = Integer.MAX_VALUE;
				}
			}
		}

		// System.out.println(board);

		while (true) {
			if (board.size() == 0)
				break;
			Point p = board.poll();
			Point[] dirs = new Point[4];
			dirs[0] = new Point();
			dirs[0].row = 1;
			dirs[0].col = 0;
			dirs[1] = new Point();
			dirs[1].row = -1;
			dirs[1].col = 0;
			dirs[2] = new Point();
			dirs[2].row = 0;
			dirs[2].col = 1;
			dirs[3] = new Point();
			dirs[3].row = 0;
			dirs[3].col = -1;
			// System.out.println(String.format("Get %d,%d", p.row, p.col));
			for (Point d : dirs) {
				Point temp = new Point(p);
				temp.row += d.row;
				temp.col += d.col;
				// System.out.println(String.format("%d,%d", temp.row,
				// temp.col));
				if (0 <= temp.row && temp.row < rows && 0 <= temp.col && temp.col < cols) {
					int orig = ans[p.row][p.col];
					int cur = ans[temp.row][temp.col];
					if (orig + 1 < cur) {
						ans[temp.row][temp.col] = ans[p.row][p.col] + 1;
						board.add(temp);
					}
				}
			}
		}
		return ans;
	}

	public static void demo() {
		int[][] mat = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int[][] ans = updateMatrix(mat);
		for (int row = 0; row < ans.length; row++) {
			for (int col = 0; col < ans[row].length; col++) {
				System.out.print(ans[row][col] + ", ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
