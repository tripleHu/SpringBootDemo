package app.service;

import java.util.List;

import javax.transaction.Transactional;

import app.domain.BaseInfo;


public interface SampleService {
	public void addInfo(BaseInfo baseInfo);
	public List<BaseInfo> getByInfo(String info);
}
