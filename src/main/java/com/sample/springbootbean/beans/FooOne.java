package com.sample.springbootbean.beans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Qualifier("FooOne")
public class FooOne implements Foo{
    @Override
    public void print() {
        log.info("Log message for implementation FooOne");
    }
}
