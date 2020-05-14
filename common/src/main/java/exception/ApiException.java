package exception;

import enums.ResultEnum;

/**
 * @author fenghouzhi
 * @date 2020/5/12 - 9:00 下午
 * @description: 自定义异常类 - ApiException
 */
public class ApiException extends RuntimeException {

    private ResultEnum resultEnum;

    public ApiException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.resultEnum = resultEnum;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable throwable) {
        super(throwable);
    }

    public ApiException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ResultEnum getResultEnum() {
        return resultEnum;
    }

}