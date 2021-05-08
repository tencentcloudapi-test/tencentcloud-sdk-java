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

public class DeployServiceV2Request extends AbstractModel{

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 容器端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 初始化 pod 数
    */
    @SerializedName("InitPodNum")
    @Expose
    private Long InitPodNum;

    /**
    * cpu规格
    */
    @SerializedName("CpuSpec")
    @Expose
    private Float CpuSpec;

    /**
    * 内存规格
    */
    @SerializedName("MemorySpec")
    @Expose
    private Float MemorySpec;

    /**
    * 环境ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 镜像仓库
    */
    @SerializedName("ImgRepo")
    @Expose
    private String ImgRepo;

    /**
    * 版本描述信息
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * 启动参数
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 弹性伸缩配置，不传默认不启用弹性伸缩配置
    */
    @SerializedName("EsInfo")
    @Expose
    private EsInfo EsInfo;

    /**
    * 环境变量配置
    */
    @SerializedName("EnvConf")
    @Expose
    private Pair [] EnvConf;

    /**
    * 日志配置
    */
    @SerializedName("LogConfs")
    @Expose
    private String [] LogConfs;

    /**
    * 数据卷配置
    */
    @SerializedName("StorageConfs")
    @Expose
    private StorageConf [] StorageConfs;

    /**
    * 数据卷挂载配置
    */
    @SerializedName("StorageMountConfs")
    @Expose
    private StorageMountConf [] StorageMountConfs;

    /**
    * 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * 包名。使用 JAR 包或者 WAR 包部署的时候必填。
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * 安全组ID s
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 日志输出配置
    */
    @SerializedName("LogOutputConf")
    @Expose
    private LogOutputConf LogOutputConf;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 版本描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 镜像命令
    */
    @SerializedName("ImageCommand")
    @Expose
    private String ImageCommand;

    /**
    * 镜像命令参数
    */
    @SerializedName("ImageArgs")
    @Expose
    private String [] ImageArgs;

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 容器端口 
     * @return ContainerPort 容器端口
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 容器端口
     * @param ContainerPort 容器端口
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 初始化 pod 数 
     * @return InitPodNum 初始化 pod 数
     */
    public Long getInitPodNum() {
        return this.InitPodNum;
    }

    /**
     * Set 初始化 pod 数
     * @param InitPodNum 初始化 pod 数
     */
    public void setInitPodNum(Long InitPodNum) {
        this.InitPodNum = InitPodNum;
    }

    /**
     * Get cpu规格 
     * @return CpuSpec cpu规格
     */
    public Float getCpuSpec() {
        return this.CpuSpec;
    }

    /**
     * Set cpu规格
     * @param CpuSpec cpu规格
     */
    public void setCpuSpec(Float CpuSpec) {
        this.CpuSpec = CpuSpec;
    }

    /**
     * Get 内存规格 
     * @return MemorySpec 内存规格
     */
    public Float getMemorySpec() {
        return this.MemorySpec;
    }

    /**
     * Set 内存规格
     * @param MemorySpec 内存规格
     */
    public void setMemorySpec(Float MemorySpec) {
        this.MemorySpec = MemorySpec;
    }

    /**
     * Get 环境ID 
     * @return NamespaceId 环境ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 环境ID
     * @param NamespaceId 环境ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 镜像仓库 
     * @return ImgRepo 镜像仓库
     */
    public String getImgRepo() {
        return this.ImgRepo;
    }

    /**
     * Set 镜像仓库
     * @param ImgRepo 镜像仓库
     */
    public void setImgRepo(String ImgRepo) {
        this.ImgRepo = ImgRepo;
    }

