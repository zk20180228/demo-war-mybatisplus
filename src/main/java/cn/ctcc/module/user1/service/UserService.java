package cn.ctcc.module.user1.service;

import cn.ctcc.module.user1.entity.User;

/**
 * @Auther: zhangkui
 * @Date: 2018/7/13 14:31
 * @Description:用户Service层
 */
public interface UserService {

    /**
     * 根据id查询用户
     * @param id
     * @return user实体
     * @throws Exception Service层和Mapper层不要处理异常，都把异常抛给Controller,在Controller层统一处理
     * 注意：throws Exception可以不写，默认抛给调用者
     */
    User findUserById(String id)throws Exception;


    /**
     * 添加用户
     * @param user
     * @return void
     * @throws Exception Service层和Mapper层不要处理异常，都把异常抛给Controller,在Controller层统一处理
     * 注意：throws Exception可以不写，默认抛给调用者
     */
     void addUser(User user)throws Exception;

    /**
     * 根据id删除用户
     * @param id
     * @return void
     * @throws Exception Service层和Mapper层不要处理异常，都把异常抛给Controller,在Controller层统一处理
     * 注意：throws Exception可以不写，默认抛给调用者
     */
     void delUserById(int id)throws Exception;

    /**
     * 根据id更新用户
     * @param user
     * @return void
     * @throws Exception Service层和Mapper层不要处理异常，都把异常抛给Controller,在Controller层统一处理
     * 注意：throws Exception可以不写，默认抛给调用者
     */
     void updateUserByid(User user)throws Exception;
}
