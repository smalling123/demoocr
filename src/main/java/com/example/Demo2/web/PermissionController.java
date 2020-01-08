package com.example.Demo2.web;
import com.example.Demo2.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Demo2.model.Result;
import com.example.Demo2.mapper.RechargeMapper;
@Controller
public class PermissionController{
	@Autowired
	private RechargeMapper m_RechargeMapper;
	private UserMapper m_userMapper;
	@RequestMapping(value = "/Permission/getAddRecord", method = RequestMethod.POST)
	@ResponseBody
	public Result getAddRecord(Integer userid) {
		Result result = new Result();
		try{
			result.setData(m_RechargeMapper.getAddRecord(userid));
		}catch(Exception error){
			result.setCode(error.hashCode());
			result.setMsg(error.getMessage());
			return result;
		}
		return result;
	}
	@RequestMapping(value = "/Permission/getBalance", method = RequestMethod.POST)
	@ResponseBody
	public String getBalance(Integer UserId) {
		UserId=1;
		String Balance = m_RechargeMapper.getBalance(UserId); //根据id查询余额
		/*String UserName =m_userMapper.getUserNameById(UserId);//根据Userid查询用户姓名*/
		return  "您的当前余额为:" + Balance;
	}
	@RequestMapping(value = "/Permission/getSValue", method = RequestMethod.POST)
	@ResponseBody
	public String getSValue(Integer UserId) {
		String SValue=m_RechargeMapper.getSValue(UserId);
		System.out.println("实际付款金额为"+SValue);
		return SValue;
	}
	@RequestMapping(value = "/Permission/updateBalance", method = RequestMethod.POST)
	public String updateBalance(@RequestParam("UserId") Integer UserId,@RequestParam("AddValue") Double AddValue) {
		String msg="";
		int num=m_RechargeMapper.updateBalance(UserId,AddValue);
		if(num>0){
			return "success";
		}else{
			msg="充值失败";
		}
		return msg;
	}
	@RequestMapping(value="/Permission/pay", method = RequestMethod.GET)
	public String pay(){
		return "pay";
	}

}
