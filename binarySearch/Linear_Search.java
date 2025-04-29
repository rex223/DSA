package binarySearch;
// best case: O(1) worst case: O(n) average case: O(n)

public class Linear_Search {
// Linear searching
static int LSintegerPos(int[] array,int target){
    if(array==null || array.length==0 ){
        System.out.println("Empty or non intialized array...");
        return -1;
    }
    for(int i=0;i<array.length;i++){
        if(array[i]==target){
            System.out.printf("The target %d is at index : ",target);
            return i;
            }

        }
        System.out.println(target+"not found in array.");
        return -1;
    }
// String searching
static String LSstringPos(String[] array,String target){
    if(array==null || array.length==0){
        return "Empty or non initialized array";
    }
    for(int i=0;i<array.length;i++){
        if(array[i].equals(target)){
            System.out.printf("The target %s is at index : ",target);
            return i+"";
           }
        }
    return "String not found in array";
    }
// Boolean search for char in an array of strings
static boolean LSchar(String[] array,String target){

    if(array==null || array.length==0){
        System.out.println("Not initialized or missing elements");
        return false;
    }

    for(int i=0;i<array.length;i++){
        if(array[i].indexOf(target)!=1){
            return true;
            }
        }

    return false;
    }
// Returning the position of the char in array of strings
static int LScharPos(String[] array,char target){
    if(array==null || array.length==0){
        System.out.println("Not initialized or missing elements");
        return -1;
    }

    for(int i=0;i<array.length;i++){
        if(array[i].indexOf(target)!=-1){
            System.out.print("The target "+target+" is at index : ");
            return i;
            }
        }
    return -1;
    }
static int LScharString(String str,char target){
    int c=0;
    if (str==null || str.length()==0) {
        System.out.println("Not initialized or missing elements");
        return -1;
    }
    for (char ch : str.toCharArray()) {
        if(ch==target){
            System.out.print("The target "+target+" is at index : ");
            return c;
        }
        c++;        
    }
    return -1;
}
static int[] LSinteger2D(int[][] array,int target){
    int row=1;
    if (array==null || array.length==0){
        System.out.println("Array is not initialized or is empty. ");
        return new int[]{-1,-1};
    }
    for(int[] num: array){
        for(int i=1 ;i<=num.length; i++){
            if(num[i-1]==target){
                System.out.print("The target "+target+" is at index : ");
                return  new int[]{row,i};
                }
            }
        row++;
        }
    return new int[]{-1,-1};
    }
}