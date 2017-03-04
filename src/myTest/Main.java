package myTest;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		Integer[] datas = new Integer[count];

		for(int i =0; i < count; i++){
			datas[i] = s.nextInt();
		}

		int five = 0;

		int five1cal = 0;
		int five1num = 1;

		int five2num = 0;

		int five3aver = 0;
		int five3num =0;

		int maxfive4 = -1;

		for(int i =0; i < count; i++){
			if(datas[i]%5 == 0 && datas[i]%2 == 0){
				five = five + datas[i];
			}
			if (datas[i]%5 == 1){
				if(five1num % 2 == 1){
					five1cal = five1cal + datas[i];
				}else{
					five1cal = five1cal - datas[i];
				}
				five1num++;
			}
			if(datas[i]%5 == 2){
				five2num ++;
			}
			if(datas[i]%5 == 3){
				five3aver = five3aver + datas[i];
				five3num++;
			}
			if(datas[i]%5 == 4){
				if(maxfive4 < datas[i]){
					maxfive4 = datas[i];
				}
			}
		}
		DecimalFormat df  = new DecimalFormat("###.0");
		float five3 = 0;
		if(five3num!=0){
			five3 = (float)five3aver/five3num;
		}
		if(five==0){
			if(five2num==1){
				if(five3num==0){
					if(maxfive4==0) {
						System.out.println("N N " + five2num + " N N");
					}
				}
			}
		}else{
			System.out.println(five+" "+five1cal+" "+five2num+" "+df.format(five3)+" "+maxfive4);
		}


	}

}
