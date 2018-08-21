package cn.jxufe.it.services.Impl;

import cn.jxufe.it.entity.Goodsinfo;
import cn.jxufe.it.mapper.GoodsinfoMapper;
import cn.jxufe.it.services.GoodsinfoService;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;



@Service
@Transactional
public class GoodsinfoServiceImpl implements GoodsinfoService {

    @Resource
    private GoodsinfoMapper gim;

    @Override
    public void insertGoodsinfo(Goodsinfo goodsinfo) {
        gim.insertGoodsinfo(goodsinfo);
    }

    @Override
    public void deleteGoodsinfoByGoodsId(Integer goodsId) {
        gim.deleteGoodsinfoByGoodsId(goodsId);
    }

    @Override
    public void updateGoodsinfo(Goodsinfo goodsinfo) {
        gim.updateGoodsinfo(goodsinfo);
    }

    @Override
    public Page<Goodsinfo> searchGoodsinfoByParams(Map<String, String> map, Pageable pageable) {
        return gim.searchGoodsinfoByParams(map,pageable);
    }

    @Override
    public List<Goodsinfo> searchGoodsinfoByParams(Map<String, String> map) {
        return gim.searchGoodsinfoByParams(map);
    }

    @Override
    public List<Goodsinfo> searchGoodsCategoryBySort(Map<String, String> map) {
        return gim.searchGoodsCategoryBySort(map);
    }
}
