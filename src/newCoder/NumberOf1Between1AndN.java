package other;

/**
 * 牛客网例题
 *
 * 题目描述
 *求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 *为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 *但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 *可以很快的求出任意非负整数区间中1出现的次数。
 *
 * 题目描述有些问题：求 1～N数字中数字1出现的次数，而不是M~N
 * */

public class NumberOf1Between1AndN {

    public static void main(String[] args) {
        int n = 100;
        System.out.println(countDigitOne(n));
        System.out.println(NumberOf1Between1AndN_Solution(n));
    }

    //Thought of mine.
    public static int countDigitOne(int n) {
        int ones = 0;
        for (int i = 1; i <= n; i *= 10) {
            //前缀块
            int prefix = n / i;
            //余数块
            int remainder = n % i;

            if (prefix % 10 == 0) {
                ones += (prefix / 10) * i;
            } else if (prefix % 10 == 1) {
                ones += (prefix / 10) * i + remainder + 1;
            } else {
                ones += (prefix / 10 + 1) * i;
            }
        }

        return ones;
    }

    /*
    Undone.Trying to figure it out.
    https://discuss.leetcode.com/topic/18054/4-lines-o-log-n-c-java-python
     */
    public static int NumberOf1Between1AndN_Solution(int n) {
        int ones = 0;
        for (long m = 1; m <= n; m *= 10) {
            ones += (n / m + 8) / 10 * m + (n / m % 10 == 1 ? n % m + 1 : 0);
        }
        return ones;
    }
}

