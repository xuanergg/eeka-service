package com.greatonce.oms.query.trade;

import com.greatonce.core.database.Query;
import com.greatonce.oms.domain.enums.mall.MallSalesOrderDetailStatus;
import com.greatonce.oms.domain.enums.product.ProductType;
import com.greatonce.oms.domain.enums.trade.SalesOrderDetailRefundStatus;
import com.greatonce.oms.domain.enums.trade.SalesOrderDetailStatus;
import com.greatonce.oms.domain.enums.trade.SalesOrderDetailType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 销售订单明细.
 *
 * @author code-generator
 * @author Shenzhen Greatonce Co Ltd
 * @version 3.0
 */
public class SalesOrderDetailQuery extends Query {
  /**
   * 活动id.
   */
  private Long activityId;
  /**
   * 实际金额.
   */
  private Double actualAmount;
  /**
   * 实际销售价.
   */
  private Double actualSellingPrice;
  /**
   * 成本价.
   */
  private Double costPrice;
  /**
   * 创建时间开始.
   */
  private LocalDateTime createdTimeBegin;
  /**
   * 创建时间结束.
   */
  private LocalDateTime createdTimeEnd;
  /**
   * 优惠金额.
   */
  private Double discountAmount;
  /**
   * 分销金额.
   */
  private Double distributionAmount;
  /**
   * 分销价.
   */
  private Double distributionPrice;
  /**
   * 换货单id.
   */
  private String exchangeId;
  /**
   * 快递名称.
   */
  private String expressName;
  /**
   * 快递单号.
   */
  private String expressNo;
  /**
   * 赠送的策略id.
   */
  private Long giftStrategyId;
  /**
   * 赠送的策略名称.
   */
  private String giftStrategyName;
  /**
   * 是否套装明细.
   */
  private Boolean combinationDetail;
  /**
   * 是否组合商品.
   */
  private Boolean combination;
  /**
   * 是否已删除.
   */
  private Boolean deleted;
  /**
   * 是否代发.
   */
  private Boolean dropShipping;
  /**
   * 是否赠品.
   */
  private Boolean gift;
  /**
   * 是否锁定库存.
   */
  private Boolean lockStock;
  /**
   * 是否手工添加.
   */
  private Boolean manualAdd;
  /**
   * 是否需要退货.
   */
  private Boolean needReturnGoods;
  /**
   * 是否缺货.
   */
  private Boolean oos;
  /**
   * 是否预包装.
   */
  private Boolean prepackage;
  /**
   * 是否预售有货先发.
   */
  private Boolean presellPriority;
  /**
   * 是否商品异常.
   */
  private Boolean productAbnormal;
  /**
   * 是否拆分发货.
   */
  private Boolean separate;
  /**
   * 商城明细id.
   */
  private String mallDetailId;
  /**
   * 平台预售发货要求.
   */
  private String mallPresellDeliveryRequiring;
  /**
   * 商城商品编码.
   */
  private String mallProductId;
  /**
   * 商城商品名称.
   */
  private String mallProductName;
  /**
   * 商城商品外部编码.
   */
  private String mallProductOutCode;
  /**
   * 商城明细状态.
   */
  private MallSalesOrderDetailStatus mallSalesOrderDetailStatus;
  /**
   * 商城规格编码.
   */
  private String mallSkuId;
  /**
   * 商城规格名称.
   */
  private String mallSkuName;
  /**
   * 商城规格外部编码.
   */
  private String mallSkuOutCode;
  /**
   * 更新时间开始.
   */
  private LocalDateTime modifiedTimeBegin;
  /**
   * 更新时间结束.
   */
  private LocalDateTime modifiedTimeEnd;
  /**
   * 订单明细原始明细id.
   */
  private Long originalDetailid;
  /**
   * 预售发货日期开始.
   */
  private LocalDate presellDeliveryDateBegin;
  /**
   * 预售发货日期结束.
   */
  private LocalDate presellDeliveryDateEnd;
  /**
   * 预售id.
   */
  private Long presellId;
  /**
   * 商品编码.
   */
  private String productCode;
  /**
   * 商品id.
   */
  private Long productId;
  /**
   * 商品名称.
   */
  private String productName;
  /**
   * 商品类型.
   */
  private ProductType productType;
  /**
   * 数量.
   */
  private Integer quantity;
  /**
   * 明细id.
   */
  private Long salesOrderDetailId;
  /**
   * .
   */
  private List<Long> salesOrderDetailIds;
  /**
   * 退款状态.
   */
  private SalesOrderDetailRefundStatus salesOrderDetailRefundStatus;
  /**
   * 订单明细类型.
   */
  private SalesOrderDetailType salesOrderDetailType;
  /**
   * 销售单id.
   */
  private Long salesOrderId;
  /**
   * 销售金额.
   */
  private Double sellingAmount;
  /**
   * 销售价.
   */
  private Double sellingPrice;
  /**
   * 结算金额.
   */
  private Double settlementAmount;
  /**
   * 结算价.
   */
  private Double settlementPrice;
  /**
   * 商品规格编码.
   */
  private String skuCode;
  /**
   * 商品规格id.
   */
  private Long skuId;
  /**
   * 商品规格名称.
   */
  private String skuName;
  /**
   * 状态.
   */
  private SalesOrderDetailStatus status;
  /**
   * 建议发货仓库id.
   */
  private Long suggestVirtualWarehouseId;
  /**
   * 建议发货仓库名称.
   */
  private String suggestVirtualWarehouseName;
  /**
   * 建议实体仓id.
   */
  private Long suggestWarehouseId;
  /**
   * 建议实体仓名称.
   */
  private String suggestWarehouseName;
  /**
   * 重量.
   */
  private Double weight;


