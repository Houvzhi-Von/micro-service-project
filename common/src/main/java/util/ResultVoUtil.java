package util;

import enums.ResultEnum;
import vo.ResultVO;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 11:33 下午
 * @description: 统一响应对象构建工具类 - ResultVOUtil
 */
public class ResultVoUtil {

    @SuppressWarnings("rawtypes")
    public static ResultVO success() {
        return success(null);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static ResultVO success(Object object) {
        ResultVO resultVo = new ResultVO();
        resultVo.setData(object);
        resultVo.setCode(200);
        resultVo.setMsg("成功");
        return resultVo;
    }

    @SuppressWarnings("rawtypes")
    public static ResultVO error(ResultEnum resultEnum) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(resultEnum.getCode());
        resultVo.setMsg(resultEnum.getMessage());
        return resultVo;
    }

}