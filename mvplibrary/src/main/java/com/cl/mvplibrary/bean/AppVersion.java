package com.cl.mvplibrary.bean;

import org.litepal.crud.LitePalSupport;

/**
 * 应用版本更新
 */
public class AppVersion extends LitePalSupport {


    /**
     * name : 坏天气
     * version : 1
     * changelog : 更新图标
     * updated_at : 1622481681
     * versionShort : 2.5
     * build : 1
     * installUrl : https://download.jappstore.com/apps/60b3bb940d81cc3df39678cd/install?download_token=78464083743a00f1df849c8ab18c8c61&source=update
     * install_url : https://download.jappstore.com/apps/60b3bb940d81cc3df39678cd/install?download_token=78464083743a00f1df849c8ab18c8c61&source=update
     * direct_install_url : https://download.jappstore.com/apps/60b3bb940d81cc3df39678cd/install?download_token=78464083743a00f1df849c8ab18c8c61&source=update
     * update_url : https://jappstore.com/h265
     * binary : {"fsize":39505911}
     */

    private String name;
    private String version;
    private String changelog;
    private int updated_at;
    private String versionShort;
    private String build;
    private String installUrl;
    private String install_url;
    private String direct_install_url;
    private String update_url;
    private BinaryBean binary;
    private String appSize;

    public String getAppSize() {
        return appSize;
    }

    public void setAppSize(String appSize) {
        this.appSize = appSize;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getChangelog() {
        return changelog;
    }

    public void setChangelog(String changelog) {
        this.changelog = changelog;
    }

    public int getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(int updated_at) {
        this.updated_at = updated_at;
    }

    public String getVersionShort() {
        return versionShort;
    }

    public void setVersionShort(String versionShort) {
        this.versionShort = versionShort;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getInstallUrl() {
        return installUrl;
    }

    public void setInstallUrl(String installUrl) {
        this.installUrl = installUrl;
    }

    public String getInstall_url() {
        return install_url;
    }

    public void setInstall_url(String install_url) {
        this.install_url = install_url;
    }

    public String getDirect_install_url() {
        return direct_install_url;
    }

    public void setDirect_install_url(String direct_install_url) {
        this.direct_install_url = direct_install_url;
    }

    public String getUpdate_url() {
        return update_url;
    }

    public void setUpdate_url(String update_url) {
        this.update_url = update_url;
    }

    public BinaryBean getBinary() {
        return binary;
    }

    public void setBinary(BinaryBean binary) {
        this.binary = binary;
    }

    public static class BinaryBean {
        /**
         * fsize : 39505911
         */

        private int fsize;

        public int getFsize() {
            return fsize;
        }

        public void setFsize(int fsize) {
            this.fsize = fsize;
        }
    }
}
