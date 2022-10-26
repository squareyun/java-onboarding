package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    static int calcPoint(List<Integer> user) {
        int leftPagePoint = calcEachDigit(user.get(0));
        int rightPagePoint = calcEachDigit(user.get(1));
        return Math.max(leftPagePoint, rightPagePoint);
    }

    static int calcEachDigit(int pageNum) {
        int eachDigitSum = calcEachDigitSum(pageNum);
        int eachDigitProduct = calcEachDigitProduct(pageNum);
        return Math.max(eachDigitSum, eachDigitProduct);
    }

    static int calcEachDigitSum(int pageNum) {
        int totalSum = 0;

        while (pageNum > 0) {
            int digit = pageNum % 10;
            totalSum += digit;
            pageNum /= 10;
        }

        return totalSum;
    }

    static int calcEachDigitProduct(int pageNum) {
        int totalProduct = 0;

        while (pageNum > 0) {
            int digit = pageNum % 10;
            totalProduct *= digit;
            pageNum /= 10;
        }

        return totalProduct;
    }

}