package number;

public class ClassName {

	public static void main(String[] args) {
		// Test cases
		int[] testNumbers = {370, 371, 0, 1, 1634, 2, 123};

        for (int number : testNumbers) {
            System.out.println("Is " + number + " Armstrong number changes? " + isArmstrongNumber(number));
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

        int temp = number;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        if (number == 0) {
            return true;
        }

        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNumber;
    }
}

	
