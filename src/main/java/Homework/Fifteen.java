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

       return names[names.length-1];
     }
//    // Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }
//   // Question 6
    public static int getSum(int[] ints) {
        return 0;
    }

    public static void main(String[] args) {

        String[] names = {"Martin", "JOhn", "jimmy", "jeff", "casey", "david"};
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));









    }
}