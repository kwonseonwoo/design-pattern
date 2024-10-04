package com.example.demo.designPattern.proxy;

import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StoreProxy implements AbstractStore {

    private final AbstractStore store;

    public StoreProxy() {
        this.store = new Store();
    }

    @Override
    public void process(Bread bread, int cash) {
        System.out.println("[매장 Proxy] 빵을 고르지 않은 경우 랜덤으로 빵을 고릅니다.");

        if(ObjectUtils.isEmpty(bread)) {
            int index = (int) (Math.random() * 5) + 1;
            bread = makeBreadMap().get(index);
        }
        store.process(bread, cash);
    }

    private Map<Integer, Bread> makeBreadMap() {
        AtomicInteger index = new AtomicInteger(1);
        return Arrays.stream(Bread.values())
                .collect(
                        Collectors.toUnmodifiableMap(
                                data -> index.getAndIncrement(),
                                Function.identity()
                        )
                );
    }
}
