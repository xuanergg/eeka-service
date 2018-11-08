package com.greatonce.oms.domain.enums.stock;

import com.greatonce.core.ValueEnum;

/**
 * StockInOrderStatus
 *
 * @author Shenzhen Greatonce Co Ltd
 * @author ginta
 * @version 2018/5/26
 */
public enum LoanOutStatus implements ValueEnum {
  NO_OUT("未出库", 1),
  PART_OUT("部分出库", 2),
  ALL_OUT("全部出库", 3);

  private final String caption;
  private final int value;

  LoanOutStatus(String caption, int value) {
    this.caption = caption;
    this.value = value;
  }

  @Override
  public int value() {
    return this.value;
  }

  @Override
  public String caption() {
    return this.caption;
  }
}
