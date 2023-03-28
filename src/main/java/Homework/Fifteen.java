package Homework;

public class Fifteen {
//question 1
    public static int getLastIndex(String[] names) {

        return names.length - 1 ;
    }


    // Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }
//    //Question 3
    public static String getFirstElement(String[] names) {

        return names[0];
    }
//    // Question 4
   public static String getLastElement(String[] names) {
     if(names == null || names.length == 0){}
       return names[names.length-1];
     }
//    // Question 5
    public static String getSecondToLastElement(String[] names) {
        if(names.length >= 2){
        }
        return names[names.length-2];
    }
//   // Question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        int i;
        for( i = 0; i < ints.length; i++){
             sum += ints[i];
        }
        return sum;
    }

   // Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        int i;
        for( i = 0; i < ints.length; i++){
             sum = sum + ints[i];}
        int Average = sum / ints.length;

        return Average;
    }
    //Question 8
    public static int extractAllOddNumbers(int[] numbers) {


        return null;

    }


    public static void main(String[] args) {

        String[] names = {"Mark","Martin", "JOhn", "jimmy", "jeff", "casey", "david","jeremiah"};
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(nums));
        System.out.println(getAverage(nums));
        System.out.println(extractAllOddNumbers(nums));








    }
}