package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class Collectioninfo {
	/**
	 *  主键
	 */
	private Integer cid;
	/**
	 *  会员ID
	 */
	private Integer memberid;
	/**
	 *  商品ID
	 */
	private Integer goodsid;
	/**
	 *  搜藏时间
	 */
	private java.util.Date CTime;
	/**
	 * 主键
	 * @param cid
	 */
	public void setCid(Integer cid){
		this.cid = cid;
	}
	
    /**
     * 主键
     * @return
     */	
    public Integer getCid(){
    	return cid;
    }
	/**
	 * 会员ID
	 * @param memberid
	 */
	public void setMemberid(Integer memberid){
		this.memberid = memberid;
	}
	
    /**
     * 会员ID
     * @return
     */	
    public Integer getMemberid(){
    	return memberid;
    }
	/**
	 * 商品ID
	 * @param goodsid
	 */
	public void setGoodsid(Integer goodsid){
		this.goodsid = goodsid;
	}
	
    /**
     * 商品ID
     * @return
     */	
    public Integer getGoodsid(){
    	return goodsid;
    }
	/**
	 * 搜藏时间
	 * @param CTime
	 */
	public void setCTime(java.util.Date CTime){
		this.CTime = CTime;
	}
	
    /**
     * 搜藏时间
     * @return
     */	
    public java.util.Date getCTime(){
    	return CTime;
    }
}