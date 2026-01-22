package academy.tochkavhoda.introduction;

public class ZeroSteps1 {

    public int sum (int x, int y){
        return x + y;
    }
    public int mul (int x, int y){
        return x * y;
    }
    public int div (int x, int y){
        return x / y;
    }
    public int mod (int x, int y){
        return x % y;
    }
    public boolean isEqual (int x, int y){
        return x == y;
    }
    public boolean isGreater (int x, int y){
        return y < x;
    }
    public double calculateTriangleSquare(int side1, int side2){
        return (side1 * side2) /2.0;
    }
    public double calculateTrianglePerimeter(int side1, int side2){
        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        return hypotenuse + side1 + side2;
    }
    public int reverseNumber(int number) {
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;

        return c * 100 + b * 10 + a;
    }
    public long calculate15Degree(int number){
        long n2 = (long) number * number;
        long n4 = n2 * n2;
        long n8 = n4 * n4;
        long n16 = n8 * n8;

        return n16 / number;
    }
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return xLeft <= x && x <= xRight && yTop <= y && y <= yBottom;
    }
    public double sqrtAbs(int number) {
        return Math.sqrt(Math.abs(number));
    }
    public boolean isTriangleExist(int side1, int side2, int side3){
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;

    }
    public int getDigitsProduction(int number) {
        int n = Math.abs(number);

        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;

        return a * b * c * d;
    }
    public boolean isCircleInsideSquare(int radius, int side) {
        return 2 * radius < side;
    }
    public char getCharByCode(short code) {
        return (char) code;
    }
    public short getCodeByChar(char character) {
        return (short) character;
    }
    public char getCharByCodeAndOffset(char ch, short offset) {
        return (char) (ch + offset);
    }
    public boolean isGreaterOrEqual(char ch1, char ch2) {
        return ch1 >= ch2;
    }
    public char getAverageChar(char ch1, char ch2) {
        return (char) ((ch1 + ch2) / 2);
    }



}
