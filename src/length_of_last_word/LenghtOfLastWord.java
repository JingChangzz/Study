package length_of_last_word;

import java.util.Scanner;

/**
 * 在字符串含空格中计算最后一个单词的长度
 *      1.全空格字符串 如'     ' 返回0
        2.最后一个单词后面存在空格 如'day   ' 返回3
        3.单词前面存在多个空格 如'    day' 返回3
        4.复杂的情况 如'  ab day ' 返回3
 * @author ZhangJing
 */

public class LenghtOfLastWord {
	
	public static void getLength(String sentence){
		int defalutLenght = 0;
		String[] words = sentence.split(" ");
		if(words.length<=0){
			System.out.println(defalutLenght);
			return;
		}
		System.out.println(words[words.length-1].length());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String read = scan.nextLine(); 
		getLength(read);
	}

}
