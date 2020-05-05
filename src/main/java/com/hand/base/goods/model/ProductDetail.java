package com.hand.base.goods.model;

/**
 * 商品明细
 * 
 * @author zhenghongda
 *
 */
public class ProductDetail {


	private String productId;

	private String productName;

	/**
	 * 商品图片Id
	 */
	private String productPicId;

	/**
	 * 商品图片
	 */
	private String productPic;

	/**
	 * 商品图片类型
	 */
	private String productPicType;

	private String comments;

	public String getProductPicId() {
		return productPicId;
	}

	public void setProductPicId(String productPicId) {
		this.productPicId = productPicId;
	}

	public String getProductPicType() {
		return productPicType;
	}

	public void setProductPicType(String productPicType) {
		this.productPicType = productPicType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductPic() {
		return productPic;
	}

	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	private String	createdBy;				// 创建人Id
	private String	created;				// 创建日期
	private String	lastUpdated;			// 最后更新时间
	private String	lastUpdatedBy;			// 最后更新人Id
	private String	id;						// 对象Id
	private String	corpid;					// 企业帐套编号

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCorpid() {
		return corpid;
	}

	public void setCorpid(String corpid) {
		this.corpid = corpid;
	}
}
