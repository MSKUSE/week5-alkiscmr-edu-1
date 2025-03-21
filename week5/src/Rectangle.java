public class Rectangle {


    private Point topLeft;
    private int sideA, sideB;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setSideA(int sideA) {
        if (sideA < 0) {
            this.sideA = 0;
            System.out.println("TSide A cannot be negative.");
        }
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B cannot be negative.");
        }
    }

    public int perimeter(){
        return (2*this.sideA) + (2*this.sideB);
    }
    public int area(){
        return this.sideA * this.sideB;
    }
}