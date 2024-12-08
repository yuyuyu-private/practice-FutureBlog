package practice1;

public class IfCalculatePractice {
    public static void main(String[] args) {
        double height = 170.0;        // ←値を変更しながら実行
        double weight = 55.0;         // ←値を変更しながら実行
        System.out.println("身長：" + height + "（cm）");
        System.out.println("体重：" + weight + "（kg）");
        // BMI値の算出と表示
        double bmi = weight / ( height / 100  * height / 100);
        System.out.println("あなたのBMI値は" + bmi +"です");
        if (bmi >= 26.5){
            System.out.println("肥満です");
        } else if (bmi >= 24) {
            System.out.println("太り気味です");
        } else if (bmi >= 20) {
            System.out.println("普通です");
        } else if (bmi >= 0) {
            System.out.println("スリムです");
        }else {
            System.out.println("エラーです");
        }
    }
}
