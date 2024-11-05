package homework_39.courses;

import java.util.HashSet;
import java.util.Set;

public class CoursesAppl {

    public static void main(String[] args) {

        //сохдаем список студентов на два курса
        Set<String> mathCourse = new HashSet<>();
        Set<String> infCourse = new HashSet<>();

        //добавляем студентов на курсы
        mathCourse.add("Galina");
        mathCourse.add("Polina");
        mathCourse.add("Alexander");
        mathCourse.add("Dmitri");

        infCourse.add("Alina");
        infCourse.add("Alexander");
        infCourse.add("Dmitri");
        infCourse.add("Lucas");

        //список студентов, которые записаны на оба курса, т.н. пересечение?
        Set<String> allCourses = new HashSet<>(mathCourse);
        allCourses.retainAll(infCourse); //retain - метод, котоырцй вычисляет тех, кто так же есть на курсе информатики
        System.out.println("Students from both of coursers: " + allCourses);

        //список студентов, которые записаны только на один курс
        Set<String> oneCourse = new HashSet<>(infCourse);
        oneCourse.addAll(mathCourse); //добавляем всех с математического курса к курсу по информатике
        oneCourse.removeAll(allCourses); //удалем дублирующихся
        System.out.println("Students from only one of course: " + oneCourse);

    }
}
