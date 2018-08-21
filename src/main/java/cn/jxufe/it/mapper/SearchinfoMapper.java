package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.Searchinfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface SearchinfoMapper {

	void insertSearchinfo(Searchinfo searchinfo);

	void deleteSearchinfoBySId(Integer SId);

	void updateSearchinfo(Searchinfo searchinfo);

	Page<Searchinfo> searchSearchinfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Searchinfo> searchSearchinfoByParams(@Param("map") Map<String, String> map);

} 
