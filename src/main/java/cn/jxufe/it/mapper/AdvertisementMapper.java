package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.Advertisement;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface AdvertisementMapper {

	void insertAdvertisement(Advertisement advertisement);

	void deleteAdvertisementByAdvId(Integer advId);

	void updateAdvertisement(Advertisement advertisement);

	Page<Advertisement> searchAdvertisementByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Advertisement> searchAdvertisementByParams(@Param("map") Map<String, String> map);

} 
