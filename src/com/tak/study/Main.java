package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();	//색종이의 수 입력
        int area = 0;

        boolean[][] check = new boolean[101][101];

        for(int tc = 0; tc < num; tc++) {

            int x = sc.nextInt();	// 색종이의 좌측 아래 꼭짓점 좌표
            int y = sc.nextInt();	// 색종이의 좌측 위 꼭짓점 좌표

            for(int i = x; i < x+10; i++) {	// 색종이의 가로, 세로 크기는 10

                for(int j = y; j < y+10; j++) {

                    if(check[i][j] == true) { // 이전에 의해 이미 칠한경우 => 중복되므로 제거
                        continue;
                    }

                    check[i][j] = true;	// 검은색 색종이로 색칠하기
                    area ++;

                }
            }
        }

        System.out.println(area);
        sc.close();

    }

}
