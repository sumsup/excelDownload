package com.excelex.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExcelController {
	
	@RequestMapping("/excelDownload")
	public String excelTransform(@RequestParam Map<String, Object> paramMap, Map<String, Object> ModelMap, HttpServletResponse response) throws Exception {
		
		 /*
		 
		 excelDownload?target=books&id=b2
		  
		 위와 같은 형식으로 파라미터가 온다고 가정
		 target에 따라서 가져올 리스트를 선택.
		  
		 */
		
		String target = paramMap.get("target").toString(); // target 은 books
		
		response.setHeader("Content-disposition", "attachment; filename=" + target + ".xlsx"); // target명을 file명으로 작성.
		
		// 엑셀에 작성할 리스트를 가져온다.
		//List<Object> excelList = excelService.getAllObjects(target, paramMap);
		
		return null;
		
		
		
		
		
	}
	
}
