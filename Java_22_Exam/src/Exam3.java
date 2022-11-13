import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        char check = sc.next().charAt(0);
        boolean national = check == 'y' || check == 'Y';

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        check = sc.next().charAt(0);
        boolean card = check == 'y' || check == 'Y';

        int price = 0;
        if (age > 2) {
            if (age < 13 || time >= 17) price = 4000;
            else if (national || card) price = 8000;
            else price = 10000;
        }
        System.out.print("입장료: "+ price);
    }
}
