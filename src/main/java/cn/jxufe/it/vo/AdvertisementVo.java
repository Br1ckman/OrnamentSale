package cn.jxufe.it.vo;

/**
 * 
 * @author 666
 */
public class AdvertisementVo {
	/**
	 *  主键
	 */
	private Integer advId;
	/**
	 *  广告的标题
	 */
	private String advTitle;
	/**
	 *  广告的图片路径
	 */
	private String advPicUrl;
	/**
	 *  广告是否禁用(0禁用 1启用)
	 */
	private Short advOffline;
	/**
	 *  广告的序号
	 */
	private Integer advOrder;
	/**
	 *  点击广告后跳转的地址
	 */
	private String advLinkUrl;
	/**
	 *  广告的创建时间
	 */
	private java.util.Date advCratetime;
	/**
	 *  广告的修改时间
	 */
	private java.util.Date advUpdatetime;
	/**
	 * 主键
	 * @param advId
	 */
	public void setAdvId(Integer advId){
		this.advId = advId;
	}
	
    /**
     * 主键
     * @return Integer
     */	
    public Integer getAdvId(){
    	return advId;
    }
	/**
	 * 广告的标题
	 * @param advTitle
	 */
	public void setAdvTitle(String advTitle){
		this.advTitle = advTitle;
	}
	
    /**
     * 广告的标题
     * @return String
     */	
    public String getAdvTitle(){
    	return advTitle;
    }
	/**
	 * 广告的图片路径
	 * @param advPicUrl
	 */
	public void setAdvPicUrl(String advPicUrl){
		this.advPicUrl = advPicUrl;
	}
	
    /**
     * 广告的图片路径
     * @return String
     */	
    public String getAdvPicUrl(){
    	return advPicUrl;
    }
	/**
	 * 广告是否禁用(0禁用 1启用)
	 * @param advOffline
	 */
	public void setAdvOffline(Short advOffline){
		this.advOffline = advOffline;
	}
	
    /**
     * 广告是否禁用(0禁用 1启用)
     * @return Short
     */	
    public Short getAdvOffline(){
    	return advOffline;
    }
	/**
	 * 广告的序号
	 * @param advOrder
	 */
	public void setAdvOrder(Integer advOrder){
		this.advOrder = advOrder;
	}
	
    /**
     * 广告的序号
     * @return Integer
     */	
    public Integer getAdvOrder(){
    	return advOrder;
    }
	/**
	 * 点击广告后跳转的地址
	 * @param advLinkUrl
	 */
	public void setAdvLinkUrl(String advLinkUrl){
		this.advLinkUrl = advLinkUrl;
	}
	
    /**
     * 点击广告后跳转的地址
     * @return String
     */	
    public String getAdvLinkUrl(){
    	return advLinkUrl;
    }
	/**
	 * 广告的创建时间
	 * @param advCratetime
	 */
	public void setAdvCratetime(java.util.Date advCratetime){
		this.advCratetime = advCratetime;
	}
	
    /**
     * 广告的创建时间
     * @return java.util.Date
     */	
    public java.util.Date getAdvCratetime(){
    	return advCratetime;
    }
	/**
	 * 广告的修改时间
	 * @param advUpdatetime
	 */
	public void setAdvUpdatetime(java.util.Date advUpdatetime){
		this.advUpdatetime = advUpdatetime;
	}
	
    /**
     * 广告的修改时间
     * @return java.util.Date
     */	
    public java.util.Date getAdvUpdatetime(){
    	return advUpdatetime;
    }
}