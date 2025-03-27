package arrays;

// we defined a swap method which can be used in any file
public class Swap{
    static void swap(int[] array,int index1,int index2){
        array[index1]=(array[index1]+array[index2])-(array[index2]=array[index1]);
    }
}
