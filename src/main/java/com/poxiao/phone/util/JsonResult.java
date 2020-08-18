package com.poxiao.phone.util;

import java.util.List;
import java.util.Map;

/**
 * 返回结果集
 *
 * @author bug程序猿
 * @date 2020/08/18 10:12
 */
public class JsonResult {
    /**
     * 操作成功(不带返回数据)
     *
     * @param respCode 状态码和状态信息
     * @return result
     */
    public static Result success(ResultEnum respCode) {
        return new Result(respCode.getCode(), respCode.getMessage(), true);
    }

    /**
     * 操作成功(带返回数据list)
     *
     * @param respCode 状态码和状态信息
     * @param data     返回数据
     * @return result
     */
    public static Result success(ResultEnum respCode, List data) {
        return new Result(respCode.getCode(), respCode.getMessage(), data, true);
    }

    /**
     * 操作成功(带返回数据map)
     *
     * @param respCode 状态码和状态信息
     * @param data     返回数据
     * @return result
     */
    public static Result success(ResultEnum respCode, Map data) {
        return new Result(respCode.getCode(), respCode.getMessage(), data, true);
    }

    /**
     * 操作成功(带返回数据Object)
     *
     * @param respCode 状态码和状态信息
     * @param data     返回数据
     * @return result
     */
    public static Result success(ResultEnum respCode, Object data) {
        return new Result(respCode.getCode(), respCode.getMessage(), data, true);
    }

    /**
     * 操作成功（自定义成功msg）
     *
     * @param respCode
     * @param message
     * @return
     */
    public static Result success(ResultEnum respCode, String message) {
        return new Result(respCode.getCode(), message, true);
    }

    /**
     * 操作失败
     *
     * @param respCode 状态码和状态信息
     * @return result
     */
    public static Result error(ResultEnum respCode) {
        return new Result(respCode.getCode(), respCode.getMessage(), false);
    }

    public static Result error(ResultEnum respCode, String message) {
        return new Result(respCode.getCode(), message, false);
    }
}
