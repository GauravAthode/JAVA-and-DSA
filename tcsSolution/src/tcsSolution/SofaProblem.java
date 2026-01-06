package tcsSolution;

import java.util.*;

public class SofaProblem {

    static class State {
        int x, y, orient; // orient: 0 = horizontal, 1 = vertical
        State(int x, int y, int orient) {
            this.x = x;
            this.y = y;
            this.orient = orient;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof State)) return false;
            State s = (State) o;
            return x == s.x && y == s.y && orient == s.orient;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x, y, orient);
        }
    }

    static int M, N;
    static char[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        grid = new char[M][N];

        List<int[]> startCells = new ArrayList<>();
        List<int[]> goalCells = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = sc.next().charAt(0);
                if (grid[i][j] == 's') startCells.add(new int[]{i, j});
                if (grid[i][j] == 'S') goalCells.add(new int[]{i, j});
            }
        }

        State start = buildState(startCells);
        State goal = buildState(goalCells);

        int result = bfs(start, goal);
        if (result == -1) System.out.println("Impossible");
        else System.out.println("Minimum Steps = " + result);
    }

    static State buildState(List<int[]> cells) {
        int x1 = cells.get(0)[0], y1 = cells.get(0)[1];
        int x2 = cells.get(1)[0], y2 = cells.get(1)[1];
        if (x1 == x2) { // horizontal
            return new State(x1, Math.min(y1, y2), 0);
        } else { // vertical
            return new State(Math.min(x1, x2), y1, 1);
        }
    }

    static int bfs(State start, State goal) {
        Queue<State> q = new LinkedList<>();
        Map<State, Integer> dist = new HashMap<>();
        q.add(start);
        dist.put(start, 0);

        while (!q.isEmpty()) {
            State cur = q.poll();
            int steps = dist.get(cur);

            // Debug Print current sofa position
            System.out.println("\nStep " + steps + ":");
            printGrid(cur);

            if (cur.equals(goal)) {
                System.out.println("\nGoal Reached!");
                return steps;
            }

            // try moves
            for (int[] d : new int[][]{{1,0},{-1,0},{0,1},{0,-1}}) {
                State nxt = move(cur, d[0], d[1]);
                if (nxt != null && !dist.containsKey(nxt)) {
                    dist.put(nxt, steps+1);
                    q.add(nxt);
                }
            }

            // try rotations
            for (State nxt : rotate(cur)) {
                if (!dist.containsKey(nxt)) {
                    dist.put(nxt, steps+1);
                    q.add(nxt);
                }
            }
        }
        return -1;
    }

    static State move(State cur, int dx, int dy) {
        int x = cur.x, y = cur.y, o = cur.orient;

        if (o == 0) { // horizontal (two cells: (x,y) and (x,y+1))
            int nx1 = x + dx, ny1 = y + dy;
            int nx2 = x + dx, ny2 = y+1 + dy;
            if (inBounds(nx1, ny1) && inBounds(nx2, ny2) &&
                isFree(nx1, ny1) && isFree(nx2, ny2)) {
                return new State(nx1, ny1, o);
            }
        } else { // vertical (two cells: (x,y) and (x+1,y))
            int nx1 = x + dx, ny1 = y + dy;
            int nx2 = x+1 + dx, ny2 = y + dy;
            if (inBounds(nx1, ny1) && inBounds(nx2, ny2) &&
                isFree(nx1, ny1) && isFree(nx2, ny2)) {
                return new State(nx1, ny1, o);
            }
        }
        return null;
    }

    static List<State> rotate(State cur) {
        List<State> res = new ArrayList<>();
        int x = cur.x, y = cur.y, o = cur.orient;

        if (o == 0) { // horizontal
            // rotate down
            if (x+1 < M &&
                isFree(x,y) && isFree(x,y+1) &&
                isFree(x+1,y) && isFree(x+1,y+1)) {
                res.add(new State(x,y,1));
                res.add(new State(x,y+1,1));
            }
            // rotate up
            if (x-1 >= 0 &&
                isFree(x,y) && isFree(x,y+1) &&
                isFree(x-1,y) && isFree(x-1,y+1)) {
                res.add(new State(x-1,y,1));
                res.add(new State(x-1,y+1,1));
            }
        } else { // vertical
            // rotate right
            if (y+1 < N &&
                isFree(x,y) && isFree(x+1,y) &&
                isFree(x,y+1) && isFree(x+1,y+1)) {
                res.add(new State(x,y,0));
                res.add(new State(x+1,y,0));
            }
            // rotate left
            if (y-1 >= 0 &&
                isFree(x,y) && isFree(x+1,y) &&
                isFree(x,y-1) && isFree(x+1,y-1)) {
                res.add(new State(x,y-1,0));
                res.add(new State(x+1,y-1,0));
            }
        }

        return res;
    }

    static boolean inBounds(int x, int y) {
        return x >= 0 && x < M && y >= 0 && y < N;
    }

    static boolean isFree(int x, int y) {
        return grid[x][y] != 'H';
    }

    // Print current grid with sofa
    static void printGrid(State s) {
        char[][] copy = new char[M][N];
        for (int i = 0; i < M; i++) {
            copy[i] = grid[i].clone();
        }

        if (s.orient == 0) { // horizontal
            copy[s.x][s.y] = '*';
            copy[s.x][s.y+1] = '*';
        } else { // vertical
            copy[s.x][s.y] = '*';
            copy[s.x+1][s.y] = '*';
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(copy[i][j] + " ");
            }
            System.out.println();
        }
    }
}