  /**
   * 活动id.
   * @param activityId 活动id
   */
  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  /**
   * 活动id.
   * @return 活动id
   */
  public Long getActivityId() {
      return this.activityId;
  }

  /**
   * 实际金额.
   * @param actualAmount 实际金额
   */
  public void setActualAmount(Double actualAmount) {
    this.actualAmount = actualAmount;
  }

  /**
   * 实际金额.
   * @return 实际金额
   */
  public Double getActualAmount() {
      return this.actualAmount;
  }

  /**
   * 实际销售价.
   * @param actualSellingPrice 实际销售价
   */
  public void setActualSellingPrice(Double actualSellingPrice) {
    this.actualSellingPrice = actualSellingPrice;
  }

  /**
   * 实际销售价.
   * @return 实际销售价
   */
  public Double getActualSellingPrice() {
      return this.actualSellingPrice;
  }

  /**
   * 成本价.
   * @param costPrice 成本价
   */
  public void setCostPrice(Double costPrice) {
    this.costPrice = costPrice;
  }

  /**
   * 成本价.
   * @return 成本价
   */
  public Double getCostPrice() {
      return this.costPrice;
  }

  /**
   * 创建时间开始.
   * @param createdTimeBegin 开始.
   */
  public void setCreatedTimeBegin(LocalDateTime createdTimeBegin) {
    this.createdTimeBegin = createdTimeBegin;
  }

  /**
   * 创建时间开始.
   * @return 创建时间开始
   */
  public LocalDateTime getCreatedTimeBegin() {
    return this.createdTimeBegin;
  }

  /**
   * 创建时间结束.
   * @param createdTimeEnd 结束
   */
  public void setCreatedTimeEnd(LocalDateTime createdTimeEnd) {
    this.createdTimeEnd = createdTimeEnd;
  }

  /**
   * 创建时间结束.
   * @return 创建时间结束
   */
  public LocalDateTime getCreatedTimeEnd() {
    return this.createdTimeEnd;
  }

