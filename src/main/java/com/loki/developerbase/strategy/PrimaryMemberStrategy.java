package com.loki.developerbase.strategy;

/**
 * @Author xujs
 * 设计模式-策略模式
 * 初级会员折扣类
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员没有折扣");
        return booksPrice;
    }

}