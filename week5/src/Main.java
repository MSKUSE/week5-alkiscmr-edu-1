public class Main {
    public static void main(String[] args) {



point p1 = new Point();
        System.out.println(p1.xCoord);
        System.out.println()

point p2 = new Point(x:3,y:4);
        System.out.println(p2.xCoord);
        System.out.println()

point p3 = new Point(x: 5);
        System.out.println(p3.xCoord);
        System.out.ptintln()

Rectangle r1 = new Rectangle(
        new Point((x:3),
sideA: 4,
sideB: 5
        );

        System.out.println(r1.getsideA());
        System.out.println(r1.getsideB());
        System.out.println(r1.gettopLeft().xCoord);
        System.out.println(r1.gettopLeft().yCoord);

        System.out.println(r1.perimeter());
        System.out.println(r1.area());
}


}
