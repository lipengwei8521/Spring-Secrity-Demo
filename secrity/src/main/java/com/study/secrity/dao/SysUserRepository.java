package com.study.secrity.dao;

import com.study.secrity.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by  lpw'ASUS on 2018/7/17.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long> {

    /**
     * 根据用户名查用户
     * @param username
     * @return
     */
    SysUser findByUsername(String username);
}
