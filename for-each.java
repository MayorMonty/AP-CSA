/**
 * Enhanced For Loop is invalid, usually because the index of the element is
 * important to the algoritm
 */

public class NoEnhancedFor {

    // Not valid cause you need to compare adjacent elements
    public int[] notAlone(int[] nums, int val) {

        if (nums.length < 3) {
            return nums;
        }

        int[] out = new int[nums.length];
        out[0] = nums[0];
        out[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i] != val || nums[i - 1] == nums[i] || nums[i + 1] == nums[i]) {
                out[i] = nums[i];
                continue;
            }

            out[i] = Math.max(nums[i - 1], nums[i + 1]);

        }

        return out;

    }

    // Can't use for each because you have to swap elements
    public int[] zeroFront(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                continue;

            for (int j = i; j > 0; j--) {

                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;

            }

        }

        return nums;

    }

}

/**
 * Enhanced For makes sense, because the index doesn't matter, each element is
 * considered in isolation
 */

public class EnhancedForLoop {

    public int countEvens(int[] nums) {
        int evens = 0;

        for (int i : nums) {
            if (i % 2 == 0)
                evens++;
        }

        return evens;
    }

    public int bigDiff(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];

        for (int value : nums) {
            largest = Math.max(value, largest);
            smallest = Math.min(value, smallest);
        }

        return largest - smallest;

    }

    public int centeredAverage(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int max = nums[0];

        for (int n : nums) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return (sum - min - max) / (nums.length - 2);

    }

    public int sum13(int[] nums) {
        int sum = 0;
        boolean tarnished = false;

        for (int n : nums) {

            if (tarnished) {
                tarnished = false;
                continue;
            }

            if (n == 13) {
                tarnished = true;
                continue;
            }

            sum += n;

        }

        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean tarnished = false;

        for (int n : nums) {

            if (tarnished) {

                if (n == 7) {
                    tarnished = false;
                }

                continue;
            }

            if (n == 6) {
                tarnished = true;
                continue;
            }

            sum += n;

        }

        return sum;

    }

    public boolean has22(int[] nums) {
        boolean prevTwo = false;

        for (int n : nums) {

            if (prevTwo && n == 2) {
                return true;
            }

            prevTwo = n == 2;
        }

        return false;
    }

    public boolean lucky13(int[] nums) {

        for (int value : nums) {

            if (value == 1 || value == 3) {
                return false;
            }

        }

        return true;
    }

    public boolean sum28(int[] nums) {
        int sum2 = 0;

        for (int values : nums) {

            if (values == 2) {
                sum2 += values;
            }

        }

        return sum2 == 8;
    }

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int value : nums) {

            if (value == 1) {
                count1++;
            }

            if (value == 4) {
                count4++;
            }
        }

        return count1 > count4;
    }

    public int[] withoutTen(int[] nums) {

        int out[] = new int[nums.length];
        int nonTens = 0;

        for (int n : nums) {
            if (n != 10)
                out[nonTens++] = n;
        }

        return out;

    }

}