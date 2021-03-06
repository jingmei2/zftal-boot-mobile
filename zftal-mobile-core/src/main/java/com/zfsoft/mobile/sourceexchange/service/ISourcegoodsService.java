package com.zfsoft.mobile.sourceexchange.service;

import java.util.List;

import com.zfsoft.dao.page.PageList;
import com.zfsoft.mobile.sourceexchange.entity.Sourcegoods;
import com.zfsoft.mobile.sourceexchange.query.SourcegoodsQuery;

public interface ISourcegoodsService {
	public PageList<Sourcegoods> getPageList(SourcegoodsQuery query);
	//商品列表--不分页
	public List<Sourcegoods> getAllgoodsList(SourcegoodsQuery query);

	//增加商品
	public void insert(SourcegoodsQuery query);
	//更新商品数据
	public void update(SourcegoodsQuery query);

	public void updateStorage(SourcegoodsQuery query);
	//删除商品
	public void deleteGoods(String goodsid);
	//根据id获取商品信息
	public Sourcegoods findById(SourcegoodsQuery query);
	//启用禁用方法
	public int goodsControl(SourcegoodsQuery query);
}
