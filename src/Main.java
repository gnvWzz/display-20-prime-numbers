public class Main {
    public static void main(String[] args) {
        int countDivNum = 0;
        int countPrimeNum = 0;
        long INT_MAX = Long.MAX_VALUE;

        for (int i = 0; i < INT_MAX; i++) {
            if (countPrimeNum < 20) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        countDivNum++;
                    }
                }
                if (countDivNum == 2) {
                    countPrimeNum++;
                    System.out.println(i);
                }
                countDivNum = 0;
            } else {
                break;
            }
        }
    }
}