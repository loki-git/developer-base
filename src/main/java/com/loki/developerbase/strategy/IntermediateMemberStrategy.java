package com.loki.developerbase.strategy;

/**
 * @Author xujs
 * 设计模式-策略模式
 * 中级会员折扣类
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("中级会员的折扣是0.9");
        return booksPrice * 0.9;
    }
}
