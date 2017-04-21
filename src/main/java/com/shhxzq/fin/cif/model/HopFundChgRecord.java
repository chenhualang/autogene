package com.shhxzq.fin.cif.model;

import java.math.BigDecimal;
import java.util.Date;

public class HopFundChgRecord {
    /** 主键 */
    private Long id;

    /** 基金名称 */
    private String fundName;

    /** 基金总份数 */
    private BigDecimal totalFundvol;

    /** 基金代码 */
    private String fundCode;

    /** TA代码 */
    private String taNo;

    /** 工作日 */
    private String workDate;

    /** 基金状态 */
    private String fundStatus;

    /** 基金单位净值 */
    private BigDecimal nav;

    /** 基金净值日期 */
    private String updateDate;

    /** 净值类型 */
    private String netValueType;

    /** 累计基金单位净值 */
    private BigDecimal accumulativeNav;

    /** 基金转换状态 */
    private String convertStatus;

    /** 定期定额状态 */
    private String periodicStatus;

    /** 转托管状态 */
    private String transferAgencyStatus;

    /** 基金规模 */
    private BigDecimal fundSize;

    /** 结算币种 */
    private String currencyType;

    /** 公告标志 */
    private String announcFlag;

    /** 默认分红方式 */
    private String defDividendMethod;

    /** 法人追加认购金额 */
    private BigDecimal instAppSubsAmnt;

    /** 法人追加认购份数 */
    private BigDecimal instAppSubsVol;

    /** 法人首次认购最低金额 */
    private BigDecimal minAmountByinst;

    /** 法人首次认购最低份数 */
    private BigDecimal minVolByinst;

    /** 托管人代码 */
    private String custoDianCode;

    /** 定时定额申购的金额 */
    private BigDecimal amountOfPeriodicSubs;

    /** 定时定额申购日期 */
    private String dateOfPeriodicSubs;

    /** 基金最高赎回份数 */
    private BigDecimal maxRedemptionVol;

    /** 基金最低持有份数 */
    private BigDecimal minAccountBalance;

    /** 基金募集开始日期 */
    private String ipoStartDate;

    /** 基金募集结束日期 */
    private String ipoEnddate;

    /** 基金管理人 */
    private String fundManagerCode;

    /** 个人追加认购份数 */
    private BigDecimal indiAppSubsVol;

    /** 个人追加认购金额 */
    private BigDecimal indiAppsubsAmount;

    /** 个人首次认购最低份数 */
    private BigDecimal minSubsVolByindi;

    /** 个人首次认购最低金额 */
    private BigDecimal minSubsAmountByindi;

    /** 注册登记人代码 */
    private String registRarcode;

    /** 基金发起人 */
    private String fundSponsor;

    /** 交易价格 */
    private BigDecimal tradingPrice;

    /** 基金面值 */
    private BigDecimal faceValue;

    /** 分红日/发放日 */
    private String dividentDate;

    /** 权益登记日期 */
    private String registrationDate;

    /** 除权日 */
    private String xrDate;

    /** 个人最高认购份数 */
    private BigDecimal maxSubsVolByindi;

    /** 个人最高认购金额 */
    private BigDecimal maxSubsAmountByindi;

    /** 法人最高认购份数 */
    private BigDecimal maxSubsVolByinst;

    /** 法人最高认购金额 */
    private BigDecimal maxSubsAmountByinst;

    /** 个人认购份数单位 */
    private BigDecimal unitSubsVolByindi;

    /** 个人认购金额单位 */
    private BigDecimal unitSubsAmountByindi;

    /** 法人认购份数单位 */
    private BigDecimal unitSubsVolByinst;

    /** 法人认购金额单位 */
    private BigDecimal unitSubsAmountByinst;

    /** 个人首次申购最低金额 */
    private BigDecimal minBidsAmountByindi;

    /** 法人首次申购最低金额 */
    private BigDecimal minBidsAmountByinst;

    /** 个人追加申购最低金额 */
    private BigDecimal minAppbidsAmountByindi;

    /** 法人追加申购最低金额 */
    private BigDecimal minAppbidsAmountByinst;

    /** 基金最少赎回份数 */
    private BigDecimal minRedemptionVol;

    /** 最低基金转换份数 */
    private BigDecimal mininterconvertVol;

    /** 个人发行方式 */
    private String issuetypeByindi;

    /** 机构发行方式 */
    private String issuetypeByinst;

    /** 认购方式 */
    private String subsType;

    /** 交易费收取方式 */
    private String collectFeetype;

    /** 下一开放日 */
    private String nextTradedate;

    /** 产品价值线数值 */
    private BigDecimal valueLine;

    /** 累计单位分红 */
    private BigDecimal totalDivident;

    /** 货币基金万份收益 */
    private BigDecimal fundIncome;

    /** 货币基金万份收益正负 */
    private String fundIncomeFlag;

    /** 货币基金七日年化收益 */
    private BigDecimal yield;

    /** 货币基金七日年化收益 */
    private String yieldFlag;

    /** 保本净值 */
    private BigDecimal guaranteedNav;

    /** 货币基金年收益率 */
    private BigDecimal fundyearincomeRate;

    /** 货币基金年收益率正负 */
    private String fundyearincomeRateFlag;

    /** 个人最大申购金额 */
    private BigDecimal indimaxPurchase;

    /** 法人最大申购金额 */
    private BigDecimal instmaxPurchase;

