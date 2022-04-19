import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sub subin = new sub();


        //값을 변환할 값을 입력받아서 변수 value 에 저장.
        System.out.println("값을 변환할 온도를 넣어주세요");
        float value = sc.nextFloat();


        //1번과 2번 선택지를 입력받음.
        System.out.println("C > F 는 1번 , F > C 는 2번을 눌러주세요.");
        int choice = sc.nextInt();

        if(choice == 1)
            System.out.println(subin.CtoF(value));
        else if(choice == 2)
            System.out.println(subin.FtoC(value));
        else
            System.out.println("잘못된 입력입니다. 프로그램이 종료됩니다.");


            sc.close();
    }
}
