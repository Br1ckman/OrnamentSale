package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.Goodsinfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface GoodsinfoMapper {

	void insertGoodsinfo(Goodsinfo goodsinfo);

	void deleteGoodsinfoByGoodsId(Integer goodsId);

	void updateGoodsinfo(Goodsinfo goodsinfo);

	Page<Goodsinfo> searchGoodsinfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Goodsinfo> searchGoodsinfoByParams(@Param("map") Map<String, String> map);

	List<Goodsinfo> searchGoodsCategoryBySort(@Param("map") Map<String,String> map);

} 
