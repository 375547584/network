package com.xinrui.network.entity;

import java.util.Date;

public class Enterprise {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 企业名称
     */
    private String name;

    /**
     * 企业统一信用代码
     */
    private String licenseNumber;

    /**
     * 企业行政区域id
     */
    private Integer areaId;

    /**
     * 企业行政区域名称
     */
    private String areaName;

    /**
     * 企业区域类型
     */
    private String areaType;

    /**
     * 企业所属环节Id
     */
    private Integer linkId;

    /**
     * 企业所属环节名称
     */
    private String linkName;

    /**
     * 企业所属地点id
     */
    private Integer placeId;

    /**
     * 企业所属场所名称
     */
    private String placeName;

    /**
     * 企业其他
     */
    private String placeOther;

    /**
     * 企业食品生产经营许可证号/入网许可证号或ICP经营许可证/经营许可证/生产许可证
     */
    private String qsNo;

    /**
     * 企业地址
     */
    private String address;

    /**
     * 企业年销售额
     */
    private String annualSales;

    /**
     * 企业法人代表，legal representative
     */
    private String legalRep;

    /**
     * 企业联系人
     */
    private String contacts;

    /**
     * 企业联系电话
     */
    private String phone;

    /**
     * 企业传真
     */
    private String fax;

    /**
     * 企业是否连锁企业：0、不是；1、是
     */
    private Boolean chainFlag;

    /**
     * 经营许可证/生产许可证：1、经营许可证；2、生产许可证
m-manager
p-product
     */
    private Integer mOrP;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date updateDate;

    /**
     * 操作人员
     */
    private Integer updateUserId;

    /**
     * 状态
     */
    private Boolean state;

    /**
     * 时效类型
     */
    private Boolean active;

    /**
     * 样品网址/平台网址
     */
    private String url;

    /**
     * 单位名称地址信息来源：1、通过网店页面查询；2、无
     */
    private Integer addressSources;

    /**
     * 原产地id
     */
    private Integer originAreaId;

    /**
     * 原产地名称
     */
    private String originAreaName;

    /**
     * 平台名称
     */
    private String platformName;

    /**
     * 邮编
     */
    private String zipCode;

    /**
     * 网点名称
     */
    private String shopName;

    /**
     * 许可证号
     */
    private String enterpriseQsNo;

    /**
     * 连锁品牌
     */
    private String chainBrand;

    /**
     * 特殊区域名称
     */
    private String specialAreaName;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 是否连锁企业：0、不是；1、是
     */
    private Boolean enterpriseChain;

    /**
     * 美食类型
     */
    private String beautyFoodType;

    /**
     * 招牌名称
     */
    private String wellBrandName;

    /**
     * 美食类型ID
     */
    private Integer beautyFoodTypeId;

    /**
     * 受检单位行政区域id
     */
    private Integer enterpriseAreaId;

    /**
     * 受检单位行政区域名称
     */
    private String enterpriseAreaName;

    /**
     * 市区ID
     */
    private Integer cityId;

    /**
     * 市区
     */
    private String cityName;
    /**
     * 省
     */
    private Integer provinceId;
    /**
     * 省
     */
    private String provinceName;
    /**
     * 是否是重点企业
     */
    private Integer importantPrise;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取企业名称
     *
     * @return name - 企业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置企业名称
     *
     * @param name 企业名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取企业统一信用代码
     *
     * @return license_number - 企业统一信用代码
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 设置企业统一信用代码
     *
     * @param licenseNumber 企业统一信用代码
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    /**
     * 获取企业行政区域id
     *
     * @return area_id - 企业行政区域id
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * 设置企业行政区域id
     *
     * @param areaId 企业行政区域id
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取企业行政区域名称
     *
     * @return area_name - 企业行政区域名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置企业行政区域名称
     *
     * @param areaName 企业行政区域名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 获取企业区域类型
     *
     * @return area_type - 企业区域类型
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * 设置企业区域类型
     *
     * @param areaType 企业区域类型
     */
    public void setAreaType(String areaType) {
        this.areaType = areaType == null ? null : areaType.trim();
    }

    /**
     * 获取企业所属环节Id
     *
     * @return link_id - 企业所属环节Id
     */
    public Integer getLinkId() {
        return linkId;
    }

    /**
     * 设置企业所属环节Id
     *
     * @param linkId 企业所属环节Id
     */
    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    /**
     * 获取企业所属环节名称
     *
     * @return link_name - 企业所属环节名称
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * 设置企业所属环节名称
     *
     * @param linkName 企业所属环节名称
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    /**
     * 获取企业所属地点id
     *
     * @return place_id - 企业所属地点id
     */
    public Integer getPlaceId() {
        return placeId;
    }

