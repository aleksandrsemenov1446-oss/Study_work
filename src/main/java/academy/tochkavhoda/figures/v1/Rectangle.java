package academy.tochkavhoda.figures.v1;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point leftTop, Point rightBottom){
        this.topLeft = leftTop;
        this.bottomRight = rightBottom;
    }
    // 2. Геттеры для углов
    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    // 3. Длина (по вертикали)
    public int getLength() {
        return bottomRight.getX() - topLeft.getX();
    }

    // 4. Ширина (по горизонтали)
    public int getWidth() {
        return bottomRight.getY() - topLeft.getY();
    }
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom){
        this.topLeft = new Point(xLeft, yTop);
        this.bottomRight = new Point(xRight, yBottom);
    }
    public Rectangle(int length, int width){
        this.topLeft = new Point(0, -width);
        this.bottomRight = new Point(length, 0);
    }
    public Rectangle(){
        this.topLeft = new Point(0,-1);
        this.bottomRight = new Point(1, 0);

    }
    public void setTopLeft(Point topLeft){
        this.topLeft = topLeft;
    }
    public void setBottomRight(Point bottomRight){
        this.bottomRight = bottomRight;
    }
    public void moveRel(int x, int y){
        topLeft.moveRel(x, y);
        bottomRight.moveRel(x, y);
    }
    public void moveTo(int dx, int dy){
        int lenght = getLength();
        int width = getWidth();
        topLeft.moveTo(dx, dy);
        bottomRight.moveTo(dx + lenght, dy + width);
    }
    public void moveTo(Point point){
        moveTo(point.getX(), point.getY());
    }
    public void resize(double ratio){
        int newWidth = (int)(getWidth() * ratio);
        int newLength = (int)(getLength() * ratio);

        bottomRight.moveTo(topLeft.getX() + newWidth, topLeft.getY() + newLength);
    }
    public void stretch(double xRatio, double yRatio){
        int newWidth = (int)(getWidth() * xRatio);
        int newLength = (int)(getLength() * yRatio);

        bottomRight.moveTo(topLeft.getX() + newWidth, topLeft.getY() + newLength);
    }
    public double getArea(){
        return getLength() * getWidth();
    }
    public double getPerimeter(){
        return getLength() * 2 + getWidth() * 2;
    }
    public boolean isInside(int x, int y){ //Определяет, лежит ли точка (x, y) внутри Rectangle. Если точка лежит на стороне, считается, что она лежит внутри.
        return topLeft.getX() <= x && x <= bottomRight.getX() && topLeft.getY() <= y && y <= bottomRight.getY();
    }
    public boolean isInside(Point point){
        return isInside(point.getX(), point.getY());
    }
    public boolean isIntersects(Rectangle rectangle) {

        int left1 = this.topLeft.getX();
        int right1 = this.bottomRight.getX();
        int top1 = this.topLeft.getY();
        int bottom1 = this.bottomRight.getY();

        int left2 = rectangle.getTopLeft().getX();
        int right2 = rectangle.getBottomRight().getX();
        int top2 = rectangle.getTopLeft().getY();
        int bottom2 = rectangle.getBottomRight().getY();

        if (right1 < left2 || right2 < left1 || bottom1 < top2 || bottom2 < top1) {
            return false;
        }

        return true;
    }
    public boolean isInside(Rectangle rectangle) {
        int left1 = this.topLeft.getX();
        int right1 = this.bottomRight.getX();
        int top1 = this.topLeft.getY();
        int bottom1 = this.bottomRight.getY();

        int left2 = rectangle.getTopLeft().getX();
        int right2 = rectangle.getBottomRight().getX();
        int top2 = rectangle.getTopLeft().getY();
        int bottom2 = rectangle.getBottomRight().getY();

        return left2 >= left1 && right2 <= right1 &&
                top2 >= top1 && bottom2 <= bottom1;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (!topLeft.equals(rectangle.topLeft)) return false;
        return bottomRight.equals(rectangle.bottomRight);
    }

    @Override
    public int hashCode() {
        int result = topLeft.hashCode();
        result = 31 * result + bottomRight.hashCode();
        return result;
    }


}
