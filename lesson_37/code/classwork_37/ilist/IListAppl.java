package classwork_37.ilist;

import classwork_28.car_garage.ait.cars.model.Car;
import classwork_37.ilist.model.IList;
import classwork_37.ilist.model.IListImpl;

import java.util.ArrayList;
import java.util.List;

public class IListAppl {

    public static void main(String[] args) {

        //список с целыми числами
        IList<Integer> listOfAge= new IListImpl<>(100);

        listOfAge.add(61);
        listOfAge.add(38);
        listOfAge.add(37);
        listOfAge.add(35);
        listOfAge.add(44);
        listOfAge.add(27);
        listOfAge.add(48);
        listOfAge.add(41);
        listOfAge.add(34);
        listOfAge.add(47);
        listOfAge.add(35);
        listOfAge.add(60);

        System.out.println(listOfAge.size());
        System.out.println(listOfAge.indexOf(61));
        System.out.println(listOfAge.indexOf(35));

        System.out.println(listOfAge);
        for (Integer i : listOfAge){
            System.out.println(i);
        }

        System.out.println(listOfAge);
        int index = 0;
        for (Integer i : listOfAge){
            System.out.println(index++ + " : " + i);
        }

        int sum = 0;
        for (Integer i : listOfAge){
            sum += i;
        }
        System.out.println("-------------------------------");
        System.out.println(sum);
        double avgAge = (double) sum / listOfAge.size();
        System.out.println(avgAge);

        IList<String> listOfNames = new IListImpl<>();
        listOfNames.add("Galina");
        System.out.println(listOfNames.size());
        listOfNames.add("Leonid");
        listOfNames.add("Artyom");
        listOfNames.add("Jurij");
        listOfNames.add("Diana");
        listOfNames.add("Jurij");
        listOfNames.add(null);
        listOfNames.add("German");

        for (String str : listOfNames){
            System.out.println(index++ + " : " + str);
        }

        String strTotal = "";
        for (String str : listOfNames){
            strTotal += str;
        }
        System.out.println(strTotal);

        listOfNames.remove(3);
        listOfNames.remove("Leonid");

        index = 0;
        for (String str : listOfNames){
            System.out.println(index++ + " : " + str);

        }



    }

}
