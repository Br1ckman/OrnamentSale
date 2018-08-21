package cn.jxufe.it.services;

import cn.jxufe.it.entity.Goodsinfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsinfoService {
    void insertGoodsinfo(Goodsinfo goodsinfo);

    void deleteGoodsinfoByGoodsId(Integer goodsId);

    void updateGoodsinfo(Goodsinfo goodsinfo);

    Page<Goodsinfo> searchGoodsinfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

    List<Goodsinfo> searchGoodsinfoByParams(@Param("map") Map<String, String> map);

    List<Goodsinfo> searchGoodsCategoryBySort(@Param("map") Map<String,String> map);
}
