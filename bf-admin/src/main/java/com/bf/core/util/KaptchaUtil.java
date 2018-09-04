package com.bf.core.util;

import com.bf.config.properties.BfProperties;

/**
 * 验证码工具类
 */
public class KaptchaUtil {

    /**
     * 获取验证码开关
     */
    public static Boolean getKaptchaOnOff() {
        return SpringContextHolder.getBean(BfProperties.class).getKaptchaOpen();
    }
}