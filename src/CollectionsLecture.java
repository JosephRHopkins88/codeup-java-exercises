import java.util.ArrayList;

public class CollectionsLecture {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        ArrayList<Integer> collectionOfNums = new ArrayList<>();
        collectionOfNums.add(16);
        collectionOfNums.add(44);
        collectionOfNums.add(32);
        collectionOfNums.add(1,24);

        for (int i = 0; i < collectionOfNums.size(); i++){
            System.out.println(collectionOfNums.get(i));
        }

        for (Integer collectionOfNum : collectionOfNums) {
            System.out.println(collectionOfNum);
        }

        System.out.println(numbers);
        System.out.println(collectionOfNums);

        System.out.println(collectionOfNums.contains(44));
        System.out.println(collectionOfNums.indexOf(44));
        System.out.println(collectionOfNums.lastIndexOf(44));
        ArrayList<String> studentNames = new ArrayList<>();
        if (studentNames.isEmpty()) {
            System.out.println("Let's fill in the list of Student names.");
        }

        studentNames.remove("Beatrice");

        System.out.println(collectionOfNums);
        collectionOfNums.remove((Integer) 44);
        System.out.println(collectionOfNums);
    }
}
