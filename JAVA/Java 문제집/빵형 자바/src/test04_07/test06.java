package test04_07;

import java.util.Arrays;
import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5) 입력된 값을 배열의 값과 비교, 몇 번 검색하여 찾았는지 
		//선형 검색을 이용해 소스코드 작성
		//ex.4, 6, 9, 2
		String[] answer = {"4", "6", "9", "2"};
		int num = 0; 
		
		Scanner scan5 = new Scanner(System.in);
		
		System.out.print("검색할 값을 입력하세요 : ");
		String choNum = scan5.next();
	
		
		
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
