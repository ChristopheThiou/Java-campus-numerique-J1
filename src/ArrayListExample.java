import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");
        describe(names);
        describeForEach(names);
        describePlusDeQuatre(names);
        describeToUpperCase(names);
    }

    public static void describe(ArrayList<String> arrayList) {
        for (String name : arrayList) {
            System.out.println(name + " (" + name.length() + " lettres)");
        }
    }

    public static void describeForEach(ArrayList<String> arrayList) {
        arrayList.forEach(name -> System.out.println("for each " + name + " (" + name.length() + " lettres)"));
    }

    public static void describePlusDeQuatre(ArrayList<String> arrayList) {
        for (String name : arrayList) {
            if (name.length() > 4) {
                System.out.println("Plus de quatres carac " + name + " (" + name.length() + " lettres)");
            }
        }
    }

    public static void describeToUpperCase(ArrayList<String> arrayList) {
        for (String name : arrayList) {
            System.out.println("EN MAJ " + name.toUpperCase());
        }
    }
}