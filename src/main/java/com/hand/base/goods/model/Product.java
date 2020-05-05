package com.hand.base.goods.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品
 * 
 * @author zhenghongda
 *
 */
public class Product {



	/**
	 * 商品ID
	 */
	private String productId;

	/**
	 * 商品名称
	 */
	private String productName;
	/**
	 * 省
	 */
	private String provinceId;
	/**
	 * 市
	 */
	private String cityId;
	/**
	 * 县
	 */
	private String districtId;
	/**
	 * 省
	 */
	private String province;
	/**
	 * 市
	 */
	private String city;
	/**
	 * 县
	 */
	private String district;
	/**
	 * 价格
	 */
	private BigDecimal price;

	/**
	 * 描述
	 */
	private String comments;

	private List<ProductDetail> productDetails = new ArrayList<>();

	public List<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}


	private String	createdBy;				// 创建人Id
	private String	created;				// 创建日期
	private String	lastUpdated;			// 最后更新时间
	private String	lastUpdatedBy;			// 最后更新人Id
	private String	id;						// 对象Id
	private String	corpid;					// 企业帐套编号

	private Integer	page		= -1;		// 当前页数
	private Integer	rows		= 50;		// 每页显示记录数
	private Integer	total		= -1;		// 总记录数
	private Integer	totalPage	= -1;		// 总页数
	private Integer	startRow	= 0;		// 当前页在数据库中的起始行
	private Integer	startRows	= 0;		// 当前页在数据库中的起始行(不使用框架,直接在sql中写limit时使用)
	private Integer	endRow		= 0;		// 当前页在数据库中的截止行

	public Integer getTotalPage() {
		if (page == 1) {
			totalPage = total / rows;
			if (total % rows != 0) {
				totalPage++;
			}
		}
		return totalPage;
	}

	public Integer getStartRow() {
		if (page > 0)
			startRow = (page - 1) * rows + 1;
		return startRow;
	}

	public Integer getStartRows() {
		if (page > 0)
			startRows = (page - 1) * rows;
		return startRows;
	}

	public Integer getEndRow() {
		if (page > 0)
			endRow = page * rows;
		return endRow;
	}

	public Integer getEndRowS() {
		if (page > 0)
			endRow = page * rows - 1;
		return endRow;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

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
