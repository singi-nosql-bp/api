package io.zobic.nosqlapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestNosqlApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(NosqlApiApplication::main).with(TestNosqlApiApplication.class).run(args);
    }

}
