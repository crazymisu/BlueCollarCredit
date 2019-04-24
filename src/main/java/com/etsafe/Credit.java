package com.etsafe;

import java.math.BigDecimal;
import java.util.Random;

public class Credit {
    public BigDecimal credit(int numberOverdue,int numberBorrow,int judicialRecord,String financialRisk) {
        /**
         * 网络借贷逾期次数(历史)：number_overdue
         * 网络借贷数量：number_borrow
         * 司法负面记录数量：judicial_record
         * 金融风险记录数量：financial_risk
         */
        BigDecimal creditScore = new BigDecimal(65.00);

        if (numberOverdue == 0){
        }else if (1 <= numberOverdue && numberOverdue <=3) {
            creditScore = creditScore.subtract(new BigDecimal(8.125)) ;
        }else{
            creditScore = creditScore.subtract(new BigDecimal(16.25)) ;
        }

        if (numberBorrow == 0){
        }else if (1 <= numberBorrow && numberBorrow <=3) {
            creditScore = creditScore.subtract(new BigDecimal(4.875)) ;
        }else{
            creditScore = creditScore.subtract(new BigDecimal(9.75)) ;
        }

        if (judicialRecord == 0){
        }else if (1 <= judicialRecord && judicialRecord <=3) {
            creditScore = creditScore.subtract(new BigDecimal(9.75)) ;
        }else{
            creditScore = creditScore.subtract(new BigDecimal(19.50)) ;
        }

        if ( "长期拖欠".equals(financialRisk)) {
            creditScore = creditScore.subtract(new BigDecimal(6.50)) ;
        }else if ("不良客户".equals(financialRisk)){
            creditScore = creditScore.subtract(new BigDecimal(13.00)) ;
        }else if("疑似欺诈或高风险".equals(financialRisk)){
            creditScore = creditScore.subtract(new BigDecimal(19.50)) ;
        }else{

        }

        if (creditScore.compareTo(new BigDecimal(65.00)) == 0){
            Random ra =new Random();
            int rand = ra.nextInt(8)+1;
            creditScore = creditScore.add(new BigDecimal(rand));
        }
        System.out.println("creditScore: " + creditScore);
        return creditScore;
    }

    public static void main(String[] args){
        // 下面的语句将创建一个BlueCollar对象
        Credit creditObject = new Credit();
        BigDecimal creditScore = creditObject.credit(0,0,0,null);
    }
}
