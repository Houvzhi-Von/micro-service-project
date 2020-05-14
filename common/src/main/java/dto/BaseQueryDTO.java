package dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 6:58 下午
 * @description: 查询入参基类 - DTO
 */
@Data
@ApiModel(value = "查询入参基类 - DTO")
public class BaseQueryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "页码")
    private Integer pageNum;

    @ApiModelProperty(value = "每页条数")
    private Integer pageSize;

}