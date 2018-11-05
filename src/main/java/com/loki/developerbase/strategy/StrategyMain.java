package com.loki.developerbase.strategy;

/**
 * @Author xujs
 * 设计模式-策略模式
 */
public class StrategyMain {

    public static void main(String[] args) {
        // 选择并创建需要使用的策略对象
        MemberStrategy memberStrategy = new AdvancedMemberStrategy();

        // 创建环境
        Price price = new Price(memberStrategy);

        // 计算价格
        double quote = price.quote(100);
        System.out.println("图书最终价格为:" + quote);
    }

}
