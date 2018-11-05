package com.loki.developerbase.strategy;

/**
 * @Author xujs
 * 设计模式-策略模式
 * 高级会员折扣类
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("高级会员折扣为0.8");
        return booksPrice * 0.8;
    }

}
