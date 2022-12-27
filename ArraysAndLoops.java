package Loops;

public class ArraysAndLoops {
    public static void main(String[] args) {
        String[]names ={"Anshu", "Soumya", "Arpit", "Sandhya"};
        System.out.println("The no, Elements in array is " + names.length);
        for(int i = 0;i< names.length;i++){
            System.out.println(names[i] + " Will seat in" + i + "no. seat");
        }
    }
    
}