    /**
     * Get 版本描述信息 
     * @return VersionDesc 版本描述信息
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set 版本描述信息
     * @param VersionDesc 版本描述信息
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get 启动参数 
     * @return JvmOpts 启动参数
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set 启动参数
     * @param JvmOpts 启动参数
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get 弹性伸缩配置，不传默认不启用弹性伸缩配置 
     * @return EsInfo 弹性伸缩配置，不传默认不启用弹性伸缩配置
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set 弹性伸缩配置，不传默认不启用弹性伸缩配置
     * @param EsInfo 弹性伸缩配置，不传默认不启用弹性伸缩配置
     */
    public void setEsInfo(EsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get 环境变量配置 
     * @return EnvConf 环境变量配置
     */
    public Pair [] getEnvConf() {
        return this.EnvConf;
    }

    /**
     * Set 环境变量配置
     * @param EnvConf 环境变量配置
     */
    public void setEnvConf(Pair [] EnvConf) {
        this.EnvConf = EnvConf;
    }

    /**
     * Get 日志配置 
     * @return LogConfs 日志配置
     */
    public String [] getLogConfs() {
        return this.LogConfs;
    }

    /**
     * Set 日志配置
     * @param LogConfs 日志配置
     */
    public void setLogConfs(String [] LogConfs) {
        this.LogConfs = LogConfs;
    }

    /**
     * Get 数据卷配置 
     * @return StorageConfs 数据卷配置
     */
    public StorageConf [] getStorageConfs() {
        return this.StorageConfs;
    }

    /**
     * Set 数据卷配置
     * @param StorageConfs 数据卷配置
     */
    public void setStorageConfs(StorageConf [] StorageConfs) {
        this.StorageConfs = StorageConfs;
    }

    /**
     * Get 数据卷挂载配置 
     * @return StorageMountConfs 数据卷挂载配置
     */
    public StorageMountConf [] getStorageMountConfs() {
        return this.StorageMountConfs;
    }

    /**
     * Set 数据卷挂载配置
     * @param StorageMountConfs 数据卷挂载配置
     */
    public void setStorageMountConfs(StorageMountConf [] StorageMountConfs) {
        this.StorageMountConfs = StorageMountConfs;
    }

    /**
     * Get 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署 
     * @return DeployMode 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署
     * @param DeployMode 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。 
     * @return DeployVersion 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。
     * @param DeployVersion 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get 包名。使用 JAR 包或者 WAR 包部署的时候必填。 
     * @return PkgName 包名。使用 JAR 包或者 WAR 包部署的时候必填。
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set 包名。使用 JAR 包或者 WAR 包部署的时候必填。
     * @param PkgName 包名。使用 JAR 包或者 WAR 包部署的时候必填。
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。 
     * @return JdkVersion JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。
     * @param JdkVersion JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    /**
     * Get 安全组ID s 
     * @return SecurityGroupIds 安全组ID s
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID s
     * @param SecurityGroupIds 安全组ID s
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 日志输出配置 
     * @return LogOutputConf 日志输出配置
     */
    public LogOutputConf getLogOutputConf() {
        return this.LogOutputConf;
    }

    /**
     * Set 日志输出配置
     * @param LogOutputConf 日志输出配置
     */
    public void setLogOutputConf(LogOutputConf LogOutputConf) {
        this.LogOutputConf = LogOutputConf;
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
     * Get 版本描述 
     * @return Description 版本描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述
     * @param Description 版本描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 镜像命令 
     * @return ImageCommand 镜像命令
     */
    public String getImageCommand() {
        return this.ImageCommand;
    }

    /**
     * Set 镜像命令
     * @param ImageCommand 镜像命令
     */
    public void setImageCommand(String ImageCommand) {
        this.ImageCommand = ImageCommand;
    }

    /**
     * Get 镜像命令参数 
     * @return ImageArgs 镜像命令参数
     */
    public String [] getImageArgs() {
        return this.ImageArgs;
    }

    /**
     * Set 镜像命令参数
     * @param ImageArgs 镜像命令参数
     */
    public void setImageArgs(String [] ImageArgs) {
        this.ImageArgs = ImageArgs;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "InitPodNum", this.InitPodNum);
        this.setParamSimple(map, prefix + "CpuSpec", this.CpuSpec);
        this.setParamSimple(map, prefix + "MemorySpec", this.MemorySpec);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ImgRepo", this.ImgRepo);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamArrayObj(map, prefix + "EnvConf.", this.EnvConf);
        this.setParamArraySimple(map, prefix + "LogConfs.", this.LogConfs);
        this.setParamArrayObj(map, prefix + "StorageConfs.", this.StorageConfs);
        this.setParamArrayObj(map, prefix + "StorageMountConfs.", this.StorageMountConfs);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "LogOutputConf.", this.LogOutputConf);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ImageCommand", this.ImageCommand);
        this.setParamArraySimple(map, prefix + "ImageArgs.", this.ImageArgs);

    }
}

