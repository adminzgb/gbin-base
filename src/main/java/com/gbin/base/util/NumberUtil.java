package com.gbin.base.util;

import java.util.regex.Pattern;

/**
 * @author chao
 * @since 2015/1/3
 */
public class NumberUtil {

    /**
     * 产生短UUID，长度19位
     *
     * @return
     */
    public String generateShortUUID(){
        return ShortUUID.generate();
    }

    /**
     * 是否小数
     * @param str
     * @return
     */
    public boolean isDecimal(String str) {
        Pattern pattern = Pattern.compile("^-?[0-9]+(.[0-9]+)?$");
        return pattern.matcher(str).matches();
    }

    /**
     * 字符串转int
     *
     * @param string
     * @return
     */
    public int toInteger(String string) {
        try {
            return Integer.parseInt(string);
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * 字符串转long
     *
     * @param string
     * @return
     */
    public long toLong(String string) {
        try {
            return Long.parseLong(string);
        } catch (Exception e) {
            return 0;
        }
    }


}
