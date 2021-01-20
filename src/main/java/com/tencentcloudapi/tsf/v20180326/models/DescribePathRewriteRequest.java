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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePathRewriteRequest extends AbstractModel{

    /**
    * 路径重写规则ID
    */
    @SerializedName("PathRewriteId")
    @Expose
    private String PathRewriteId;

    /**
     * Get 路径重写规则ID 
     * @return PathRewriteId 路径重写规则ID
     */
    public String getPathRewriteId() {
        return this.PathRewriteId;
    }

    /**
     * Set 路径重写规则ID
     * @param PathRewriteId 路径重写规则ID
     */
    public void setPathRewriteId(String PathRewriteId) {
        this.PathRewriteId = PathRewriteId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PathRewriteId", this.PathRewriteId);

    }
}

