package com.example.Demo2.mapper;

import java.util.List;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import com.example.Demo2.model.Permission.UserInfo;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
	@Select("Select UserName,Sex,Birthday,Phone from userinfo where id=#{id}")
	List<UserInfo> getUsers(@Param("id") int id);

	@Update("update userinfo set UserName=#{UserName},Sex=#{Sex},Birthday=#{Birthday},Phone=#{Phone} where openid=#{openid}")
	void UpdateAllInfo(@Param("UserName") String UserName, @Param("Sex") int Sex, @Param("Birthday") java.util.Date Birthday, @Param("Phone") int Phone, @Param("OpenId") String OpenId);

	@Update("update userinfo set UserName=#{U.UserName} where openid=#{U.openid}")
	void UpdateUserName(@Param("U") UserInfo U);

	@Update("update userinfo set Sex=#{Sex} where openid=#{openid}")
	void UpdateSex(@Param("Sex") int Sex, @Param("openid") String openid);

	@Update("update userinfo set Birthday=#{Birthday} where openid=#{openid}")
	void UpdateBirthday(@Param("Birthday") java.util.Date Birthday, @Param("openid") String openid);

	@Update("update userinfo set Phone=#{Phone} where openid=#{openid}")
	void UpdatePhone(@Param("Phone") String Phone, @Param("openid") String openid);

	@Select("select u.UserName FROM `userinfo`u  JOIN `rechargedetail` r on r.UserID=u.id where Userid=#{Userid}")
	String getUserNameById(Integer Userid);
}
