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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel{

    /**
    * 集群Id。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 说明信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 接入点数量
    */
    @SerializedName("EndPointNum")
    @Expose
    private Long EndPointNum;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 集群是否健康，1表示健康，0表示异常
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * 集群健康信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthyInfo")
    @Expose
    private String HealthyInfo;

    /**
    * 集群状态，0:创建中，1:正常，2:删除中，3:已删除，5:创建失败，6: 删除失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 最大命名空间数量
    */
    @SerializedName("MaxNamespaceNum")
    @Expose
    private Long MaxNamespaceNum;

    /**
    * 最大Topic数量
    */
    @SerializedName("MaxTopicNum")
    @Expose
    private Long MaxTopicNum;

    /**
    * 最大QPS
    */
    @SerializedName("MaxQps")
    @Expose
    private Long MaxQps;

    /**
    * 消息保留时间
    */
    @SerializedName("MessageRetentionTime")
    @Expose
    private Long MessageRetentionTime;

    /**
    * 最大存储容量
    */
    @SerializedName("MaxStorageCapacity")
    @Expose
    private Long MaxStorageCapacity;

    /**
     * Get 集群Id。 
     * @return ClusterId 集群Id。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id。
     * @param ClusterId 集群Id。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称。 
     * @return ClusterName 集群名称。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称。
     * @param ClusterName 集群名称。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 说明信息。 
     * @return Remark 说明信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息。
     * @param Remark 说明信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 接入点数量 
     * @return EndPointNum 接入点数量
     */
    public Long getEndPointNum() {
        return this.EndPointNum;
    }

    /**
     * Set 接入点数量
     * @param EndPointNum 接入点数量
     */
    public void setEndPointNum(Long EndPointNum) {
        this.EndPointNum = EndPointNum;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 集群是否健康，1表示健康，0表示异常 
     * @return Healthy 集群是否健康，1表示健康，0表示异常
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 集群是否健康，1表示健康，0表示异常
     * @param Healthy 集群是否健康，1表示健康，0表示异常
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 集群健康信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthyInfo 集群健康信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthyInfo() {
        return this.HealthyInfo;
    }

    /**
     * Set 集群健康信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthyInfo 集群健康信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthyInfo(String HealthyInfo) {
        this.HealthyInfo = HealthyInfo;
    }

    /**
     * Get 集群状态，0:创建中，1:正常，2:删除中，3:已删除，5:创建失败，6: 删除失败 
     * @return Status 集群状态，0:创建中，1:正常，2:删除中，3:已删除，5:创建失败，6: 删除失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态，0:创建中，1:正常，2:删除中，3:已删除，5:创建失败，6: 删除失败
     * @param Status 集群状态，0:创建中，1:正常，2:删除中，3:已删除，5:创建失败，6: 删除失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 最大命名空间数量 
     * @return MaxNamespaceNum 最大命名空间数量
     */
    public Long getMaxNamespaceNum() {
        return this.MaxNamespaceNum;
    }

    /**
     * Set 最大命名空间数量
     * @param MaxNamespaceNum 最大命名空间数量
     */
    public void setMaxNamespaceNum(Long MaxNamespaceNum) {
        this.MaxNamespaceNum = MaxNamespaceNum;
    }

    /**
     * Get 最大Topic数量 
     * @return MaxTopicNum 最大Topic数量
     */
    public Long getMaxTopicNum() {
        return this.MaxTopicNum;
    }

    /**
     * Set 最大Topic数量
     * @param MaxTopicNum 最大Topic数量
     */
    public void setMaxTopicNum(Long MaxTopicNum) {
        this.MaxTopicNum = MaxTopicNum;
    }

    /**
     * Get 最大QPS 
     * @return MaxQps 最大QPS
     */
    public Long getMaxQps() {
        return this.MaxQps;
    }

    /**
     * Set 最大QPS
     * @param MaxQps 最大QPS
     */
    public void setMaxQps(Long MaxQps) {
        this.MaxQps = MaxQps;
    }

    /**
     * Get 消息保留时间 
     * @return MessageRetentionTime 消息保留时间
     */
    public Long getMessageRetentionTime() {
        return this.MessageRetentionTime;
    }

    /**
     * Set 消息保留时间
     * @param MessageRetentionTime 消息保留时间
     */
    public void setMessageRetentionTime(Long MessageRetentionTime) {
        this.MessageRetentionTime = MessageRetentionTime;
    }

    /**
     * Get 最大存储容量 
     * @return MaxStorageCapacity 最大存储容量
     */
    public Long getMaxStorageCapacity() {
        return this.MaxStorageCapacity;
    }

    /**
     * Set 最大存储容量
     * @param MaxStorageCapacity 最大存储容量
     */
    public void setMaxStorageCapacity(Long MaxStorageCapacity) {
        this.MaxStorageCapacity = MaxStorageCapacity;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EndPointNum", this.EndPointNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "HealthyInfo", this.HealthyInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MaxNamespaceNum", this.MaxNamespaceNum);
        this.setParamSimple(map, prefix + "MaxTopicNum", this.MaxTopicNum);
        this.setParamSimple(map, prefix + "MaxQps", this.MaxQps);
        this.setParamSimple(map, prefix + "MessageRetentionTime", this.MessageRetentionTime);
        this.setParamSimple(map, prefix + "MaxStorageCapacity", this.MaxStorageCapacity);

    }
}

