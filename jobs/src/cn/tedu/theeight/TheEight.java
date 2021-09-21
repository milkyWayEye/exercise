package cn.tedu.theeight;
/*8.将一个数组中的数据倒序排序打印输出
int arr[]={45,22,33,23,34};

输出结果
34,23,33,22,45*/
public class TheEight {
    public static void main(String[] args) {
        int arr[]={45,22,33,23,34};
        for (int i = arr.length-1; i > 0 ; i--) {
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[0]);
    }
}
