import java.util.*;

class Problem {
    String name;
    String difficulty;
    boolean solved;

    Problem(String name, String difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        this.solved = false;
    }
}

public class Main {
    static HashMap<String, Problem> problems = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add Problem 2.Mark Solved 3.View Progress 4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter problem name: ");
                String name = sc.nextLine();
                System.out.print("Enter difficulty: ");
                String diff = sc.nextLine();
                problems.put(name, new Problem(name, diff));
                System.out.println("Problem added");
            } 
            else if (choice == 2) {
                System.out.print("Enter problem name: ");
                String name = sc.nextLine();
                if (problems.containsKey(name)) {
                    problems.get(name).solved = true;
                    System.out.println("Marked as solved");
                }
            } 
            else if (choice == 3) {
                int solved = 0;
                for (Problem p : problems.values()) {
                    if (p.solved) solved++;
                }
                System.out.println("Solved: " + solved + "/" + problems.size());
            } 
            else {
                break;
            }
        }
        sc.close();
    }
}
Added initial project structure and main logic
