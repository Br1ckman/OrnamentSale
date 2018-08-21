package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.Collectioninfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface CollectioninfoMapper {

	void insertCollectioninfo(Collectioninfo collectioninfo);

	void deleteCollectioninfoByCid(Integer cid);

	void updateCollectioninfo(Collectioninfo collectioninfo);

	Page<Collectioninfo> searchCollectioninfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Collectioninfo> searchCollectioninfoByParams(@Param("map") Map<String, String> map);

} 
