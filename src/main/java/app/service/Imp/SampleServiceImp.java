package app.service.Imp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domain.BaseInfo;
import app.repositoty.InfoRepositoty;
import app.service.SampleService;


@Service
public class SampleServiceImp implements SampleService {
	@Autowired
    private InfoRepositoty infoRepositoty;
	

	@Override
	@Transactional
	public void addInfo(BaseInfo baseInfo){
		infoRepositoty.save(baseInfo);
	}
	//查询数据
	@Override
	@Transactional
     public List<BaseInfo> getByInfo(String info) {
         return infoRepositoty.getByInfo(info);
    }
    //删除数据
    @Transactional
    public void delete(Long id) {
    	infoRepositoty.deleteById(id);
    }
	
     
}
