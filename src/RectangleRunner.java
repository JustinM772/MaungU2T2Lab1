public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        plot1.setWidth(75);
        plot2.setWidth(75);
        plot2.setLength(75);
        plot3.setWidth(75);
        int a1 = plot1.calculateArea();
        int a2 = plot2.calculateArea();
        int a3 = plot3.calculateArea();
        System.out.println("These three plots require " + (a1 + a2 + a3) + " square feet of seed");
    }
}
