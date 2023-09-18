package com.learning04._throw;

/**
 * @author yuxiaohong
 * @package com.learning04._throw
 * @date 2023/8/22 12:04
 * @description
 */
public class BelowZeroException extends Exception {

    // 用于唯一标识当前的异常类
    static final long serialVersionUID = -3387516999948L;

    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
