package com.alibaba.csp.sentinel.spi;

/**
 */
@Spi(value = "five", isDefault = true, order = -270)
public class TestFiveProvider implements TestInterface {

}
