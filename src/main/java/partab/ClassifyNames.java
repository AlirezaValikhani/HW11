package partab;

import java.util.*;
import java.util.stream.Collectors;

public class ClassifyNames {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer input = null;
        List<String> names = new ArrayList<>();
        System.out.print("Enter number of names : ");
        while (true) {
            try {
                input = scanner.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("Please enter number");
            }
            for (int i = 0; i < input; i++) {
                System.out.print("Name number " + (i + 1) + " is : ");
                names.add(scanner.next());
            }

            names.forEach((String name) -> System.out.print(name + " "));

            Map<Integer, List<String>> result = names
                    .stream()
                    .distinct()
                    .collect(Collectors.groupingBy(String::length));


            System.out.println(result);
        }
    }
}
