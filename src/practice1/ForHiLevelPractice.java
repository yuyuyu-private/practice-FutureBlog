package practice1;

public class ForHiLevelPractice {
    public static void main(String[] args) {
        // 山の段数を表す変数
        int level = 2;
        // for文の開始
        for(int i = 0; i < level; i++) {
            for(int j = 0; j < level - i - 1; j++) {
                System.out.print("▫");
            }
            for(int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("▪");
            }
            System.out.println();
        }
    }
}