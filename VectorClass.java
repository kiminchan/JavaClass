import java.util.Vector;
import java.util.Arrays;
import java.util.Iterator;
public class VectorClass {
    public static void main(String[] args){
    // Vector 선언 
        Vector v = new Vector();
        Vector<Integer> nums = new Vector<Integer>();
        Vector<Integer> nums1 = new Vector<>(Arrays.asList(1,2,3));
        Vector<String> names = new Vector<String>(10);
    
    // Vector 값 추가 
        nums.add(1);
        nums.add(null);
        nums.add(1,5);
        System.out.println(nums);
    
    // Vector 값 삭제
        nums.remove(2);
        nums.removeAllElements();
        nums.clear();
    
    // Vector 크기 구하기 
        System.out.println(nums.size());
        System.out.println(nums.capacity());
    
    // Vector 값 출력 (ArrayList와 동일)
        for(int i=1; i < 5; i++) {
            nums.add(i);
        }

        System.out.println(nums.get(0));

        for(Integer i : nums) {
            System.out.println(i);
        }

        Iterator iter = nums.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
}
