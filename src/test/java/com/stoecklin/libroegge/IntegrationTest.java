package com.stoecklin.libroegge;

import com.stoecklin.libroegge.config.AsyncSyncConfiguration;
import com.stoecklin.libroegge.config.EmbeddedSQL;
import com.stoecklin.libroegge.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        LibroEggeApp.class,
        JacksonConfiguration.class,
        AsyncSyncConfiguration.class,
        com.stoecklin.libroegge.config.JacksonHibernateConfiguration.class,
    }
)
@EmbeddedSQL
public @interface IntegrationTest {}
