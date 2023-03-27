import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();

        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        int islandCount = scottishIslands.size();
        System.out.println(islandCount);
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
        }


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));
            }
        }
//        2. Print the difference between the largest and smallest value
        int min_val = Collections.min(numbers);
        int max_val = Collections.max(numbers);
        System.out.println(max_val - min_val);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean testd = false;
        int result = 0;
        int x = 1;

        for(int i = 0; i < numbers.size() - 1; i++) {
            if(numbers.get(i) == x && numbers.get(i+1) == x) {
                System.out.println( String.valueOf(true));
                result = 1;
            }

            if(i <= numbers.size() - 3 && numbers.get(i) == x && numbers.get(i+2) == x) {
                System.out.println( String.valueOf(true));
                result = 1;
            }
        }

        if (result == 0){
                System.out.println( String.valueOf(false));
        }


//        // CHANGES MADE TO THE ABOVE TASK AFTER PAIRED PROGRAMMING FINISHED
//        // 1) Set default value for boolean variable 'result' to false
//        boolean result = false;
//        // 2) Iterate through ArrayList to find consecutive 1s
//        for (int i = 0; i < numbers.size() - 1; i++) {
//            // Find last digit of i
//            int last_digit_in_i = numbers.get(i) % 10;
//            // Find first digit of i + 1
//            String numberStr = numbers.get(i + 1).toString();
//            int first_digit_in_index_after_i = Integer.parseInt(numberStr.substring(0, 1));
//
//            // If the last digit of i & the first digit of i + 1 are both 1, OR if the string of i contains "11", print true.
//            if ((last_digit_in_i == 1 && first_digit_in_index_after_i == 1) || numbers.get(i).toString().contains("11")) {
//                result = true;
//            }
//        }
//        // 3) Print value of result
//        System.out.println(result);


//        4. Print the sum of the numbers,
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.

        int sumExcept13 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != 13) {
                sumExcept13 += numbers.get(i);
            } else {
                i++;
            }
        }

        System.out.println(sumExcept13);
//
//          So [2, 7, 13, 2] would have sum of 9.

    }

}


