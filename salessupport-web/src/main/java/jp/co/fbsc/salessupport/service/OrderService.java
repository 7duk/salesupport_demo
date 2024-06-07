package jp.co.fbsc.salessupport.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.fbsc.salessupport.mapper.TOrderManageMapper;
import jp.co.fbsc.salessupport.model.TOrderManage;

@Service
public class OrderService {
	@Autowired
	private TOrderManageMapper tOrderManageMapper;
	public List<TOrderManage> search(){
		return tOrderManageMapper.selectAll();
	}
	public List<TOrderManage> search(String key,String value){
		return tOrderManageMapper.selectByKey(key,value);
	}
	public List<String> keySearch(){
		return tOrderManageMapper.keySearch();
	}

}
