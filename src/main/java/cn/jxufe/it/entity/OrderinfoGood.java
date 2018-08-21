package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class OrderinfoGood {
	/**
	 *  订单商品表索引id
	 */
	private Integer recId;
	/**
	 *  订单id
	 */
	private String orderId;
	/**
	 *  商品id
	 */
	private Integer goodsId;
	/**
	 *  商品名称
	 */
	private String goodsName;
	/**
	 *  商品价格
	 */
	private java.math.BigDecimal goodsPrice;
	/**
	 *  商品数量
	 */
	private Integer goodsNum;
	/**
	 *  商品实际成交价
	 */
	private Long goodsPayPrice;
	/**
	 *  创建时间
	 */
	private java.util.Date createdTime;
	/**
	 *  修改时间
	 */
	private java.util.Date updatedTime;
	/**
	 * 订单商品表索引id
	 * @param recId
	 */
	public void setRecId(Integer recId){
		this.recId = recId;
	}
	
    /**
     * 订单商品表索引id
     * @return
     */	
    public Integer getRecId(){
    	return recId;
    }
	/**
	 * 订单id
	 * @param orderId
	 */
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单id
     * @return
     */	
    public String getOrderId(){
    	return orderId;
    }
	/**
	 * 商品id
	 * @param goodsId
	 */
	public void setGoodsId(Integer goodsId){
		this.goodsId = goodsId;
	}
	
    /**
     * 商品id
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
	 * 商品价格
	 * @param goodsPrice
	 */
	public void setGoodsPrice(java.math.BigDecimal goodsPrice){
		this.goodsPrice = goodsPrice;
	}
	
    /**
     * 商品价格
     * @return
     */	
    public java.math.BigDecimal getGoodsPrice(){
    	return goodsPrice;
    }
	/**
	 * 商品数量
	 * @param goodsNum
	 */
	public void setGoodsNum(Integer goodsNum){
		this.goodsNum = goodsNum;
	}
	
    /**
     * 商品数量
     * @return
     */	
    public Integer getGoodsNum(){
    	return goodsNum;
    }
	/**
	 * 商品实际成交价
	 * @param goodsPayPrice
	 */
	public void setGoodsPayPrice(Long goodsPayPrice){
		this.goodsPayPrice = goodsPayPrice;
	}
	
    /**
     * 商品实际成交价
     * @return
     */	
    public Long getGoodsPayPrice(){
    	return goodsPayPrice;
    }
	/**
	 * 创建时间
	 * @param createdTime
	 */
	public void setCreatedTime(java.util.Date createdTime){
		this.createdTime = createdTime;
	}
	
    /**
     * 创建时间
     * @return
     */	
    public java.util.Date getCreatedTime(){
    	return createdTime;
    }
	/**
	 * 修改时间
	 * @param updatedTime
	 */
	public void setUpdatedTime(java.util.Date updatedTime){
		this.updatedTime = updatedTime;
	}
	
    /**
     * 修改时间
     * @return
     */	
    public java.util.Date getUpdatedTime(){
    	return updatedTime;
    }
}