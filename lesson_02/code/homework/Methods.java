package homework;

public class Methods {

    public static void main(String[] args) {

        System.out.println("start");
        method01(); // вызов
        System.out.println("finish");

    } //end of main

    public static void method01(){

        System.out.println("method01 start");
        method02();
        System.out.println("method01 finish");
    }

    public static void method02(){
        System.out.println("method02 start");
        method03();
        System.out.println("method02 finish");
    }

    public static void method03(){
        System.out.println("method03 start");
        System.out.println("method03 finish");
    }


}



