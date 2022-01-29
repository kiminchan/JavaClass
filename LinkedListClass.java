import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args){
    // LinkedList 선언 
        LinkedList<String> names = new LinkedList<String>();  
        LinkedList<Integer> scores = new LinkedList<Integer>(); 
    
    // LinkedList 값 추가 
        scores.addFirst(1);
        scores.addLast(2);
        scores.add(3);
        scores.add(3,4);
        System.out.println(scores);
    
    // LinkedList 값 삭제 
        scores.removeFirst();
        scores.removeLast();
        scores.remove(); // 0번째 인덱스 제거 
        scores.remove(0);
        scores.clear();
        System.out.println(scores);

    // LinkedList 크기 구하기 
        System.out.println(scores.size());
    
    // LinkedList 값 출력 
        scores.add(1);
        scores.add(2);
        scores.add(3);
        scores.add(4);

        System.out.println(scores.get(0));
        for(Integer i : scores) {
            System.out.println(i);
        }

        Iterator<Integer> iter  = scores.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    
    // LinkedList 값 검색 
        System.out.println(scores.contains(1));
        System.out.println(scores.indexOf(1)); // 해당 정수가 있는 index 리턴 
    } 
}
