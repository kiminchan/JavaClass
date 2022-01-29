import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListClass {
    public static void main(String[] args) {
    // ArrayList : add, get, size, contains, remove 
    /*
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("140");
        pitches.add("132");
        pitches.add(0,"124");
        System.out.println(pitches);
        System.out.println(pitches.get(2));

        System.out.println(pitches.contains("142"));

        System.out.println(pitches.remove("124"));
        System.out.println(pitches);
        System.out.println(pitches.remove(0));
        System.out.println(pitches);
    */
    // 이미 데이터가 있는 경우 ArrayList 생성 
    /*
        String [] data = {"138", "142", "125"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "142", "125"));
        System.out.println(pitches);
    */
    // String.join(구분자, 리스트객체)
    /*
        String[] pitches = new String[] {"138", "142", "125"};
        String result = String.join(",",pitches);
        System.out.println(result);
    */
    // Comparator : 리스트 정렬 
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "142", "125"));
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches);

    }
}
