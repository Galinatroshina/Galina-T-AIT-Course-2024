package methods;

public class Circus {

    public static void main(String[] args) {

        lightOn();
        entertainer();
        lightsOff();

    } // end of main

    public static void lightOn(){
        System.out.println("Lights ONNNN!!!");
    }

    public static void lightsOff(){
        System.out.println("Lights OFF!");
    }

    public static void entertainer(){
        jogger();
        cloun();
        singer();
    }


    public static void jogger(){
        System.out.println("Im jogging...");
    }

    public static void cloun(){
        System.out.println("Im joking...");
    }

    public static void singer(){
        System.out.println("Im singing...");
    }




} // end of class
