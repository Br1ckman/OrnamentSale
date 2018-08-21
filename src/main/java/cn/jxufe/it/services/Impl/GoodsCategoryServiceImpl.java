package cn.jxufe.it.services.Impl;

import cn.jxufe.it.entity.GoodsCategory;
import cn.jxufe.it.mapper.GoodsCategoryMapper;
import cn.jxufe.it.services.GoodsCategoryService;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class GoodsCategoryServiceImpl implements GoodsCategoryService {

    @Resource
    private GoodsCategoryMapper gcm;

    @Override
    public void insertGoodsCategory(GoodsCategory goodsCategory) {
        gcm.insertGoodsCategory(goodsCategory);
    }

    @Override
    public void deleteGoodsCategoryByCatId(Integer catId) {
        gcm.deleteGoodsCategoryByCatId(catId);
    }

    @Override
    public void updateGoodsCategory(GoodsCategory goodsCategory) {
        gcm.updateGoodsCategory(goodsCategory);
    }

    @Override
    public Page<GoodsCategory> searchGoodsCategoryByParams(Map<String, String> map, Pageable pageable) {
        return gcm.searchGoodsCategoryByParams(map,pageable);
    }

    @Override
    public List<GoodsCategory> searchGoodsCategoryByParams(Map<String, String> map) {
        return gcm.searchGoodsCategoryByParams(map);
    }
}
