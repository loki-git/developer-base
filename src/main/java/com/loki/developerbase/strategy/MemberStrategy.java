package com.loki.developerbase.strategy;

/**
 * 设计模式-策略模式
 * 抽象折扣类
 */
public interface MemberStrategy {

    /**
     * 计算图书的价格
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public abstract double calcPrice(double booksPrice);

}
