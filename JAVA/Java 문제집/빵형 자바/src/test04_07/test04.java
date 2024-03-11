package test04_07;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method st		
//		//3) 정수의 값 입력받고 입력받은 값이 
////		양수 > 그냥 출력 음수>양수로 변환 출력
////		ex. 정수값을 입력하세요 : 4 /n 출력값 : 4
//		Scanner scan3 = new Scanner(System.in);
//		
//		System.out.print("정수값을 입력하세요 : ");
//		int num3 = scan3.nextInt();
//		
//		if(num3<0) { //음수일 때
//			num3 = num3*-1;
//		}
//		
//		System.out.print("출력값 : "+num3 );
//		
//		//예제코드 - 3)
////		System.out.printf("출력-값 : %d% \n", (num3>0) ? num3 : (num3*-1));;
//		System.out.printf(" 출력값 : %d%n", (num3>0) ? num3 : (num3*-1));
		
		
		
//		//2) 100점 만점의 학점을 입력바다 90점 이상 a, ... 60점 미만 f
//		//입력받는 점수는 0~100사이 값
//		//ex. 0~100사이의 학점을 입력하세요 : 55 /n 
//		//	  학점(55)은 F입니다.
//		Scanner scan2 = new Scanner(System.in);
//
//		System.out.print("0~100사이의 학점을 입력하세요 : ");
//
//		int score = scan2.nextInt();
//
//		String scoreText = "";
//
//		//if문 
//		if(!(0<=score&&score<=100)) {
//			System.out.println("점수 범위가 초과하였습니다. 다시 시도해주세요.");
//		}else {		
//			if(score >= 90) {
//				scoreText = "A";
//			}else if(score >=80) {
//				scoreText = "B";
//			}else if(score >= 70) {
//				scoreText = "C";
//			}else if(score >= 60) {
//				scoreText = "D";
//			}else{
//				scoreText = "F";
//			}
//			System.out.printf("학점(%d)은 %s입니다.", score, scoreText);
//		}
//
//		//삼항 연산자
//		if(!(0<=score&&score<=100)) {
//			System.out.println("점수 범위가 초과하였습니다. 다시 시도해주세요.");
//		}else {
//			scoreText = score >= 90 ?  "A" :
//						score >=80 ? "B" :
//							score >= 70 ? "C" :
//								score >= 60 ? "D" : "F";
//			
//			System.out.printf("학점(%d)은 %s입니다.", score, scoreText);
//		}
		

		//		//1) 두 개의 값을 입력받아 큰 수를 출력(같으면 0으로 출력)
		//		//ex. 답 입력 > 30 20 \n 출력 > 30
		//		
		//		Scanner scan1 = new Scanner(System.in);
		//		
		//		System.out.print("답 입력 >");
		//		
		//		int num1 = scan1.nextInt();
		//		int num2 = scan1.nextInt();
		//		
		//		int answer = num1 == num2 ? 0 : 
		//										num1>num2 ? num1 : num2;
		//		
		//		System.out.printf("출력 > %d",answer);		
	}

}
