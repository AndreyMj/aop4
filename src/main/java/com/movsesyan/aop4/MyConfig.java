package com.movsesyan.aop4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.movsesyan")
@EnableAspectJAutoProxy
public class MyConfig {
}
