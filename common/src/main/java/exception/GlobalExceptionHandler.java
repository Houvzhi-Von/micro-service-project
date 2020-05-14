package exception;

import enums.ResultEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import util.ResultVoUtil;
import vo.ResultVO;

/**
 * @author fenghouzhi
 * @date 2020/5/12 - 9:08 下午
 * @description: 全局异常处理类 - GlobalExceptionHandler
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = ApiException.class)
    public ResultVO handler(ApiException e) {
        if (null != e.getResultEnum()) {
            return ResultVoUtil.error(e.getResultEnum());
        }
        return ResultVoUtil.error(ResultEnum.INTERNAL_SERVER_ERROR);
    }

}