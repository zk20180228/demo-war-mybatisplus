package cn.ctcc.module.user2.service.impl;


import cn.ctcc.module.user2.entity.User2;
import cn.ctcc.module.user2.mapper.User2Mapper;
import cn.ctcc.module.user2.service.User2Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @Auther: zhangkui
 * @Date: 2018/7/13 14:31
 * @Description:用户Service层,我们在service层使用缓存，需要注意的是当一个支持缓存的方法在对象内部被调用时是不会触发缓存功能的。
 */
@Service
public class User2ServiceImpl extends ServiceImpl<User2Mapper,User2> implements User2Service {



}