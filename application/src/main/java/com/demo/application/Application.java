package com.demo.application;

import com.demo.common.one.model.SharedModelOne;
import io.quarkus.scheduler.Scheduled;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Slf4j
@ApplicationScoped
public class Application {

    @Transactional
    @Scheduled(every = "20s")
    void schedule() {

        SharedModelOne model = new SharedModelOne();

        model.setCreatedAt(LocalDateTime.now());
        model.setName("test");

        model.persist();

        log.info("shared model entries: " + SharedModelOne.count());
    }

}
