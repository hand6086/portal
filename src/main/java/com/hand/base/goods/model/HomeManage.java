package com.hand.base.goods.model;

/**
 * 首页管理
 * 
 * @author zhenghongda
 *
 */
public class HomeManage {

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

	/**
	 * 类型
	 */
	private String type;

	/**
	 * 图片id
	 */
	private String picId;
	/**
	 * 图片地址
	 */
	private String pic;

	private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPicId() {
		return picId;
	}

	public void setPicId(String picId) {
		this.picId = picId;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
}
