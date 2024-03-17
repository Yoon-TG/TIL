package test04_07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4) 모든 단어는 소문자
		//공백 다음에 오는 알파벳은 공백을 제거하고 대문자 변환.
		//입력값 = Internet of things / 출력값 = internetOfThing
		//boolean 으로 구분하고 판단하는 방법을 좀 더 활용해볼 수 있도록 신경써야겠다...
		String str = "Internet of things";
		String result = "";
		
		str = str.toLowerCase(); //모두 소문자로 바꿈

		boolean changeFlag = false;
		
		for(var c : str.toCharArray()) {
			//str을 돌면서
			if(changeFlag) { //c가 공백인 경우에만 실행됨
				changeFlag = false;
				c = (char)((int)c - 32); //대문자 변환
			}
			
			if(c == ' ') { //공백인경우
				changeFlag = true; 
				continue;
			}
			
			result += c; //결과값 더하기
		}
		
		System.out.println(result);
		
		
		
//		//3)전기세 계산 프로그램 - //사용량을 키보드로 입력받아 계산
// 참고 : https://seeminglyjs.tistory.com/244

//		/*전력 사용량 : 201~400kwh
//		//기본 요금 1600, 단계별로 차등
//		//1단계 : 200kwh*93.3(1~200까지는 93.3원)
//		//2단계 : 200kwh*187.9(201~400까지는 187.9원)
//		//소수점 이하 절사방법(Math.floor(n)로 절사)
//		//소수점 이하 반올림방법(Math. round(n)로 반올림)
//		
//		//ex) 
//		사용량 201kwh => 1600원+18,847원 = 20,447원
//		부가가치세(원미만 4사5입(반올림)) : 20,447*0.1 = 2,045원
//		전력산업기반기금(10미만 절사) : 20,447*0.037 = 750원
//		청구금액(전기요금계+부가가치세+전력산업기반기금) 
//		= 20,447+2,045+750 = 23,240원(10원 미만 절사)		
//		*/
//		//사용량 입력받기
//		Scanner scan3 = new Scanner(System.in);
//		
//		System.out.print("사용하신 전력 사용량을 입력하세요 : ");
//		int usedAmount = scan3.nextInt(); //전력사용량
//		
//		int defaultCost = 1600; //기본요금
//		int usedCost = defaultCost+(int) (200*93.3); //사용량에 따른 금액(200까지 금액)
//		
//		//사용량 계산(사용량은 201~400)
//		usedCost += (usedAmount-200)*187.9; //200이상 사용량에 따른 금액
//				
//		//부가가치세 계산
//		int extraCost = (int)(Math.round(usedCost*0.1));
//		
//		//전력산업기반기금 계산 - 10원 미만 절사 필요
//		int elecCost = (int)(Math.floor(usedCost*0.037/10)*10);
//		
//		//청구금액 계산
//		int total = (int) (Math.floor((usedCost+extraCost+elecCost)/10)*10);
//		System.out.printf("사용량 %d %d원, 부가가치세 %d원, 전력산업기반기금 %d원 \n", 
//						 	usedAmount,usedCost, extraCost, elecCost);
//		System.out.println("청구금액 : "+total);
		
		
//		//2) 로또 추첨 번호 예상 프로그램 작성하기
//		//임의의 숫자를 1~45까지의 수를 6개 추첨하여 당첨번호 구하기
//		//중복숫자x
//		//1. random()을 for문으로 배열 길이가 6 될때까지 반복하며 넣음.
//		//중복 검증 절차 필요
//		int[] lotto = new int[6];
//		
//		for(int i = 0; i<lotto.length; i++) {
//			int number = (int) ((Math.random()*45)+1); //난수
//			//검증절차
//			for(int check : lotto) {
//				if(check!=number) {
//					lotto[i] = number; //넣음
//					break;
//				}
//			}			
//		}		
//		//출력하기
//		System.out.println(Arrays.toString(lotto));
		
		
		
		//2.Set 이용, for문을 통해 Set의 길이가 6이 될 때까지 반복하며 랜덤수를 
		//넣기~
//		Set<Integer> lotto = new HashSet<>();
//
//		do {
//			lotto.add((int) ((Math.random()*45)+1)); //난수 넣기
//		}while(lotto.size()<6);
//			
//		//출력하기
//		System.out.println(Arrays.toString(lotto.toArray()));
				
		
//		//1) 입력받은 수가 양수인지 음수인지 판단하기
//		Scanner scan1 = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int num1 = scan1.nextInt();
//		
//		if(num1<0) {
//			System.out.printf("%d은 음수입니다.", num1);
//		}else {
//			System.out.printf("%d은 양수입니다.", num1);
//		}
		
	}

}
