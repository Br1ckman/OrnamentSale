package cn.jxufe.it.services;

import cn.jxufe.it.entity.GoodsComment;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodsCommentService {
    void insertGoodsComment(GoodsComment goodsComment);

    void deleteGoodsCommentByScommId(Integer scommId);

    void updateGoodsComment(GoodsComment goodsComment);

    Page<GoodsComment> searchGoodsCommentByParams(@Param("map") Map<String, String> map, Pageable pageable);

    List<GoodsComment> searchGoodsCommentByParams(@Param("map") Map<String, String> map);

}
