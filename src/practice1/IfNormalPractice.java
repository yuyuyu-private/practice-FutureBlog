package practice1;

public class IfNormalPractice {
    public static void main(String[] args) {
        // 年齢変数の宣言と初期化
        int age = 0;        // ←値を変更しながら実行
        System.out.println("年齢：" + age);
        // if文の開始
        if(age >= 20){
            System.out.println("成人です");
        } else if (age < 0 ) {
            System.out.println("エラー");
        } else if ( age > 14 || age< 6 ) {
            System.out.println("未成年です");
            System.out.println("今は義務教育を受けていません。");
        } else if (age <= 14 && age >=6 ) {
            System.out.println("未成年です");
            System.out.println("今は義務教育を受けています。");
        }
    }
}
