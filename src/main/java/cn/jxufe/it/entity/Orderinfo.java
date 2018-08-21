package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class Orderinfo {
	/**
	 *  订单索引id
	 */
	private Integer orderId;
	/**
	 *  订单编号
	 */
	private String orderSn;
	/**
	 *  买家id
	 */
	private Integer buyerId;
	/**
	 *  买家姓名
	 */
	private String buyerName;
	/**
	 *  买家的联系电话
	 */
	private String buyerTel;
	/**
	 *  订单生成时间
	 */
	private java.util.Date addTime;
	/**
	 *  支付方式名称代码
	 */
	private String paymentCode;
	/**
	 *  支付(付款)时间
	 */
	private java.util.Date paymentTime;
	/**
	 *  订单完成时间
	 */
	private java.util.Date finnshedTime;
	/**
	 *  订单总价格
	 */
	private Long orderAmount;
	/**
	 *  订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	 */
	private Integer orderState;
	/**
	 *  
	 */
	private java.util.Date createdTime;
	/**
	 *  
	 */
	private java.util.Date updatedTime;
	/**
	 * 订单索引id
	 * @param orderId
	 */
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单索引id
     * @return
     */	
    public Integer getOrderId(){
    	return orderId;
    }
	/**
	 * 订单编号
	 * @param orderSn
	 */
	public void setOrderSn(String orderSn){
		this.orderSn = orderSn;
	}
	
    /**
     * 订单编号
     * @return
     */	
    public String getOrderSn(){
    	return orderSn;
    }
	/**
	 * 买家id
	 * @param buyerId
	 */
	public void setBuyerId(Integer buyerId){
		this.buyerId = buyerId;
	}
	
    /**
     * 买家id
     * @return
     */	
    public Integer getBuyerId(){
    	return buyerId;
    }
	/**
	 * 买家姓名
	 * @param buyerName
	 */
	public void setBuyerName(String buyerName){
		this.buyerName = buyerName;
	}
	
    /**
     * 买家姓名
     * @return
     */	
    public String getBuyerName(){
    	return buyerName;
    }
	/**
	 * 买家的联系电话
	 * @param buyerTel
	 */
	public void setBuyerTel(String buyerTel){
		this.buyerTel = buyerTel;
	}
	
    /**
     * 买家的联系电话
     * @return
     */	
    public String getBuyerTel(){
    	return buyerTel;
    }
	/**
	 * 订单生成时间
	 * @param addTime
	 */
	public void setAddTime(java.util.Date addTime){
		this.addTime = addTime;
	}
	
    /**
     * 订单生成时间
     * @return
     */	
    public java.util.Date getAddTime(){
    	return addTime;
    }
	/**
	 * 支付方式名称代码
	 * @param paymentCode
	 */
	public void setPaymentCode(String paymentCode){
		this.paymentCode = paymentCode;
	}
	
    /**
     * 支付方式名称代码
     * @return
     */	
    public String getPaymentCode(){
    	return paymentCode;
    }
	/**
	 * 支付(付款)时间
	 * @param paymentTime
	 */
	public void setPaymentTime(java.util.Date paymentTime){
		this.paymentTime = paymentTime;
	}
	
    /**
     * 支付(付款)时间
     * @return
     */	
    public java.util.Date getPaymentTime(){
    	return paymentTime;
    }
	/**
	 * 订单完成时间
	 * @param finnshedTime
	 */
	public void setFinnshedTime(java.util.Date finnshedTime){
		this.finnshedTime = finnshedTime;
	}
	
    /**
     * 订单完成时间
     * @return
     */	
    public java.util.Date getFinnshedTime(){
    	return finnshedTime;
    }
	/**
	 * 订单总价格
	 * @param orderAmount
	 */
	public void setOrderAmount(Long orderAmount){
		this.orderAmount = orderAmount;
	}
	
    /**
     * 订单总价格
     * @return
     */	
    public Long getOrderAmount(){
    	return orderAmount;
    }
	/**
	 * 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
	 * @param orderState
	 */
	public void setOrderState(Integer orderState){
		this.orderState = orderState;
	}
	
    /**
     * 订单状态：0(已取消)10(默认):未付款;20:已付款;30:已发货;40:已收货;
     * @return
     */	
    public Integer getOrderState(){
    	return orderState;
    }
	/**
	 * 
	 * @param createdTime
	 */
	public void setCreatedTime(java.util.Date createdTime){
		this.createdTime = createdTime;
	}
	
    /**
     * 
     * @return
     */	
    public java.util.Date getCreatedTime(){
    	return createdTime;
    }
	/**
	 * 
	 * @param updatedTime
	 */
	public void setUpdatedTime(java.util.Date updatedTime){
		this.updatedTime = updatedTime;
	}
	
    /**
     * 
     * @return
     */	
    public java.util.Date getUpdatedTime(){
    	return updatedTime;
    }
}