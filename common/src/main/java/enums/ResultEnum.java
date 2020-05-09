package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 11:34 下午
 * @description: 响应码 - 枚举类
 */
@Getter
@AllArgsConstructor
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
    FAILURE(4004, "操作失败"),

    /**
     * 登录失败, 登录信息不正确
     */
    LOGIN_FAIL(25, "登录失败, 登录信息不正确"),

    /**
     * 参数为空
     */
    EMPTY(15, "参数为空"),

    /**
     * 参数不正确
     */
    PARAM_ERROR(16, "参数不正确"),

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
     * 未获得系统授权,请联系管理员
     */
    DB_VERIFY_DISABLED(20012, "未获得系统授权,请联系管理员"),

    /**
     * 请求方法与服务端请求方法不一致
     */
    REQUEST_METHOD_ERROR(400, "请求方法与服务端请求方法不一致"),

    /**
     * 账号没有访问权限
     */
    ROLE_DISABLED(403, "账号没有访问权限"),

    /**
     * 请求路径不对
     */
    NOT_FOUND(404, "请求路径不对"),

    TOKEN_UNSUPPORTED_JWT_EXCEPTION(1002, "Token格式错误"),

    TOKEN_MALFORMED_JWT_EXCEPTION(1003, "Token没有被正确构造"),

    TOKEN_SIGNATURE_EXCEPTION(1004, "签名失败"),

    TOKEN_CREATE_ERROR(1006, "TOKEN创建失败");

    private final Integer code;

    private final String message;

}