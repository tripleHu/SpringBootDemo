package app.service.Imp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.domain.BaseInfo;
import app.mapper.BaseInfoMapper;
import app.service.SampleService;


@Service
public class SampleServiceImp  implements SampleService{
	@Autowired
	private BaseInfoMapper baseInfoMapper;
	
	@Override
	@Transactional
	public void addInfo(BaseInfo baseInfo) {
		baseInfoMapper.insert(baseInfo);
		
	}

	@Override
	@Transactional
	public List<BaseInfo> getByInfo(String info) {
		List<BaseInfo> listInfos = baseInfoMapper.getByInfo(info);
		return listInfos;
	}
	
	


   
	
     
}
