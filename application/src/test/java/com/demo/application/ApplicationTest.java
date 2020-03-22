package com.demo.application;

import com.demo.common.one.model.SharedModelOne;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.h2.H2DatabaseTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@QuarkusTestResource(H2DatabaseTestResource.class)
class ApplicationTest {

    @Test
    @Transactional
    void test() {
        SharedModelOne one = new SharedModelOne();
        one.setName("test");
        one.persist();
    }
}