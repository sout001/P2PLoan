package com.zking.P2PLoan.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * BigDecimal 工具类
 * create by CSQ on 2020-01-07
 */
public class BigDecimalUtil {


    /**
     * BigDecimal 加法
     * @param bigDecimal1
     * @param bigDecimal2
     * @return 返回结果
     */
    public static BigDecimal Addition(BigDecimal bigDecimal1,BigDecimal bigDecimal2){

        if(bigDecimal1 !=null && bigDecimal2 !=null){
            return bigDecimal1.add(bigDecimal2);
        }

        return null;
    }

    /**
     * BigDecimal 减法
     * @param bigDecimal1 减数
     * @param bigDecimal2 被减数
     * @return 返回结果
     */
    public static BigDecimal Subtraction(BigDecimal bigDecimal1,BigDecimal bigDecimal2){

        if(bigDecimal1 !=null && bigDecimal2 !=null){
            //如果减数大于被减数
            if(bigDecimal1.compareTo(bigDecimal2)==1){
               return bigDecimal1.subtract(bigDecimal2);
            } else if(bigDecimal1.compareTo(bigDecimal2)==0) { //如果两个数相等
                return bigDecimal1.subtract(bigDecimal2);
            }
        }

        return null;
    }

    /**
     * 乘法
     * @param bigDecimal1
     * @param bigDecimal2
     * @return 返回结果
     */
    public static BigDecimal Multiplication(BigDecimal bigDecimal1,BigDecimal bigDecimal2) {

        if(bigDecimal1 !=null && bigDecimal2 !=null){
          return bigDecimal1.multiply(bigDecimal2);
        }

        return null;
    }

    /**
     * 取绝对值
     * @param bis
     * @return
     */
    public static List<BigDecimal> Absolute(List<BigDecimal> bis){

        List<BigDecimal> result = new ArrayList<>();
        if(bis.size()>0){
            for (BigDecimal b : bis){
                BigDecimal abs = b.abs();
                result.add(abs);
            }
        }

        return result;
    }

}
