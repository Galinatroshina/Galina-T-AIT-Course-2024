package homework_17;

public class Cube {

    private int cubeSideA;

    public Cube(int cubeSideA) {
        this.cubeSideA = cubeSideA;
    }

    public int cubeP(){
        return 12 * cubeSideA;
    }

    public int cubeS(){
        return 6 * cubeSideA * cubeSideA;
    }

    public int cubeV(){
        return cubeSideA * 3;
    }

    public void display(){
        System.out.println("Side: " + cubeSideA + " Cube Perimeter: " + cubeP() + " Cube Area: " + cubeS() + " Cube Volume: " + cubeV());
    }
}
