package util;

import java.util.UUID;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 9:47 下午
 * @description: UUID - 工具类
 */
public class UuidUtil {

    /**
     * 生成 UUID
     *
     * @return UUID
     */
    public static String generateUuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}