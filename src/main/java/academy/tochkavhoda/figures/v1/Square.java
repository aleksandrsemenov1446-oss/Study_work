package academy.tochkavhoda.figures.v1;

public class Square {
    private Point topLeft;
    private int size;

    public Square(Point leftTop, int size) {
        this.topLeft = leftTop;
        this.size = size;
    }

    public Square(int xLeft, int yTop, int size) {
        this.topLeft = new Point(xLeft, yTop);
        this.size = size;
    }

    public Square(int size) {
        this.topLeft = new Point(0, -size);
        this.size = size;
    }

    public Square() {
        this.topLeft = new Point(0, -1);
        this.size = 1;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return new Point(topLeft.getX() + size, topLeft.getY() + size);
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getLength() {
        return size;
    }

    public void moveTo(int x, int y) {
        topLeft.moveTo(x, y);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        topLeft.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        this.size = (int)(size * ratio);
    }

    public double getArea() {
        return size * size;
    }

    public double getPerimeter() {
        return 4 * size;
    }

    public boolean isInside(int x, int y) {
        return x >= topLeft.getX() && x <= topLeft.getX() + size &&
                y >= topLeft.getY() && y <= topLeft.getY() + size;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    public boolean isIntersects(Square square) {
        int left1 = this.topLeft.getX();
        int right1 = left1 + this.size;
        int top1 = this.topLeft.getY();
        int bottom1 = top1 + this.size;

        int left2 = square.getTopLeft().getX();
        int right2 = left2 + square.getLength();
        int top2 = square.getTopLeft().getY();
        int bottom2 = top2 + square.getLength();

        return !(right1 < left2 || right2 < left1 || bottom1 < top2 || bottom2 < top1);
    }

    public boolean isInside(Square square) {
        int left1 = this.topLeft.getX();
        int right1 = left1 + this.size;
        int top1 = this.topLeft.getY();
        int bottom1 = top1 + this.size;

        int left2 = square.getTopLeft().getX();
        int right2 = left2 + square.getLength();
        int top2 = square.getTopLeft().getY();
        int bottom2 = top2 + square.getLength();

        return left2 >= left1 && right2 <= right1 &&
                top2 >= top1 && bottom2 <= bottom1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return size == square.size && topLeft.equals(square.topLeft);
    }

    @Override
    public int hashCode() {
        int result = topLeft.hashCode();
        result = 31 * result + size;
        return result;
    }
}