package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.AreainfoCopy;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface AreainfoCopyMapper {

	void insertAreainfoCopy(AreainfoCopy areainfoCopy);

	void deleteAreainfoCopyByAreaId(Integer areaId);

	void updateAreainfoCopy(AreainfoCopy areainfoCopy);

	Page<AreainfoCopy> searchAreainfoCopyByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<AreainfoCopy> searchAreainfoCopyByParams(@Param("map") Map<String, String> map);

} 
