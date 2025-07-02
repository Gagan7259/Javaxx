package Array;

public class SSSS {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];

        // Fill the array with random numbers
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

        // Print the array in a grid format
        System.out.println("Generated 2D Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}

