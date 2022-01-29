public class StringClass {
    public static void main (String[] args){
        String myStr ="Hello";
        String myStr1 = "Hello";
        char[] myStr2 =  {'H', 'e', 'l', 'l', 'o'};
        String space = "";
    // charAt()
        System.out.println(myStr.charAt(0));
    // codePointAt() 
        System.out.println(myStr.codePointAt(0)); // Unicode 
    
    // codePointBefore()
        System.out.println(myStr.codePointBefore(1));
    
    // codePointCount()
        System.out.println(myStr.codePointCount(0,5));

    // compareTo()
        System.out.println(myStr.compareTo(myStr1)); // true : 0 , false : 1
    
    // compareToIgnoreCase()
        System.out.println(myStr.compareToIgnoreCase(myStr1));
    
    // concat()
        System.out.println(myStr.concat(myStr1));
    
    // contains()
        System.out.println(myStr.contains("Hell"));
        System.out.println(myStr.contains("elo"));
    
    // contentEquals()
        System.out.println(myStr.contentEquals(myStr1));
        System.out.println(myStr.contentEquals("Hell"));
    
    // copyValueOf()
        System.out.println(space.copyValueOf(myStr2,0,5));
    
    // endswith()
        System.out.println(myStr.endsWith("Hel"));   
        System.out.println(myStr.endsWith("ell"));
        System.out.println(myStr.endsWith("ello"));
        System.out.println(myStr.endsWith("llo"));              
    
    // equals()
        System.out.println(myStr.equals(myStr1));
        System.out.println(myStr.equals(space));
    
    // equalsIgnoreCase()
        System.out.println(myStr.equals("hello"));
    
    // hashcode()
        System.out.println(myStr.hashCode());
    }
}
