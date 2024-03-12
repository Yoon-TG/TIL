package test04_07;

import java.util.Arrays;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//3)구입하지 않는 물건 출력하기
//		//구입할 물건["냉장고","선풍기","TV","노트북","세탁기","에어컨"]
//		//구입한 물건["에어컨","노트북","TV"]
//		//출력 : 냉장고 선풍기 세탁기
//		String[] buyThings = {"냉장고","선풍기","TV","노트북","세탁기","에어컨"};
//		String[] boughtThings = {"에어컨","노트북","TV"};
//		
//		System.out.println("===구입하지 못한 물건===");
//		
//		Arrays.sort(boughtThings);
//		
//		for(String by : buyThings) {
//			if(Arrays.binarySearch(boughtThings,by)<0) {
//				System.out.println(by);
//			}
//		}
		
		
//		//2) 5*5 2차원 배열 데이터 넣고 출력
//		//	숫자 자료형일때 0, 빈공간 null
		//책은 하나하나 대입하길래.. 자동화해서 넣어봄
//		//6 / 6, 5 / 6, 5, 4 / 6,5,4,3 / 6,5,4,3,2
//		int[][] numbers = new int[5][5];
//		
//		for(int i=0; i<numbers.length; i++) {//0~5
//			for(int j = 0; j<(i+1); j++) {
//				numbers[i][4-j] = 6-j;
//			} 
//		}
//
//		for(int[] a : numbers) {
//			System.out.println(Arrays.toString(a));
//		}
		
		
//		//1)학생 수 만큼의 정수 자료형으로 배열 만들기
//		
//		int[][][] classes = new int[3][3][12];
//		
//		classes[1][0] = new int[9]; //2-1 = 9명
//		classes[1][2] = new int[10]; //2-3 = 10명
//		
//		classes[2][0] = new int[7]; //3-1 = 7명
//		classes[2][2] = new int[11]; //3-3 = 11명
//		
//		for(int i=0; i<classes.length; i++) {
//			for(int j = 0; j<classes.length; j++) {
//				System.out.printf("%d학년 %d반 %d명 \n",
//									(i+1),(j+1), classes[i][j].length);
//			}
//		}
		
		
	}

}
