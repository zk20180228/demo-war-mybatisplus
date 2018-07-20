package cn.ctcc.module.user2.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: zhangkui
 * @Date: 2018/7/13 11:29
 * @Description:用户实体
 */
//假如有枚举属性，对应的枚举类实现IEnum,枚举上加入@JsonFormat(shape = JsonFormat.Shape.OBJECT)//所有成员变量都会被序列化成对象或者在需要响应描述字段的get方法上添加@JsonValue注解即可
@TableName("tb_user")
public class User2 implements Serializable {

    private static final long serialVersionUID = -8131610168643194817L;

    @TableId
    private long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Date created;
    private Date updated;

    //逻辑删除：会在mp自带查询和更新方法的sql后面，追加『逻辑删除字段』=『LogicNotDeleteValue默认值』 删除方法: deleteById()和其他delete方法, 底层SQL调用的是update tbl_xxx set 『逻辑删除字段』=『logicDeleteValue默认值』
//    @TableField(value = "delete_flag")
//    @TableLogic
//    private Integer deleteFlag;

    public User2(String username, String password, String phone, String email, Date created, Date updated) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.created = created;
        this.updated = updated;
    }

    public User2() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }

}
