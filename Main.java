import java.util.Arrays;

public class Main {
    public static int[] product(int[] num){ //Try to multiply the consecutive 2 numbers
        int[] newArray=new int[num.length-1];
        for(int i=0;i<num.length-1;i++){
            newArray[i]=num[i]*num[i+1];
        }
        return newArray;
    }


    public static void main(String[] args) {
        int[] num={1,-1,5,7,-3,0};

        System.out.println(Arrays.toString(product(num)));
    }
}