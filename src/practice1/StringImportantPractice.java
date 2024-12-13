package practice1;

import java.util.Scanner;

public class StringImportantPractice {
    // 正しいパスワード定数
    private static final String PASSWORD = "XYZ";
    public static void main(String[] args) {
        System.out.print("パスワードを入力してください :");
        // 入力パスワード変数の宣言と初期化
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.next();
        // ここからパスワードの一致を調べてください
        if(inputPassword.equals(PASSWORD)){
            System.out.println("パスワードが一致しました。");
        }else {
            System.out.println("パスワードが一致しません。");
        }
    }
}
