
public class Zigzag {
	public static String convert_slow(String s, int numRows) {
		int rows = numRows;
		int cols = 0;
		if (numRows <= 2) {
			cols = s.length() / rows;
		}
		else {
			cols = s.length() / (2 * rows - 2);
			cols *= (1 + (rows - 2));
		}

		int left = 0;
		if (numRows <= 2)
			left = s.length() % rows;
		else
			left = s.length() % (2 * rows - 2);
		left -= rows;
		cols++;

		if (left > 0) {
			cols += left;
		}
		char[][] board = new char[rows][cols];

		// state machine
		int state = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < s.length(); i++) {
			board[row][col] = s.charAt(i);
			state = getState(i, rows, state);
			if (state == 0) {
				if (row < rows - 1)
					row++;
			} else if (state == 1) {
				if (row > 0)
					row--;
				col++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (row = 0; row < rows; row++) {
			for (col = 0; col < cols; col++) {
				if (0x0 != board[row][col])
					sb.append(board[row][col]);
			}
		}
		return sb.toString();
	}

	private static int getState(int i, int rows, int state) {
		int remainder = 0;
		if (rows <= 2)
			remainder = i % rows;
		else
			remainder = i % (2 * rows - 2);
		if (remainder < rows - 1)
			return 0;
		return 1;
	}

	public static void demo() {
		System.out.println(convert("PAYPALISHIRING", 4));
	}

	private static String convert(String s, int numRows) {
		int blocker = 0;
		int jump = 0;
		if (numRows <= 2) {
			jump = numRows;
			blocker = numRows;
		}
		else {
			jump = (2 * numRows - 2);
			blocker = (2 * numRows - 2);
		}

		StringBuilder sb = new StringBuilder();
		for (int row = 0; row < numRows; row++) {
			int index = row;
			while (true) {
				if (index >= s.length()) {
					break;
				}
				sb.append(s.charAt(index));
				if (0 < blocker && blocker < jump && index + blocker < s.length() )
					sb.append(s.charAt(index + blocker));
				index += jump;
			}
			blocker -= 2;
		}
		return sb.toString();
	}

}
