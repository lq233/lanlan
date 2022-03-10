package com.lq.myapplication.bean;

import java.util.List;

public class FirstHotBean {
    /**
     * data : [{"apkLink":"","audit":1,"author":"扔物线","canEdit":false,"chapterId":249,"chapterName":"干货资源","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":12554,"link":"https://mp.weixin.qq.com/s/d5ju9Vya4Ozx054UPEA7FA","niceDate":"刚刚","niceShareDate":"2020-03-23 16:36","origin":"","prefix":"","projectLink":"","publishTime":1651248000000,"realSuperChapterId":248,"selfVisible":0,"shareDate":1584952597000,"shareUser":"","superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"我又用 Jetpack Compose 做了个示例 App，是怎样的体验？【带源码】","type":1,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>前两天看公众号文章：<br><a href=\"https://mp.weixin.qq.com/s/XHbJ1L5_rdvKs3AjLCvGiA\">分享一个困惑很久的问题：App前台，Activity会被回收吗？<\/a><\/p>\r\n<p>文章中源码分析阶段，看到了一些核心类：<\/p>\r\n<pre><code> ActivityRecord、TaskRecord、ActivityStack、ActivityDisplay、ActivityStackSupervisor\r\n<\/code><\/pre><p>绕起来有点晕。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这些类分别起到什么作用？<\/li>\r\n<li>有什么好的方式帮助记忆吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21681,"link":"https://wanandroid.com/wenda/show/21681","niceDate":"1天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1646723250000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1646659440000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | ActivityRecord、TaskRecord、ActivityStack、ActivityDisplay、ActivityStackSupervisor 分别是干什么的？","type":1,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"享学","canEdit":false,"chapterId":249,"chapterName":"干货资源","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":21379,"link":"https://mp.weixin.qq.com/s/imZc25G009_T60_IFEToKg","niceDate":"1天前","niceShareDate":"2022-02-08 23:50","origin":"","prefix":"","projectLink":"","publishTime":1646723243000,"realSuperChapterId":248,"selfVisible":0,"shareDate":1644335416000,"shareUser":"","superChapterId":249,"superChapterName":"干货资源","tags":[],"title":"调用API就可以完成的需求，为什么总被追着原理问个不停？","type":1,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>正在我们在开发的时候，涉及到需要跨进程通信，尤其是较为复杂的，需要拿到服务端 binder 代理进行交互的方式。<\/p>\r\n<p>一般流程为：<\/p>\r\n<ol>\r\n<li>编写 aidl 文件；<\/li>\r\n<li>实现一个 Service 子类(独立进程)，复写 onBind 方法，返回 Binder&#39;s Stub；<\/li>\r\n<li>主进程通过调用 bindService，间接拿到 binder 驱动，然后实现 binder 通信；<\/li>\r\n<\/ol>\r\n<p>更进一步的说，很多时候，我们也可以不依赖 aidl 文件，自己去实现Stub、Proxy类，利用 binder 驱动通过 transact 方法与服务端 Stub onTransact 进行跨进程交互。<\/p>\r\n<p>但是依然是需要依赖 bindService 方法，去获取 binder驱动。<\/p>\r\n<p>可以参考：<a href=\"https://blog.csdn.net/lmj623565791/article/details/38461079/\">Android aidl Binder框架浅析<\/a><\/p>\r\n<p>不过我们今天的关注点在于：<\/p>\r\n<ol>\r\n<li>可以不通过 bindService ，利用别的方式来传递 \u201cbinder 驱动\u201d来实现跨进程通信吗？<\/li>\r\n<li>framework 层有哪些地方使用了 1 的方式进行通信？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21630,"link":"https://www.wanandroid.com/wenda/show/21630","niceDate":"2022-03-02 00:41","niceShareDate":"2022-03-02 00:40","origin":"","prefix":"","projectLink":"","publishTime":1646152900000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1646152857000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 可以不借助 bindService，实现跨进程 binder 通信吗？","type":1,"userId":2,"visible":1,"zan":7},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前小缘在群里问过这个问题：<\/p>\r\n<p><img src=\"https://wanandroid.com/blogimgs/122c7a4f-12e7-4b59-833b-0a2a1631661d.png\" alt=\"截屏2022-02-10 下午5.27.05.png\" /><\/p>\r\n<blockquote>\r\n<p>先不考虑其实际的使用价值，单纯从技术角度思考，其实也有场景能用上，暂时不表。<\/p>\r\n<\/blockquote>\r\n<p>我细化一下问题：<\/p>\r\n<p>前提类：<\/p>\r\n<pre><code>public class A {\r\n\r\n    private final AInner inner = new AInner();\r\n\r\n    private final class AInner {\r\n\r\n        public void b() {\r\n            Log.d(&quot;tec-hack&quot;, &quot;AInner b invoke&quot;);\r\n        }\r\n    }\r\n}\r\n<\/code><\/pre><p>注意，暂且认为该类是系统类，我们无法在编译期对齐修改。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>如何构造一个AInner的子类对象？<\/li>\r\n<li>完成对A的inner成员变量替换。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21409,"link":"https://wanandroid.com/wenda/show/21409","niceDate":"2022-02-28 00:00","niceShareDate":"2022-02-11 14:21","origin":"","prefix":"","projectLink":"","publishTime":1645977600000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1644560499000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 被声明为private final 的内部类，能生成一个子类对象吗？逆天篡改~","type":1,"userId":2,"visible":1,"zan":10}]
     * errorCode : 0
     * errorMsg :
     */

