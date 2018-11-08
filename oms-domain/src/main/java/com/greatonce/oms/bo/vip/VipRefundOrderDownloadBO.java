package com.greatonce.oms.bo.vip;

import java.time.LocalDateTime;

/**
 * 唯品下载BO.
 *
 * @author ginta
 * @author Shenzhen Greatonce Co Ltd
 * @version 2018-08-03
 */
public class VipRefundOrderDownloadBO {

  private Long storeId;
  private String outerCode;
  private LocalDateTime createdTimeBegin;
  private LocalDateTime createdTimeEnd;

  public Long getStoreId() {
    return storeId;
  }

  public void setStoreId(Long storeId) {
    this.storeId = storeId;
  }

  public String getOuterCode() {
    return outerCode;
  }

  public void setOuterCode(String outerCode) {
    this.outerCode = outerCode;
  }

  public LocalDateTime getCreatedTimeBegin() {
    return createdTimeBegin;
  }

  public void setCreatedTimeBegin(LocalDateTime createdTimeBegin) {
    this.createdTimeBegin = createdTimeBegin;
  }

  public LocalDateTime getCreatedTimeEnd() {
    return createdTimeEnd;
  }

  public void setCreatedTimeEnd(LocalDateTime createdTimeEnd) {
    this.createdTimeEnd = createdTimeEnd;
  }
}
