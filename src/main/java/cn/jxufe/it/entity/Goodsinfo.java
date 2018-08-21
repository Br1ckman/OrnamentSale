package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class Goodsinfo {
	/**
	 *  商品索引id
	 */
	private Integer goodsId;
	/**
	 *  商品名称
	 */
	private String goodsName;
	/**
	 *  商品副标题
	 */
	private String goodsSubtitle;
	/**
	 *  商品分类id
	 */
	private Integer gcId;
	/**
	 *  商品分类名称
	 */
	private String gcName;
	/**
	 *  商品原价
	 */
	private Double goodsPrice;
	/**
	 *  商品现价
	 */
	private Double goodsSellPrice;
	/**
	 *  商品默认封面图片
	 */
	private String goodsImage;
	/**
	 *  商品浏览数
	 */
	private Integer goodsClick;
	/**
	 *  商品状态，0开启，1违规下架
	 */
	private Integer goodsState;
	/**
	 *  商品推荐
	 */
	private Integer goodsCommend;
	/**
	 *  商品违规下架原因
	 */
	private String goodsCloseReason;
	/**
	 *  评论次数
	 */
	private Integer commentNum;
	/**
	 *  商品点赞量
	 */
	private Long thumbsUpNum;
	/**
	 *  售出数量
	 */
	private Integer salenumNum;
	/**
	 *  商品收藏数量
	 */
	private Integer goodsCollectNum;
	/**
	 *  是否删除 0:未删除  1:已删除
	 */
	private Integer isDel;
	/**
	 *  上传者
	 */
	private Integer memberId;
	/**
	 *  商品库存
	 */
	private Integer stock;
	/**
	 *  商品修改时间
	 */
	private java.util.Date updateTime;
	/**
	 *  商品上传时间
	 */
	private java.util.Date createTime;
	/**
	 * 商品索引id
	 * @param goodsId
	 */
	public void setGoodsId(Integer goodsId){
		this.goodsId = goodsId;
	}
	
    /**
     * 商品索引id
     * @return
     */	
    public Integer getGoodsId(){
    	return goodsId;
    }
	/**
	 * 商品名称
	 * @param goodsName
	 */
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}
	
    /**
     * 商品名称
     * @return
     */	
    public String getGoodsName(){
    	return goodsName;
    }
	/**
	 * 商品副标题
	 * @param goodsSubtitle
	 */
	public void setGoodsSubtitle(String goodsSubtitle){
		this.goodsSubtitle = goodsSubtitle;
	}
	
    /**
     * 商品副标题
     * @return
     */	
    public String getGoodsSubtitle(){
    	return goodsSubtitle;
    }
	/**
	 * 商品分类id
	 * @param gcId
	 */
	public void setGcId(Integer gcId){
		this.gcId = gcId;
	}
	
    /**
     * 商品分类id
     * @return
     */	
    public Integer getGcId(){
    	return gcId;
    }
	/**
	 * 商品分类名称
	 * @param gcName
	 */
	public void setGcName(String gcName){
		this.gcName = gcName;
	}
	
    /**
     * 商品分类名称
     * @return
     */	
    public String getGcName(){
    	return gcName;
    }
	/**
	 * 商品原价
	 * @param goodsPrice
	 */
	public void setGoodsPrice(Double goodsPrice){
		this.goodsPrice = goodsPrice;
	}
	
    /**
     * 商品原价
     * @return
     */	
    public Double getGoodsPrice(){
    	return goodsPrice;
    }
	/**
	 * 商品现价
	 * @param goodsSellPrice
	 */
	public void setGoodsSellPrice(Double goodsSellPrice){
		this.goodsSellPrice = goodsSellPrice;
	}
	
    /**
     * 商品现价
     * @return
     */	
    public Double getGoodsSellPrice(){
    	return goodsSellPrice;
    }
	/**
	 * 商品默认封面图片
	 * @param goodsImage
	 */
	public void setGoodsImage(String goodsImage){
		this.goodsImage = goodsImage;
	}
	
    /**
     * 商品默认封面图片
     * @return
     */	
    public String getGoodsImage(){
    	return goodsImage;
    }
	/**
	 * 商品浏览数
	 * @param goodsClick
	 */
	public void setGoodsClick(Integer goodsClick){
		this.goodsClick = goodsClick;
	}
	
    /**
     * 商品浏览数
     * @return
     */	
    public Integer getGoodsClick(){
    	return goodsClick;
    }
	/**
	 * 商品状态，0开启，1违规下架
	 * @param goodsState
	 */
	public void setGoodsState(Integer goodsState){
		this.goodsState = goodsState;
	}
	
    /**
     * 商品状态，0开启，1违规下架
     * @return
     */	
    public Integer getGoodsState(){
    	return goodsState;
    }
	/**
	 * 商品推荐
	 * @param goodsCommend
	 */
	public void setGoodsCommend(Integer goodsCommend){
		this.goodsCommend = goodsCommend;
	}
	
    /**
     * 商品推荐
     * @return
     */	
    public Integer getGoodsCommend(){
    	return goodsCommend;
    }
	/**
	 * 商品违规下架原因
	 * @param goodsCloseReason
	 */
	public void setGoodsCloseReason(String goodsCloseReason){
		this.goodsCloseReason = goodsCloseReason;
	}
	
    /**
     * 商品违规下架原因
     * @return
     */	
    public String getGoodsCloseReason(){
    	return goodsCloseReason;
    }
	/**
	 * 评论次数
	 * @param commentNum
	 */
	public void setCommentNum(Integer commentNum){
		this.commentNum = commentNum;
	}
	
    /**
     * 评论次数
     * @return
     */	
    public Integer getCommentNum(){
    	return commentNum;
    }
	/**
	 * 商品点赞量
	 * @param thumbsUpNum
	 */
	public void setThumbsUpNum(Long thumbsUpNum){
		this.thumbsUpNum = thumbsUpNum;
	}
	
    /**
     * 商品点赞量
     * @return
     */	
    public Long getThumbsUpNum(){
    	return thumbsUpNum;
    }
	/**
	 * 售出数量
	 * @param salenumNum
	 */
	public void setSalenumNum(Integer salenumNum){
		this.salenumNum = salenumNum;
	}
	
    /**
     * 售出数量
     * @return
     */	
    public Integer getSalenumNum(){
    	return salenumNum;
    }
	/**
	 * 商品收藏数量
	 * @param goodsCollectNum
	 */
	public void setGoodsCollectNum(Integer goodsCollectNum){
		this.goodsCollectNum = goodsCollectNum;
	}
	
    /**
     * 商品收藏数量
     * @return
     */	
    public Integer getGoodsCollectNum(){
    	return goodsCollectNum;
    }
	/**
	 * 是否删除 0:未删除  1:已删除
	 * @param isDel
	 */
	public void setIsDel(Integer isDel){
		this.isDel = isDel;
	}
	
    /**
     * 是否删除 0:未删除  1:已删除
     * @return
     */	
    public Integer getIsDel(){
    	return isDel;
    }
	/**
	 * 上传者
	 * @param memberId
	 */
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	
    /**
     * 上传者
     * @return
     */	
    public Integer getMemberId(){
    	return memberId;
    }
	/**
	 * 商品库存
	 * @param stock
	 */
	public void setStock(Integer stock){
		this.stock = stock;
	}
	
    /**
     * 商品库存
     * @return
     */	
    public Integer getStock(){
    	return stock;
    }
	/**
	 * 商品修改时间
	 * @param updateTime
	 */
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime = updateTime;
	}
	
    /**
     * 商品修改时间
     * @return
     */	
    public java.util.Date getUpdateTime(){
    	return updateTime;
    }
	/**
	 * 商品上传时间
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	
    /**
     * 商品上传时间
     * @return
     */	
    public java.util.Date getCreateTime(){
    	return createTime;
    }
}