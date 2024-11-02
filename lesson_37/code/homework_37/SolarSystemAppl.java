package homework_37;
//Занести планеты солнечной системы в список, содержащий:
//
//наименование;
//расстояние до Солнца;
//массу;
//количество спутников.
//Вывести список планет отсортированный по:
//
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SolarSystemAppl {

    public static void main(String[] args) {

        //list

        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", 57.9, 0.33, 0));
        planets.add(new Planet("Venus", 108.2, 4.87, 0));
        planets.add(new Planet("Earth", 149.6, 5.97, 1));
        planets.add(new Planet("Mars", 227.9, 0.642, 2));
        planets.add(new Planet("Jupiter", 778.3, 1898, 79));
        planets.add(new Planet("Saturn", 1427, 568, 83));
        planets.add(new Planet("Uranus", 2871, 86.8, 27));
        planets.add(new Planet("Neptune", 4495, 102, 14));

        System.out.println("List of planets: ");
        planets.forEach(System.out::println);

        System.out.println("---------- Sort by distance to Sun ----------------");
        planets.sort(Comparator.comparingDouble(Planet::getDistanceToSun));
        planets.forEach(System.out::println);

        System.out.println("---------- Sort by name ----------------");
        planets.sort(Comparator.comparing(Planet :: getName));
        planets.forEach(System.out::println);

        System.out.println("---------- Sort by mass ----------------");
        planets.sort(Comparator.comparingDouble(Planet :: getMass));
        planets.forEach(System.out::println);

        System.out.println("---------- Sort by quantity of satellites ----------------");
        planets.sort(Comparator.comparingDouble(Planet :: getSatellite));
        planets.forEach(System.out::println);

    }

}
