package test04_07;

import java.util.Arrays;
import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//6) 구구단의 값을 2차원 배열에 넣은 후 출력하기
//		//넣고 출력 둘 다 반복문으로 만들어보기
//		//출력값은 tab으로 간격 조정
//		//넣기
//		int[][] gugudan = new int[8][9];
//		
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				gugudan[i-2][j-1] = i*j;
//			}
//		}
//		
//		int num = 2;
//		//출력하기
//		for(int[] a : gugudan) {
//			System.out.printf("===== %d 단 ===== \n", num);
//			for(int b : a) {
////				System.out.printf("%d \t",b); //답은 이건데
//				System.out.printf("%d ",b); //이 쪽이 더 보기 편함
//			}
//			System.out.println();
//			num++;
//		}
		
		
		
//		//5) 입력된 값을 배열의 값과 비교, 몇 번 검색하여 찾았는지 
//		//선형 검색을 이용해 소스코드 작성
//		//ex.4, 6, 9, 2
//		String[] answer = {"4", "6", "9", "2"};
//		int num = 0; 
//		
//		Scanner scan5 = new Scanner(System.in);
//		
//		System.out.print("검색할 값을 입력하세요 : ");
//		String choStr = scan5.next();
//		
//		for(String testStr : answer) {
//			num +=1; //횟수 추가
//			
//			if(testStr.equals(choStr)) { //같은 경우 반복문 종료
//				num += 1;
//				System.out.printf("\n %d번 검색하여 값을 찾았습니다.", num);
//				break;
//			}
//			
//			if(num==answer.length) { //끝까지 돌았는데 못 찾은 경우
//				System.out.println("찾을 수 없는 값입니다.");
//			}
//		}

		
//		//4) 문자열 입력 받고 아스키코드 활용하여 암호화(-3) > 다시 복호화
//		Scanner scan4 = new Scanner(System.in);
//		
//		System.out.print("단어를 입력하세요 : ");
//		String answer = scan4.next();
//
//		System.out.print("암호화 된 단어 : ");
//		String pwd = ""; //암호화 된 단어
//		
//		for(char word : answer.toCharArray()) {
//			pwd += (char)(word-3);
//		}
//		System.out.println(pwd);
//		
//		
//		System.out.print("복호화 된 단어 : ");
//		String ans = ""; //복호화 된 단어
//		
//		for(char word2 : pwd.toCharArray()) {
//			ans += (char)(word2+3);
//		}
//		System.out.println(ans);
		
		

		
		
		
//		//3)1~100까지의 수 중 약수만 출력 4/2=0
//		boolean number = true;
//		
//		for(int i=2; i<=100; i++) {	
//			number = true; //초기화!
//			
//			for(int j=2; j<i; j++) {
//				if((i%j)==0) {
//					number = false;
//				}
//			}
//			
//			if(number) {
//				System.out.print(i+" ");
//			}
//		}

		
		
//		//2) *로 피라미드 출력하기 
//		//1-1 2-3 3-5 4-7 5-9
//		int lines = 5; //라인 수
//		for(int line = 1; line<=lines; line++) {
//			for(int blank=5; blank>line; blank--) { //4,3,2,1
//				System.out.print(" ");
//			}
//			for(int star=1; star<(line*2); star++) { //1,3,5,7,9
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		//1) 숫자 입력받고 1부터 입력받은 수까지 배열에 담기
//		// 배열 for문으로 출력하기
//		Scanner scan1 = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 : ");
//		int num = scan1.nextInt();
//		
//		int[] answer = new int[num];
//		for(int i=0; i<answer.length; i++) {
//			answer[i] = (i+1);
//			System.out.println(answer[i]);
//		}
	}

}
