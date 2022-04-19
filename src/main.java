import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //반복문으로 0번을 입력받기전까지 프로그램 무한반복.
        while (true){

            //1번과 2번 혹은 종료하는 0번의 선택지를 입력받음.
            System.out.println("C > F 는 1번 , F > C 는 2번, 종료하시려면 0번을 눌러주세요.");
            int choice = sc.nextInt();

            if(choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (!(choice == 1 || choice == 2)) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                continue;
            }
            //값을 변환할 값을 입력받아서 변수 value 에 저장.
            System.out.println("값을 변환할 온도를 넣어주세요");
            float value = sc.nextFloat();


            if (choice == 1)
                System.out.println(sub.CtoF(value) + "도 입니다.");
            else if (choice == 2)
                System.out.println(sub.FtoC(value) + "도 입니다.");

            else
                System.out.println("잘못된 입력입니다. 1번혹은 2번, 종료는 0번을 눌러주세요.");

        }
    }
}
