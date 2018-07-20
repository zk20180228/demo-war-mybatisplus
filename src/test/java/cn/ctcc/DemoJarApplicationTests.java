package cn.ctcc;

import cn.ctcc.module.user2.entity.User2;
import cn.ctcc.module.user2.service.User2Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJarApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Resource
	private User2Service user2Service;


	@Before
	public void testBefore(){
		System.out.println(user2Service);
	}


	//查询全部
	@Test
	public void test01(){
		List<User2> list = user2Service.selectList(null);
		System.out.println(list);
	}

	//分页无条件查询
	@Test
	public void test02(){
		IPage<User2> pageList = user2Service.selectPage(new Page<User2>(1, 10), null);//当前页,页大小
		System.out.println("list"+pageList.getRecords());//结果列表
		System.out.println("total:"+pageList.getTotal());//总记录数
		System.out.println("pages:"+pageList.getPages());//总页数
		System.out.println("current:"+pageList.getCurrent());//当前页
		System.out.println("size:"+pageList.getSize());//页大小
	}

	/*****************************正式的demo开始*******************************************************/

	//增
	@Test
	public void test03(){

		User2 user2 = new User2("测试06", "root", "13333333333", null, null, new Date());

		boolean b = user2Service.insert(user2);

		//插入成功后会返回主键，但是这与mybatis-plus.global-config.db-config.id-type=auto策略相关，否则返回的主键可能不正确
		System.out.println(user2.getId());
	}

	//更新--根据id更新
	@Test
	public void test04(){

		User2 user2 = new User2("测试05", "", "13333333333", "1589022273@qq.com", new Date(), new Date());
		user2.setId(48);
		user2Service.updateById(user2);

	}

	//更新--根据条件更新
	@Test
	public void test05(){

		User2 user2 = new User2("测试06", "root", "13333333333", "1589022273@qq.com", new Date(), new Date());

		user2Service.update(user2,new UpdateWrapper<User2>().eq("username","测试06"));
	}

	//删除-->根据id删除
	@Test
	public void test06(){

		//要注意主键的类型，Integer和Long都是不一样的，会报转换异常
		user2Service.deleteById(49l);
	}

	//删除--->根据条件删除
	@Test
	public void test07(){

		user2Service.delete(new QueryWrapper<User2>().eq("username","测试03"));

	}

	//查询-->根据id查询
	@Test
	public void test08(){

		//要注意主键的类型，Integer和Long都是不一样的，会报转换异常
		User2 user2 = user2Service.selectById(48l);
		System.out.println(user2);
	}

	//查询--->根据条件查询
	@Test
	public void test09(){

		List<User2> list = user2Service.selectList(new QueryWrapper<User2>().eq("username", "测试05"));
		System.out.println(list);
	}

	//查询--->分页查询
	@Test
	public void test10(){

		IPage<User2> page = user2Service.selectPage(new Page<User2>(1, 10), null);
		System.out.println("list"+page.getRecords());//结果列表
		System.out.println("total:"+page.getTotal());//总记录数
		System.out.println("pages:"+page.getPages());//总页数
		System.out.println("current:"+page.getCurrent());//当前页
		System.out.println("size:"+page.getSize());//页大小


	}


	//自定义分页查询，略
	@Test
	public void test11(){


	}


	/*************************************************你的测试可以写到下边，要规范。目的：帮助别人使用***************************************************/
	//
	@Test
	public void test12(){



	}

	//
	@Test
	public void test13(){



	}

	//
	@Test
	public void test14(){



	}

	//
	@Test
	public void test15(){



	}

	//
	@Test
	public void test16(){



	}

	//
	@Test
	public void test17(){



	}

	//
	@Test
	public void test18(){



	}

	//
	@Test
	public void test19(){



	}

	//
	@Test
	public void test20(){



	}

	//
	@Test
	public void test21(){



	}

	//
	@Test
	public void test22(){



	}









}
