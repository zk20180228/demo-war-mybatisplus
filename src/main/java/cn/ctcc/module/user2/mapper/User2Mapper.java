package cn.ctcc.module.user2.mapper;


import cn.ctcc.module.user2.entity.User2;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Auther: zhangkui
 * @Date: 2018/7/13 14:31
 * @Description:用户持久层层
 *
 * 注意：idea的开发者，推荐使用mybatisX插件，这个插件可以帮助你快速的定位xml，快速的校验，statement是否有对应的方法,而且可以智能提示参数类型
 */
@Mapper
public interface User2Mapper extends BaseMapper<User2> {


}
