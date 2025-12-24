package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] arr = new int[10];
	
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = arr.length-i;
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}

	}

	public void practice3() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num < 0 && num > 6) {
			System.out.println("잘못 입력하셨습니다");
			return;
		}
		String[] calender = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

		System.out.println(calender[num]);
	}

	public void practice5() {
		int sum = 0;
		System.out.print("정수 : ");
		int maxnum = sc.nextInt();

		int[] arr = new int[maxnum];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.print("총합 : " + sum);
	}

	public void practice6() {
		int cnt = 0;
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = str.toCharArray();
		
		System.out.print("문자열에 있는 문자 : ");
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			
			boolean isDup = false;
			for (int i = 0; i < j; i++) {
				
				if(arr[j] == arr[i]) {
					isDup = true;
					break;
				}
			}
			if(!isDup) {
				System.out.print(ch + ", " );
				cnt++;
			}
		}
		System.out.println();
		System.out.print("총 문자 갯수 : " + cnt);
	}

	public void practice7() {
		int cnt = 0;
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.print("i 개수 : " + cnt);
	}

	public void practice8() {
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] arr = str.toCharArray();

		char[] copy = { '*', '*', '*', '*', '*', '*', '-', '*', '*', '*', '*', '*', '*', '*', };
		System.arraycopy(arr, 0, copy, 0, 8);
		System.out.println(copy);
	}

	public void practice9() {
		int[] arr = new int[10];
		int random = (int)(Math.random() * 10 + 1);
		int max = random;
		int min = random;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random;
			System.out.print(arr[i] + " ");
			max = (max < arr[i] ? arr[i] : max);
			min = (min > arr[i] ? arr[i] : min);
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practice10() {
		int [] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);;
			for (int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) i--;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
	}

	public void practice11() {
		while(true) {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		
		if(num<3 || num%2==0) {
			System.out.println("다시 입력하세요.");
		continue;
		}
		
		int[] arr = new int[num];
		
		int a = 1;
		
		for (int i = 0; i < arr.length/2; i++) {
			arr[i] = a++;
			System.out.print(arr[i] + " ");
		}
		for (int i = arr.length/2; i < arr.length; i++) {
			arr[i] = a--;
			System.out.print(arr[i] + " ");
		}
		
		break;
	}
	}
	
	public void practice12() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		String[] str = new String[size];
		String[] copy = {};
	int count = 0;
	int i = 0;
		while(true) {
			
			for (int j = count; j < size; j++) {
				System.out.print(j+1 + "번째 문자열 : ");
				str[j] = sc.next(); 
				count++;
			}
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			
			if(ch=='y' || ch=='Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int cnt = sc.nextInt();
				
				size += cnt;
				
				str = Arrays.copyOf(str, size);
				System.out.println(Arrays.toString(str));
			//	copy = Arrays.copyOf(str, size);
			//	System.out.println(Arrays.toString(copy));
				continue;
			}
			if(ch=='n' || ch=='N') {
				break;
			}			
	}
		System.out.println(Arrays.toString(str));
	}
	}
	

