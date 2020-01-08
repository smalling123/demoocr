package com.example.Demo2.mapper;

import java.util.List;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import com.example.Demo2.model.Permission.HomePic;

public interface HomePicMapper {
	@Select("select PicCode,PicName,PicUrl,Titles,Tag,Content from homepic where id=#{id}")
	List<HomePic> getUserIndex(@Param("id") int id);

}
