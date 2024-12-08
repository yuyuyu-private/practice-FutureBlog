package practice1;

public class ArrayBasicPractice {
    public static void main(String[] args) {
        // 1. int配列型変数の宣言
        int[] ary;
        // 2. 配列オブジェクトの生成
        ary = new int[3];
        // 3. 各要素の値を代入
        ary[0] = 11;
        ary[1] = 21;
        ary[2] = 31;
        // 4. 各要素の値を表示
        for (int i = 0 ; i < ary.length ; i++ ){
            System.out.println( (i+1) + "番目の配列は" + ary[i]);
        }
    }
}
