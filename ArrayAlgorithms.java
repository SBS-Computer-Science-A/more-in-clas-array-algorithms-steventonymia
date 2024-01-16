import java.util.Arrays;
public class ArrayAlgorithms {//Class ArrayAlgorithms
    public static int repetitions(int[] numbers) {//Find the repeated number of times
        int repeatnumber = 0;
        for (int i = 0; i < numbers.length; i++) { //Using 2 for loops to detect the times of repetiton.
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    repeatnumber++;
                    break;
                }
            }
        }
        return repeatnumber;
    }

    public static int[] shiftRight(int[] array, int steps) { //Swap the number to the right with given number of steps.
        int n = array.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = i+steps;
            if(newIndex>=n){
                newIndex-=n;
            }
            temp[newIndex]=array[i];
        }
        return temp;
    }


    public static void main(String[] args) {//Test and printing.
        int[] array = {1, 1, 3, 3, 1, 3, 3, 3};
        int repeatnumber = repetitions(array);
        System.out.println("Number of repetition: " + repeatnumber);
        System.out.println(Arrays.toString(shiftRight(array,3)));
    }
    }

