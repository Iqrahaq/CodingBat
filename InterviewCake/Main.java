package InterviewCake;

public class Main{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //printFirstItem(numbers);
        //printAllItems(numbers);
        printAllPossibleOrderedPairs(numbers);
    }

    public static void printFirstItem(int[] items){
        System.out.println(items[0]);
    }

    public static void printAllItems(int[] items){
        for(int item : items){
            System.out.println(item);
        }
    }

    public static void printAllPossibleOrderedPairs(int[] items){
        for(int firstItem : items){
            for(int secondItem : items){
                System.out.println(firstItem + ", " + secondItem);
            }
        }
    }
}
