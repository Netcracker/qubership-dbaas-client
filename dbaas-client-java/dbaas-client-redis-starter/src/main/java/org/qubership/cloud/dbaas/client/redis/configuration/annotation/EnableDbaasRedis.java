package org.qubership.cloud.dbaas.client.redis.configuration.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableServiceDbaasRedis
@EnableTenantDbaasRedis
public @interface EnableDbaasRedis {
}
