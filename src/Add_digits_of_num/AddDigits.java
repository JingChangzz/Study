package Add_digits_of_num;

import java.util.Scanner;

/**
 * Given num = 38, 
 * the process is like: 3 + 8 = 11, 1 + 1 = 2. 
 * Since 2 has only one digit, return it.
 * 各个位数相加，直到得到各位数的结果。
 * 时间复杂度o(1)
 * @author ZhangJing
 *
 */

public class AddDigits {

	public static int add(int num){
		return 1 + (num - 1)%9;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int read = scan.nextInt(); 
		System.out.println(add(read));
	}

}
