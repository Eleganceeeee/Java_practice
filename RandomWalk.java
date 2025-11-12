import java.util.Random;

public class RandomWalk {
    public static void main(String[] args) {
        char[][] grid = new char[10][10];
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                grid[i][j] = '.';

        Random rand = new Random();
        int x = 0, y = 0;
        char letter = 'A';
        grid[x][y] = letter;

        while (letter < 'Z') {
            int direction = rand.nextInt(4); // 0=上,1=右,2=下,3=左
            int newX = x, newY = y;
            switch (direction) {
                case 0 -> newX--;
                case 1 -> newY++;
                case 2 -> newX++;
                case 3 -> newY--;
            }

            if (newX < 0 || newX >= 10 || newY < 0 || newY >= 10 || grid[newX][newY] != '.') {
                // 检查是否四面堵死
                boolean blocked = true;
                for (int[] d : new int[][]{{-1,0},{1,0},{0,-1},{0,1}}) {
                    int tx = x + d[0], ty = y + d[1];
                    if (tx >= 0 && tx < 10 && ty >= 0 && ty < 10 && grid[tx][ty] == '.') {
                        blocked = false;
                        break;
                    }
                }
                if (blocked) break;
                continue;
            }

            grid[newX][newY] = ++letter;
            x = newX;
            y = newY;
        }

        for (char[] row : grid) {
            for (char c : row)
                System.out.print(c + " ");
            System.out.println();
        }
    }
}