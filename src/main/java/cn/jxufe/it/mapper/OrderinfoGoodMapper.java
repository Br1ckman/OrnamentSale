package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.OrderinfoGood;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface OrderinfoGoodMapper {

	void insertOrderinfoGood(OrderinfoGood orderinfoGood);

	void deleteOrderinfoGoodByRecId(Integer recId);

	void updateOrderinfoGood(OrderinfoGood orderinfoGood);

	Page<OrderinfoGood> searchOrderinfoGoodByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<OrderinfoGood> searchOrderinfoGoodByParams(@Param("map") Map<String, String> map);

} 
