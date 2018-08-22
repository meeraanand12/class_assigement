package com.apex.util;

public class Assigement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalMarks = 0;
		for(int i = 1;i<=3 ;i ++){
			int[] values = {91,90,100,89,88,90};
			for(int j = 0;j< values.length;j++){
				totalMarks = totalMarks + values[j];
			}
			int average = totalMarks/6;
			System.out.println("The average marks for student " + i + ": " + average);
			totalMarks = 0;
		}
		

	}

}
