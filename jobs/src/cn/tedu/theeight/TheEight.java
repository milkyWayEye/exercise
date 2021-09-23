package cn.tedu.theeight;

import java.util.Arrays;

/*8.将一个数组中的数据倒序排序打印输出
int arr[]={45,22,33,23,34};

输出结果
34,23,33,22,45*/
public class TheEight {
    public static void main(String[] args) {
        int[] arr={45,22,33,23,34};
        for (int i = arr.length-1; i > 0 ; i--) {
            System.out.print(arr[i]+",");
        }
        System.out.println(arr[0]);
        method2(arr);
    }
    //法2首尾交换
    public static void method2(int[] s){
        for (int i = 0; i < s.length/2; i++) {
            s[i] += s[s.length-1-i];
            s[s.length-1-i] = s[i] - s[s.length-1-i];
            s[i] -= s[s.length-1-i];
        }
        System.out.println(Arrays.toString(s));
    }
}
