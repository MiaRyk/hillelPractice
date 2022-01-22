//Your goal is to create a function that removes the first and last characters of a string
package HW_5;

public class charactersRemoval {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("1solo singer1");
        System.out.println(str.substring(1, str.length() - 1));
    }
}