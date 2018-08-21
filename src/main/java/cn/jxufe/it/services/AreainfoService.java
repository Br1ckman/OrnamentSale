package cn.jxufe.it.services;

import cn.jxufe.it.entity.Areainfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AreainfoService {
    void insertAreainfo(Areainfo areainfo);

    void deleteAreainfoByAreaId(Integer areaId);

    void updateAreainfo(Areainfo areainfo);

    Page<Areainfo> searchAreainfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

    List<Areainfo> searchAreainfoByParams(@Param("map") Map<String, String> map);

}