    private Integer errorCode;
    private String errorMsg;
    private List<DataDTO> data;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        /**
         * apkLink :
         * audit : 1
         * author : 扔物线
         * canEdit : false
         * chapterId : 249
         * chapterName : 干货资源
         * collect : false
         * courseId : 13
         * desc :
         * descMd :
         * envelopePic :
         * fresh : true
         * host :
         * id : 12554
         * link : https://mp.weixin.qq.com/s/d5ju9Vya4Ozx054UPEA7FA
         * niceDate : 刚刚
         * niceShareDate : 2020-03-23 16:36
         * origin :
         * prefix :
         * projectLink :
         * publishTime : 1651248000000
         * realSuperChapterId : 248
         * selfVisible : 0
         * shareDate : 1584952597000
         * shareUser :
         * superChapterId : 249
         * superChapterName : 干货资源
         * tags : []
         * title : 我又用 Jetpack Compose 做了个示例 App，是怎样的体验？【带源码】
         * type : 1
         * userId : -1
         * visible : 1
         * zan : 0
         */

        private String apkLink;
        private Integer audit;
        private String author;
        private Boolean canEdit;
        private Integer chapterId;
        private String chapterName;
        private Boolean collect;
        private Integer courseId;
        private String desc;
        private String descMd;
        private String envelopePic;
        private Boolean fresh;
        private String host;
        private Integer id;
        private String link;
        private String niceDate;
        private String niceShareDate;
        private String origin;
        private String prefix;
        private String projectLink;
        private Long publishTime;
        private Integer realSuperChapterId;
        private Integer selfVisible;
        private Long shareDate;
        private String shareUser;
        private Integer superChapterId;
        private String superChapterName;
        private String title;
        private Integer type;
        private Integer userId;
        private Integer visible;
        private Integer zan;
        private List<?> tags;

        public String getApkLink() {
            return apkLink;
        }

        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }

        public Integer getAudit() {
            return audit;
        }

        public void setAudit(Integer audit) {
            this.audit = audit;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Boolean isCanEdit() {
            return canEdit;
        }

        public void setCanEdit(Boolean canEdit) {
            this.canEdit = canEdit;
        }

        public Integer getChapterId() {
            return chapterId;
        }

        public void setChapterId(Integer chapterId) {
            this.chapterId = chapterId;
        }

        public String getChapterName() {
            return chapterName;
        }

        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }

        public Boolean isCollect() {
            return collect;
        }

        public void setCollect(Boolean collect) {
            this.collect = collect;
        }

        public Integer getCourseId() {
            return courseId;
        }

        public void setCourseId(Integer courseId) {
            this.courseId = courseId;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDescMd() {
            return descMd;
        }

        public void setDescMd(String descMd) {
            this.descMd = descMd;
        }

        public String getEnvelopePic() {
            return envelopePic;
        }

        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }

        public Boolean isFresh() {
            return fresh;
        }

        public void setFresh(Boolean fresh) {
            this.fresh = fresh;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNiceDate() {
            return niceDate;
        }

        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }

        public String getNiceShareDate() {
            return niceShareDate;
        }

        public void setNiceShareDate(String niceShareDate) {
            this.niceShareDate = niceShareDate;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getProjectLink() {
            return projectLink;
        }

        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }

        public Long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(Long publishTime) {
            this.publishTime = publishTime;
        }

        public Integer getRealSuperChapterId() {
            return realSuperChapterId;
        }

        public void setRealSuperChapterId(Integer realSuperChapterId) {
            this.realSuperChapterId = realSuperChapterId;
        }

        public Integer getSelfVisible() {
            return selfVisible;
        }

        public void setSelfVisible(Integer selfVisible) {
            this.selfVisible = selfVisible;
        }

        public Long getShareDate() {
            return shareDate;
        }

        public void setShareDate(Long shareDate) {
            this.shareDate = shareDate;
        }

        public String getShareUser() {
            return shareUser;
        }

        public void setShareUser(String shareUser) {
            this.shareUser = shareUser;
        }

        public Integer getSuperChapterId() {
            return superChapterId;
        }

        public void setSuperChapterId(Integer superChapterId) {
            this.superChapterId = superChapterId;
        }

        public String getSuperChapterName() {
            return superChapterName;
        }

        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getVisible() {
            return visible;
        }

        public void setVisible(Integer visible) {
            this.visible = visible;
        }

        public Integer getZan() {
            return zan;
        }

        public void setZan(Integer zan) {
            this.zan = zan;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }
    }
}
