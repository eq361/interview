package com.sxt.study.interview.util;

/**
 * @author songjun
 * @date 2019/10/13.
 */
public final class ArrayUtils {

    private ArrayUtils() {
    }

    /**
     * 整型数组排序（从大到小）
     *
     * @param array
     * @return
     */
    public static void sortByBubble(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortByBubble2(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; ++i) {
            //通过符号位可以减少无谓的比较，如果已经有序了，就退出循环
            boolean flag = true;
            for (int j = 0; j < a.length - 1 - i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    /**
     * 选择排序
     *
     * @param array
     */
    public static void sortBySelect(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            // 本次循环默认最小值下标
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            // 找到本次最小值
            if (i != minIndex) {
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    /**
     * 插入排序
     *
     * @param array
     */
    public static void sortByInsert(int[] array) {
        int i, j;
        for (i = 1; i < array.length; i++) {
            int temp = array[i];
            for (j = i; j > 0 && temp < array[j - 1];j--){
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }
}
