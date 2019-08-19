package com.jdd.document.allinone.util;

import com.jdd.document.allinone.model.HttpResp;

/**
 * <p>
 *
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/19 10:38
 */
final public class HttpRespUtil {

    final public static String CODE_SUCCESS = "0";
    final public static String CODE_FAIL = "-1";

    public static <T> HttpResp<T> success(T data) {
        return success(CODE_SUCCESS, "success", data);
    }

    public static <T> HttpResp<T> success(String msg, T data) {
        return success(CODE_SUCCESS, msg, data);
    }

    public static <T> HttpResp<T> success(String code, String msg, T data) {
        return new HttpResp<>(code, msg, data);
    }

    public static <T> HttpResp<T> fail(String msg) {
        return fail(CODE_FAIL, msg, null);
    }

    public static <T> HttpResp<T> fail(String msg, T data) {
        return fail(CODE_FAIL, msg, data);
    }

    public static <T> HttpResp<T> fail(String code, String msg, T data) {
        return new HttpResp<>(code, msg, data);
    }

}
