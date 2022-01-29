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
    /* 
        int intArr[] = {10, 20, 17, 22, 35};

        int intArr1[] = {10, 15, 22};

        System.out.println("Integer Arrays on comparison: " + Arrays.compare(intArr, intArr1));

        System.out.println("Integer Arrays on comparison: " + Arrays.compareUnsigned(intArr, intArr1));
    */
    // 배열 반복문 이용방법 
    /*
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);

        for(int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }

        for(String i : cars) {
            System.out.println(i);
        }
    */
    // copyOf() : 전달받은 배열의 특정 길이만큼 새로운 배열 복사
    /* 
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1,5);

        for(int i=0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        int[] arr3 = Arrays.copyOf(arr1, 10);
        for(int i = 0; i< arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    */
    // copyOfRange() : 전달받은 배열의 특정범위에 해당하는 요소만을 새로운 배열로 복사 
    /*
        int[] arr1 = {1,2,3,4,5};

        int[] arr2 = Arrays.copyOfRange(arr1,0,10);
        for(int i = 0; i<arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    */
    // fill() : 전달받은 배열의 모든 요소를 특정값으로 초기화 
    /*
        int[] arr = new int[10];

        Arrays.fill(arr, 7);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    */
    // sort() : 배열의 모든요소를 오름차순으로 정렬 
        int[] arr = {6,7,8,9,4};

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
