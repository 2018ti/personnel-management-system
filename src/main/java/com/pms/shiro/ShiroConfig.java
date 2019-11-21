package com.pms.shiro;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {


    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("SecurityManager") DefaultSecurityManager defaultSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultSecurityManager);
        return shiroFilterFactoryBean;
    }

    @Bean(name="SecurityManager")
    public DefaultWebSecurityManager getDefaultSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
         DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(userRealm);
        return defaultWebSecurityManager;
    }

    @Bean(name="userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }

}
