package com.example.Demo2.mapper;

import java.util.List;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import com.example.Demo2.model.Permission.CouponsDetail;
import com.example.Demo2.model.Permission.CouponsInfo;

public interface CouponMapper {
	@Select("select CouponID,NeedValue,USeSDate,UseEDate,CouponValue from coupondetail where ID=#{ID}")
	List<CouponsDetail> getCouponDetail(@Param("ID") int ID);

	@Select("select CouponCode,CouponsName,Description,EffectiveDay,CouponValue,NeedValue,TotalNum from couponsinfo")
	List<CouponsInfo> getCouponInfo();

}
