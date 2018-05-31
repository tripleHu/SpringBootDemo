package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.domain.BaseInfo;
import app.repositoty.InfoRepositoty;
import app.service.SampleService;

@RestController
@EnableAutoConfiguration
public class InfoController {
	@Autowired
    private SampleService sampleService;
	
	@RequestMapping("/addInfo")
    public BaseInfo addInfo(@RequestParam(value = "info")String info) {
		BaseInfo bInfo = new BaseInfo();
		
		bInfo.setInfo(info);
		sampleService.addInfo(bInfo);
        return bInfo;
    }
	@RequestMapping("/getInfo")
    public List<BaseInfo> getInfo(@RequestParam(value = "info")String info) {
		
		List<BaseInfo> aBaseInfos = sampleService.getByInfo(info);
        return aBaseInfos;
    }
}
