package practice1;

public class ArrayMethodPractice2 {
    public static void main(String[] args) {
        int[] arr = {43, 2, 765, 234, 908, 115, 32,
                476, 938, 65, 93, 47, 102, 735,
                529, 1010, 639, 660, 182, 908};
        // maxメソッドの呼び出し
        System.out.println("配列の最大値：" + max(arr));
    }
    // ここにmaxメソッドを定義してください
    public static int max(int[] arr){
        int max = 0 ;
        for (int i = 0; i < arr.length - 1; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
