package com.example.demo.designPattern.singleton;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class SingletonObjectTest {

    @DisplayName("객체 주소값이 모두 일치하는지 검증한다.")
    @Test
    void validAddress() {
        String message = "SingleTon Object 입니다...";

        SingletonObject object = SingletonObject.getInstance();
        SingletonObject object2 = SingletonObject.getInstance();
        SingletonObject object3 = SingletonObject.getInstance();

        log.info("first object address - {}", object);
        log.info("second object address - {}", object2);
        log.info("third object address - {}", object3);

        assertAll(
                () -> assertThat(object).isEqualTo(object2),
                () -> assertThat(object2).isEqualTo(object3),
                () -> assertThat(object.getName()).isEqualTo(message)
        );
    }

}