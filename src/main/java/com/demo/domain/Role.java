package com.demo.domain;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Role {
    @SerializedName("Icon")
    private  Integer icon;
    @SerializedName("UpgradeImmortal")
    private  Integer upgradeImmortal;
    @SerializedName("UpgradeMagic")
    private  Integer upgradeMagic;
    @SerializedName("Tao")
    private  Integer tao;
    @SerializedName("DecimalTao")
    private  Double decimalTao;
    @SerializedName("TaoHtmlHelper")
    private  String taoHtmlHelper;
    @SerializedName("Con")
    private  Integer con;
    @SerializedName("ConHtmlHelper")
    private  Integer conHtmlHelper;
    @SerializedName("Wiz")
    private  Integer wiz;
    @SerializedName("WizHtmlHelper")
    private  Integer wizHtmlHelper;
    @SerializedName("Str")
    private  Integer str;
    @SerializedName("StrHtmlHelper")
    private  Integer strHtmlHelper;
    @SerializedName("Dex")
    private  Integer dex;
    @SerializedName("DexHtmlHelper")
    private  Integer dexHtmlHelper;
    @SerializedName("ServerCode")
    private  Integer serverCode;
    @SerializedName("ServerName")
    private  String serverName;
    @SerializedName("AreaCode")
    private  Integer areaCode;
    @SerializedName("AreaName")
    private  String areaName;
    @SerializedName("ItemName")
    private  String itemName;
    @SerializedName("ItemNameNum")
    private  String itemNameNum;
    @SerializedName("ItemNameColor")
    private  String itemNameColor;
    @SerializedName("SaleAccount")
    private  String saleAccount;
    @SerializedName("SaleRoelId")
    private  String saleRoelId;
    @SerializedName("GameItemCode")
    private  String gameItemCode;
    @SerializedName("SaleRoleName")
    private  String saleRoleName;
    @SerializedName("ItemTypeId")
    private  Integer itemTypeId;
    @SerializedName("ItemTypeIdThree")
    private  Integer itemTypeIdThree;
    @SerializedName("ItemTypeName")
    private  String itemTypeName;
    @SerializedName("ItemTypeP1Name")
    private  String itemTypeP1Name;
    @SerializedName("ItemXml")
    private  String itemXml;
    @SerializedName("ItemState")
    private  String itemState;
    @SerializedName("ItemStateDesc")
    private  String itemStateDesc;
    @SerializedName("ItemPreState")
    private  String itemPreState;
    @SerializedName("ItemImage")
    private  String itemImage;
    @SerializedName("ItemLevel")
    private  Integer itemLevel;
    @SerializedName("SalePriceStyle")
    private  String salePriceStyle;
    @SerializedName("QBCookieValue")
    private  String QBCookieValue;
    @SerializedName("BtnPic")
    private  String btnPic;
    @SerializedName("UnitPrice")
    private  String unitPrice;
    @SerializedName("UnitPriceInt")
    private  Integer unitPriceInt;
    @SerializedName("Oprate")
    private  Integer oprate;
    @SerializedName("OprateHtml")
    private  String oprateHtml;
    @SerializedName("PriceColorHtml")
    private  String priceColorHtml;
    @SerializedName("CurrentStateName")
    private  String currentStateName;
    @SerializedName("OriginalStateName")
    private  String originalStateName;
    @SerializedName("ItemImageName")
    private  String itemImageName;
    @SerializedName("PaymentDate")
    private  String paymentDate;
    @SerializedName("ShowPaymentDate")
    private  String showPaymentDate;
    @SerializedName("OrderState")
    private  String orderState;
    @SerializedName("GpayOrderCode")
    private  String gpayOrderCode;
    @SerializedName("ItemOrderCode")
    private  Integer itemOrderCode;
    private  String currentState;
    @SerializedName("StateName")
    private  String stateName;
    @SerializedName("ItemInfoCode")
    private  Integer itemInfoCode;
    @SerializedName("CurrentItemPrice")
    private  Double currentItemPrice;
    @SerializedName("OldReservePrice")
    private  Integer oldReservePrice;
    @SerializedName("NewReservePrice")
    private  Integer newReservePrice;
    @SerializedName("ShowItemPrice")
    private  String showItemPrice;
    @SerializedName("ShowNewReservePrice")
    private  String showNewReservePrice;
    @SerializedName("ShowOldReservePrice")
    private  String showOldReservePrice;
    @SerializedName("PublicStartDate")
    private  String publicStartDate;
    @SerializedName("ShowPublicStartDate")
    private  String showPublicStartDate;
    @SerializedName("BusinessStartDate")
    private  String businessStartDate;
    @SerializedName("ShowBusinessStarDate")
    private  String showBusinessStarDate;
    @SerializedName("BusinessEndDate")
    private  String businessEndDate;
    @SerializedName("BulletinStartDate")
    private  String bulletinStartDate;
    @SerializedName("ShowBusinessEndDate")
    private  String showBusinessEndDate;
    @SerializedName("OriginalPrice")
    private  Integer originalPrice;
    @SerializedName("ShowOriginalPrice")
    private  String showOriginalPrice;
    @SerializedName("MakeCount")
    private  Integer makeCount;
    @SerializedName("IsLock")
    private  String isLock;
    @SerializedName("IsPause")
    private  String isPause;
    @SerializedName("BusinessValidDate")
    private  String businessValidDate;
    @SerializedName("PublicEndDate")
    private  String publicEndDate;
    @SerializedName("PublicvalidDate")
    private  String publicvalidDate;
    @SerializedName("AppointRoleId")
    private  String appointRoleId;
    @SerializedName("SaleMethod")
    private  Integer saleMethod;
    @SerializedName("HighestPrice")
    private  Integer highestPrice;
    @SerializedName("CouponsCode")
    private  Integer couponsCode;
    @SerializedName("CallCount")
    private  Integer callCount;
    @SerializedName("NextCallTime")
    private  String nextCallTime;
    @SerializedName("UpdateLockTime")
    private  String updateLockTime;
    @SerializedName("GmtCreate")
    private  Date gmtCreate;
    @SerializedName("GmtUpdate")
    private  Date gmtUpdate;



    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public Integer getUpgradeImmortal() {
        return upgradeImmortal;
    }

    public void setUpgradeImmortal(Integer upgradeImmortal) {
        this.upgradeImmortal = upgradeImmortal;
    }

    public Integer getUpgradeMagic() {
        return upgradeMagic;
    }

    public void setUpgradeMagic(Integer upgradeMagic) {
        this.upgradeMagic = upgradeMagic;
    }

    public Integer getTao() {
        return tao;
    }

    public void setTao(Integer tao) {
        this.tao = tao;
    }

    public Double getDecimalTao() {
        return decimalTao;
    }

    public void setDecimalTao(Double decimalTao) {
        this.decimalTao = decimalTao;
    }

    public String getTaoHtmlHelper() {
        return taoHtmlHelper;
    }

    public void setTaoHtmlHelper(String taoHtmlHelper) {
        this.taoHtmlHelper = taoHtmlHelper == null ? null : taoHtmlHelper.trim();
    }

    public Integer getCon() {
        return con;
    }

    public void setCon(Integer con) {
        this.con = con;
    }

    public Integer getConHtmlHelper() {
        return conHtmlHelper;
    }

    public void setConHtmlHelper(Integer conHtmlHelper) {
        this.conHtmlHelper = conHtmlHelper;
    }

    public Integer getWiz() {
        return wiz;
    }

    public void setWiz(Integer wiz) {
        this.wiz = wiz;
    }

    public Integer getWizHtmlHelper() {
        return wizHtmlHelper;
    }

    public void setWizHtmlHelper(Integer wizHtmlHelper) {
        this.wizHtmlHelper = wizHtmlHelper;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getStrHtmlHelper() {
        return strHtmlHelper;
    }

    public void setStrHtmlHelper(Integer strHtmlHelper) {
        this.strHtmlHelper = strHtmlHelper;
    }

    public Integer getDex() {
        return dex;
    }

    public void setDex(Integer dex) {
        this.dex = dex;
    }

    public Integer getDexHtmlHelper() {
        return dexHtmlHelper;
    }

    public void setDexHtmlHelper(Integer dexHtmlHelper) {
        this.dexHtmlHelper = dexHtmlHelper;
    }

    public Integer getServerCode() {
        return serverCode;
    }

    public void setServerCode(Integer serverCode) {
        this.serverCode = serverCode;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemNameNum() {
        return itemNameNum;
    }

    public void setItemNameNum(String itemNameNum) {
        this.itemNameNum = itemNameNum == null ? null : itemNameNum.trim();
    }

    public String getItemNameColor() {
        return itemNameColor;
    }

    public void setItemNameColor(String itemNameColor) {
        this.itemNameColor = itemNameColor == null ? null : itemNameColor.trim();
    }

    public String getSaleAccount() {
        return saleAccount;
    }

    public void setSaleAccount(String saleAccount) {
        this.saleAccount = saleAccount == null ? null : saleAccount.trim();
    }

    public String getSaleRoelId() {
        return saleRoelId;
    }

    public void setSaleRoelId(String saleRoelId) {
        this.saleRoelId = saleRoelId == null ? null : saleRoelId.trim();
    }

    public String getGameItemCode() {
        return gameItemCode;
    }

    public void setGameItemCode(String gameItemCode) {
        this.gameItemCode = gameItemCode == null ? null : gameItemCode.trim();
    }

    public String getSaleRoleName() {
        return saleRoleName;
    }

    public void setSaleRoleName(String saleRoleName) {
        this.saleRoleName = saleRoleName == null ? null : saleRoleName.trim();
    }

    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public Integer getItemTypeIdThree() {
        return itemTypeIdThree;
    }

    public void setItemTypeIdThree(Integer itemTypeIdThree) {
        this.itemTypeIdThree = itemTypeIdThree;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName == null ? null : itemTypeName.trim();
    }

    public String getItemTypeP1Name() {
        return itemTypeP1Name;
    }

    public void setItemTypeP1Name(String itemTypeP1Name) {
        this.itemTypeP1Name = itemTypeP1Name == null ? null : itemTypeP1Name.trim();
    }

    public String getItemXml() {
        return itemXml;
    }

    public void setItemXml(String itemXml) {
        this.itemXml = itemXml == null ? null : itemXml.trim();
    }

    public String getItemState() {
        return itemState;
    }

    public void setItemState(String itemState) {
        this.itemState = itemState == null ? null : itemState.trim();
    }

    public String getItemStateDesc() {
        return itemStateDesc;
    }

    public void setItemStateDesc(String itemStateDesc) {
        this.itemStateDesc = itemStateDesc == null ? null : itemStateDesc.trim();
    }

    public String getItemPreState() {
        return itemPreState;
    }

    public void setItemPreState(String itemPreState) {
        this.itemPreState = itemPreState == null ? null : itemPreState.trim();
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage == null ? null : itemImage.trim();
    }

    public Integer getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Integer itemLevel) {
        this.itemLevel = itemLevel;
    }

    public String getSalePriceStyle() {
        return salePriceStyle;
    }

    public void setSalePriceStyle(String salePriceStyle) {
        this.salePriceStyle = salePriceStyle == null ? null : salePriceStyle.trim();
    }

    public String getQBCookieValue() {
        return QBCookieValue;
    }

    public void setQBCookieValue(String QBCookieValue) {
        this.QBCookieValue = QBCookieValue == null ? null : QBCookieValue.trim();
    }

    public String getBtnPic() {
        return btnPic;
    }

    public void setBtnPic(String btnPic) {
        this.btnPic = btnPic == null ? null : btnPic.trim();
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice == null ? null : unitPrice.trim();
    }

    public Integer getUnitPriceInt() {
        return unitPriceInt;
    }

    public void setUnitPriceInt(Integer unitPriceInt) {
        this.unitPriceInt = unitPriceInt;
    }

    public Integer getOprate() {
        return oprate;
    }

    public void setOprate(Integer oprate) {
        this.oprate = oprate;
    }

    public String getOprateHtml() {
        return oprateHtml;
    }

    public void setOprateHtml(String oprateHtml) {
        this.oprateHtml = oprateHtml == null ? null : oprateHtml.trim();
    }

    public String getPriceColorHtml() {
        return priceColorHtml;
    }

    public void setPriceColorHtml(String priceColorHtml) {
        this.priceColorHtml = priceColorHtml == null ? null : priceColorHtml.trim();
    }

    public String getCurrentStateName() {
        return currentStateName;
    }

    public void setCurrentStateName(String currentStateName) {
        this.currentStateName = currentStateName == null ? null : currentStateName.trim();
    }

    public String getOriginalStateName() {
        return originalStateName;
    }

    public void setOriginalStateName(String originalStateName) {
        this.originalStateName = originalStateName == null ? null : originalStateName.trim();
    }

    public String getItemImageName() {
        return itemImageName;
    }

    public void setItemImageName(String itemImageName) {
        this.itemImageName = itemImageName == null ? null : itemImageName.trim();
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate == null ? null : paymentDate.trim();
    }

    public String getShowPaymentDate() {
        return showPaymentDate;
    }

    public void setShowPaymentDate(String showPaymentDate) {
        this.showPaymentDate = showPaymentDate == null ? null : showPaymentDate.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public String getGpayOrderCode() {
        return gpayOrderCode;
    }

    public void setGpayOrderCode(String gpayOrderCode) {
        this.gpayOrderCode = gpayOrderCode == null ? null : gpayOrderCode.trim();
    }

    public Integer getItemOrderCode() {
        return itemOrderCode;
    }

    public void setItemOrderCode(Integer itemOrderCode) {
        this.itemOrderCode = itemOrderCode;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState == null ? null : currentState.trim();
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName == null ? null : stateName.trim();
    }

    public Integer getItemInfoCode() {
        return itemInfoCode;
    }

    public void setItemInfoCode(Integer itemInfoCode) {
        this.itemInfoCode = itemInfoCode;
    }

    public Double getCurrentItemPrice() {
        return currentItemPrice;
    }

    public void setCurrentItemPrice(Double currentItemPrice) {
        this.currentItemPrice = currentItemPrice;
    }

    public Integer getOldReservePrice() {
        return oldReservePrice;
    }

    public void setOldReservePrice(Integer oldReservePrice) {
        this.oldReservePrice = oldReservePrice;
    }

    public Integer getNewReservePrice() {
        return newReservePrice;
    }

    public void setNewReservePrice(Integer newReservePrice) {
        this.newReservePrice = newReservePrice;
    }

    public String getShowItemPrice() {
        return showItemPrice;
    }

    public void setShowItemPrice(String showItemPrice) {
        this.showItemPrice = showItemPrice == null ? null : showItemPrice.trim();
    }

    public String getShowNewReservePrice() {
        return showNewReservePrice;
    }

    public void setShowNewReservePrice(String showNewReservePrice) {
        this.showNewReservePrice = showNewReservePrice == null ? null : showNewReservePrice.trim();
    }

    public String getShowOldReservePrice() {
        return showOldReservePrice;
    }

    public void setShowOldReservePrice(String showOldReservePrice) {
        this.showOldReservePrice = showOldReservePrice == null ? null : showOldReservePrice.trim();
    }

    public String getPublicStartDate() {
        return publicStartDate;
    }

    public void setPublicStartDate(String publicStartDate) {
        this.publicStartDate = publicStartDate == null ? null : publicStartDate.trim();
    }

    public String getShowPublicStartDate() {
        return showPublicStartDate;
    }

    public void setShowPublicStartDate(String showPublicStartDate) {
        this.showPublicStartDate = showPublicStartDate == null ? null : showPublicStartDate.trim();
    }

    public String getBusinessStartDate() {
        return businessStartDate;
    }

    public void setBusinessStartDate(String businessStartDate) {
        this.businessStartDate = businessStartDate == null ? null : businessStartDate.trim();
    }

    public String getShowBusinessStarDate() {
        return showBusinessStarDate;
    }

    public void setShowBusinessStarDate(String showBusinessStarDate) {
        this.showBusinessStarDate = showBusinessStarDate == null ? null : showBusinessStarDate.trim();
    }

    public String getBusinessEndDate() {
        return businessEndDate;
    }

    public void setBusinessEndDate(String businessEndDate) {
        this.businessEndDate = businessEndDate == null ? null : businessEndDate.trim();
    }

    public String getBulletinStartDate() {
        return bulletinStartDate;
    }

    public void setBulletinStartDate(String bulletinStartDate) {
        this.bulletinStartDate = bulletinStartDate == null ? null : bulletinStartDate.trim();
    }

    public String getShowBusinessEndDate() {
        return showBusinessEndDate;
    }

    public void setShowBusinessEndDate(String showBusinessEndDate) {
        this.showBusinessEndDate = showBusinessEndDate == null ? null : showBusinessEndDate.trim();
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getShowOriginalPrice() {
        return showOriginalPrice;
    }

    public void setShowOriginalPrice(String showOriginalPrice) {
        this.showOriginalPrice = showOriginalPrice == null ? null : showOriginalPrice.trim();
    }

    public Integer getMakeCount() {
        return makeCount;
    }

    public void setMakeCount(Integer makeCount) {
        this.makeCount = makeCount;
    }

    public String getIsLock() {
        return isLock;
    }

    public void setIsLock(String isLock) {
        this.isLock = isLock == null ? null : isLock.trim();
    }

    public String getIsPause() {
        return isPause;
    }

    public void setIsPause(String isPause) {
        this.isPause = isPause == null ? null : isPause.trim();
    }

    public String getBusinessValidDate() {
        return businessValidDate;
    }

    public void setBusinessValidDate(String businessValidDate) {
        this.businessValidDate = businessValidDate == null ? null : businessValidDate.trim();
    }

    public String getPublicEndDate() {
        return publicEndDate;
    }

    public void setPublicEndDate(String publicEndDate) {
        this.publicEndDate = publicEndDate == null ? null : publicEndDate.trim();
    }

    public String getPublicvalidDate() {
        return publicvalidDate;
    }

    public void setPublicvalidDate(String publicvalidDate) {
        this.publicvalidDate = publicvalidDate == null ? null : publicvalidDate.trim();
    }

    public String getAppointRoleId() {
        return appointRoleId;
    }

    public void setAppointRoleId(String appointRoleId) {
        this.appointRoleId = appointRoleId == null ? null : appointRoleId.trim();
    }

    public Integer getSaleMethod() {
        return saleMethod;
    }

    public void setSaleMethod(Integer saleMethod) {
        this.saleMethod = saleMethod;
    }

    public Integer getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Integer highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Integer getCouponsCode() {
        return couponsCode;
    }

    public void setCouponsCode(Integer couponsCode) {
        this.couponsCode = couponsCode;
    }

    public Integer getCallCount() {
        return callCount;
    }

    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    public String getNextCallTime() {
        return nextCallTime;
    }

    public void setNextCallTime(String nextCallTime) {
        this.nextCallTime = nextCallTime == null ? null : nextCallTime.trim();
    }

    public String getUpdateLockTime() {
        return updateLockTime;
    }

    public void setUpdateLockTime(String updateLockTime) {
        this.updateLockTime = updateLockTime == null ? null : updateLockTime.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}