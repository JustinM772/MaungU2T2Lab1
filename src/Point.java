public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(int value) {
        x = value;
        y = value;
    }
    public Point() {
        x = 0;
        y = 0;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int newX) {
        x = newX;
    }
    public void setY(int newY) {
        y = newY;
    }
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }
    public String quadrant() {
        int num1 = x;
        int num2 = y;
        if (num1 == 0 && num2 == 0) {
            return "origin";
        } else if (num1 == 0) {
            return "on an axis";
        } else if (num2 == 0) {
            return "on an axis";
        } else if (num1 > 0 && num2 > 0) {
            return "I";
        } else if (num1 < 0 && num2 > 0) {
            return "II";
        } else if (num1 < 0 && num2 < 0) {
            return "III";
        } else if (num1 > 0 && num2 < 0) {
            return "IV";
        } else {
            return " ";
        }
    }

}
