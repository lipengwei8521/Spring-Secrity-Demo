package com.study.secrity.config;

import com.study.secrity.service.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by  lpw'ASUS on 2018/7/17.
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {//扩展SpringSecurity配置需要继承此类
    @Bean
    UserDetailsService customUserService(){//注册UserDetailsService的bean
        return new CustomUserService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserService()).passwordEncoder(new BCryptPasswordEncoder());//添加自定义的userDetailsService认证
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() //拦截请求，创建FilterSecurityInterceptor
                .antMatchers("/login/**","/bootstrap-3.3.7-dist/**").permitAll()//可以被直接加载的静态文件路径
                .antMatchers("/webtob/**").hasRole("USER")
                .anyRequest().authenticated()//所有的请求需要认证即登陆后才能访问
                .and()
                .formLogin().loginPage("/login")
//                .defaultSuccessUrl("/index")//指定成功后跳转的页面
                .failureUrl("/login?error")//指定失败后爱转的页面
                .permitAll() //登录页面可任意访问
                .and()
                .logout().permitAll();//注销请求可任意访问




    }

}
