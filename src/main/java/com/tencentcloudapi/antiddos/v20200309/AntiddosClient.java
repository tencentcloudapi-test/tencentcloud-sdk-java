/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.antiddos.v20200309;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.antiddos.v20200309.models.*;

public class AntiddosClient extends AbstractClient{
    private static String endpoint = "antiddos.tencentcloudapi.com";
    private static String service = "antiddos";
    private static String version = "2020-03-09";

    public AntiddosClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AntiddosClient(Credential credential, String region, ClientProfile profile) {
        super(AntiddosClient.endpoint, AntiddosClient.version, credential, region, profile);
    }

    /**
     *本接口 (AssociateDDoSEipAddress) 用于将高防弹性公网IP绑定到实例或弹性网卡的指定内网 IP 上。
     * @param req AssociateDDoSEipAddressRequest
     * @return AssociateDDoSEipAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDDoSEipAddressResponse AssociateDDoSEipAddress(AssociateDDoSEipAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateDDoSEipAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateDDoSEipAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateDDoSEipAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (AssociateDDoSEipLoadBalancer) 用于将高防弹性公网IP绑定到负载均衡指定内网 IP 上。
     * @param req AssociateDDoSEipLoadBalancerRequest
     * @return AssociateDDoSEipLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDDoSEipLoadBalancerResponse AssociateDDoSEipLoadBalancer(AssociateDDoSEipLoadBalancerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateDDoSEipLoadBalancerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateDDoSEipLoadBalancerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateDDoSEipLoadBalancer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加DDoS防护的IP黑白名单
     * @param req CreateBlackWhiteIpListRequest
     * @return CreateBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlackWhiteIpListResponse CreateBlackWhiteIpList(CreateBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定IP到高防包实例，支持独享包、共享包；需要注意的是此接口绑定或解绑IP是异步接口，当处于绑定或解绑中时，则不允许再进行绑定或解绑，需要等待当前绑定或解绑完成。
     * @param req CreateBoundIPRequest
     * @return CreateBoundIPResponse
     * @throws TencentCloudSDKException
     */
    public CreateBoundIPResponse CreateBoundIP(CreateBoundIPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBoundIPResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBoundIPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBoundIP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置DDoS防护的AI防护开关
     * @param req CreateDDoSAIRequest
     * @return CreateDDoSAIResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSAIResponse CreateDDoSAI(CreateDDoSAIRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSAIResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSAIResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDDoSAI");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加DDoS防护的区域封禁配置
     * @param req CreateDDoSGeoIPBlockConfigRequest
     * @return CreateDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSGeoIPBlockConfigResponse CreateDDoSGeoIPBlockConfig(CreateDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDDoSGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加DDoS防护的访问限速配置
     * @param req CreateDDoSSpeedLimitConfigRequest
     * @return CreateDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSSpeedLimitConfigResponse CreateDDoSSpeedLimitConfig(CreateDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSSpeedLimitConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSSpeedLimitConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDDoSSpeedLimitConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置单IP默认告警阈值配置
     * @param req CreateDefaultAlarmThresholdRequest
     * @return CreateDefaultAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultAlarmThresholdResponse CreateDefaultAlarmThreshold(CreateDefaultAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefaultAlarmThresholdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDefaultAlarmThresholdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDefaultAlarmThreshold");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置单IP告警阈值配置
     * @param req CreateIPAlarmThresholdConfigRequest
     * @return CreateIPAlarmThresholdConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateIPAlarmThresholdConfigResponse CreateIPAlarmThresholdConfig(CreateIPAlarmThresholdConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIPAlarmThresholdConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIPAlarmThresholdConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIPAlarmThresholdConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量配置L7转发规则的证书供SSL测调用
     * @param req CreateL7RuleCertsRequest
     * @return CreateL7RuleCertsResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RuleCertsResponse CreateL7RuleCerts(CreateL7RuleCertsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RuleCertsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RuleCertsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateL7RuleCerts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加DDoS防护的特征过滤规则
     * @param req CreatePacketFilterConfigRequest
     * @return CreatePacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePacketFilterConfigResponse CreatePacketFilterConfig(CreatePacketFilterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePacketFilterConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePacketFilterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePacketFilterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置DDoS防护的协议封禁配置
     * @param req CreateProtocolBlockConfigRequest
     * @return CreateProtocolBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateProtocolBlockConfigResponse CreateProtocolBlockConfig(CreateProtocolBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProtocolBlockConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProtocolBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProtocolBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个域名，可用于在封堵时调度切换IP
     * @param req CreateSchedulingDomainRequest
     * @return CreateSchedulingDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchedulingDomainResponse CreateSchedulingDomain(CreateSchedulingDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSchedulingDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSchedulingDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSchedulingDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加DDoS防护的水印防护配置
     * @param req CreateWaterPrintConfigRequest
     * @return CreateWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateWaterPrintConfigResponse CreateWaterPrintConfig(CreateWaterPrintConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWaterPrintConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWaterPrintConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWaterPrintConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加DDoS防护的水印防护密钥
     * @param req CreateWaterPrintKeyRequest
     * @return CreateWaterPrintKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateWaterPrintKeyResponse CreateWaterPrintKey(CreateWaterPrintKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWaterPrintKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWaterPrintKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWaterPrintKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除DDoS防护的IP黑白名单
     * @param req DeleteBlackWhiteIpListRequest
     * @return DeleteBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlackWhiteIpListResponse DeleteBlackWhiteIpList(DeleteBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除DDoS防护的区域封禁配置
     * @param req DeleteDDoSGeoIPBlockConfigRequest
     * @return DeleteDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSGeoIPBlockConfigResponse DeleteDDoSGeoIPBlockConfig(DeleteDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDDoSGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDDoSGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除DDoS防护的访问限速配置
     * @param req DeleteDDoSSpeedLimitConfigRequest
     * @return DeleteDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSSpeedLimitConfigResponse DeleteDDoSSpeedLimitConfig(DeleteDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSSpeedLimitConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDDoSSpeedLimitConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDDoSSpeedLimitConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除DDoS防护的特征过滤规则
     * @param req DeletePacketFilterConfigRequest
     * @return DeletePacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePacketFilterConfigResponse DeletePacketFilterConfig(DeletePacketFilterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePacketFilterConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePacketFilterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePacketFilterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除DDoS防护的水印防护配置
     * @param req DeleteWaterPrintConfigRequest
     * @return DeleteWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWaterPrintConfigResponse DeleteWaterPrintConfig(DeleteWaterPrintConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWaterPrintConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWaterPrintConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWaterPrintConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除DDoS防护的水印防护密钥
     * @param req DeleteWaterPrintKeyRequest
     * @return DeleteWaterPrintKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWaterPrintKeyResponse DeleteWaterPrintKey(DeleteWaterPrintKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWaterPrintKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWaterPrintKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWaterPrintKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基础防护攻击状态
     * @param req DescribeBasicDeviceStatusRequest
     * @return DescribeBasicDeviceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicDeviceStatusResponse DescribeBasicDeviceStatus(DescribeBasicDeviceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicDeviceStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicDeviceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBasicDeviceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取业务流量曲线
     * @param req DescribeBizTrendRequest
     * @return DescribeBizTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBizTrendResponse DescribeBizTrend(DescribeBizTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBizTrendResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBizTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBizTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护的IP黑白名单
     * @param req DescribeBlackWhiteIpListRequest
     * @return DescribeBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlackWhiteIpListResponse DescribeBlackWhiteIpList(DescribeBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取CC攻击指标数据，包括总请求峰值(QPS)和攻击请求(QPS)
     * @param req DescribeCCTrendRequest
     * @return DescribeCCTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCTrendResponse DescribeCCTrend(DescribeCCTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCTrendResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS攻击流量带宽和攻击包速率数据
     * @param req DescribeDDoSTrendRequest
     * @return DescribeDDoSTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSTrendResponse DescribeDDoSTrend(DescribeDDoSTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSTrendResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单IP默认告警阈值配置
     * @param req DescribeDefaultAlarmThresholdRequest
     * @return DescribeDefaultAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultAlarmThresholdResponse DescribeDefaultAlarmThreshold(DescribeDefaultAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultAlarmThresholdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultAlarmThresholdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefaultAlarmThreshold");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询与证书ID对于域名匹配的七层规则
     * @param req DescribeL7RulesBySSLCertIdRequest
     * @return DescribeL7RulesBySSLCertIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7RulesBySSLCertIdResponse DescribeL7RulesBySSLCertId(DescribeL7RulesBySSLCertIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7RulesBySSLCertIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7RulesBySSLCertIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeL7RulesBySSLCertId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防IP资产实例列表

     * @param req DescribeListBGPIPInstancesRequest
     * @return DescribeListBGPIPInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBGPIPInstancesResponse DescribeListBGPIPInstances(DescribeListBGPIPInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListBGPIPInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListBGPIPInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListBGPIPInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防包资产实例列表

     * @param req DescribeListBGPInstancesRequest
     * @return DescribeListBGPInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBGPInstancesResponse DescribeListBGPInstances(DescribeListBGPInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListBGPInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListBGPInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListBGPInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护的IP黑白名单列表
     * @param req DescribeListBlackWhiteIpListRequest
     * @return DescribeListBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBlackWhiteIpListResponse DescribeListBlackWhiteIpList(DescribeListBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListBlackWhiteIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListBlackWhiteIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListBlackWhiteIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护的AI防护开关列表
     * @param req DescribeListDDoSAIRequest
     * @return DescribeListDDoSAIResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSAIResponse DescribeListDDoSAI(DescribeListDDoSAIRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListDDoSAIResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListDDoSAIResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListDDoSAI");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护的区域封禁配置列表
     * @param req DescribeListDDoSGeoIPBlockConfigRequest
     * @return DescribeListDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSGeoIPBlockConfigResponse DescribeListDDoSGeoIPBlockConfig(DescribeListDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListDDoSGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListDDoSGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListDDoSGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护的访问限速配置列表
     * @param req DescribeListDDoSSpeedLimitConfigRequest
     * @return DescribeListDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSSpeedLimitConfigResponse DescribeListDDoSSpeedLimitConfig(DescribeListDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListDDoSSpeedLimitConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListDDoSSpeedLimitConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListDDoSSpeedLimitConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单IP告警阈值配置列表
     * @param req DescribeListIPAlarmConfigRequest
     * @return DescribeListIPAlarmConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListIPAlarmConfigResponse DescribeListIPAlarmConfig(DescribeListIPAlarmConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListIPAlarmConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListIPAlarmConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListIPAlarmConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取转发监听器列表
     * @param req DescribeListListenerRequest
     * @return DescribeListListenerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListListenerResponse DescribeListListener(DescribeListListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListListenerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListListenerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListListener");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护的特征过滤规则列表
     * @param req DescribeListPacketFilterConfigRequest
     * @return DescribeListPacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListPacketFilterConfigResponse DescribeListPacketFilterConfig(DescribeListPacketFilterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListPacketFilterConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListPacketFilterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListPacketFilterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取防护阈值配置列表，包括DDoS的AI、等级、CC阈值开关等
     * @param req DescribeListProtectThresholdConfigRequest
     * @return DescribeListProtectThresholdConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListProtectThresholdConfigResponse DescribeListProtectThresholdConfig(DescribeListProtectThresholdConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListProtectThresholdConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListProtectThresholdConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListProtectThresholdConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护的协议封禁配置列表
     * @param req DescribeListProtocolBlockConfigRequest
     * @return DescribeListProtocolBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListProtocolBlockConfigResponse DescribeListProtocolBlockConfig(DescribeListProtocolBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListProtocolBlockConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListProtocolBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListProtocolBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取智能调度域名列表
     * @param req DescribeListSchedulingDomainRequest
     * @return DescribeListSchedulingDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListSchedulingDomainResponse DescribeListSchedulingDomain(DescribeListSchedulingDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListSchedulingDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListSchedulingDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListSchedulingDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护的水印防护配置列表
     * @param req DescribeListWaterPrintConfigRequest
     * @return DescribeListWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListWaterPrintConfigResponse DescribeListWaterPrintConfig(DescribeListWaterPrintConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListWaterPrintConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListWaterPrintConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListWaterPrintConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DisassociateDDoSEipAddress) 用于解绑高防弹性公网IP。
     * @param req DisassociateDDoSEipAddressRequest
     * @return DisassociateDDoSEipAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDDoSEipAddressResponse DisassociateDDoSEipAddress(DisassociateDDoSEipAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateDDoSEipAddressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateDDoSEipAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateDDoSEipAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DDoS防护的区域封禁配置
     * @param req ModifyDDoSGeoIPBlockConfigRequest
     * @return ModifyDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSGeoIPBlockConfigResponse ModifyDDoSGeoIPBlockConfig(ModifyDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSGeoIPBlockConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSGeoIPBlockConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDDoSGeoIPBlockConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DDoS防护的访问限速配置
     * @param req ModifyDDoSSpeedLimitConfigRequest
     * @return ModifyDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSSpeedLimitConfigResponse ModifyDDoSSpeedLimitConfig(ModifyDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSSpeedLimitConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSSpeedLimitConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDDoSSpeedLimitConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改智能解析域名名称
     * @param req ModifyDomainUsrNameRequest
     * @return ModifyDomainUsrNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainUsrNameResponse ModifyDomainUsrName(ModifyDomainUsrNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainUsrNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainUsrNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainUsrName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改边界防护L7转发规则
     * @param req ModifyL7RulesEdgeRequest
     * @return ModifyL7RulesEdgeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7RulesEdgeResponse ModifyL7RulesEdge(ModifyL7RulesEdgeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL7RulesEdgeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL7RulesEdgeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyL7RulesEdge");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DDoS防护的特征过滤规则
     * @param req ModifyPacketFilterConfigRequest
     * @return ModifyPacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPacketFilterConfigResponse ModifyPacketFilterConfig(ModifyPacketFilterConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPacketFilterConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPacketFilterConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPacketFilterConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或关闭DDoS防护的水印防护配置
     * @param req SwitchWaterPrintConfigRequest
     * @return SwitchWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public SwitchWaterPrintConfigResponse SwitchWaterPrintConfig(SwitchWaterPrintConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchWaterPrintConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchWaterPrintConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchWaterPrintConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
