package com.sample.springbootbean.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Primary
public class FooTwo implements Foo{
    @Override
    public void print() {
        log.info("Log Message from Implementation FooTwo");
    }
}
