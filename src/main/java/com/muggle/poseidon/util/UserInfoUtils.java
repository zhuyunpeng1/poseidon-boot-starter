package com.muggle.poseidon.util;

import com.muggle.poseidon.base.exception.BasePoseidonCheckException;
import com.muggle.poseidon.base.exception.SimplePoseidonCheckException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @program: poseidon-cloud-starter
 * @description: 获取用户信息
 * @author: muggle
 * @create: 2019-11-06
 **/

public class UserInfoUtils {

    public static UserDetails getUserInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication==null||authentication.getDetails()==null){
           return null;
        }
        if (!(authentication.getDetails() instanceof UserDetails )){
           return null;
        }
        return (UserDetails)authentication.getDetails();
    }
}
