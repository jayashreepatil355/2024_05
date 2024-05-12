package com.Test;

public class Example {

	public static void main(String[] args) {
		int a[]={10,30,20,70};
		int max=a[0];

		for(int i=0;i<a.length;i++){
		if(max <a[i]){
			max=a[i];
		}
		}
		System.out.println(max);

	}

}
