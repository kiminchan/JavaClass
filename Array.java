import java.util.Arrays;

public class Array {
    public static void main(String[] args){
    // asList() : 배열을 List로 변경할때 사용
    /*   
        int intArr[] = {10, 20, 15, 22, 25};

        System.out.println("Integer Array as List : " + Arrays.asList(intArr));
    */
    // binarySearch() : 배열안에서 몇번째 인덱스에 있는지 찾아낸다. 
    /*
        int intArr[] = {10, 20, 15, 22, 25};
        Arrays.sort(intArr);

        int intKey = 15;
        System.out.println(intKey + "found at index =" + Arrays.binarySearch(intArr, intKey));
        
        //범위를 지정 
        System.out.println(Arrays.binarySearch(intArr, 0, 3, intKey));
    */
    
    // compare(array1, array2) : 배열안의 인자의 갯수에따라 a>b : 1, a<b : -1, else : 0
        int intArr[] = {10, 20, 17, 22, 35};

        int intArr1[] = {10, 15, 22};

        System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1));

        System.out.println("Integer Arrays on comparison: " + Arrays.compareUnsigned(intArr, intArr1));

    }
}
