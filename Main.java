public class Main {
    int A[][] = {
            {1, 1, 0, 1},
            {1, 0, 1, 0},
            {1, 1, 1, 0},
            {0, 0, 1, 1}
    };
    int[][] path = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public static void main(String[] args) {
        Main main = new Main();
        if (main.findPath(0, 0, 4)) {
            main.printPath();
        } else {
            System.out.println("No path found.");
        }
    }

    public boolean findPath(int i, int j, int n) {
        if (i == n-1  && j == n-1 ) {
            path[i][j] = 1;
            return true;
        }
        if (A[i][j] == 1) {
            path[i][j] = 1;  // Corrected assignment operator
            if (findPath(i, j + 1, n))
                return true;  // Corrected method invocation
            if (findPath(i + 1, j, n))
                return true;  // Corrected method invocation
            path[i][j] = 0;  // Corrected assignment operator

        }
        return false;  // Corrected return value
    }
    public void printPath() {
        System.out.println("Path found:");
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[i].length; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
    }
}
