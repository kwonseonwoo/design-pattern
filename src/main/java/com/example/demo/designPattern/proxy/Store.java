package com.example.demo.designPattern.proxy;

public class Store implements AbstractStore {

    @Override
    public void process(Bread bread, int cash) {
        System.out.println("[매장] 빵 구매 시작... cash : '" + cash + "원' 빵: '" + bread + "'");
        System.out.println("[매장] 구매할 빵은 '" + bread.getCode() + "' 입니다.");
        System.out.println("[매장] 빵의 가격은 '" + bread.getPrice() + "'원 입니다.");

        if(bread.getPrice() > cash) {
            System.out.println("돈이 모자랍니다. 빵의 가격: '" + bread.getPrice() + "' 지불한 금액: '" + cash + "'");
            return;
        }

        System.out.println("맛있게 드세요.");
    }
}
