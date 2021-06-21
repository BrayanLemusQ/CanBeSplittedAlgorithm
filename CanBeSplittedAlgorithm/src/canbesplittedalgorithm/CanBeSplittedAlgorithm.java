
package canbesplittedalgorithm;
import java.util.Scanner;

public class CanBeSplittedAlgorithm {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please type the amount of numbers in the matrix");
        int number_of_array_elements = in.nextInt(), result = 0;
        int a[] = new int[number_of_array_elements];
        a=fillArray(number_of_array_elements);    
        result = canBeSplitted(a);
    }
    
    public static int canBeSplitted(int[] entered_array){
        int size = entered_array.length, left_sum = 0, right_sum = 0, result = -1;
        if(size != 0) {
            for (int left_sum_iterator = 0; left_sum_iterator < (size-1); left_sum_iterator++) {
                left_sum += entered_array[left_sum_iterator];
                for (int right_sum_iterator = (left_sum_iterator + 1); right_sum_iterator < size; right_sum_iterator++) {
                    right_sum += entered_array[right_sum_iterator];
                }
                //System.out.println("\tleft_sum: \t" + left_sum + "\tright_sum: \t" + right_sum);
                if (left_sum == right_sum) {
                    result = 1;
                    break;
                }
                right_sum = 0;
            }
        } else{
            result = 0;
        }
        System.out.println("\tresult: \t"+result);
        return result;
    }
    
    public static int[] fillArray(int number_of_elements){
        int a[] = new int[number_of_elements];
        Scanner keyboard_in = new Scanner(System.in);
        for(int i=0; i<number_of_elements; i++){
            System.out.println("Please type the number in the "+(i+1)+" position");
            a[i] = keyboard_in.nextInt();            
        }
        for(int i=0; i<number_of_elements; i++){
            System.out.print("[ "+a[i]+" ]");
            System.out.println();
        }
        return a;
    }
    
}
