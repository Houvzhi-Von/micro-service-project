package vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 11:31 下午
 * @description: 统一响应对象 - VO
 */
@Data
@ApiModel(value = "统一响应对象")
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    @ApiModelProperty(value = "状态码", required = true)
    private Integer code;

    /**
     * 提示信息
     */
    @ApiModelProperty(value = "提示信息", required = true)
    private String msg;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    private T data;

}