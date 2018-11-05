package com.loki.developerbase.strategy;

/**
 * @Author xujs
 * 价格
 */
public class Price {

    /**
     * 持有一个具体的策略对象
     */
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double boosPrice) {
        return this.memberStrategy.calcPrice(boosPrice);
    }

}
