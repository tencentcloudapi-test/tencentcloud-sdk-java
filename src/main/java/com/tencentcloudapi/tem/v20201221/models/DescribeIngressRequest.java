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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIngressRequest extends AbstractModel{

    /**
    * tem namespaceId
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * eks namespace 名
    */
    @SerializedName("EksNamespace")
    @Expose
    private String EksNamespace;

    /**
    * ingress 规则名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
     * Get tem namespaceId 
     * @return NamespaceId tem namespaceId
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set tem namespaceId
     * @param NamespaceId tem namespaceId
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get eks namespace 名 
     * @return EksNamespace eks namespace 名
     */
    public String getEksNamespace() {
        return this.EksNamespace;
    }

    /**
     * Set eks namespace 名
     * @param EksNamespace eks namespace 名
     */
    public void setEksNamespace(String EksNamespace) {
        this.EksNamespace = EksNamespace;
    }

    /**
     * Get ingress 规则名 
     * @return Name ingress 规则名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set ingress 规则名
     * @param Name ingress 规则名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "EksNamespace", this.EksNamespace);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);

    }
}

