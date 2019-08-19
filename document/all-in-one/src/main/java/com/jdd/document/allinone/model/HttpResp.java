package com.jdd.document.allinone.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/19 10:39
 */
@Data
@AllArgsConstructor
public class HttpResp<T> implements Serializable {

    private static final long serialVersionUID = 8460095710810281010L;

    private String code;

    private String msg;

    private T data;

}