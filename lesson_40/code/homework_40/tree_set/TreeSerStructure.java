package homework_40.tree_set;

import classwork_40.ait.supermarket_hashset.model.Product;

import java.util.TreeSet;

public class TreeSerStructure {
    public static void main(String[] args) {

        //creating TreeSet of medications
        TreeSet<Medication> medications = new TreeSet<>();

        medications.add(new Medication("Aspirin", 8.99));
        medications.add(new Medication("Ibuprofen", 7.50));
        medications.add(new Medication("Paracetamol", 5.99));
        medications.add(new Medication("Omeprazole", 20.00));
        medications.add(new Medication("Metformin", 12.00));

        medications.forEach(med -> System.out.println("  " + med));

        System.out.println("-------------------------");

        Medication findMed = new Medication("Aspirin", 8.99);
        medications.contains(findMed);
        System.out.println("Contains Aspirin? " + findMed);


        //These methods help find the nearest elements in the TreeSet relative to a search value
        //ceiling(element): Returns the smallest element that is >= (greater than or equal to) the search element
        //floor(element): Returns the largest element that is <= (less than or equal to) the search element
        System.out.println("-------------------------");
        Medication ceilingFind = new Medication("Naproxen", 0);
        medications.ceiling(ceilingFind);
        System.out.println("Ceiling of 'Naproxen': " + ceilingFind);
        Medication floorFind = new Medication("Naproxen", 0);
        System.out.println("Floor of 'Naproxen': " + medications.floor(floorFind));


        //remove
        System.out.println("-------------------------");
        medications.remove(new Medication("Aspirin", 8.99));
        System.out.println("Removed Aspirin:");
        medications.forEach(med -> System.out.println("  " + med));

    }
}
