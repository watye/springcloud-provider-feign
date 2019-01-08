package com.talelife.myproject.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.talelife.myproject.feign.dto.UserDto;
import com.talelife.util.Page;
import com.talelife.util.Result;
/**
 * 用户业务接口
 * date: 2018-07-05 17:54:46
 * 
 * @author Liuweiyao
 * @version 1.0
 */
@FeignClient(name= "springcloud-provider")
@RequestMapping("/user")
public interface UserWebService{
	

	@RequestMapping("/get_user")
    Result<UserDto> getUser(@RequestParam("id") Long id);
	

}	