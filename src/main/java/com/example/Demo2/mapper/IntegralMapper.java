package com.example.Demo2.mapper;

import java.util.List;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import com.example.Demo2.model.Permission.IntegralDetail;

public interface IntegralMapper {
	@Select("select IntegralTotal,IsAdd,OperateDate,Description from integraldetail")
	List<IntegralDetail> getIntegralDetail();

}
