package practice1;

public class MethodBasicPractice {
    public static void main(String[] args) {
        // displayメソッドの呼び出し
        display("テスト", 5);
    }
    // ここにdisplayメソッドを定義してください
    public static void display(String message, int number){
        for (int i =0; i < number; i++){
            System.out.println(message);
        }
    }
}
