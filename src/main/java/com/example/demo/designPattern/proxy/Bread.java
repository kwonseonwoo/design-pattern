package com.example.demo.designPattern.proxy;

import lombok.Getter;

@Getter
public enum Bread {

    소보로빵("소보로빵", 3000, "땅콩 소보로빵 입니다."),
    팥빵("팥빵", 3500, "팥이 들어간 팥빵 입니다."),
    메론빵("메론빵", 2500, "메론이 들어간 메론빵 입니다."),
    맘모스빵("맘모스빵", 8000, "맘모스빵 입니다."),
    소금빵("소금빵", 3300, "소금이 얹어진 소금빵 입니다."),
    ;

    private final String code;
    private final Integer price;
    private final String desc;

    Bread(String code, Integer price, String desc) {
        this.code = code;
        this.price = price;
        this.desc = desc;
    }

}
