package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.GoodsCategory;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface GoodsCategoryMapper {

	void insertGoodsCategory(GoodsCategory goodsCategory);

	void deleteGoodsCategoryByCatId(Integer catId);

	void updateGoodsCategory(GoodsCategory goodsCategory);

	Page<GoodsCategory> searchGoodsCategoryByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<GoodsCategory> searchGoodsCategoryByParams(@Param("map") Map<String, String> map);

} 
