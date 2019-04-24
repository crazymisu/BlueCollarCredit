package com.etsafe;

public class Safe {
    public int safe(String peopelType) {
        /**
         * 人员状态信息：peopelType
         */
        int safeScore;
        boolean condition = "B".equals(peopelType) || "C".equals(peopelType) || "D".equals(peopelType) || "E".equals(peopelType) || "F".equals(peopelType);
        if ("A".equals(peopelType)){
            safeScore = 0;
        }else if (condition) {
            safeScore = 380;
        }else{
            safeScore = 490;
        }
        System.out.println("safeScore: " + safeScore);
        return safeScore;
    }
    public static void main(String[] args){
        // 下面的语句将创建一个BlueCollar对象
        Safe safeObject = new Safe();
        int safeScore = safeObject.safe("B");

    }
}
