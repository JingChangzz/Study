package dataStructrue.sort;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * 直接插入排序的拓展
 *
 *
 *
 */
public class ShellSort{

	public static void shellSortSmallToBig(int[] data) {
		int j = 0;
		int temp = 0;

		for (int increment = data.length / 2; increment > 0; increment /= 2) {
			System.out.println("increment:" + increment); //步长

			for (int i = increment; i < data.length; i++) {
				temp = data[i];
				for (j = i - increment; j >= 0; j -= increment) {
				// System.out.println("j:" + j);
				// System.out.println("temp:" + temp);
				// System.out.println("data[" + j + "]:" + data[j]);
					if (temp < data[j]) {
						data[j + increment] = data[j];
					} else {
						break;
					}
				}
				data[j + increment] = temp;
			}

			for (int i = 0; i < data.length; i++)  //打印每轮排序结果
				System.out.print(data[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] data = new int[] { 26, 53, 67, 48, 57, 13, 48, 32, 60, 50 };
		shellSortSmallToBig(data);
		System.out.println(Arrays.toString(data));
	}
}