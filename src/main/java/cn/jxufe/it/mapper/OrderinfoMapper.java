package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.Orderinfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface OrderinfoMapper {

	void insertOrderinfo(Orderinfo orderinfo);

	void deleteOrderinfoByOrderId(Integer orderId);

	void updateOrderinfo(Orderinfo orderinfo);

	Page<Orderinfo> searchOrderinfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Orderinfo> searchOrderinfoByParams(@Param("map") Map<String, String> map);

} 
