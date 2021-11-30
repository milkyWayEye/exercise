package cn.tedu.thetwo;

/**
 * 需求:
 * 7.打印1-100以内的质数 要求按照以下格式输出
 *
 * 2   3  5  7 11 13 17 19 23 29
 *
 * 31 37 41 43 47 53 59 61 67 71
 *
 * 73 79 83 89 97
 */
public class QuesttionSeven {
    public static void main(String[] args) {
        int num = 0;
        for (int i=2;i<101;i++) {
            boolean isPrime = true;
            for (int j=2;j<i;j++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                if(num==0) {
                    System.out.println();
                }
                System.out.print(i+"\t");
                num += 1;
                if(num==10) {
                    num=0;
                    System.out.println();
                }
            }
        }
    }
}
