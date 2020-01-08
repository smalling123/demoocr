package com.example.Demo2.mapper;

import java.util.List;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import com.example.Demo2.model.Permission.RechargeDetail;
import org.apache.ibatis.annotations.Update;

public interface RechargeMapper {
	@Select("select Balance from rechargedetail where UserId=#{UserId} order by id DESC limit 1")
	String getBalance(@Param("UserId") Integer UserId);

	@Update("update rechargedetail set Balance=Balance+#{AddValue,jdbcType=DECIMAL} where UserID=#{UserID}")
	int updateBalance(@Param("UserID") Integer UserID, @Param("AddValue") double AddValue);

	@Select("select SValue from rechargedetail where UserId=#{UserId}")
	String getSValue(@Param("UserId") Integer UserId);

	@Select("select AddValue from rechargedetail where AddValue>0 and UserId=#{UserId}")
	List<RechargeDetail> getAddRecord(@Param("UserId") Integer UserId);

	@Select("select AddValue from rechargedetail where  UserId=#{UserId}")
	String getAddValue(@Param("UserId") Integer UserId);

}
