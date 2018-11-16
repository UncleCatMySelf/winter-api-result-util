package com.myself.winter.utils;

import com.myself.winter.config.ResultApi;
import com.myself.winter.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * API Return Util
 * Created by MySelf on 2018/11/16.
 */
@Component
public class ResultVOUtil {

    @Autowired
    private ResultApi resultApi;

    /**
     * Back to Custom
     * @param object data
     * @return {@link ResultVo}
     */
    public ResultVo success(Object object){
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode(resultApi.getSuccesscode());
        resultVO.setMsg(resultApi.getSuccessmsg());
        return resultVO;
    }

    /**
     * Default Success
     * @return {@link ResultVo}
     */
    public ResultVo success(){
        return success(null);
    }

    /**
     * Error function
     * @param code Type code
     * @param msg Type description
     * @return {@link ResultVo}
     */
    public ResultVo error(Integer code, String msg){
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