    /** 个人当日累计购买最大 */
    private BigDecimal indidayMaxsumbuy;

    /** 法人当日累计购买最大 */
    private BigDecimal instdayMaxsumbuy;

    /** 个人当日累计赎回最大 */
    private BigDecimal indidayMaxsumredeem;

    /** 法人当日累计赎回最大 */
    private BigDecimal instdayMaxsumredeem;

    /** 个人最大赎回份额 */
    private BigDecimal indiMaxRedeem;

    /** 法人最大赎回份额 */
    private BigDecimal instMaxRedeem;

    /** 基金当日总收益正负 */
    private String fundDayIncomeflag;

    /** 基金当日总收益 */
    private BigDecimal fundDayIncome;

    /** 允许违约赎回标志 */
    private String allowBreachRedempt;

    /** 基金类型 */
    private String fundType;

    /** 基金类型名称 */
    private String fundTypeName;

    /** 注册登记人名称 */
    private String registrarName;

    /** 基金管理人名称 */
    private String fundmanagerName;

    /** 基金公司客服电话 */
    private String fundServerTel;

    /** 基金公司网站网址 */
    private String fundInternetAddress;

    /** 份额类别 A:前收费B:后收费 */
    private String shareType;

    /** 是否有效,0:有效，1:无效 */
    private Byte isDelete;

    /** 数据创建时间 */
    private Date createdAt;

    /** 数据更新时间 */
    private Date updatedAt;

    /**
     * 主键
     * @return ID 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 基金名称
     * @return Fund_Name 基金名称
     */
    public String getFundName() {
        return fundName;
    }

    /**
     * 基金名称
     * @param fundName 基金名称
     */
    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    /**
     * 基金总份数
     * @return Total_FundVol 基金总份数
     */
    public BigDecimal getTotalFundvol() {
        return totalFundvol;
    }

    /**
     * 基金总份数
     * @param totalFundvol 基金总份数
     */
    public void setTotalFundvol(BigDecimal totalFundvol) {
        this.totalFundvol = totalFundvol;
    }

    /**
     * 基金代码
     * @return Fund_Code 基金代码
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * 基金代码
     * @param fundCode 基金代码
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    /**
     * TA代码
     * @return TA_NO TA代码
     */
    public String getTaNo() {
        return taNo;
    }

    /**
     * TA代码
     * @param taNo TA代码
     */
    public void setTaNo(String taNo) {
        this.taNo = taNo == null ? null : taNo.trim();
    }

    /**
     * 工作日
     * @return WORK_DATE 工作日
     */
    public String getWorkDate() {
        return workDate;
    }

    /**
     * 工作日
     * @param workDate 工作日
     */
    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    /**
     * 基金状态
     * @return Fund_Status 基金状态
     */
    public String getFundStatus() {
        return fundStatus;
    }

