package Array;

public class Arr {
    public static void main(String[] args) {
        int[][] nums = new int[3][4];
        int temp =0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
               nums[i][j]= (int) (Math.random() * 100);
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }
    }
}

