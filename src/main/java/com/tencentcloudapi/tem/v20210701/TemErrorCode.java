package com.tencentcloudapi.tem.v20210701;
public enum TemErrorCode {
    // 创建服务失败。
     INTERNALERROR_CREATESERVICEERROR("InternalError.CreateServiceError"),
     
    // 应用名已存在。
     INVALIDPARAMETERVALUE_SERVICENAMEDUPLICATEERROR("InvalidParameterValue.ServiceNameDuplicateError"),
     
    // 版本的路由流量不为0。
     INVALIDPARAMETERVALUE_VERSIONROUTERATENOTZERO("InvalidParameterValue.VersionRouteRateNotZero");
     
    private String value;
    private TemErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