    /**
     * 设置企业所属地点id
     *
     * @param placeId 企业所属地点id
     */
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    /**
     * 获取企业所属场所名称
     *
     * @return place_name - 企业所属场所名称
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * 设置企业所属场所名称
     *
     * @param placeName 企业所属场所名称
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName == null ? null : placeName.trim();
    }

    /**
     * 获取企业其他
     *
     * @return place_other - 企业其他
     */
    public String getPlaceOther() {
        return placeOther;
    }

    /**
     * 设置企业其他
     *
     * @param placeOther 企业其他
     */
    public void setPlaceOther(String placeOther) {
        this.placeOther = placeOther == null ? null : placeOther.trim();
    }

    /**
     * 获取企业食品生产经营许可证号/入网许可证号或ICP经营许可证/经营许可证/生产许可证
     *
     * @return qs_no - 企业食品生产经营许可证号/入网许可证号或ICP经营许可证/经营许可证/生产许可证
     */
    public String getQsNo() {
        return qsNo;
    }

    /**
     * 设置企业食品生产经营许可证号/入网许可证号或ICP经营许可证/经营许可证/生产许可证
     *
     * @param qsNo 企业食品生产经营许可证号/入网许可证号或ICP经营许可证/经营许可证/生产许可证
     */
    public void setQsNo(String qsNo) {
        this.qsNo = qsNo == null ? null : qsNo.trim();
    }

    /**
     * 获取企业地址
     *
     * @return address - 企业地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置企业地址
     *
     * @param address 企业地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(String annualSales) {
        this.annualSales = annualSales;
    }

    /**
     * 获取企业法人代表，legal representative
     *
     * @return legal_rep - 企业法人代表，legal representative
     */
    public String getLegalRep() {
        return legalRep;
    }

    /**
     * 设置企业法人代表，legal representative
     *
     * @param legalRep 企业法人代表，legal representative
     */
    public void setLegalRep(String legalRep) {
        this.legalRep = legalRep == null ? null : legalRep.trim();
    }

    /**
     * 获取企业联系人
     *
     * @return contacts - 企业联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置企业联系人
     *
     * @param contacts 企业联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    /**
     * 获取企业联系电话
     *
     * @return phone - 企业联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置企业联系电话
     *
     * @param phone 企业联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取企业传真
     *
     * @return fax - 企业传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置企业传真
     *
     * @param fax 企业传真
     */
    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    /**
     * 获取企业是否连锁企业：0、不是；1、是
     *
     * @return chain_flag - 企业是否连锁企业：0、不是；1、是
     */
    public Boolean getChainFlag() {
        return chainFlag;
    }

    /**
     * 设置企业是否连锁企业：0、不是；1、是
     *
     * @param chainFlag 企业是否连锁企业：0、不是；1、是
     */
    public void setChainFlag(Boolean chainFlag) {
        this.chainFlag = chainFlag;
    }

    /**
     * 获取经营许可证/生产许可证：1、经营许可证；2、生产许可证
m-manager
p-product
     *
     * @return m_or_p - 经营许可证/生产许可证：1、经营许可证；2、生产许可证
m-manager
p-product
     */
    public Integer getmOrP() {
        return mOrP;
    }

