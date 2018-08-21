package cn.jxufe.it.services.Impl;

import cn.jxufe.it.entity.Areainfo;
import cn.jxufe.it.mapper.AreainfoMapper;
import cn.jxufe.it.services.AreainfoService;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class AreainfoServiceImpl implements AreainfoService {
    @Resource
    private AreainfoMapper am;


    @Override
    public void insertAreainfo(Areainfo areainfo) {
        am.insertAreainfo(areainfo);
    }

    @Override
    public void deleteAreainfoByAreaId(Integer areaId) {
        am.deleteAreainfoByAreaId(areaId);
    }

    @Override
    public void updateAreainfo(Areainfo areainfo) {
        am.updateAreainfo(areainfo);
    }

    @Override
    public Page<Areainfo> searchAreainfoByParams(Map<String, String> map, Pageable pageable) {
        return am.searchAreainfoByParams(map,pageable);
    }

    @Override
    public List<Areainfo> searchAreainfoByParams(Map<String, String> map) {
        return am.searchAreainfoByParams(map);
    }
}
