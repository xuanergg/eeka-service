package com.greatonce.oms.custom.eeka.qimen.custom.response;

import com.greatonce.oms.bridge.wms.qimen.response.OmsQimenCustomResponse;
import java.util.List;

public class EekaReturnNoticeOrderDataResponse extends OmsQimenCustomResponse {

  public EekaReturnNoticeOrderDataResponse(Long requestId) {
    super(requestId);
  }

  public EekaReturnNoticeOrderDataResponse(Long requestId,String message) {
    super(requestId,message);
  }

  private List<String> omsData;

  private String content;

  private String totalSize;

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getTotalSize() {
    return totalSize;
  }

  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
  }

  public List<String> getOmsData() {
    return omsData;
  }

  public void setOmsData(List<String> omsData) {
    this.omsData = omsData;
  }
}
