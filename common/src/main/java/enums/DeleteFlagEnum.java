package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 9:59 下午
 * @description: 删除标识 - 枚举类
 */
@Getter
@AllArgsConstructor
public enum DeleteFlagEnum {

    /**
     * 未删除
     */
    NO_DELETE("未删除"),

    /**
     * 已删除
     */
    YES_DELETE("已删除");

    private final String deleteFlag;

}