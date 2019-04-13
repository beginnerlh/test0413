/*每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
        不超过100。

        输出描述:

        输出n个整数里最小的k个数。升序输出



        示例1

        输入：

        3 9 6 8 -10 7 -11 19 30 12 23 5

        输出：

        -11 -10 3 6 7*/
package lianxi0413;

import java.util.*;
public class test0413 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[100];
        int i=0;
        while(!in.hasNext("stop") ){//为了能在本地IDE上面运行，需要加上一个终止条件。输入stop循环终止
            a[i] = in.nextInt();
            i++;
        }
        int[] arr = new int[--i];
        System.arraycopy(a,0,arr,0,i);
        Arrays.sort(arr);
        for(int j=0; j<a[i]; j++){
            if(j == a[i]-1){
                System.out.print(arr[j]);
            }else{
                System.out.print(arr[j] + " ");
            }
        }
    }
}


