import javax.management.loading.PrivateClassLoader;
import java.util.LinkedList;

public class PacManGame {

    //private int x, y;
    int grid[][] = {
            {2, 0, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 0, 2},
            {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 2},
            {2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 0, 2, 2},
            {2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 0, 2, 2},
            {2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 0, 2, 2},
            {2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 2, 2, 2, 0, 2, 0, 2, 2, 2, 2, 0, 2},
            {0, 0, 2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 0, 0, 2, 0, 2, 2, 2, 2, 0, 2},
            {0, 0, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0, 2},
            {2, 0, 2, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 2},
            {2, 0, 2, 2, 0, 0, 2, 0, 2, 2, 2, 2, 0, 2},
            {2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2}};

    enum Move {TOP, BOTTOM, LEFT, RIGHT} //mosse

    enum Status {IN_GAME, OVER, WIN} //stato del gioco
    //public static Status currentStatus;
    public static Status currentStatus = Status.IN_GAME; // stato attuale del gioco
    private int point;
    private int smile;

    LinkedList<Coord> face = new LinkedList<>();
    public int m;
    public int n;

    public PacManGame(int n, int m) {


        this.n = n;
        this.m = m;
        face.addFirst(new Coord(1, 2));
}
    public void move(Move m) {
        //for (int x=0; x < this.grid.length; x++){
            //for (int y=0; y < this.grid[x].length; y++){
                Coord face = this.face.getFirst();
                if (m == Move.RIGHT) {
                        this.face.addFirst(new Coord(face.getX(), face.getY()+1));
                    }

                if (m == Move.LEFT) {
                    this.face.addFirst(new Coord(face.getX(), face.getY()-1));
                    }

                if (m == Move.TOP) {
                    this.face.addFirst(new Coord(face.getX()+1, face.getY()));
                    }

                if (m == Move.BOTTOM) {
                    this.face.addFirst(new Coord(face.getX()-1, face.getY()));
                    }
                    this.face.removeLast();
                }

public String toString() {
        String result = this.currentStatus + "\n";
        for (int x = 0; x < this.grid.length; x++) {
            result += "[";
            for (int y = 0; y < this.grid[x].length; y++) {
                if (this.face.contains(new Coord(x, y))) {
                    result += "[ \uD83D\uDE0E ]";
                } else {
                    result += "["+"    "+"]";
                }

            }
            result += "]\n";
        }
        return result;
    }
}