    /**
     * 基金状态
     * @param fundStatus 基金状态
     */
    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus == null ? null : fundStatus.trim();
    }

    /**
     * 基金单位净值
     * @return NAV 基金单位净值
     */
    public BigDecimal getNav() {
        return nav;
    }

    /**
     * 基金单位净值
     * @param nav 基金单位净值
     */
    public void setNav(BigDecimal nav) {
        this.nav = nav;
    }

    /**
     * 基金净值日期
     * @return Update_Date 基金净值日期
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * 基金净值日期
     * @param updateDate 基金净值日期
     */
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate == null ? null : updateDate.trim();
    }

    /**
     * 净值类型
     * @return Net_Value_Type 净值类型
     */
    public String getNetValueType() {
        return netValueType;
    }

    /**
     * 净值类型
     * @param netValueType 净值类型
     */
    public void setNetValueType(String netValueType) {
        this.netValueType = netValueType == null ? null : netValueType.trim();
    }

    /**
     * 累计基金单位净值
     * @return Accumulative_NAV 累计基金单位净值
     */
    public BigDecimal getAccumulativeNav() {
        return accumulativeNav;
    }

    /**
     * 累计基金单位净值
     * @param accumulativeNav 累计基金单位净值
     */
    public void setAccumulativeNav(BigDecimal accumulativeNav) {
        this.accumulativeNav = accumulativeNav;
    }

    /**
     * 基金转换状态
     * @return Convert_Status 基金转换状态
     */
    public String getConvertStatus() {
        return convertStatus;
    }

    /**
     * 基金转换状态
     * @param convertStatus 基金转换状态
     */
    public void setConvertStatus(String convertStatus) {
        this.convertStatus = convertStatus == null ? null : convertStatus.trim();
    }

    /**
     * 定期定额状态
     * @return Periodic_Status 定期定额状态
     */
    public String getPeriodicStatus() {
        return periodicStatus;
    }

    /**
     * 定期定额状态
     * @param periodicStatus 定期定额状态
     */
    public void setPeriodicStatus(String periodicStatus) {
        this.periodicStatus = periodicStatus == null ? null : periodicStatus.trim();
    }

    /**
     * 转托管状态
     * @return Transfer_Agency_Status 转托管状态
     */
    public String getTransferAgencyStatus() {
        return transferAgencyStatus;
    }

    /**
     * 转托管状态
     * @param transferAgencyStatus 转托管状态
     */
    public void setTransferAgencyStatus(String transferAgencyStatus) {
        this.transferAgencyStatus = transferAgencyStatus == null ? null : transferAgencyStatus.trim();
    }

    /**
     * 基金规模
     * @return Fund_Size 基金规模
     */
    public BigDecimal getFundSize() {
        return fundSize;
    }

    /**
     * 基金规模
     * @param fundSize 基金规模
     */
    public void setFundSize(BigDecimal fundSize) {
        this.fundSize = fundSize;
    }

    /**
     * 结算币种
     * @return Currency_Type 结算币种
     */
    public String getCurrencyType() {
        return currencyType;
    }

    /**
     * 结算币种
     * @param currencyType 结算币种
     */
    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType == null ? null : currencyType.trim();
    }

    /**
     * 公告标志
     * @return Announc_Flag 公告标志
     */
    public String getAnnouncFlag() {
        return announcFlag;
    }

    /**
     * 公告标志
     * @param announcFlag 公告标志
     */
    public void setAnnouncFlag(String announcFlag) {
        this.announcFlag = announcFlag == null ? null : announcFlag.trim();
    }

    /**
     * 默认分红方式
     * @return Def_Dividend_Method 默认分红方式
     */
    public String getDefDividendMethod() {
        return defDividendMethod;
    }

    /**
     * 默认分红方式
     * @param defDividendMethod 默认分红方式
     */
    public void setDefDividendMethod(String defDividendMethod) {
        this.defDividendMethod = defDividendMethod == null ? null : defDividendMethod.trim();
    }

    /**
     * 法人追加认购金额
     * @return Inst_App_Subs_Amnt 法人追加认购金额
     */
    public BigDecimal getInstAppSubsAmnt() {
        return instAppSubsAmnt;
    }

    /**
     * 法人追加认购金额
     * @param instAppSubsAmnt 法人追加认购金额
     */
    public void setInstAppSubsAmnt(BigDecimal instAppSubsAmnt) {
        this.instAppSubsAmnt = instAppSubsAmnt;
    }

    /**
     * 法人追加认购份数
     * @return Inst_App_Subs_Vol 法人追加认购份数
     */
    public BigDecimal getInstAppSubsVol() {
        return instAppSubsVol;
    }

    /**
     * 法人追加认购份数
     * @param instAppSubsVol 法人追加认购份数
     */
    public void setInstAppSubsVol(BigDecimal instAppSubsVol) {
        this.instAppSubsVol = instAppSubsVol;
    }

    /**
     * 法人首次认购最低金额
     * @return Min_Amount_ByInst 法人首次认购最低金额
     */
    public BigDecimal getMinAmountByinst() {
        return minAmountByinst;
    }

    /**
     * 法人首次认购最低金额
     * @param minAmountByinst 法人首次认购最低金额
     */
    public void setMinAmountByinst(BigDecimal minAmountByinst) {
        this.minAmountByinst = minAmountByinst;
    }

    /**
     * 法人首次认购最低份数
     * @return Min_Vol_ByInst 法人首次认购最低份数
     */
    public BigDecimal getMinVolByinst() {
        return minVolByinst;
    }

    /**
     * 法人首次认购最低份数
     * @param minVolByinst 法人首次认购最低份数
     */
    public void setMinVolByinst(BigDecimal minVolByinst) {
        this.minVolByinst = minVolByinst;
    }

    /**
     * 托管人代码
     * @return Custo_dian_Code 托管人代码
     */
    public String getCustoDianCode() {
        return custoDianCode;
    }

    /**
     * 托管人代码
     * @param custoDianCode 托管人代码
     */
    public void setCustoDianCode(String custoDianCode) {
        this.custoDianCode = custoDianCode == null ? null : custoDianCode.trim();
    }

    /**
     * 定时定额申购的金额
     * @return Amount_Of_Periodic_Subs 定时定额申购的金额
     */
    public BigDecimal getAmountOfPeriodicSubs() {
        return amountOfPeriodicSubs;
    }

    /**
     * 定时定额申购的金额
     * @param amountOfPeriodicSubs 定时定额申购的金额
     */
    public void setAmountOfPeriodicSubs(BigDecimal amountOfPeriodicSubs) {
        this.amountOfPeriodicSubs = amountOfPeriodicSubs;
    }

    /**
     * 定时定额申购日期
     * @return Date_Of_Periodic_Subs 定时定额申购日期
     */
    public String getDateOfPeriodicSubs() {
        return dateOfPeriodicSubs;
    }

    /**
     * 定时定额申购日期
     * @param dateOfPeriodicSubs 定时定额申购日期
     */
    public void setDateOfPeriodicSubs(String dateOfPeriodicSubs) {
        this.dateOfPeriodicSubs = dateOfPeriodicSubs == null ? null : dateOfPeriodicSubs.trim();
    }

    /**
     * 基金最高赎回份数
     * @return Max_Redemption_Vol 基金最高赎回份数
     */
    public BigDecimal getMaxRedemptionVol() {
        return maxRedemptionVol;
    }

    /**
     * 基金最高赎回份数
     * @param maxRedemptionVol 基金最高赎回份数
     */
    public void setMaxRedemptionVol(BigDecimal maxRedemptionVol) {
        this.maxRedemptionVol = maxRedemptionVol;
    }

    /**
     * 基金最低持有份数
     * @return Min_Account_Balance 基金最低持有份数
     */
    public BigDecimal getMinAccountBalance() {
        return minAccountBalance;
    }

    /**
     * 基金最低持有份数
     * @param minAccountBalance 基金最低持有份数
     */
    public void setMinAccountBalance(BigDecimal minAccountBalance) {
        this.minAccountBalance = minAccountBalance;
    }

    /**
     * 基金募集开始日期
     * @return IPO_Start_Date 基金募集开始日期
     */
    public String getIpoStartDate() {
        return ipoStartDate;
    }

    /**
     * 基金募集开始日期
     * @param ipoStartDate 基金募集开始日期
     */
    public void setIpoStartDate(String ipoStartDate) {
        this.ipoStartDate = ipoStartDate == null ? null : ipoStartDate.trim();
    }

    /**
     * 基金募集结束日期
     * @return IPO_EndDate 基金募集结束日期
     */
    public String getIpoEnddate() {
        return ipoEnddate;
    }

    /**
     * 基金募集结束日期
     * @param ipoEnddate 基金募集结束日期
     */
    public void setIpoEnddate(String ipoEnddate) {
        this.ipoEnddate = ipoEnddate == null ? null : ipoEnddate.trim();
    }

    /**
     * 基金管理人
     * @return Fund_Manager_Code 基金管理人
     */
    public String getFundManagerCode() {
        return fundManagerCode;
    }

    /**
     * 基金管理人
     * @param fundManagerCode 基金管理人
     */
    public void setFundManagerCode(String fundManagerCode) {
        this.fundManagerCode = fundManagerCode == null ? null : fundManagerCode.trim();
    }

    /**
     * 个人追加认购份数
     * @return Indi_App_Subs_Vol 个人追加认购份数
     */
    public BigDecimal getIndiAppSubsVol() {
        return indiAppSubsVol;
    }

    /**
     * 个人追加认购份数
     * @param indiAppSubsVol 个人追加认购份数
     */
    public void setIndiAppSubsVol(BigDecimal indiAppSubsVol) {
        this.indiAppSubsVol = indiAppSubsVol;
    }

    /**
     * 个人追加认购金额
     * @return Indi_AppSubs_Amount 个人追加认购金额
     */
    public BigDecimal getIndiAppsubsAmount() {
        return indiAppsubsAmount;
    }

    /**
     * 个人追加认购金额
     * @param indiAppsubsAmount 个人追加认购金额
     */
    public void setIndiAppsubsAmount(BigDecimal indiAppsubsAmount) {
        this.indiAppsubsAmount = indiAppsubsAmount;
    }

    /**
     * 个人首次认购最低份数
     * @return Min_Subs_Vol_ByIndi 个人首次认购最低份数
     */
    public BigDecimal getMinSubsVolByindi() {
        return minSubsVolByindi;
    }

    /**
     * 个人首次认购最低份数
     * @param minSubsVolByindi 个人首次认购最低份数
     */
    public void setMinSubsVolByindi(BigDecimal minSubsVolByindi) {
        this.minSubsVolByindi = minSubsVolByindi;
    }

    /**
     * 个人首次认购最低金额
     * @return Min_Subs_Amount_ByIndi 个人首次认购最低金额
     */
    public BigDecimal getMinSubsAmountByindi() {
        return minSubsAmountByindi;
    }

    /**
     * 个人首次认购最低金额
     * @param minSubsAmountByindi 个人首次认购最低金额
     */
    public void setMinSubsAmountByindi(BigDecimal minSubsAmountByindi) {
        this.minSubsAmountByindi = minSubsAmountByindi;
    }

    /**
     * 注册登记人代码
     * @return Regist_rarCode 注册登记人代码
     */
    public String getRegistRarcode() {
        return registRarcode;
    }

    /**
     * 注册登记人代码
     * @param registRarcode 注册登记人代码
     */
    public void setRegistRarcode(String registRarcode) {
        this.registRarcode = registRarcode == null ? null : registRarcode.trim();
    }

    /**
     * 基金发起人
     * @return Fund_Sponsor 基金发起人
     */
    public String getFundSponsor() {
        return fundSponsor;
    }

    /**
     * 基金发起人
     * @param fundSponsor 基金发起人
     */
    public void setFundSponsor(String fundSponsor) {
        this.fundSponsor = fundSponsor == null ? null : fundSponsor.trim();
    }

    /**
     * 交易价格
     * @return Trading_Price 交易价格
     */
    public BigDecimal getTradingPrice() {
        return tradingPrice;
    }

    /**
     * 交易价格
     * @param tradingPrice 交易价格
     */
    public void setTradingPrice(BigDecimal tradingPrice) {
        this.tradingPrice = tradingPrice;
    }

    /**
     * 基金面值
     * @return Face_Value 基金面值
     */
    public BigDecimal getFaceValue() {
        return faceValue;
    }

    /**
     * 基金面值
     * @param faceValue 基金面值
     */
    public void setFaceValue(BigDecimal faceValue) {
        this.faceValue = faceValue;
    }

    /**
     * 分红日/发放日
     * @return Divident_Date 分红日/发放日
     */
    public String getDividentDate() {
        return dividentDate;
    }

    /**
     * 分红日/发放日
     * @param dividentDate 分红日/发放日
     */
    public void setDividentDate(String dividentDate) {
        this.dividentDate = dividentDate == null ? null : dividentDate.trim();
    }

    /**
     * 权益登记日期
     * @return Registration_Date 权益登记日期
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * 权益登记日期
     * @param registrationDate 权益登记日期
     */
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate == null ? null : registrationDate.trim();
    }

    /**
     * 除权日
     * @return XR_Date 除权日
     */
    public String getXrDate() {
        return xrDate;
    }

    /**
     * 除权日
     * @param xrDate 除权日
     */
    public void setXrDate(String xrDate) {
        this.xrDate = xrDate == null ? null : xrDate.trim();
    }

    /**
     * 个人最高认购份数
     * @return Max_Subs_Vol_ByIndi 个人最高认购份数
     */
    public BigDecimal getMaxSubsVolByindi() {
        return maxSubsVolByindi;
    }

    /**
     * 个人最高认购份数
     * @param maxSubsVolByindi 个人最高认购份数
     */
    public void setMaxSubsVolByindi(BigDecimal maxSubsVolByindi) {
        this.maxSubsVolByindi = maxSubsVolByindi;
    }

    /**
     * 个人最高认购金额
     * @return Max_Subs_Amount_ByIndi 个人最高认购金额
     */
    public BigDecimal getMaxSubsAmountByindi() {
        return maxSubsAmountByindi;
    }

    /**
     * 个人最高认购金额
     * @param maxSubsAmountByindi 个人最高认购金额
     */
    public void setMaxSubsAmountByindi(BigDecimal maxSubsAmountByindi) {
        this.maxSubsAmountByindi = maxSubsAmountByindi;
    }

    /**
     * 法人最高认购份数
     * @return Max_Subs_Vol_ByInst 法人最高认购份数
     */
    public BigDecimal getMaxSubsVolByinst() {
        return maxSubsVolByinst;
    }

    /**
     * 法人最高认购份数
     * @param maxSubsVolByinst 法人最高认购份数
     */
    public void setMaxSubsVolByinst(BigDecimal maxSubsVolByinst) {
        this.maxSubsVolByinst = maxSubsVolByinst;
    }

    /**
     * 法人最高认购金额
     * @return Max_Subs_Amount_ByInst 法人最高认购金额
     */
    public BigDecimal getMaxSubsAmountByinst() {
        return maxSubsAmountByinst;
    }

    /**
     * 法人最高认购金额
     * @param maxSubsAmountByinst 法人最高认购金额
     */
    public void setMaxSubsAmountByinst(BigDecimal maxSubsAmountByinst) {
        this.maxSubsAmountByinst = maxSubsAmountByinst;
    }

    /**
     * 个人认购份数单位
     * @return Unit_Subs_Vol_ByIndi 个人认购份数单位
     */
    public BigDecimal getUnitSubsVolByindi() {
        return unitSubsVolByindi;
    }

    /**
     * 个人认购份数单位
     * @param unitSubsVolByindi 个人认购份数单位
     */
    public void setUnitSubsVolByindi(BigDecimal unitSubsVolByindi) {
        this.unitSubsVolByindi = unitSubsVolByindi;
    }

    /**
     * 个人认购金额单位
     * @return Unit_Subs_Amount_ByIndi 个人认购金额单位
     */
    public BigDecimal getUnitSubsAmountByindi() {
        return unitSubsAmountByindi;
    }

    /**
     * 个人认购金额单位
     * @param unitSubsAmountByindi 个人认购金额单位
     */
    public void setUnitSubsAmountByindi(BigDecimal unitSubsAmountByindi) {
        this.unitSubsAmountByindi = unitSubsAmountByindi;
    }

    /**
     * 法人认购份数单位
     * @return Unit_Subs_Vol_ByInst 法人认购份数单位
     */
    public BigDecimal getUnitSubsVolByinst() {
        return unitSubsVolByinst;
    }

    /**
     * 法人认购份数单位
     * @param unitSubsVolByinst 法人认购份数单位
     */
    public void setUnitSubsVolByinst(BigDecimal unitSubsVolByinst) {
        this.unitSubsVolByinst = unitSubsVolByinst;
    }

    /**
     * 法人认购金额单位
     * @return Unit_Subs_Amount_ByInst 法人认购金额单位
     */
    public BigDecimal getUnitSubsAmountByinst() {
        return unitSubsAmountByinst;
    }

    /**
     * 法人认购金额单位
     * @param unitSubsAmountByinst 法人认购金额单位
     */
    public void setUnitSubsAmountByinst(BigDecimal unitSubsAmountByinst) {
        this.unitSubsAmountByinst = unitSubsAmountByinst;
    }

    /**
     * 个人首次申购最低金额
     * @return Min_Bids_Amount_ByIndi 个人首次申购最低金额
     */
    public BigDecimal getMinBidsAmountByindi() {
        return minBidsAmountByindi;
    }

    /**
     * 个人首次申购最低金额
     * @param minBidsAmountByindi 个人首次申购最低金额
     */
    public void setMinBidsAmountByindi(BigDecimal minBidsAmountByindi) {
        this.minBidsAmountByindi = minBidsAmountByindi;
    }

    /**
     * 法人首次申购最低金额
     * @return Min_Bids_Amount_ByInst 法人首次申购最低金额
     */
    public BigDecimal getMinBidsAmountByinst() {
        return minBidsAmountByinst;
    }

    /**
     * 法人首次申购最低金额
     * @param minBidsAmountByinst 法人首次申购最低金额
     */
    public void setMinBidsAmountByinst(BigDecimal minBidsAmountByinst) {
        this.minBidsAmountByinst = minBidsAmountByinst;
    }

    /**
     * 个人追加申购最低金额
     * @return Min_AppBids_Amount_ByIndi 个人追加申购最低金额
     */
    public BigDecimal getMinAppbidsAmountByindi() {
        return minAppbidsAmountByindi;
    }

    /**
     * 个人追加申购最低金额
     * @param minAppbidsAmountByindi 个人追加申购最低金额
     */
    public void setMinAppbidsAmountByindi(BigDecimal minAppbidsAmountByindi) {
        this.minAppbidsAmountByindi = minAppbidsAmountByindi;
    }

    /**
     * 法人追加申购最低金额
     * @return Min_AppBids_Amount_ByInst 法人追加申购最低金额
     */
    public BigDecimal getMinAppbidsAmountByinst() {
        return minAppbidsAmountByinst;
    }

    /**
     * 法人追加申购最低金额
     * @param minAppbidsAmountByinst 法人追加申购最低金额
     */
    public void setMinAppbidsAmountByinst(BigDecimal minAppbidsAmountByinst) {
        this.minAppbidsAmountByinst = minAppbidsAmountByinst;
    }

    /**
     * 基金最少赎回份数
     * @return Min_Redemption_Vol 基金最少赎回份数
     */
    public BigDecimal getMinRedemptionVol() {
        return minRedemptionVol;
    }

    /**
     * 基金最少赎回份数
     * @param minRedemptionVol 基金最少赎回份数
     */
    public void setMinRedemptionVol(BigDecimal minRedemptionVol) {
        this.minRedemptionVol = minRedemptionVol;
    }

    /**
     * 最低基金转换份数
     * @return MinInterconvert_Vol 最低基金转换份数
     */
    public BigDecimal getMininterconvertVol() {
        return mininterconvertVol;
    }

    /**
     * 最低基金转换份数
     * @param mininterconvertVol 最低基金转换份数
     */
    public void setMininterconvertVol(BigDecimal mininterconvertVol) {
        this.mininterconvertVol = mininterconvertVol;
    }

    /**
     * 个人发行方式
     * @return IssueType_ByIndi 个人发行方式
     */
    public String getIssuetypeByindi() {
        return issuetypeByindi;
    }

    /**
     * 个人发行方式
     * @param issuetypeByindi 个人发行方式
     */
    public void setIssuetypeByindi(String issuetypeByindi) {
        this.issuetypeByindi = issuetypeByindi == null ? null : issuetypeByindi.trim();
    }

    /**
     * 机构发行方式
     * @return IssueType_ByInst 机构发行方式
     */
    public String getIssuetypeByinst() {
        return issuetypeByinst;
    }

    /**
     * 机构发行方式
     * @param issuetypeByinst 机构发行方式
     */
    public void setIssuetypeByinst(String issuetypeByinst) {
        this.issuetypeByinst = issuetypeByinst == null ? null : issuetypeByinst.trim();
    }

    /**
     * 认购方式
     * @return Subs_Type 认购方式
     */
    public String getSubsType() {
        return subsType;
    }

    /**
     * 认购方式
     * @param subsType 认购方式
     */
    public void setSubsType(String subsType) {
        this.subsType = subsType == null ? null : subsType.trim();
    }

    /**
     * 交易费收取方式
     * @return Collect_FeeType 交易费收取方式
     */
    public String getCollectFeetype() {
        return collectFeetype;
    }

    /**
     * 交易费收取方式
     * @param collectFeetype 交易费收取方式
     */
    public void setCollectFeetype(String collectFeetype) {
        this.collectFeetype = collectFeetype == null ? null : collectFeetype.trim();
    }

    /**
     * 下一开放日
     * @return Next_TradeDate 下一开放日
     */
    public String getNextTradedate() {
        return nextTradedate;
    }

    /**
     * 下一开放日
     * @param nextTradedate 下一开放日
     */
    public void setNextTradedate(String nextTradedate) {
        this.nextTradedate = nextTradedate == null ? null : nextTradedate.trim();
    }

    /**
     * 产品价值线数值
     * @return Value_Line 产品价值线数值
     */
    public BigDecimal getValueLine() {
        return valueLine;
    }

    /**
     * 产品价值线数值
     * @param valueLine 产品价值线数值
     */
    public void setValueLine(BigDecimal valueLine) {
        this.valueLine = valueLine;
    }

    /**
     * 累计单位分红
     * @return Total_Divident 累计单位分红
     */
    public BigDecimal getTotalDivident() {
        return totalDivident;
    }

    /**
     * 累计单位分红
     * @param totalDivident 累计单位分红
     */
    public void setTotalDivident(BigDecimal totalDivident) {
        this.totalDivident = totalDivident;
    }

    /**
     * 货币基金万份收益
     * @return Fund_Income 货币基金万份收益
     */
    public BigDecimal getFundIncome() {
        return fundIncome;
    }

    /**
     * 货币基金万份收益
     * @param fundIncome 货币基金万份收益
     */
    public void setFundIncome(BigDecimal fundIncome) {
        this.fundIncome = fundIncome;
    }

    /**
     * 货币基金万份收益正负
     * @return Fund_Income_Flag 货币基金万份收益正负
     */
    public String getFundIncomeFlag() {
        return fundIncomeFlag;
    }

    /**
     * 货币基金万份收益正负
     * @param fundIncomeFlag 货币基金万份收益正负
     */
    public void setFundIncomeFlag(String fundIncomeFlag) {
        this.fundIncomeFlag = fundIncomeFlag == null ? null : fundIncomeFlag.trim();
    }

    /**
     * 货币基金七日年化收益
     * @return Yield 货币基金七日年化收益
     */
    public BigDecimal getYield() {
        return yield;
    }

    /**
     * 货币基金七日年化收益
     * @param yield 货币基金七日年化收益
     */
    public void setYield(BigDecimal yield) {
        this.yield = yield;
    }

    /**
     * 货币基金七日年化收益
     * @return Yield_Flag 货币基金七日年化收益
     */
    public String getYieldFlag() {
        return yieldFlag;
    }

    /**
     * 货币基金七日年化收益
     * @param yieldFlag 货币基金七日年化收益
     */
    public void setYieldFlag(String yieldFlag) {
        this.yieldFlag = yieldFlag == null ? null : yieldFlag.trim();
    }

    /**
     * 保本净值
     * @return Guaranteed_NAV 保本净值
     */
    public BigDecimal getGuaranteedNav() {
        return guaranteedNav;
    }

    /**
     * 保本净值
     * @param guaranteedNav 保本净值
     */
    public void setGuaranteedNav(BigDecimal guaranteedNav) {
        this.guaranteedNav = guaranteedNav;
    }

    /**
     * 货币基金年收益率
     * @return FundYearIncome_Rate 货币基金年收益率
     */
    public BigDecimal getFundyearincomeRate() {
        return fundyearincomeRate;
    }

    /**
     * 货币基金年收益率
     * @param fundyearincomeRate 货币基金年收益率
     */
    public void setFundyearincomeRate(BigDecimal fundyearincomeRate) {
        this.fundyearincomeRate = fundyearincomeRate;
    }

    /**
     * 货币基金年收益率正负
     * @return FundYearIncome_Rate_Flag 货币基金年收益率正负
     */
    public String getFundyearincomeRateFlag() {
        return fundyearincomeRateFlag;
    }

    /**
     * 货币基金年收益率正负
     * @param fundyearincomeRateFlag 货币基金年收益率正负
     */
    public void setFundyearincomeRateFlag(String fundyearincomeRateFlag) {
        this.fundyearincomeRateFlag = fundyearincomeRateFlag == null ? null : fundyearincomeRateFlag.trim();
    }

    /**
     * 个人最大申购金额
     * @return IndiMax_Purchase 个人最大申购金额
     */
    public BigDecimal getIndimaxPurchase() {
        return indimaxPurchase;
    }

    /**
     * 个人最大申购金额
     * @param indimaxPurchase 个人最大申购金额
     */
    public void setIndimaxPurchase(BigDecimal indimaxPurchase) {
        this.indimaxPurchase = indimaxPurchase;
    }

    /**
     * 法人最大申购金额
     * @return InstMax_Purchase 法人最大申购金额
     */
    public BigDecimal getInstmaxPurchase() {
        return instmaxPurchase;
    }

    /**
     * 法人最大申购金额
     * @param instmaxPurchase 法人最大申购金额
     */
    public void setInstmaxPurchase(BigDecimal instmaxPurchase) {
        this.instmaxPurchase = instmaxPurchase;
    }

    /**
     * 个人当日累计购买最大
     * @return IndiDay_MaxSumBuy 个人当日累计购买最大
     */
    public BigDecimal getIndidayMaxsumbuy() {
        return indidayMaxsumbuy;
    }

    /**
     * 个人当日累计购买最大
     * @param indidayMaxsumbuy 个人当日累计购买最大
     */
    public void setIndidayMaxsumbuy(BigDecimal indidayMaxsumbuy) {
        this.indidayMaxsumbuy = indidayMaxsumbuy;
    }

    /**
     * 法人当日累计购买最大
     * @return InstDay_MaxSumBuy 法人当日累计购买最大
     */
    public BigDecimal getInstdayMaxsumbuy() {
        return instdayMaxsumbuy;
    }

    /**
     * 法人当日累计购买最大
     * @param instdayMaxsumbuy 法人当日累计购买最大
     */
    public void setInstdayMaxsumbuy(BigDecimal instdayMaxsumbuy) {
        this.instdayMaxsumbuy = instdayMaxsumbuy;
    }

    /**
     * 个人当日累计赎回最大
     * @return IndiDay_MaxSumRedeem 个人当日累计赎回最大
     */
    public BigDecimal getIndidayMaxsumredeem() {
        return indidayMaxsumredeem;
    }

    /**
     * 个人当日累计赎回最大
     * @param indidayMaxsumredeem 个人当日累计赎回最大
     */
    public void setIndidayMaxsumredeem(BigDecimal indidayMaxsumredeem) {
        this.indidayMaxsumredeem = indidayMaxsumredeem;
    }

    /**
     * 法人当日累计赎回最大
     * @return InstDay_MaxSumRedeem 法人当日累计赎回最大
     */
    public BigDecimal getInstdayMaxsumredeem() {
        return instdayMaxsumredeem;
    }

    /**
     * 法人当日累计赎回最大
     * @param instdayMaxsumredeem 法人当日累计赎回最大
     */
    public void setInstdayMaxsumredeem(BigDecimal instdayMaxsumredeem) {
        this.instdayMaxsumredeem = instdayMaxsumredeem;
    }

    /**
     * 个人最大赎回份额
     * @return Indi_Max_Redeem 个人最大赎回份额
     */
    public BigDecimal getIndiMaxRedeem() {
        return indiMaxRedeem;
    }

    /**
     * 个人最大赎回份额
     * @param indiMaxRedeem 个人最大赎回份额
     */
    public void setIndiMaxRedeem(BigDecimal indiMaxRedeem) {
        this.indiMaxRedeem = indiMaxRedeem;
    }

    /**
     * 法人最大赎回份额
     * @return Inst_Max_Redeem 法人最大赎回份额
     */
    public BigDecimal getInstMaxRedeem() {
        return instMaxRedeem;
    }

    /**
     * 法人最大赎回份额
     * @param instMaxRedeem 法人最大赎回份额
     */
    public void setInstMaxRedeem(BigDecimal instMaxRedeem) {
        this.instMaxRedeem = instMaxRedeem;
    }

    /**
     * 基金当日总收益正负
     * @return Fund_Day_IncomeFlag 基金当日总收益正负
     */
    public String getFundDayIncomeflag() {
        return fundDayIncomeflag;
    }

    /**
     * 基金当日总收益正负
     * @param fundDayIncomeflag 基金当日总收益正负
     */
    public void setFundDayIncomeflag(String fundDayIncomeflag) {
        this.fundDayIncomeflag = fundDayIncomeflag == null ? null : fundDayIncomeflag.trim();
    }

    /**
     * 基金当日总收益
     * @return Fund_Day_Income 基金当日总收益
     */
    public BigDecimal getFundDayIncome() {
        return fundDayIncome;
    }

    /**
     * 基金当日总收益
     * @param fundDayIncome 基金当日总收益
     */
    public void setFundDayIncome(BigDecimal fundDayIncome) {
        this.fundDayIncome = fundDayIncome;
    }

    /**
     * 允许违约赎回标志
     * @return Allow_Breach_Redempt 允许违约赎回标志
     */
    public String getAllowBreachRedempt() {
        return allowBreachRedempt;
    }

    /**
     * 允许违约赎回标志
     * @param allowBreachRedempt 允许违约赎回标志
     */
    public void setAllowBreachRedempt(String allowBreachRedempt) {
        this.allowBreachRedempt = allowBreachRedempt == null ? null : allowBreachRedempt.trim();
    }

    /**
     * 基金类型
     * @return Fund_Type 基金类型
     */
    public String getFundType() {
        return fundType;
    }

    /**
     * 基金类型
     * @param fundType 基金类型
     */
    public void setFundType(String fundType) {
        this.fundType = fundType == null ? null : fundType.trim();
    }

    /**
     * 基金类型名称
     * @return Fund_Type_Name 基金类型名称
     */
    public String getFundTypeName() {
        return fundTypeName;
    }

    /**
     * 基金类型名称
     * @param fundTypeName 基金类型名称
     */
    public void setFundTypeName(String fundTypeName) {
        this.fundTypeName = fundTypeName == null ? null : fundTypeName.trim();
    }

    /**
     * 注册登记人名称
     * @return Registrar_Name 注册登记人名称
     */
    public String getRegistrarName() {
        return registrarName;
    }

    /**
     * 注册登记人名称
     * @param registrarName 注册登记人名称
     */
    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName == null ? null : registrarName.trim();
    }

    /**
     * 基金管理人名称
     * @return FundManager_Name 基金管理人名称
     */
    public String getFundmanagerName() {
        return fundmanagerName;
    }

    /**
     * 基金管理人名称
     * @param fundmanagerName 基金管理人名称
     */
    public void setFundmanagerName(String fundmanagerName) {
        this.fundmanagerName = fundmanagerName == null ? null : fundmanagerName.trim();
    }

    /**
     * 基金公司客服电话
     * @return Fund_Server_Tel 基金公司客服电话
     */
    public String getFundServerTel() {
        return fundServerTel;
    }

    /**
     * 基金公司客服电话
     * @param fundServerTel 基金公司客服电话
     */
    public void setFundServerTel(String fundServerTel) {
        this.fundServerTel = fundServerTel == null ? null : fundServerTel.trim();
    }

    /**
     * 基金公司网站网址
     * @return Fund_Internet_Address 基金公司网站网址
     */
    public String getFundInternetAddress() {
        return fundInternetAddress;
    }

    /**
     * 基金公司网站网址
     * @param fundInternetAddress 基金公司网站网址
     */
    public void setFundInternetAddress(String fundInternetAddress) {
        this.fundInternetAddress = fundInternetAddress == null ? null : fundInternetAddress.trim();
    }

    /**
     * 份额类别 A:前收费B:后收费
     * @return Share_Type 份额类别 A:前收费B:后收费
     */
    public String getShareType() {
        return shareType;
    }

    /**
     * 份额类别 A:前收费B:后收费
     * @param shareType 份额类别 A:前收费B:后收费
     */
    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
    }

    /**
     * 是否有效,0:有效，1:无效
     * @return is_delete 是否有效,0:有效，1:无效
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 是否有效,0:有效，1:无效
     * @param isDelete 是否有效,0:有效，1:无效
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 数据创建时间
     * @return created_at 数据创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 数据创建时间
     * @param createdAt 数据创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 数据更新时间
     * @return updated_at 数据更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 数据更新时间
     * @param updatedAt 数据更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}