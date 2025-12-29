package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		String [][] arr = new String[3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
	}
}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

	}
	
	public void practice3() {
		int[][] arr = new int[4][4];
		int num = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = num--;
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}	
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		int total = 0;
		
		 for (int i = 0; i < arr.length-1; i++) {
		        for (int j = 0; j < arr.length-1; j++) {
		        	arr[i][j] = (int)(Math.random() * 10) + 1;
		            arr[i][arr.length-1] += arr[i][j];  
		            arr[arr.length-1][j] += arr[i][j];   
		            total += arr[i][j];  
		        }
		        
		    }
		 arr[3][3] = total;
		 for (int i = 0; i < arr.length; i++) {
		        for (int j = 0; j < arr.length; j++) {
		            System.out.printf("%3d ", arr[i][j]);
		        }
		        System.out.println();
		    }
	}
	
	public void practice5() {
		
		while(true) {
			System.out.print("행 크기 :");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if (!(1 <= row && row <= 10 || (1 <= col && row <= col)))
			{
				System.out.println("반드시 1~10사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			char [][] arr = new char[row][col];
			 for (int i = 0; i < row; i++) {
			        for (int j = 0; j < col; j++) {
			            arr[i][j] = (char)(65 + (int)(Math.random() * 26));
			            System.out.print(arr[i][j] + " ");
			        }
			        System.out.println();
			    }
			 break;
		}
		
	}
	
	public void practice6() {
		String[][] strArr = new String[][] 
				{{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "시"}, 
			{"배", "심", "다", "좀", "다"},
			{"열", "히", "! ", "더", "!! "}};

	}
	
	public void practice7() {
		System.out.print("행의 크기 :" );
		int row = sc.nextInt();
		char [][] arr = new char[row][];
		
		char a = 'a';
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int col = sc.nextInt();
			arr[i] = new char[col];
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] student = {"강건강","남나나","도대담","류라라"
				,"문미미","박보배","송성실","윤예의","진재주",
				"차천축","피풍표","홍하하"};
		int count = 0;
		int row = 3;
		int col = 2;
		String[][] arr1 = new String[row][col];
		String[][] arr2 = new String[row][col];
		System.out.println("== 1분단 ==");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr1[i][j] = student[count++];
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr2[i][j] = student[count++];
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
