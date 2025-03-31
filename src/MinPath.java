
public class MinPath {
	public static int minTimeToVisitAllPoints(int[][] points) {
		int ans = 0;
		for (int i = 0; i < points.length - 1; i++){
			int x1 = points[i][0];
			int y1 = points[i][1];
			int x2 = points[i + 1][0];
			int y2 = points[i + 1][1];
			int dx = Math.abs(x2 - x1);
			int dy = Math.abs(y2 - y1);
//			int diff = Math.abs(dx - dy);
			int dist = Math.max(dx, dy);
			ans += dist;
		}
		return ans;
	}

	public static void demo() {
		int[][] points = {{1,1},{3,4},{-1,0}};
		System.out.println(minTimeToVisitAllPoints(points));
	}
}
