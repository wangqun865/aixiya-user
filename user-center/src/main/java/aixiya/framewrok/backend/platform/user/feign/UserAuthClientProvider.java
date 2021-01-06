/*
 *      Copyright (c) 2018-2028, Chill Zhuang All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the dreamlu.net developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: Chill 庄骞 (smallchill@163.com)
 */
package aixiya.framewrok.backend.platform.user.feign;

import aixiya.framework.backend.platform.user.api.UserAuthClient;
import aixiya.framework.backend.platform.user.api.entity.Production;
import aixiya.framework.backend.platform.user.api.entity.User;
import aixiya.framework.backend.platform.user.api.vo.UserCheckLoginVO;
import com.aixiya.framework.backend.common.api.AixiyaFwResponse;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 鉴权中心接口Feign实现类
 *
 * @author wangqun865@163.com
 */
@RestController
@AllArgsConstructor
@Slf4j
public class UserAuthClientProvider implements UserAuthClient {


    @Override
    @PostMapping(CHECK_LOGIN)
    public UserCheckLoginVO checkLogin(String loginName, String password, Long orgId) {
        UserCheckLoginVO userCheckLoginVO = new UserCheckLoginVO();
        //todo yours business
        return userCheckLoginVO;
    }

    @Override
    public AixiyaFwResponse checkLoginByPhone(String phone, String code) {
        //todo yours business
        return null;
    }

    @Override
    @PostMapping(GET_RESOURCE_CODE)
    public String[] getResourceCode(String loginName, Long orgId, String oath2Id)
    {
        //todo yours business
        //return resourceService.getResourceCodeByLoginName(loginName,orgId,oath2Id);
        return null;
    }

    private boolean containsOrgId(final List<Long> list, final Long orgId) {
        return list.stream().filter(o -> o.equals(orgId)).findFirst().isPresent();
    }

    @Override
    public aixiya.framework.backend.platform.user.api.entity.Production getProductionByOAuth2Id(String oauth2Id) {
        if(StringUtils.isEmpty(oauth2Id)) {
            return null;
        }
        Production prodPram = new Production();
        prodPram.setOauth2Id(oauth2Id);
        //List<Production> prodList = this.productService.findProductions(prodPram);
        //todo yours business
        /*if(prodList.size() > 0) {
            aixiya.framework.backend.platform.user.api.entity.Production rtnProd = new aixiya.framework.backend.platform.user.api.entity.Production();
            BeanUtils.copyProperties(prodList.get(0), rtnProd);
            return rtnProd;
        }*/
        return null;
    }

    @Override
    public User getUserByLoginName(String loginName, String orgId) {
        if(StringUtils.isEmpty(loginName)) {
            return null;
        }
        // todo your business
        return null;
    }

}
