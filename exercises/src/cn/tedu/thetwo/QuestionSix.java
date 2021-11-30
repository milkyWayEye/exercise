package cn.tedu.thetwo;

/**
 * 需求:
 * 6.求100-1000水仙花数。所谓水仙花数，是指一个三位数abc，如果满足a3 + b3 + c3 = abc，则abc是水仙花数。
 */
public class QuestionSix {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            boolean isNarc = (i / 100) * (i / 100) * (i / 100) +
                    (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10) + (i % 10) * (i % 10) * (i % 10) == i;
            if (isNarc) {
                System.out.println(i);
            }
        }
    }
}
