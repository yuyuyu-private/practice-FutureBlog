package practice1;

import java.util.Scanner;

public class StringArrayPractice {
    public static void main(String[] args) {
        // アパートに住む住人2次元配列変数
        String[][] apartment = {
                {"後藤", "矢口", "石川", "吉澤", "藤本"},
                {"亀井", "小川", "紺野"},
                {"石川", "安部", "安田", "後藤"},
                {"石黒", "福田", "後藤"}
        };
        System.out.print("検索する名前を入力してください : ");
        // 検索するname変数の宣言とキーボード入力値による初期化
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int count = 0;
        for (int i=0; i<apartment.length; i++){
            for (int j=0; j<apartment[i].length; j++){
                if (name.equals(apartment[i][j])){
                    System.out.println(++count + "人目の" + name + "さんは、" + (i + 1) + "階の" + (j + 1) + "号室に住んでいます");
                }
            }
        }
        if (count == 0){
            System.out.println(name + "さんはこのアパートには住んでいません。");
        }
    }
}
