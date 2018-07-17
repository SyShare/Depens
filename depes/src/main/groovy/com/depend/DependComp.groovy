package com.depend

public class DependComp {
    int compileSdkVersion = 27
    String buildToolsVersion = '27.0.3'

    int minSdkVersion = 16
    int targetSdkVersion = 27
    String supportVersion = '27.0.2'

    String lifecycleVersion = '1.1.1'

    def support_v4() {
        return support_v4(supportVersion)
    }

    def support_v4(String version) {
        return "com.android.support:support-v4:${version}"
    }

    def appcompat_v7() {
        return appcompat_v7(supportVersion)
    }

    def appcompat_v7(String version) {
        return "com.android.support:appcompat-v7:${version}"
    }

    def cardview_v7() {
        return cardview_v7(supportVersion)
    }

    def cardview_v7(String version) {
        return "com.android.support:cardview-v7:${version}"
    }

    def rv_v7() {
        return rv_v7(supportVersion)
    }

    def rv_v7(String version) {
        return "com.android.support:recyclerview-v7:${version}"
    }

    def design() {
        return design(supportVersion)
    }

    def design(String version) {
        return "com.android.support:design:${version}"
    }

    def percent() {
        return percent(supportVersion)
    }

    def percent(String version) {
        return "com.android.support:percent:${version}"
    }

    def constraintLayout() {
        return constraintLayout('latest.release')
    }

    def constraintLayout(String version) {
        return "com.android.support.constraint:constraint-layout:${version}"
    }

    def multidex() {
        return multidex('latest.release')
    }

    def multidex(String version) {
        return "com.android.support:multidex:${version}"
    }

    def gson() {
        return gson('latest.release')
    }

    def gson(String version) {
        return "com.google.code.gson:gson:${version}"
    }

    /**
     * 事件通知库 ==============================
     */
    def eventbus() {
        return eventbus('latest.release')
    }

    def eventbus(String version) {
        return "org.greenrobot:eventbus:${version}"
    }

    def eventbus_apt() {
        return eventbus_apt('latest.release')
    }

    def eventbus_apt(String version) {
        return "org.greenrobot:eventbus-annotation-processor:${version}"
    }

    /**
     * rxjava编码库 ==============================
     */
    @Deprecated
    def rxjava1() {
        return rxjava1('latest.release')
    }

    @Deprecated
    def rxjava1(String version) {
        return "io.reactivex:rxjava:${version}"
    }

    def rxjava2() {
        return rxjava2('latest.release')
    }

    def rxjava2(String version) {
        return "io.reactivex.rxjava2:rxjava:${version}"
    }

    @Deprecated
    def rxandroid1() {
        return rxandroid1('latest.release')
    }

    @Deprecated
    def rxandroid1(String version) {
        return "io.reactivex:rxandroid:${version}"
    }

    def rxandroid2() {
        return rxandroid2('latest.release')
    }

    def rxandroid2(String version) {
        return "io.reactivex.rxjava2:rxandroid:${version}"
    }

    def rxbinding() {
        return rxbinding('latest.release')
    }

    def rxbinding(String version) {
        return "com.jakewharton.rxbinding:rxbinding:${version}"
    }

    /**
     * okhttp网络请求库 ==============================
     */
    def okhttp() {
        return okhttp('latest.release')
    }

    def okhttp(String version) {
        return "com.squareup.okhttp3:okhttp:${version}"
    }

    def okhttp_log() {
        return okhttp_log('latest.release')
    }

    def okhttp_log(String version) {
        return "com.squareup.okhttp3:logging-interceptor:${version}"
    }

    /**
     * retrofit网络请求库 ==============================
     */
    def retrofit() {
        return retrofit('latest.release')
    }

    def retrofit(String version) {
        return "com.squareup.retrofit2:retrofit:${version}"
    }

    def retrofit_rxjava_adapter() {
        return retrofit_rxjava_adapter('latest.release')
    }

    def retrofit_rxjava_adapter(String version) {
        return "com.squareup.retrofit2:adapter-rxjava:${version}"
    }

    def retrofit_gson() {
        return retrofit_gson('latest.release')
    }

    def retrofit_gson(String version) {
        return "com.squareup.retrofit2:converter-gson:${version}"
    }

    def retrofit_scalars() {
        return retrofit_scalars('latest.release')
    }

    def retrofit_scalars(String version) {
        return "com.squareup.retrofit2:converter-scalars:${version}"
    }

    def retrofit_rxjava2_adapter() {
        return retrofit_rxjava2_adapter('latest.release')
    }

    def retrofit_rxjava2_adapter(String version) {
        return "com.squareup.retrofit2:adapter-rxjava2:${version}"
    }

    /**
     * 图片加载 ==============================
     * @return
     */
    def glide() {
        return glide('latest.release')
    }

    def glide(String version) {
        return "com.github.bumptech.glide:glide:${version}"
    }

    def glide_apt() {
        return glide_apt()
    }

    def glide_apt(String version) {
        return "com.github.bumptech.glide:compiler:${version}"
    }

    def glide_okhttp_integration() {
        return glide_okhttp_integration('latest.release')
    }

    def glide_okhttp_integration(String version) {
        return "com.github.bumptech.glide:okhttp3-integration:${version}"
    }

