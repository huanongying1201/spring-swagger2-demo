package com.zjl;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * 描述:时间控制器
 * @author  zhoujialin
 * @created 2018年10月1日 上午3:12:32
 * @since   v1.0.0
 */
@Api(tags = "时间控制器")
@Controller
public class DateController {
	
	/**
	 * 返回数据
	 * @author  zhoujialin
	 * @param model
	 * @return
	 */
	@ApiOperation(httpMethod = "GET", value = "返回系统时间", produces = MediaType.ALL_VALUE)
	@GetMapping("/date.htm")
	@ResponseBody
    public String date(Model model){
        return "time:" + new Date();
    }
    
	/**
	 * 跳转页面
	 * @author  zhoujialin
	 * @param model
	 * @return
	 */
    @ApiOperation(httpMethod = "GET", value = "页面跳转", produces = MediaType.ALL_VALUE)
    @GetMapping("/forward.htm")
    public String forward(Model model){
    	model.addAttribute("date", new Date());
        return "date";
    }
    
}