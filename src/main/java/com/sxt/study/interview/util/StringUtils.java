package com.sxt.study.interview.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author songj
 * @date 2019/10/14 15:41
 */
public final class StringUtils {

    private StringUtils() {
    }

    /**
     * 字符串反转
     *
     * @param originStr
     * @return
     */
    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() <= 1) {
            return originStr;
        }
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }

    /**
     * 按规则替换字符串
     *
     * @param str    源字符串
     * @param regex  规则
     * @param newStr
     * @return
     */
    public static String replaceAll(String str, String regex, String newStr) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        String result = matcher.replaceAll(newStr);
        return result;
    }

    /**
     * 判断 t 是否是 s 的重组串
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] bit = new int[26];
        for (int i = 0; i < s.length(); i++) {
            bit[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (--bit[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