    /**
     * 内存溢出插件 ==============================
     * @return
     */
    def leakcanary_debug() {
        return leakcanary_debug('latest.release')
    }

    def leakcanary_debug(String version) {
        return "com.squareup.leakcanary:leakcanary-android:${version}"
    }

    def leakcanary_release() {
        return leakcanary_release('latest.release')
    }

    def leakcanary_release(String version) {
        return "com.squareup.leakcanary:leakcanary-android-no-op:${version}"
    }

    /**
     * 检测卡顿插件 ==============================
     */
    def blockcanary_debug() {
        return blockcanary_debug('latest.release')
    }

    def blockcanary_debug(String version) {
        return "com.github.markzhai:blockcanary-android:${version}"
    }

    def blockcanary_release() {
        return blockcanary_release('latest.release')
    }

    def blockcanary_release(String version) {
        return "com.github.markzhai:blockcanary-no-op:${version}"
    }

    /**
     * 权限管理 ==============================
     */
    def rxpermission() {
        return rxpermission('latest.release')
    }

    def rxpermission(String version) {
        return "com.tbruyelle.rxpermissions:rxpermissions:${version}"
    }

    /**
     * basequickadapter rv适配器 ==============================
     */
    def baseadapter() {
        return baseadapter('latest.release')
    }

    def baseadapter(String version) {
        return "com.github.CymChad:BaseRecyclerViewAdapterHelper:${version}"
    }

    /**
     * 图片伸缩 ==============================
     */
    def photoview() {
        return photoview('latest.release')
    }

    def photoview(String version) {
        return "com.github.chrisbanes:PhotoView:${version}"
    }

    /**
     * 日志统计 ==============================
     */
    def bugly() {
        return bugly('latest.release')
    }

    def bugly(String version) {
        return "com.tencent.bugly:crashreport:${version}"
    }

    def bugly_native() {
        return bugly_native('latest.release')
    }

    def bugly_native(String version) {
        return "com.tencent.bugly:nativecrashreport:${version}"
    }

    /**
     * 数据库管理 ==============================
     */
    def greendao() {
        return greendao('latest.release')
    }

    def greendao(String version) {
        return "org.greenrobot:greendao:${version}"
    }

    def greendao_apt() {
        return greendao_apt('latest.release')
    }

    def greendao_apt(String version) {
        return "org.greenrobot:greendao-generator:${version}"
    }

    /**
     * 个推 ==============================
     */
    def getui() {
        return getui('latest.release')
    }

    def getui(String version) {
        return "com.getui:sdk:${version}"
    }

    /**
     * 友盟分享 ==============================
     */
    def umeng_analytics() {
        return umeng_analytics('latest.release')
    }

    def umeng_analytics(String version) {
        return "com.umeng.analytics:analytics:${version}"
    }

    /**
     * protobuf ==============================
     */
    def protobuf() {
        return protobuf('latest.release')
    }

    def protobuf(String version) {
        return "com.google.protobuf:protobuf-lite:${version}"
    }

    /**
     * org的commons库 ==============================
     */
    def commons_text() {
        return commons_text('latest.release')
    }

    def commons_text(String version) {
        return "org.apache.commons:commons-text:${version}"
    }

    def commons_io() {
        return commons_io('latest.release')
    }

    def commons_io(String version) {
        return "commons-io:commons-io:${version}"
    }

    /**
     * org的commons库 ==============================
     */
    def walle() {
        return walle('latest.release')
    }

    def walle(String version) {
        return "com.meituan.android.walle:library:${version}"
    }

    /**
     * 腾讯MTA打的插件 ==============================
     */
    def mta() {
        return mta('latest.release')
    }

    def mta(String version) {
        return "com.qq.mta:mta:${version}"
    }

    def mta_mid() {
        return mta_mid('latest.release')
    }

    def mta_mid(String version) {
        return "com.tencent.mid:mid:${version}"
    }

    def mta_visual() {
        return mta_visual('latest.release')
    }

    def mta_visual(String version) {
        return "com.qq.visual:visual:${version}"
    }

    /**
     * lifeCircle 插件集合
     */
    def lifecycle_runtime() {
        return lifecycle_runtime(lifecycleVersion)
    }

    def lifecycle_runtime(String version) {
        return "android.arch.lifecycle:runtime:${version}"
    }

    def lifecycle_compiler() {
        return lifecycle_compiler(lifecycleVersion)
    }

    def lifecycle_compiler(String version) {
        return "android.arch.lifecycle:compiler:${version}"
    }

    def lifecycle_common_java() {
        return lifecycle_compiler(lifecycleVersion)
    }

    def lifecycle_common_java(String version) {
        return "android.arch.lifecycle:common-java8:${version}"
    }

    /**
     * LiveData 、Model
     */
    def lifecycle_extensions() {
        return lifecycle_compiler(lifecycleVersion)
    }

    def lifecycle_extensions(String version) {
        return "android.arch.lifecycle:extensions:${version}"
    }

    def lifecycle_core_testing() {
        return lifecycle_compiler(lifecycleVersion)
    }

    def lifecycle_core_testing(String version) {
        return "android.arch.core:core-testing:${version}"
    }

    def lifecycle_reactivestreams() {
        return lifecycle_compiler(lifecycleVersion)
    }

    def lifecycle_reactivestreams(String version) {
        return "android.arch.lifecycle:reactivestreams:${version}"
    }
}