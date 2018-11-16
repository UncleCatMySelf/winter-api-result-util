package com.myself.winter.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * API Unified Return Object
 * Created by MySelf on 2018/11/16.
 */
@Data
public class ResultVo<T> implements Serializable {

    private static final long serialVersionUID = -1020280450330091843L;

    /** Error code */
    private Integer code;

    /** Error msg */
    private String msg;

    /** Specific content */
    private T data;

}
