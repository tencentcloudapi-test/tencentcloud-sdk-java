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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupBound extends AbstractModel{

    /**
    * 执行规则。ACCEPT或DROP
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * ip段。
    */
    @SerializedName("CidrIp")
    @Expose
    private String CidrIp;

    /**
    * 端口范围
    */
    @SerializedName("PortRange")
    @Expose
    private String PortRange;

    /**
    * 传输层协议。tcp，udp或ALL
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 安全组id代表的地址集合
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 地址组id代表的地址集合
    */
    @SerializedName("AddressModule")
    @Expose
    private String AddressModule;

    /**
    * 服务组id代表的协议和端口集合
    */
    @SerializedName("ServiceModule")
    @Expose
    private String ServiceModule;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 执行规则。ACCEPT或DROP 
     * @return Action 执行规则。ACCEPT或DROP
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行规则。ACCEPT或DROP
     * @param Action 执行规则。ACCEPT或DROP
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get ip段。 
     * @return CidrIp ip段。
     */
    public String getCidrIp() {
        return this.CidrIp;
    }

    /**
     * Set ip段。
     * @param CidrIp ip段。
     */
    public void setCidrIp(String CidrIp) {
        this.CidrIp = CidrIp;
    }

    /**
     * Get 端口范围 
     * @return PortRange 端口范围
     */
    public String getPortRange() {
        return this.PortRange;
    }

    /**
     * Set 端口范围
     * @param PortRange 端口范围
     */
    public void setPortRange(String PortRange) {
        this.PortRange = PortRange;
    }

    /**
     * Get 传输层协议。tcp，udp或ALL 
     * @return IpProtocol 传输层协议。tcp，udp或ALL
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 传输层协议。tcp，udp或ALL
     * @param IpProtocol 传输层协议。tcp，udp或ALL
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 安全组id代表的地址集合 
     * @return Id 安全组id代表的地址集合
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 安全组id代表的地址集合
     * @param Id 安全组id代表的地址集合
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 地址组id代表的地址集合 
     * @return AddressModule 地址组id代表的地址集合
     */
    public String getAddressModule() {
        return this.AddressModule;
    }

    /**
     * Set 地址组id代表的地址集合
     * @param AddressModule 地址组id代表的地址集合
     */
    public void setAddressModule(String AddressModule) {
        this.AddressModule = AddressModule;
    }

    /**
     * Get 服务组id代表的协议和端口集合 
     * @return ServiceModule 服务组id代表的协议和端口集合
     */
    public String getServiceModule() {
        return this.ServiceModule;
    }

    /**
     * Set 服务组id代表的协议和端口集合
     * @param ServiceModule 服务组id代表的协议和端口集合
     */
    public void setServiceModule(String ServiceModule) {
        this.ServiceModule = ServiceModule;
    }

    /**
     * Get 描述 
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public SecurityGroupBound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupBound(SecurityGroupBound source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CidrIp != null) {
            this.CidrIp = new String(source.CidrIp);
        }
        if (source.PortRange != null) {
            this.PortRange = new String(source.PortRange);
        }
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AddressModule != null) {
            this.AddressModule = new String(source.AddressModule);
        }
        if (source.ServiceModule != null) {
            this.ServiceModule = new String(source.ServiceModule);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CidrIp", this.CidrIp);
        this.setParamSimple(map, prefix + "PortRange", this.PortRange);
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AddressModule", this.AddressModule);
        this.setParamSimple(map, prefix + "ServiceModule", this.ServiceModule);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

