package cn.jxufe.it.services.Impl;

import cn.jxufe.it.entity.GoodsComment;
import cn.jxufe.it.services.GoodsCommentService;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class GoodsCommentServiceImpl implements GoodsCommentService {

    @Resource
    private GoodsCommentService gcs;


    @Override
    public void insertGoodsComment(GoodsComment goodsComment) {
        gcs.insertGoodsComment(goodsComment);
    }

    @Override
    public void deleteGoodsCommentByScommId(Integer scommId) {
        gcs.deleteGoodsCommentByScommId(scommId);
    }

    @Override
    public void updateGoodsComment(GoodsComment goodsComment) {
        gcs.updateGoodsComment(goodsComment);
    }

    @Override
    public Page<GoodsComment> searchGoodsCommentByParams(Map<String, String> map, Pageable pageable) {
        return gcs.searchGoodsCommentByParams(map,pageable);
    }

    @Override
    public List<GoodsComment> searchGoodsCommentByParams(Map<String, String> map) {
        return gcs.searchGoodsCommentByParams(map);
    }
}
