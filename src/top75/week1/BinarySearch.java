package top75.week1;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int pivotId = (left + right) / 2;

        while (left <= right) {
            if (nums[pivotId] < target) {
                left = pivotId + 1;
                pivotId = (left + right) / 2;
            }

            if (nums[pivotId] > target) {
                right = pivotId - 1;
                pivotId = (left + right) / 2;
            }


            if (nums[pivotId] == target){
                return pivotId;
            }

        }

        return -1;
    }
}
