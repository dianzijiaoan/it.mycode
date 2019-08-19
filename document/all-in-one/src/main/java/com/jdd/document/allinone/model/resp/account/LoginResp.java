package com.jdd.document.allinone.model.resp.account;

import java.io.Serializable;

import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author: keller.ji
 * @since: 2019/8/19 10:41
 */
@Data
public class LoginResp implements Serializable {

    private static final long serialVersionUID = 3319898503313021938L;

    private String identity;

}
