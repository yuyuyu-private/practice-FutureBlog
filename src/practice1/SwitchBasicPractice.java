package practice1;

public class SwitchBasicPractice {
    public static void main(String[] args) {
        int month = 13;        // ←値を変更しながら実行
        System.out.println(month + "月");
        // switch文の開始
        switch (month){
            case 1:
                System.out.println(month + "月は31日まであります");
                break;
            case 2:
                System.out.println(month + "月は28、または、29日まであります");
                break;
            case 3:
                System.out.println(month + "月は31日まであります");
                break;
            case 4:
                System.out.println(month + "月は30日まであります");
                break;
            case 5:
                System.out.println(month + "月は31日まであります");
                break;
            case 6:
                System.out.println(month + "月は30日まであります");
                break;
            case 7:
                System.out.println(month + "月は31日まであります");
                break;
            case 8:
                System.out.println(month + "月は31日まであります");
                break;
            case 9:
                System.out.println(month + "月は30日まであります");
                break;
            case 10:
                System.out.println(month + "月は31日まであります");
                break;
            case 11:
                System.out.println(month + "月は30日まであります");
                break;
            case 12:
                System.out.println(month + "月は31日まであります");
                break;
            default:
                System.out.println("エラー");
                break;
        }
    }
}