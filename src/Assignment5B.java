import java.util.Scanner;

public class Assignment5B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] maze = {{"_", "X", "_", "X", "X"},
                {"_", "X", "_", "X", "W"},
                {"_", "_", "_", "X", "_"},
                {"X", "X", "_", "_", "_"},
                {"_", "_", "_", "X", "X"}};


        int row = 0;
        int col = 0;


        while (true) {

            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < 5; j++) {
                    maze[row][col] = "O";


                    System.out.print(maze[i][j] + " ");
                }


                System.out.println("");
            }
            System.out.println("Which direction do you want to move?");
            String dir = scan.nextLine();
            switch (dir) {
                case "Up":
                    maze[row][col] = "_";
                    if (row == 0) {
                        System.out.println("You can’t move there – it’s out of bounds!");
                    } else if
                    (maze[row - 1][col].equals("W")) {
                        System.out.println("You win!");
                        System.exit(0);

                    } else {
                        row = row - 1;
                    }
                    break;
                case "Down":
                    maze[row][col] = "_";
                    if (row == 0) {
                        System.out.println("You can’t move there – it’s out of bounds!");
                    }else if
                    (maze[row+1][col].equals("X")) {
                        System.out.println("You hit a wall – Game Over!");
                        System.exit(0);
                    }
                    row = row + 1;
                    break;
                case "Right":
                    if (maze[row][col + 1].equals("X")) {
                        System.out.println("You hit a wall – Game Over!");
                        System.exit(0);
                    }
                    maze[row][col] = "_";
                    col = col + 1;
                    break;
                case "Left":

                    if (col == 0) {
                        System.out.println("You can’t move there – it’s out of bounds!");


                    } else if
                    (maze[row][col - 1].equals("X")) {
                        System.out.println("You hit a wall – Game Over!");
                        System.exit(0);
                    } else {
                        col = col - 1;
                    }

                    break;

                default:
                    System.out.println("That’s not a valid direction!");
                    break;
            }
        }

    }
}

