public class Coord {
    private int x;
    private int y;
    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coord() {
        int x, y;
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public boolean equals(Object o) {
        if (o instanceof Coord) {
            Coord c = (Coord)o;
            if (c.x == this.x && c.y == this.y) {
                return true;
            }
            return false;
        }
        return false;
    }
}
