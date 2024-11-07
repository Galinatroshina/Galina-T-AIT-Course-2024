package classwork_41.citizens.dao;

import classwork_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens {

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;


    //0(1) constant time
    //create a 3 empty ArrayLists
    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }


    // O(n log n) - where n is the size of list???
    // O(n log n) — Квазилинейная сложность. Время выполнения растет как n * log n и часто встречается в алгоритмах эффективной сортировки (from GPT)
    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // O(log n)
    // This method is used to add a Person object to the CitizensImpl
    @Override
    public boolean add(Person person) {
        // it checks if the person parameter is null. it returns false to indicate that the addition was unsuccessful
        if (person == null) {
            return false;
        }
        // this method returns the index of the element if it is found, or a negative value if it is not found
        int index = Collections.binarySearch(idList, person); // search for the person in the idList
        if (index >= 0) { // if the person is found, it returns false
            return false;
        }
        index = -index - 1; // if the person is not found, the method calculates the correct index to insert the person into the idList
        idList.add(index, person); // adds the person to the idList at the calculated index
        // repeats the process of finding the correct index to insert the person into the ageList and lastNameList
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person);
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person);
        return true;
    }

    //O(log n)
    // This method is used to remove a Person object from the CitizensImpl based on their ID
    @Override
    public boolean remove(int id) {
        Person victim = find(id); //method to retrieve the Person object with the given id
        if (victim == null) { //if the Person object is not found (i.e., the find() method returns null)
            return false; //the method returns false to indicate that the removal was unsuccessful
        }
        //if the Person object is found, the method removes it from the idList, ageList, and lastNameList
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true; // it returns true to indicate that the Person object was successfully removed
    }


    //O(log n)
    // this method is used to find a Person object in the CitizensImpl based on their ID
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now()); //new Person object with the given id and an empty name and date
        int index = Collections.binarySearch(idList, pattern); // search for the Person object in the idList
        return index < 0 ? null : idList.get(index); //if the Person object is found (index >= 0), the method returns the Person. If not found (index < 0), the method returns null
    }

    //O(log n) + m, m is number of persons in the age range
    // this method is used to find all Person objects in the CitizensImpl whose age falls within the specified range
    @Override
    public Iterable<Person> find(int minAge, int maxAge) { //person with the minimum possible ID and the minAge as the age
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    //O(log n) + m, m is number of persons in the lastName
    //this method is used to find all Person objects in the CitizensImpl with the specified last name.
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now); //person with the minimum possible ID and the given lastName
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1; //find the index of the first Person object in the lastNameList that is greater than or equal to the created Person
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now); //person with the maximum possible ID and the given lastName
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1; //find the index of the first Person object in the lastNameList that is greater than the created Person
        return lastNameList.subList(from, to); //it returns a sublist of the lastNameList between the from and to indices
    }

    // O(1), simple return, no copy, constant time
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    // O(1), constant time, no copy
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    // O(1), constant time, no copy
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // O(1), constant time
    @Override
    public int size() {
        return idList.size();
    }
}
