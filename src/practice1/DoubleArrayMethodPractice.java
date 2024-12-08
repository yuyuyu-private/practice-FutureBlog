package practice1;

public class DoubleArrayMethodPractice {
    public static void main(String[] args) {
        // int二次元配列変数の宣言と初期化
        int[][] arr = {{1, 5, 8}, {2, 4, 7}, {1, 9, 3, 5}, {4, 2},
                {6, 1, 9, 4}, {7, 3, 8, 1}, {8, 4, 3, 9, 7}};
        // 検索する数値変数の宣言と初期化
        int target = 1;
        // countメソッドの呼び出し
        System.out.println(target + "の個数：" + count(arr, target));
        // 検索する数値の変更
        target = 7;
        // countメソッドの呼び出し
        System.out.println(target + "の個数：" + count(arr, target));
    }
    // ここにcountメソッドを定義してください
    public static int count(int[][] array, int tar){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == tar){
                    count++;
                }
            }
        }
        return count;
    }
}