    /**
     * 设置经营许可证/生产许可证：1、经营许可证；2、生产许可证
m-manager
p-product
     *
     * @param mOrP 经营许可证/生产许可证：1、经营许可证；2、生产许可证
m-manager
p-product
     */
    public void setmOrP(Integer mOrP) {
        this.mOrP = mOrP;
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改日期
     *
     * @return update_date - 修改日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置修改日期
     *
     * @param updateDate 修改日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取操作人员
     *
     * @return update_user_id - 操作人员
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置操作人员
     *
     * @param updateUserId 操作人员
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public Boolean getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * 获取时效类型
     *
     * @return active - 时效类型
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * 设置时效类型
     *
     * @param active 时效类型
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * 获取样品网址/平台网址
     *
     * @return url - 样品网址/平台网址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置样品网址/平台网址
     *
     * @param url 样品网址/平台网址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取单位名称地址信息来源：1、通过网店页面查询；2、无
     *
     * @return address_sources - 单位名称地址信息来源：1、通过网店页面查询；2、无
     */
    public Integer getAddressSources() {
        return addressSources;
    }

    /**
     * 设置单位名称地址信息来源：1、通过网店页面查询；2、无
     *
     * @param addressSources 单位名称地址信息来源：1、通过网店页面查询；2、无
     */
    public void setAddressSources(Integer addressSources) {
        this.addressSources = addressSources;
    }

    /**
     * 获取原产地id
     *
     * @return origin_area_id - 原产地id
     */
    public Integer getOriginAreaId() {
        return originAreaId;
    }

    /**
     * 设置原产地id
     *
     * @param originAreaId 原产地id
     */
    public void setOriginAreaId(Integer originAreaId) {
        this.originAreaId = originAreaId;
    }

    /**
     * 获取原产地名称
     *
     * @return origin_area_name - 原产地名称
     */
    public String getOriginAreaName() {
        return originAreaName;
    }

    /**
     * 设置原产地名称
     *
     * @param originAreaName 原产地名称
     */
    public void setOriginAreaName(String originAreaName) {
        this.originAreaName = originAreaName == null ? null : originAreaName.trim();
    }

    /**
     * 获取平台名称
     *
     * @return platform_name - 平台名称
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * 设置平台名称
     *
     * @param platformName 平台名称
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    /**
     * 获取邮编
     *
     * @return zip_code - 邮编
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置邮编
     *
     * @param zipCode 邮编
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * 获取网点名称
     *
     * @return shop_name - 网点名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 设置网点名称
     *
     * @param shopName 网点名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * 获取连锁品牌
     *
     * @return chain_brand - 连锁品牌
     */
    public String getChainBrand() {
        return chainBrand;
    }

    /**
     * 设置连锁品牌
     *
     * @param chainBrand 连锁品牌
     */
    public void setChainBrand(String chainBrand) {
        this.chainBrand = chainBrand == null ? null : chainBrand.trim();
    }

    /**
     * 获取特殊区域名称
     *
     * @return special_area_name - 特殊区域名称
     */
    public String getSpecialAreaName() {
        return specialAreaName;
    }

    /**
     * 设置特殊区域名称
     *
     * @param specialAreaName 特殊区域名称
     */
    public void setSpecialAreaName(String specialAreaName) {
        this.specialAreaName = specialAreaName == null ? null : specialAreaName.trim();
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取是否连锁企业：0、不是；1、是
     *
     * @return enterprise_chain - 是否连锁企业：0、不是；1、是
     */
    public Boolean getEnterpriseChain() {
        return enterpriseChain;
    }

    /**
     * 设置是否连锁企业：0、不是；1、是
     *
     * @param enterpriseChain 是否连锁企业：0、不是；1、是
     */
    public void setEnterpriseChain(Boolean enterpriseChain) {
        this.enterpriseChain = enterpriseChain;
    }

    /**
     * 获取美食类型
     *
     * @return beauty_food_type - 美食类型
     */
    public String getBeautyFoodType() {
        return beautyFoodType;
    }

    /**
     * 设置美食类型
     *
     * @param beautyFoodType 美食类型
     */
    public void setBeautyFoodType(String beautyFoodType) {
        this.beautyFoodType = beautyFoodType == null ? null : beautyFoodType.trim();
    }

    /**
     * 获取招牌名称
     *
     * @return well_brand_name - 招牌名称
     */
    public String getWellBrandName() {
        return wellBrandName;
    }

    /**
     * 设置招牌名称
     *
     * @param wellBrandName 招牌名称
     */
    public void setWellBrandName(String wellBrandName) {
        this.wellBrandName = wellBrandName == null ? null : wellBrandName.trim();
    }

    /**
     * 获取美食类型ID
     *
     * @return beauty_food_type_id - 美食类型ID
     */
    public Integer getBeautyFoodTypeId() {
        return beautyFoodTypeId;
    }

    /**
     * 设置美食类型ID
     *
     * @param beautyFoodTypeId 美食类型ID
     */
    public void setBeautyFoodTypeId(Integer beautyFoodTypeId) {
        this.beautyFoodTypeId = beautyFoodTypeId;
    }

    /**
     * 获取受检单位行政区域id
     *
     * @return enterprise_area_id - 受检单位行政区域id
     */
    public Integer getEnterpriseAreaId() {
        return enterpriseAreaId;
    }

    /**
     * 设置受检单位行政区域id
     *
     * @param enterpriseAreaId 受检单位行政区域id
     */
    public void setEnterpriseAreaId(Integer enterpriseAreaId) {
        this.enterpriseAreaId = enterpriseAreaId;
    }

    /**
     * 获取受检单位行政区域名称
     *
     * @return enterprise_area_name - 受检单位行政区域名称
     */
    public String getEnterpriseAreaName() {
        return enterpriseAreaName;
    }

    public String getEnterpriseQsNo() {
        return enterpriseQsNo;
    }

    public void setEnterpriseQsNo(String enterpriseQsNo) {
        this.enterpriseQsNo = enterpriseQsNo;
    }

    /**
     * 设置受检单位行政区域名称
     *
     * @param enterpriseAreaName 受检单位行政区域名称
     */
    public void setEnterpriseAreaName(String enterpriseAreaName) {
        this.enterpriseAreaName = enterpriseAreaName == null ? null : enterpriseAreaName.trim();


    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getImportantPrise(){return importantPrise;}

    public void setImportantPrise(Integer importantPrise){this.importantPrise = importantPrise;}

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}