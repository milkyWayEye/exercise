package cn.tedu.theone;
/**
 * 需求:
 * 2.使用for循环实现等腰三角形
 *  * * * * *
 *   * * * *
 *    * * *
 *     * *
 *      *
 * */
public class QuestionTwo {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<5-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
