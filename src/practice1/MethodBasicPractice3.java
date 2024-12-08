package practice1;

public class MethodBasicPractice3 {
    public static void main(String[] args) {
        int x = 1000;
        int y = 90;
        int z = 9;
        // minメソッドの呼び出し
        System.out.println("整数" + x + "、" + y + "、" + z + "の中で最小の値は");
        System.out.println(min(x, y, z) + "です");
    }
    // ここにminメソッドを定義してください

    public static int min(int value1, int value2, int value3){
        int minvalue = value1;

        if (minvalue > value2)
            minvalue = value2;

        if (minvalue > value3)
            minvalue=value3;

        return minvalue;
    }
}
