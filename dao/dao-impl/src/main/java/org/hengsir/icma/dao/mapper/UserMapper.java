package org.hengsir.icma.dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.hengsir.icma.entity.Right;
import org.hengsir.icma.entity.Role;
import org.hengsir.icma.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    /**
     * 根据帐号查询用户。
     * @param userAccount 用户账号
     */
    public User findUserByAccount(@Param("userAccount") String userAccount);

    /**
     * 根据id查询用户。
     * @param userId 用户id
     */
    public User findUserById(@Param("userId") int userId);

    /**
     * 根据帐号得出用户角色。
     * @param userAccount 用户账号
     */
    public List<Role> getRolesByAccount(@Param("userAccount") String userAccount);


    /**
     * 根据帐号得出用户所有的权限。
     * @param userAccount 用户账号
     */
    public List<Right> getPermissionsByAccount(@Param("userAccount") String userAccount);
}