  /**
   * 优惠金额.
   * @param discountAmount 优惠金额
   */
  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }

  /**
   * 优惠金额.
   * @return 优惠金额
   */
  public Double getDiscountAmount() {
      return this.discountAmount;
  }

  /**
   * 分销金额.
   * @param distributionAmount 分销金额
   */
  public void setDistributionAmount(Double distributionAmount) {
    this.distributionAmount = distributionAmount;
  }

  /**
   * 分销金额.
   * @return 分销金额
   */
  public Double getDistributionAmount() {
      return this.distributionAmount;
  }

  /**
   * 分销价.
   * @param distributionPrice 分销价
   */
  public void setDistributionPrice(Double distributionPrice) {
    this.distributionPrice = distributionPrice;
  }

  /**
   * 分销价.
   * @return 分销价
   */
  public Double getDistributionPrice() {
      return this.distributionPrice;
  }

  /**
   * 换货单id.
   * @param exchangeId 换货单id
   */
  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId == null ? null : exchangeId.trim();
  }

  /**
   * 换货单id.
   * @return 换货单id
   */
  public String getExchangeId() {
      return this.exchangeId;
  }

  /**
   * 快递名称.
   * @param expressName 快递名称
   */
  public void setExpressName(String expressName) {
    this.expressName = expressName == null ? null : expressName.trim();
  }

  /**
   * 快递名称.
   * @return 快递名称
   */
  public String getExpressName() {
      return this.expressName;
  }

  /**
   * 快递单号.
   * @param expressNo 快递单号
   */
  public void setExpressNo(String expressNo) {
    this.expressNo = expressNo == null ? null : expressNo.trim();
  }

  /**
   * 快递单号.
   * @return 快递单号
   */
  public String getExpressNo() {
      return this.expressNo;
  }

  /**
   * 赠送的策略id.
   * @param giftStrategyId 赠送的策略id
   */
  public void setGiftStrategyId(Long giftStrategyId) {
    this.giftStrategyId = giftStrategyId;
  }

  /**
   * 赠送的策略id.
   * @return 赠送的策略id
   */
  public Long getGiftStrategyId() {
      return this.giftStrategyId;
  }

  /**
   * 赠送的策略名称.
   * @param giftStrategyName 赠送的策略名称
   */
  public void setGiftStrategyName(String giftStrategyName) {
    this.giftStrategyName = giftStrategyName == null ? null : giftStrategyName.trim();
  }

  /**
   * 赠送的策略名称.
   * @return 赠送的策略名称
   */
  public String getGiftStrategyName() {
      return this.giftStrategyName;
  }

  /**
   * 是否套装明细.
   * @param combinationDetail 是否套装明细
   */
  public void setCombinationDetail(Boolean combinationDetail) {
    this.combinationDetail = combinationDetail;
  }

  /**
   * 是否套装明细.
   * @return 是否套装明细
   */
  public Boolean isCombinationDetail() {
      return this.combinationDetail;
  }

  /**
   * 是否组合商品.
   * @param combination 是否组合商品
   */
  public void setCombination(Boolean combination) {
    this.combination = combination;
  }

  /**
   * 是否组合商品.
   * @return 是否组合商品
   */
  public Boolean isCombination() {
      return this.combination;
  }

  /**
   * 是否已删除.
   * @param deleted 是否已删除
   */
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  /**
   * 是否已删除.
   * @return 是否已删除
   */
  public Boolean isDeleted() {
      return this.deleted;
  }

  /**
   * 是否代发.
   * @param dropShipping 是否代发
   */
  public void setDropShipping(Boolean dropShipping) {
    this.dropShipping = dropShipping;
  }

  /**
   * 是否代发.
   * @return 是否代发
   */
  public Boolean isDropShipping() {
      return this.dropShipping;
  }

  /**
   * 是否赠品.
   * @param gift 是否赠品
   */
  public void setGift(Boolean gift) {
    this.gift = gift;
  }

  /**
   * 是否赠品.
   * @return 是否赠品
   */
  public Boolean isGift() {
      return this.gift;
  }

  /**
   * 是否锁定库存.
   * @param lockStock 是否锁定库存
   */
  public void setLockStock(Boolean lockStock) {
    this.lockStock = lockStock;
  }

  /**
   * 是否锁定库存.
   * @return 是否锁定库存
   */
  public Boolean isLockStock() {
      return this.lockStock;
  }

  /**
   * 是否手工添加.
   * @param manualAdd 是否手工添加
   */
  public void setManualAdd(Boolean manualAdd) {
    this.manualAdd = manualAdd;
  }

  /**
   * 是否手工添加.
   * @return 是否手工添加
   */
  public Boolean isManualAdd() {
      return this.manualAdd;
  }

  /**
   * 是否需要退货.
   * @param needReturnGoods 是否需要退货
   */
  public void setNeedReturnGoods(Boolean needReturnGoods) {
    this.needReturnGoods = needReturnGoods;
  }

  /**
   * 是否需要退货.
   * @return 是否需要退货
   */
  public Boolean isNeedReturnGoods() {
      return this.needReturnGoods;
  }

  /**
   * 是否缺货.
   * @param oos 是否缺货
   */
  public void setOos(Boolean oos) {
    this.oos = oos;
  }

  /**
   * 是否缺货.
   * @return 是否缺货
   */
  public Boolean isOos() {
      return this.oos;
  }

  /**
   * 是否预包装.
   * @param prepackage 是否预包装
   */
  public void setPrepackage(Boolean prepackage) {
    this.prepackage = prepackage;
  }

  /**
   * 是否预包装.
   * @return 是否预包装
   */
  public Boolean isPrepackage() {
      return this.prepackage;
  }

  /**
   * 是否预售有货先发.
   * @param presellPriority 是否预售有货先发
   */
  public void setPresellPriority(Boolean presellPriority) {
    this.presellPriority = presellPriority;
  }

  /**
   * 是否预售有货先发.
   * @return 是否预售有货先发
   */
  public Boolean isPresellPriority() {
      return this.presellPriority;
  }

  /**
   * 是否商品异常.
   * @param productAbnormal 是否商品异常
   */
  public void setProductAbnormal(Boolean productAbnormal) {
    this.productAbnormal = productAbnormal;
  }

  /**
   * 是否商品异常.
   * @return 是否商品异常
   */
  public Boolean isProductAbnormal() {
      return this.productAbnormal;
  }

  /**
   * 是否拆分发货.
   * @param separate 是否拆分发货
   */
  public void setSeparate(Boolean separate) {
    this.separate = separate;
  }

  /**
   * 是否拆分发货.
   * @return 是否拆分发货
   */
  public Boolean isSeparate() {
      return this.separate;
  }

  /**
   * 商城明细id.
   * @param mallDetailId 商城明细id
   */
  public void setMallDetailId(String mallDetailId) {
    this.mallDetailId = mallDetailId == null ? null : mallDetailId.trim();
  }

  /**
   * 商城明细id.
   * @return 商城明细id
   */
  public String getMallDetailId() {
      return this.mallDetailId;
  }

  /**
   * 平台预售发货要求.
   * @param mallPresellDeliveryRequiring 平台预售发货要求
   */
  public void setMallPresellDeliveryRequiring(String mallPresellDeliveryRequiring) {
    this.mallPresellDeliveryRequiring = mallPresellDeliveryRequiring == null ? null : mallPresellDeliveryRequiring.trim();
  }

  /**
   * 平台预售发货要求.
   * @return 平台预售发货要求
   */
  public String getMallPresellDeliveryRequiring() {
      return this.mallPresellDeliveryRequiring;
  }

  /**
   * 商城商品编码.
   * @param mallProductId 商城商品编码
   */
  public void setMallProductId(String mallProductId) {
    this.mallProductId = mallProductId == null ? null : mallProductId.trim();
  }

  /**
   * 商城商品编码.
   * @return 商城商品编码
   */
  public String getMallProductId() {
      return this.mallProductId;
  }

  /**
   * 商城商品名称.
   * @param mallProductName 商城商品名称
   */
  public void setMallProductName(String mallProductName) {
    this.mallProductName = mallProductName == null ? null : mallProductName.trim();
  }

  /**
   * 商城商品名称.
   * @return 商城商品名称
   */
  public String getMallProductName() {
      return this.mallProductName;
  }

  /**
   * 商城商品外部编码.
   * @param mallProductOutCode 商城商品外部编码
   */
  public void setMallProductOutCode(String mallProductOutCode) {
    this.mallProductOutCode = mallProductOutCode == null ? null : mallProductOutCode.trim();
  }

  /**
   * 商城商品外部编码.
   * @return 商城商品外部编码
   */
  public String getMallProductOutCode() {
      return this.mallProductOutCode;
  }

  /**
   * 商城明细状态.
   * @param mallSalesOrderDetailStatus 商城明细状态
   */
  public void setMallSalesOrderDetailStatus(MallSalesOrderDetailStatus mallSalesOrderDetailStatus) {
    this.mallSalesOrderDetailStatus = mallSalesOrderDetailStatus;
  }

  /**
   * 商城明细状态.
   * @return 商城明细状态
   */
  public MallSalesOrderDetailStatus getMallSalesOrderDetailStatus() {
      return this.mallSalesOrderDetailStatus;
  }

  /**
   * 商城规格编码.
   * @param mallSkuId 商城规格编码
   */
  public void setMallSkuId(String mallSkuId) {
    this.mallSkuId = mallSkuId == null ? null : mallSkuId.trim();
  }

  /**
   * 商城规格编码.
   * @return 商城规格编码
   */
  public String getMallSkuId() {
      return this.mallSkuId;
  }

  /**
   * 商城规格名称.
   * @param mallSkuName 商城规格名称
   */
  public void setMallSkuName(String mallSkuName) {
    this.mallSkuName = mallSkuName == null ? null : mallSkuName.trim();
  }

  /**
   * 商城规格名称.
   * @return 商城规格名称
   */
  public String getMallSkuName() {
      return this.mallSkuName;
  }

  /**
   * 商城规格外部编码.
   * @param mallSkuOutCode 商城规格外部编码
   */
  public void setMallSkuOutCode(String mallSkuOutCode) {
    this.mallSkuOutCode = mallSkuOutCode == null ? null : mallSkuOutCode.trim();
  }

  /**
   * 商城规格外部编码.
   * @return 商城规格外部编码
   */
  public String getMallSkuOutCode() {
      return this.mallSkuOutCode;
  }

  /**
   * 更新时间开始.
   * @param modifiedTimeBegin 开始.
   */
  public void setModifiedTimeBegin(LocalDateTime modifiedTimeBegin) {
    this.modifiedTimeBegin = modifiedTimeBegin;
  }

  /**
   * 更新时间开始.
   * @return 更新时间开始
   */
  public LocalDateTime getModifiedTimeBegin() {
    return this.modifiedTimeBegin;
  }

  /**
   * 更新时间结束.
   * @param modifiedTimeEnd 结束
   */
  public void setModifiedTimeEnd(LocalDateTime modifiedTimeEnd) {
    this.modifiedTimeEnd = modifiedTimeEnd;
  }

  /**
   * 更新时间结束.
   * @return 更新时间结束
   */
  public LocalDateTime getModifiedTimeEnd() {
    return this.modifiedTimeEnd;
  }

  /**
   * 订单明细原始明细id.
   * @param originalDetailid 订单明细原始明细id
   */
  public void setOriginalDetailid(Long originalDetailid) {
    this.originalDetailid = originalDetailid;
  }

  /**
   * 订单明细原始明细id.
   * @return 订单明细原始明细id
   */
  public Long getOriginalDetailid() {
      return this.originalDetailid;
  }

  /**
   * 预售发货日期开始.
   * @param presellDeliveryDateBegin 开始.
   */
  public void setPresellDeliveryDateBegin(LocalDate presellDeliveryDateBegin) {
    this.presellDeliveryDateBegin = presellDeliveryDateBegin;
  }

  /**
   * 预售发货日期开始.
   * @return 预售发货日期开始
   */
  public LocalDate getPresellDeliveryDateBegin() {
    return this.presellDeliveryDateBegin;
  }

  /**
   * 预售发货日期结束.
   * @param presellDeliveryDateEnd 结束
   */
  public void setPresellDeliveryDateEnd(LocalDate presellDeliveryDateEnd) {
    this.presellDeliveryDateEnd = presellDeliveryDateEnd;
  }

  /**
   * 预售发货日期结束.
   * @return 预售发货日期结束
   */
  public LocalDate getPresellDeliveryDateEnd() {
    return this.presellDeliveryDateEnd;
  }

  /**
   * 预售id.
   * @param presellId 预售id
   */
  public void setPresellId(Long presellId) {
    this.presellId = presellId;
  }

  /**
   * 预售id.
   * @return 预售id
   */
  public Long getPresellId() {
      return this.presellId;
  }

  /**
   * 商品编码.
   * @param productCode 商品编码
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode == null ? null : productCode.trim();
  }

  /**
   * 商品编码.
   * @return 商品编码
   */
  public String getProductCode() {
      return this.productCode;
  }

  /**
   * 商品id.
   * @param productId 商品id
   */
  public void setProductId(Long productId) {
    this.productId = productId;
  }

  /**
   * 商品id.
   * @return 商品id
   */
  public Long getProductId() {
      return this.productId;
  }

  /**
   * 商品名称.
   * @param productName 商品名称
   */
  public void setProductName(String productName) {
    this.productName = productName == null ? null : productName.trim();
  }

  /**
   * 商品名称.
   * @return 商品名称
   */
  public String getProductName() {
      return this.productName;
  }

  /**
   * 商品类型.
   * @param productType 商品类型
   */
  public void setProductType(ProductType productType) {
    this.productType = productType;
  }

  /**
   * 商品类型.
   * @return 商品类型
   */
  public ProductType getProductType() {
      return this.productType;
  }

  /**
   * 数量.
   * @param quantity 数量
   */
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * 数量.
   * @return 数量
   */
  public Integer getQuantity() {
      return this.quantity;
  }

  /**
   * 明细id.
   * @param salesOrderDetailId 明细id
   */
  public void setSalesOrderDetailId(Long salesOrderDetailId) {
    this.salesOrderDetailId = salesOrderDetailId;
  }

  /**
   * 明细id.
   * @return 明细id
   */
  public Long getSalesOrderDetailId() {
      return this.salesOrderDetailId;
  }

  /**
   * .
   * @param salesOrderDetailIds 
   */
  public void setSalesOrderDetailIds(List<Long> salesOrderDetailIds) {
    this.salesOrderDetailIds = salesOrderDetailIds;
  }

  /**
   * .
   * @return 
   */
  public List<Long> getSalesOrderDetailIds() {
      return this.salesOrderDetailIds;
  }

  /**
   * 退款状态.
   * @param salesOrderDetailRefundStatus 退款状态
   */
  public void setSalesOrderDetailRefundStatus(SalesOrderDetailRefundStatus salesOrderDetailRefundStatus) {
    this.salesOrderDetailRefundStatus = salesOrderDetailRefundStatus;
  }

  /**
   * 退款状态.
   * @return 退款状态
   */
  public SalesOrderDetailRefundStatus getSalesOrderDetailRefundStatus() {
      return this.salesOrderDetailRefundStatus;
  }

  /**
   * 订单明细类型.
   * @param salesOrderDetailType 订单明细类型
   */
  public void setSalesOrderDetailType(SalesOrderDetailType salesOrderDetailType) {
    this.salesOrderDetailType = salesOrderDetailType;
  }

  /**
   * 订单明细类型.
   * @return 订单明细类型
   */
  public SalesOrderDetailType getSalesOrderDetailType() {
      return this.salesOrderDetailType;
  }

  /**
   * 销售单id.
   * @param salesOrderId 销售单id
   */
  public void setSalesOrderId(Long salesOrderId) {
    this.salesOrderId = salesOrderId;
  }

  /**
   * 销售单id.
   * @return 销售单id
   */
  public Long getSalesOrderId() {
      return this.salesOrderId;
  }

  /**
   * 销售金额.
   * @param sellingAmount 销售金额
   */
  public void setSellingAmount(Double sellingAmount) {
    this.sellingAmount = sellingAmount;
  }

  /**
   * 销售金额.
   * @return 销售金额
   */
  public Double getSellingAmount() {
      return this.sellingAmount;
  }

  /**
   * 销售价.
   * @param sellingPrice 销售价
   */
  public void setSellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  /**
   * 销售价.
   * @return 销售价
   */
  public Double getSellingPrice() {
      return this.sellingPrice;
  }

  /**
   * 结算金额.
   * @param settlementAmount 结算金额
   */
  public void setSettlementAmount(Double settlementAmount) {
    this.settlementAmount = settlementAmount;
  }

  /**
   * 结算金额.
   * @return 结算金额
   */
  public Double getSettlementAmount() {
      return this.settlementAmount;
  }

  /**
   * 结算价.
   * @param settlementPrice 结算价
   */
  public void setSettlementPrice(Double settlementPrice) {
    this.settlementPrice = settlementPrice;
  }

  /**
   * 结算价.
   * @return 结算价
   */
  public Double getSettlementPrice() {
      return this.settlementPrice;
  }

  /**
   * 商品规格编码.
   * @param skuCode 商品规格编码
   */
  public void setSkuCode(String skuCode) {
    this.skuCode = skuCode == null ? null : skuCode.trim();
  }

  /**
   * 商品规格编码.
   * @return 商品规格编码
   */
  public String getSkuCode() {
      return this.skuCode;
  }

  /**
   * 商品规格id.
   * @param skuId 商品规格id
   */
  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  /**
   * 商品规格id.
   * @return 商品规格id
   */
  public Long getSkuId() {
      return this.skuId;
  }

  /**
   * 商品规格名称.
   * @param skuName 商品规格名称
   */
  public void setSkuName(String skuName) {
    this.skuName = skuName == null ? null : skuName.trim();
  }

  /**
   * 商品规格名称.
   * @return 商品规格名称
   */
  public String getSkuName() {
      return this.skuName;
  }

  /**
   * 状态.
   * @param status 状态
   */
  public void setStatus(SalesOrderDetailStatus status) {
    this.status = status;
  }

  /**
   * 状态.
   * @return 状态
   */
  public SalesOrderDetailStatus getStatus() {
      return this.status;
  }

  /**
   * 建议发货仓库id.
   * @param suggestVirtualWarehouseId 建议发货仓库id
   */
  public void setSuggestVirtualWarehouseId(Long suggestVirtualWarehouseId) {
    this.suggestVirtualWarehouseId = suggestVirtualWarehouseId;
  }

  /**
   * 建议发货仓库id.
   * @return 建议发货仓库id
   */
  public Long getSuggestVirtualWarehouseId() {
      return this.suggestVirtualWarehouseId;
  }

  /**
   * 建议发货仓库名称.
   * @param suggestVirtualWarehouseName 建议发货仓库名称
   */
  public void setSuggestVirtualWarehouseName(String suggestVirtualWarehouseName) {
    this.suggestVirtualWarehouseName = suggestVirtualWarehouseName == null ? null : suggestVirtualWarehouseName.trim();
  }

  /**
   * 建议发货仓库名称.
   * @return 建议发货仓库名称
   */
  public String getSuggestVirtualWarehouseName() {
      return this.suggestVirtualWarehouseName;
  }

  /**
   * 建议实体仓id.
   * @param suggestWarehouseId 建议实体仓id
   */
  public void setSuggestWarehouseId(Long suggestWarehouseId) {
    this.suggestWarehouseId = suggestWarehouseId;
  }

  /**
   * 建议实体仓id.
   * @return 建议实体仓id
   */
  public Long getSuggestWarehouseId() {
      return this.suggestWarehouseId;
  }

  /**
   * 建议实体仓名称.
   * @param suggestWarehouseName 建议实体仓名称
   */
  public void setSuggestWarehouseName(String suggestWarehouseName) {
    this.suggestWarehouseName = suggestWarehouseName == null ? null : suggestWarehouseName.trim();
  }

  /**
   * 建议实体仓名称.
   * @return 建议实体仓名称
   */
  public String getSuggestWarehouseName() {
      return this.suggestWarehouseName;
  }

  /**
   * 重量.
   * @param weight 重量
   */
  public void setWeight(Double weight) {
    this.weight = weight;
  }

  /**
   * 重量.
   * @return 重量
   */
  public Double getWeight() {
      return this.weight;
  }
}