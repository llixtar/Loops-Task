package App;

public class Main {

    public static void main(String[] args) {

        int[] arrNum = {1, 2, 3, 4, 5, 6};
        int totalSum = 0;

        int counter = 1;

        for (int currNum : arrNum) {
            totalSum += currNum;

            System.out.printf("%d) Num is %d, sum is %d%n",
                    counter, currNum, totalSum);

            counter++;
        }
        System.out.printf("----------------------%nSum of numbers is %d%n", totalSum);
    }
}
