package enums;

import lombok.Getter;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 11:34 下午
 * @description:
 */
@Getter
public enum ResultEnum {

    /**
     * 请求成功
     */
    SUCCESS(0, "成功"),

    /**
     * 没有更多数据
     */
    RESULT_EMPTY(300, "没有更多数据"),

    /**
     * 操作失败
     */
    Failure(4004, "操作失败"),

    /**
     * 签名验证失败
     */
    SIGN_ERROR(20, "签名验证失败"),

    /**
     * 登录失败, 登录信息不正确
     */
    LOGIN_FAIL(25, "登录失败, 登录信息不正确"),

    /**
     * 参数为空
     */
    EMPTY(15, "参数为空"),

    /**
     * 登出成功
     */
    LOGOUT_SUCCESS(26, "登出成功"),

    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500, "服务器内部错误"),

    /**
     * 用户不存在
     */
    USER_NOT_EXISTS(10003, "用户不存在"),

    /**
     * 数据绑定失败
     */
    DB_VERIFY_USER_ERROR(20001, "数据绑定失败"),

    /**
     * 账号已被禁用,请联系管理员
     */
    DB_VERIFY_ACCOUNT_ERROR(20001, "账号已被禁用,请联系管理员"),

    /**
     * 更新 session 失败
     */
    DB_SESSION_UPDATE_ERROR(20002, "更新 session 失败"),

    /**
     * 新增 session 失败
     */
    DB_SESSION_CREATE_ERROR(20003, "新增 session 失败"),

    /**
     * 手机号和预留账号不一致
     */
    DB_VERIFY_PHONE_ERROR(20004, "手机号和预留账号不一致"),

    /**
     * 用户身份证号已存在使用
     */
    DB_USER_IDUMBER_EXISTS(20005, "用户身份证号已存在使用"),

    /**
     * 用户手机号已存在使用
     */
    DB_USER_PHONE_EXISTS(20006, "用户手机号已存在使用"),

    /**
     * 验证码不存在,请重新获取
     */
    QRCODE_NO_EXISTS(20007, "验证码不存在,请重新获取"),

    /**
     * 验证码已过期,请重新获取
     */
    QRCODE_EXPIRED(20008, "验证码已过期,请重新获取"),

    /**
     * 未获得系统授权,请联系管理员
     */
    DB_VERIFY_DISABLED(20012, "未获得系统授权,请联系管理员"),

    NO_DEVICE_DISABLED(20013, "设备未绑定"),

    PARAM_ERROR(1, "参数不正确"),

    NOT_EMPTY(2, "参数不能为空"),

    REQUEST_ERROR(3, "请求错误"),

    CLIENT_ERROR(4, "客户端请求错误"),

    PARSE_ERROR(5, "类型转换错误"),

    REQUEST_METHOD_ERROR(400, "请求方法与服务端请求方法不一致"),

    ROLE_DISABLED(403, "账号没有访问权限"),

    NOT_FOUND(404, "请求路径不对"),

    REQUEST_TIMEOUT(408, "请求超时"),

    TOKEN_UNSUPPORTED_JWT_EXCEPTION(1002, "Token格式错误"),

    TOKEN_MALFORMED_JWT_EXCEPTION(1003, "Token没有被正确构造"),

    TOKEN_SIGNATURE_EXCEPTION(1004, "签名失败"),

    TOKEN_CREATE_ERROR(1006, "TOKEN创建失败");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}