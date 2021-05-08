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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBundle extends AbstractModel{

    /**
    * 更改实例套餐后需要补的差价。
    */
    @SerializedName("ModifyPrice")
    @Expose
    private Price ModifyPrice;

    /**
    * 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li>
    */
    @SerializedName("ModifyBundleState")
    @Expose
    private String ModifyBundleState;

    /**
    * 套餐信息。
    */
    @SerializedName("Bundle")
    @Expose
    private Bundle Bundle;

    /**
     * Get 更改实例套餐后需要补的差价。 
     * @return ModifyPrice 更改实例套餐后需要补的差价。
     */
    public Price getModifyPrice() {
        return this.ModifyPrice;
    }

    /**
     * Set 更改实例套餐后需要补的差价。
     * @param ModifyPrice 更改实例套餐后需要补的差价。
     */
    public void setModifyPrice(Price ModifyPrice) {
        this.ModifyPrice = ModifyPrice;
    }

    /**
     * Get 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li> 
     * @return ModifyBundleState 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li>
     */
    public String getModifyBundleState() {
        return this.ModifyBundleState;
    }

    /**
     * Set 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li>
     * @param ModifyBundleState 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li>
     */
    public void setModifyBundleState(String ModifyBundleState) {
        this.ModifyBundleState = ModifyBundleState;
    }

    /**
     * Get 套餐信息。 
     * @return Bundle 套餐信息。
     */
    public Bundle getBundle() {
        return this.Bundle;
    }

    /**
     * Set 套餐信息。
     * @param Bundle 套餐信息。
     */
    public void setBundle(Bundle Bundle) {
        this.Bundle = Bundle;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ModifyPrice.", this.ModifyPrice);
        this.setParamSimple(map, prefix + "ModifyBundleState", this.ModifyBundleState);
        this.setParamObj(map, prefix + "Bundle.", this.Bundle);

    }
}

