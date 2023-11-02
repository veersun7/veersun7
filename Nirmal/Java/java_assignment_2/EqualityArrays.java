import java.util.Arrays;
public class EqualityArrays{
    public static void main(final String[] args) {
        final int[] array1 = { 51, 22, 33, 43, 52 };
        final int[] array2 = { 51, 22, 33, 43, 52 };
        final boolean intCheck = Arrays.equals(array1, array2);
        System.out.println("Two Arrays are Equal :: " + intCheck);
       }
      }