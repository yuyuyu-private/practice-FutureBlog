package practice1;

public class VariablePractice {
    public static void main(String[] args) {
        // みかんの価格を表現するint型の変数を宣言してください。
        int orangeValue;
        // みかんの価格変数に130を代入してください。
        orangeValue = 130;
        // みかんの個数を表現するint型の変数を宣言し、
        int orangeNum;
        // 初期値として6を代入してください。（変数名はおまかせします）
        orangeNum = 6;
        // みかんの総価格を表現するint型の変数を宣言し、
        int orangeTotalCoast;
        // 初期値に「みかん価格変数の値×みかん個数変数の値」の演算結果
        orangeTotalCoast = orangeNum * orangeValue;
        // を代入してください。（変数名はおまかせします）
        // みかん価格変数の値を出力してください。
        System.out.println("みかんの価格：" + orangeValue + "円");
        // みかん個数変数の値を出力してください。
        System.out.println("みかんの個数：" + orangeNum + "個");
        // みかん総価格変数の値を出力してください。
        System.out.println("みかんの総価格：" + orangeTotalCoast + "円");
    }
}
