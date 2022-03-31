package com.lq.myapplication.bean;

import java.util.List;

public class WenDaBean {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>前两天看公众号文章：<br><a href=\"https://mp.weixin.qq.com/s/XHbJ1L5_rdvKs3AjLCvGiA\">分享一个困惑很久的问题：App前台，Activity会被回收吗？<\/a><\/p>\r\n<p>文章中源码分析阶段，看到了一些核心类：<\/p>\r\n<pre><code> ActivityRecord、TaskRecord、ActivityStack、ActivityDisplay、ActivityStackSupervisor\r\n<\/code><\/pre><p>绕起来有点晕。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这些类分别起到什么作用？<\/li>\r\n<li>有什么好的方式帮助记忆吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":true,"host":"","id":21681,"link":"https://wanandroid.com/wenda/show/21681","niceDate":"1天前","niceShareDate":"2022-03-07 21:24","origin":"","prefix":"","projectLink":"","publishTime":1647332538000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1646659440000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | ActivityRecord、TaskRecord、ActivityStack、ActivityDisplay、ActivityStackSupervisor 分别是干什么的？","type":1,"userId":2,"visible":1,"zan":11},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>正在我们在开发的时候，涉及到需要跨进程通信，尤其是较为复杂的，需要拿到服务端 binder 代理进行交互的方式。<\/p>\r\n<p>一般流程为：<\/p>\r\n<ol>\r\n<li>编写 aidl 文件；<\/li>\r\n<li>实现一个 Service 子类(独立进程)，复写 onBind 方法，返回 Binder&#39;s Stub；<\/li>\r\n<li>主进程通过调用 bindService，间接拿到 binder 驱动，然后实现 binder 通信；<\/li>\r\n<\/ol>\r\n<p>更进一步的说，很多时候，我们也可以不依赖 aidl 文件，自己去实现Stub、Proxy类，利用 binder 驱动通过 transact 方法与服务端 Stub onTransact 进行跨进程交互。<\/p>\r\n<p>但是依然是需要依赖 bindService 方法，去获取 binder驱动。<\/p>\r\n<p>可以参考：<a href=\"https://blog.csdn.net/lmj623565791/article/details/38461079/\">Android aidl Binder框架浅析<\/a><\/p>\r\n<p>不过我们今天的关注点在于：<\/p>\r\n<ol>\r\n<li>可以不通过 bindService ，利用别的方式来传递 \u201cbinder 驱动\u201d来实现跨进程通信吗？<\/li>\r\n<li>framework 层有哪些地方使用了 1 的方式进行通信？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21630,"link":"https://www.wanandroid.com/wenda/show/21630","niceDate":"2022-03-02 00:41","niceShareDate":"2022-03-02 00:40","origin":"","prefix":"","projectLink":"","publishTime":1646152900000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1646152857000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 可以不借助 bindService，实现跨进程 binder 通信吗？","type":1,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前小缘在群里问过这个问题：<\/p>\r\n<p><img src=\"https://wanandroid.com/blogimgs/122c7a4f-12e7-4b59-833b-0a2a1631661d.png\" alt=\"截屏2022-02-10 下午5.27.05.png\" /><\/p>\r\n<blockquote>\r\n<p>先不考虑其实际的使用价值，单纯从技术角度思考，其实也有场景能用上，暂时不表。<\/p>\r\n<\/blockquote>\r\n<p>我细化一下问题：<\/p>\r\n<p>前提类：<\/p>\r\n<pre><code>public class A {\r\n\r\n    private final AInner inner = new AInner();\r\n\r\n    private final class AInner {\r\n\r\n        public void b() {\r\n            Log.d(&quot;tec-hack&quot;, &quot;AInner b invoke&quot;);\r\n        }\r\n    }\r\n}\r\n<\/code><\/pre><p>注意，暂且认为该类是系统类，我们无法在编译期对齐修改。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>如何构造一个AInner的子类对象？<\/li>\r\n<li>完成对A的inner成员变量替换。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21409,"link":"https://wanandroid.com/wenda/show/21409","niceDate":"2022-02-28 00:00","niceShareDate":"2022-02-11 14:21","origin":"","prefix":"","projectLink":"","publishTime":1645977600000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1644560499000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 被声明为private final 的内部类，能生成一个子类对象吗？逆天篡改~","type":1,"userId":2,"visible":1,"zan":11},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前有聊过：<a href=\"https://www.wanandroid.com/wenda/show/18615\">每日一问 | 我们经常说到的 Android 脱糖指的是什么？<\/a>  已经有同学提到可能会影响到编译期间 Transform 的编写。<\/p>\r\n<p>今天就来详细了解下，例如比较常见的需求：<\/p>\r\n<p><strong>在编译期间通过字节码处理View防止重复点击<\/strong><\/p>\r\n<ol>\r\n<li>在该案例下，需要了解脱糖的时机以及流程么？<\/li>\r\n<li>脱糖对该案例会造成什么样的影响？<\/li>\r\n<li>对于导致的问题，如何处理呢？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20946,"link":"https://www.wanandroid.com/wenda/show/20946","niceDate":"2022-03-07 21:26","niceShareDate":"2021-12-25 18:39","origin":"","prefix":"","projectLink":"","publishTime":1646659580000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1640428781000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 脱糖对于Android 打包期间插桩的有什么影响？","type":0,"userId":2,"visible":0,"zan":1},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在我们学习 Java类加载流程的时候，一般都会提到：<\/p>\r\n<p>加载 -&gt; 连接 -&gt; 初始化 三个过程。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这三个过程中每个环节主要做哪些事？<\/li>\r\n<li>.class vs Class.forName() vs loadClass()  这三者有什么不同？可以结合三个过程来描述<\/li>\r\n<li>Android 中类加载有个 verify class的过程上述哪个流程会触发？什么情况下会出现 verify class error 情况？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21251,"link":"https://www.wanandroid.com/wenda/show/21251","niceDate":"2022-02-11 14:22","niceShareDate":"2022-01-19 00:51","origin":"","prefix":"","projectLink":"","publishTime":1644560546000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1642524702000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 .class vs Class.forName() vs loadClass() 类加载傻傻分不清楚？","type":0,"userId":2,"visible":1,"zan":1},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在上一问中：<\/p>\r\n<p><a href=\"https://wanandroid.com/wenda/show/20535\">每日一问 | android hidden api 不是禁用反射，以及如何突破，「元反射」不行了？<\/a><\/p>\r\n<p>中，我也从中学到了很多，其实我预期的答案是小缘所回来的。但是，其他同学的回答完全超出预期，尤其是这个库<a href=\"https://github.com/LSPosed/AndroidHiddenApiBypass\">https://github.com/LSPosed/AndroidHiddenApiBypass<\/a> 里面的 UnSafe 操作太秀了。<\/p>\r\n<p>刚哥也提到 stub api 的方式，也能某些情况下解决问题。<\/p>\r\n<p>忽然想到一个问题：<\/p>\r\n<p>如果一个接口是 hidden 的，我们是否可以构造出其实现类？如果可以，有几种方式呢？<\/p>\r\n<p>更后，我们团队一直在招人，欢迎联系<a href=\"https://wanandroid.com/blog/show/2949\">招聘要求<\/a><\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20867,"link":"https://www.wanandroid.com/wenda/show/20867","niceDate":"2022-02-08 23:51","niceShareDate":"2021-12-19 17:15","origin":"","prefix":"","projectLink":"","publishTime":1644335483000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1639905347000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  | 如何构造一个 hide interface 的实现类？","type":0,"userId":2,"visible":1,"zan":2},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>出这个问题有两个原因：<\/p>\r\n<ol>\r\n<li>之前在公众号推文，很多同学认为android 9之后只要是反射都不被允许了，希望拨正这个观念；<\/li>\r\n<li>虽然已经有很多好文提到android hidden api如何突破，但是大多是都是基于android 9来测试的，实际上随着targetSDKVersion的提升，很多方案都失效了，包括「反射的反射」这个方案，所以我觉得还是可以讨论下；<\/li>\r\n<\/ol>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>hidden api是指不让使用反射吗？<\/li>\r\n<li>hidden api list在每个系统版本上，怎么知道哪些api被限制反射使用呢？<\/li>\r\n<li>hidden api 官方的限制思路是怎么样的？<\/li>\r\n<li>目前市面上突破android hidden api的方案，能够支持targetSDKVersion 提升到android 10 , 11, 12吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20535,"link":"https://wanandroid.com/wenda/show/20535","niceDate":"2022-02-08 23:51","niceShareDate":"2021-11-19 11:57","origin":"","prefix":"","projectLink":"","publishTime":1644335474000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1637294221000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | android hidden api 不是禁用反射，以及如何突破，「元反射」不行了？","type":0,"userId":2,"visible":1,"zan":21},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>Gson大家一定不陌生，在很多项目中都大规模使用。<\/p>\r\n<p>例如常见的：<\/p>\r\n<pre><code>网络请求\r\n    -&gt;返回Json数据\r\n    -&gt;Gson解析为对象\r\n    -&gt;渲染页面\r\n<\/code><\/pre><p>很多时候，历史项目包含很多Gson解析对象在UI线程的操作，或者说即使在子线程其实也会影响页面展现速度。<\/p>\r\n<p>大家都了解Gson对于对象的解析，如果不单独的配置TypeAdapter，那么其实内部是充满反射的。<\/p>\r\n<p>问题来了：<\/p>\r\n<p><strong>有没有什么低侵入的方案可以尽可能去除反射操作，从而提升运行效率？描述思路即可。<\/strong><\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":19623,"link":"https://wanandroid.com/wenda/show/19623","niceDate":"2021-12-02 00:50","niceShareDate":"2021-08-30 21:36","origin":"","prefix":"","projectLink":"","publishTime":1638377423000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1630330596000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Gson中序列化对象的操作有低侵入的优化方案吗？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>今天意外在崩溃上报平台发现一个异常为UndeclaredThrowableException，看名字就比较好奇，大家可以搜索下，尝试回答：<\/p>\r\n<ol>\r\n<li>什么时候会抛出此异常？<\/li>\r\n<li>为什么[1]中重新封装为此异常抛出，这么设计的原因是？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20514,"link":"https://www.wanandroid.com/wenda/show/20514","niceDate":"2021-12-02 00:50","niceShareDate":"2021-11-17 00:56","origin":"","prefix":"","projectLink":"","publishTime":1638377410000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1637081819000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 UndeclaredThrowableException 是什么异常？","type":0,"userId":2,"visible":1,"zan":2},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>问题如题：<\/p>\r\n<p>ViewGroup 的 measureChild 方法和 measureChildWithMargins 方法的区别是什么，如何在实际开发中决定选择使用哪一个？<\/p>\r\n<p>来源：<a href=\"https://wanandroid.com/wenda/show/8857?fid=833&amp;date=2021_10_12_09_13_15&amp;message=ViewGroup#msg_id2204\">可以从这里提问<\/a>，欢迎大家踊跃提问~<\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20130,"link":"https://wanandroid.com/wenda/show/20130","niceDate":"2021-12-02 00:50","niceShareDate":"2021-10-12 20:20","origin":"","prefix":"","projectLink":"","publishTime":1638377400000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1634041255000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"【大家提问】 | ViewGroup 的 measureChild 方法和 measureChildWithMargins 方法的区别是什么？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>关于 Activity 重建，我们探究几个问题：<\/p>\r\n<ol>\r\n<li>当前 app 正在前台运行，不在栈顶的 Activity 有可能会因为系统资源，例如内存等不足回收吗？<\/li>\r\n<li>当 app 处于后台运行，app 进程未被杀死，其内部的 Activity 会被回收吗？<\/li>\r\n<li>当 app 处于后台运行，app 的进程会被杀死吗？<\/li>\r\n<\/ol>\r\n<p>如果有能力，建议解释过程中可以配合源码，不一定要全部答出来~<\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18965,"link":"https://www.wanandroid.com/wenda/show/18965","niceDate":"2021-08-30 21:37","niceShareDate":"2021-07-15 00:27","origin":"","prefix":"","projectLink":"","publishTime":1630330636000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1626280047000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 关于 Activity 重建，值得探究的几个问题","type":0,"userId":2,"visible":1,"zan":19},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>了解应用启动相关代码的同学一定知道：<\/p>\r\n<p>我们的应用启动时，每个进程会对应一个ActivityThread对象，而Application对象在正常情况下也是每个进程只有一个？<\/p>\r\n<p>但是如果你看ActivityThread的源码，你会发现：<\/p>\r\n<pre><code>public final class ActivityThread {\r\n    final ArrayList&lt;Application&gt; mAllApplications\r\n                = new ArrayList&lt;Application&gt;();\r\n    ...\r\n}\r\n<\/code><\/pre><p><a href=\"https://cs.android.com/android/platform/superproject/+/master:frameworks/base/core/java/android/app/ActivityThread.java;l=237?q=ActivitYtHREAD&amp;sq=&amp;ss=android%2Fplatform%2Fsuperproject\">源码直达<\/a><\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>什么情况下一个ActivityThread对象，会对应多个Application对象，即mAllApplications.size() &gt; 1；<\/li>\r\n<li>如果找到了1的情况，支持这个目的是？<\/li>\r\n<\/ol>\r\n<blockquote>\r\n<p>本问题归因为好奇，硬说使用场景在一些插件化中会尝试构造Application会调用这个，但是这个肯定不是google的本意。<\/p>\r\n<\/blockquote>","descMd":"","envelopePic":"","fresh":false,"host":"","id":19550,"link":"https://wanandroid.com/wenda/show/19550","niceDate":"2021-08-30 21:36","niceShareDate":"2021-08-25 18:10","origin":"","prefix":"","projectLink":"","publishTime":1630330617000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1629886237000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 好奇ActivityThread中为什么会有一个 Application的集合？","type":0,"userId":2,"visible":1,"zan":6},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>今天我们来讨论下 Jetpack 中的 ViewModel:<\/p>\r\n<p>大家都知道 ViewModel 有一个特点就是能够在 Activity 发生重建时做数据的恢复。<\/p>\r\n<p>我们就针对这个「重建」与「恢复」问一些问题：<\/p>\r\n<ol>\r\n<li>ViewModel 在 Activity 发生旋转等配置发生变化所导致的重建，能恢复数据吗？<\/li>\r\n<li>如果 1 能，尝试从源码角度分析，数据存在哪？怎么存储的？怎么读取的？<\/li>\r\n<li>当 Activity 切换到后台，被系统杀死（进程存活），此时回到 Activity 导致的重建，ViewModel 的数据能恢复吗？为什么？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18930,"link":"https://www.wanandroid.com/wenda/show/18930","niceDate":"2021-08-25 18:11","niceShareDate":"2021-07-11 22:05","origin":"","prefix":"","projectLink":"","publishTime":1629886294000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1626012349000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | ViewModel 在什么情况下的「销毁重建」能够对数据进行无缝恢复？","type":0,"userId":2,"visible":1,"zan":30},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在我们的印象里，如果构造一个 Dialog 传入一个非 Activiy 的 context，则可能会出现 bad token exception。<\/p>\r\n<p>今天我们就来彻底搞清楚这一块，问题来了：<\/p>\r\n<ol>\r\n<li>为什么传入一个非 Activity 的 context 会出现错误？<\/li>\r\n<li>传入的 context 一定要是 Activity 吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18281,"link":"https://www.wanandroid.com/wenda/show/18281","niceDate":"2021-07-11 22:06","niceShareDate":"2021-05-13 00:20","origin":"","prefix":"","projectLink":"","publishTime":1626012414000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1620836414000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Dialog 的构造方法的 context 必须传入 Activity吗？","type":0,"userId":2,"visible":1,"zan":23},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>更近一直在补一些 C/C++的知识，导致 Android 相关知识看的少了，导致每日一问憋半天憋不出来。<\/p>\r\n<p>还好，我又更新了...<\/p>\r\n<p>之前公众号推文的时候，推送到混淆的时候，经常会说到「脱糖」，也有同学在留言区问什么是脱糖呀？<\/p>\r\n<p>今天的问题就是为了带大家彻底搞清楚什么是脱糖：<\/p>\r\n<ol>\r\n<li>脱糖产生的原因是什么？<\/li>\r\n<li>脱糖在 D8 产生后发生了什么变化？<\/li>\r\n<li>脱糖我们需要关注吗？在我们做什么事情的时候可能会影响到呢？<\/li>\r\n<\/ol>\r\n<p>求解答~<\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18615,"link":"https://www.wanandroid.com/wenda/show/18615","niceDate":"2021-07-11 22:06","niceShareDate":"2021-06-14 22:56","origin":"","prefix":"","projectLink":"","publishTime":1626012397000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1623682607000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 我们经常说到的 Android 脱糖指的是什么？","type":0,"userId":2,"visible":1,"zan":14},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>更近聊到一种编译优化的方案，号称秒级别：<\/p>\r\n<ol>\r\n<li>每次拿到修改 java 文件，编译为 class；<\/li>\r\n<li>将 1 中的 class 转成 dex；<\/li>\r\n<li>push 到 sdcard，然后重启生效；<\/li>\r\n<\/ol>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>第一步中将特定的 Java 文件转成 class 如何操作？如何极快的操作？<\/li>\r\n<li>如果是 kotlin 文件呢？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18453,"link":"https://www.wanandroid.com/wenda/show/18453","niceDate":"2021-07-11 22:06","niceShareDate":"2021-05-28 00:28","origin":"","prefix":"","projectLink":"","publishTime":1626012386000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1622132918000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 极致的编译优化如何实现？ [更新]","type":0,"userId":2,"visible":1,"zan":12},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前看文章，经常看到一些分析 Dialog、PopupWindow的文章，有些文章分析如下：<\/p>\r\n<p><strong>Dialog有自己独立的Window，而PopupWindow没有，所以PopupWindow可以称之为子窗口，而 Dialog不是。<\/strong><\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这种说法合理吗？<\/li>\r\n<li>在Android中，有没有子窗口的概念呢？如果有到底应该以什么为标准呢？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18192,"link":"https://wanandroid.com/wenda/show/18192","niceDate":"2021-05-28 00:29","niceShareDate":"2021-05-06 00:15","origin":"","prefix":"","projectLink":"","publishTime":1622132956000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1620231346000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Android中的子窗口到底指的是什么？","type":0,"userId":2,"visible":1,"zan":16},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>对于 Intent 大家肯定都不陌生，今天我们聊一聊它的一个近亲：<strong>PendingIntent<\/strong><\/p>\r\n<p>官方对其描述为：<\/p>\r\n<p>A description of an Intent and target action to perform with it. <\/p>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>PendingIntent 仅仅是对 Intent 的一个封装吗？<\/li>\r\n<li>如果1 不是，那么为什么 PendingIntent与 Intent 有何不同，它的定位是什么样的呢？<\/li>\r\n<li>对于 2 的回答，如果从源码侧佐证？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18072,"link":"https://www.wanandroid.com/wenda/show/18072","niceDate":"2021-05-28 00:29","niceShareDate":"2021-04-24 22:58","origin":"","prefix":"","projectLink":"","publishTime":1622132946000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1619276317000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 已经有了 Intent，那为啥还要 PendingIntent?","type":0,"userId":2,"visible":1,"zan":8},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>正常大家都清楚，当我们view发生一些必须要重新测量才能生效的属性的时候，我们会尝试触发view.requestLayout从而让整个view树发生重新测量与布局。<\/p>\r\n<p>今天的问题是:<\/p>\r\n<ol>\r\n<li>假设requestLayout的调用发生在灭屏/切home之后会立即触发吗？<\/li>\r\n<li>如果1不会立即触发，当我们回到应用，会自动重新触发一次requestLayout吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17956,"link":"https://wanandroid.com/wenda/show/17956","niceDate":"2021-05-06 00:16","niceShareDate":"2021-04-15 14:40","origin":"","prefix":"","projectLink":"","publishTime":1620231413000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1618468829000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | view.requestLayout如果在灭屏或者切home之后调用会怎么样？","type":0,"userId":2,"visible":1,"zan":17},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>这个问题很明确了，想必大家都能了解，我们经常在自定义 View 的时候，会发现 onMeasure 执行了多次？<\/p>\r\n<p>那么问题来了：<\/p>\r\n<p><strong>onMeasure 执行多次的原因有哪些呢？<\/strong><\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17920,"link":"https://www.wanandroid.com/wenda/show/17920","niceDate":"2021-05-06 00:16","niceShareDate":"2021-04-13 00:30","origin":"","prefix":"","projectLink":"","publishTime":1620231402000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1618245050000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  | onMeasure()多次执行原因？","type":0,"userId":2,"visible":1,"zan":12},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>大家应该都清楚app上内存是非常宝贵的资源，而Bitmap几乎是app里面占据内存更大的一个部分。<\/p>\r\n<p>不少同学也清楚，Bitmap占据的内存计算为：<\/p>\r\n<pre><code>宽 * 高 * 单个像素所需字节数\r\n<\/code><\/pre><p>今天有个很常规，但是你可能没有太关注的问题：<\/p>\r\n<ol>\r\n<li>Bitmap所占用的内存，是app的哪部分的内存？或者说app运行时可使用Java内存为512M，Bitmap占据的内存可以超过512M吗?<\/li>\r\n<li>问题1中所描述的，需要区分Android版本吗（5.0以下不考虑）？<\/li>\r\n<li>问题1，问题2如果都搞清楚，经常在一些blog看到这样的代码：设置fresco图片缓存空间为Java内存的白分比，例如1/4，合适吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17874,"link":"https://wanandroid.com/wenda/show/17874","niceDate":"2021-04-19 23:40","niceShareDate":"2021-04-07 14:57","origin":"","prefix":"","projectLink":"","publishTime":1618846801000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1617778650000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 听说你做过内存优化 之 Bitmap内存占用到底在哪？","type":0,"userId":2,"visible":0,"zan":4},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候我们在自定义 View 的需要做动画的时候，我们可以依赖属性动画的回调周期性修改 自定义的属性值，然后调用 invalidate 方法实现。<\/p>\r\n<p>不过我还见过一个比较野的路子，它在 onDraw 里面直接修改属性，然后调用 invalidate() 方法。<\/p>\r\n<p>运行起来好像也没问题。<\/p>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>在 onDraw 里面调用 修改绘制相关属性（例如画圆，修改半径） invalidate() ，这种与属性动画的回调调用 invalidate()源码分析有什么区别？<\/li>\r\n<li>在 onDraw 里面调用  invalidate() 会存在什么问题？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17629,"link":"https://www.wanandroid.com/wenda/show/17629","niceDate":"2021-04-13 00:31","niceShareDate":"2021-03-15 00:43","origin":"","prefix":"","projectLink":"","publishTime":1618245076000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1615740191000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | onDraw 里面调用 invalidate 做动画，有什么问题？","type":0,"userId":2,"visible":1,"zan":13},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>关于kotlin的可空与非可空：<\/p>\r\n<ol>\r\n<li>在写代码的时候感觉是两种类型，那么他们在字节码上是不同的类型吗？<\/li>\r\n<li>方法的调用分为a.b(),a?.b(),a!!.b()，他们有什么区别？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17800,"link":"https://wanandroid.com/wenda/show/17800","niceDate":"2021-04-08 00:25","niceShareDate":"2021-03-30 21:12","origin":"","prefix":"","projectLink":"","publishTime":1617812734000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1617109936000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Kotlin 空 与 非空类型的一些疑问","type":0,"userId":2,"visible":1,"zan":4}],"offset":0,"over":false,"pageCount":7,"size":23,"total":153}
     * errorCode : 0
     * errorMsg :
     */

    private DataDTO data;
    private Integer errorCode;
    private String errorMsg;

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

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

    public static class DataDTO {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>前两天看公众号文章：<br><a href=\"https://mp.weixin.qq.com/s/XHbJ1L5_rdvKs3AjLCvGiA\">分享一个困惑很久的问题：App前台，Activity会被回收吗？<\/a><\/p>\r\n<p>文章中源码分析阶段，看到了一些核心类：<\/p>\r\n<pre><code> ActivityRecord、TaskRecord、ActivityStack、ActivityDisplay、ActivityStackSupervisor\r\n<\/code><\/pre><p>绕起来有点晕。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这些类分别起到什么作用？<\/li>\r\n<li>有什么好的方式帮助记忆吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":true,"host":"","id":21681,"link":"https://wanandroid.com/wenda/show/21681","niceDate":"1天前","niceShareDate":"2022-03-07 21:24","origin":"","prefix":"","projectLink":"","publishTime":1647332538000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1646659440000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | ActivityRecord、TaskRecord、ActivityStack、ActivityDisplay、ActivityStackSupervisor 分别是干什么的？","type":1,"userId":2,"visible":1,"zan":11},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>正在我们在开发的时候，涉及到需要跨进程通信，尤其是较为复杂的，需要拿到服务端 binder 代理进行交互的方式。<\/p>\r\n<p>一般流程为：<\/p>\r\n<ol>\r\n<li>编写 aidl 文件；<\/li>\r\n<li>实现一个 Service 子类(独立进程)，复写 onBind 方法，返回 Binder&#39;s Stub；<\/li>\r\n<li>主进程通过调用 bindService，间接拿到 binder 驱动，然后实现 binder 通信；<\/li>\r\n<\/ol>\r\n<p>更进一步的说，很多时候，我们也可以不依赖 aidl 文件，自己去实现Stub、Proxy类，利用 binder 驱动通过 transact 方法与服务端 Stub onTransact 进行跨进程交互。<\/p>\r\n<p>但是依然是需要依赖 bindService 方法，去获取 binder驱动。<\/p>\r\n<p>可以参考：<a href=\"https://blog.csdn.net/lmj623565791/article/details/38461079/\">Android aidl Binder框架浅析<\/a><\/p>\r\n<p>不过我们今天的关注点在于：<\/p>\r\n<ol>\r\n<li>可以不通过 bindService ，利用别的方式来传递 \u201cbinder 驱动\u201d来实现跨进程通信吗？<\/li>\r\n<li>framework 层有哪些地方使用了 1 的方式进行通信？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21630,"link":"https://www.wanandroid.com/wenda/show/21630","niceDate":"2022-03-02 00:41","niceShareDate":"2022-03-02 00:40","origin":"","prefix":"","projectLink":"","publishTime":1646152900000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1646152857000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 可以不借助 bindService，实现跨进程 binder 通信吗？","type":1,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前小缘在群里问过这个问题：<\/p>\r\n<p><img src=\"https://wanandroid.com/blogimgs/122c7a4f-12e7-4b59-833b-0a2a1631661d.png\" alt=\"截屏2022-02-10 下午5.27.05.png\" /><\/p>\r\n<blockquote>\r\n<p>先不考虑其实际的使用价值，单纯从技术角度思考，其实也有场景能用上，暂时不表。<\/p>\r\n<\/blockquote>\r\n<p>我细化一下问题：<\/p>\r\n<p>前提类：<\/p>\r\n<pre><code>public class A {\r\n\r\n    private final AInner inner = new AInner();\r\n\r\n    private final class AInner {\r\n\r\n        public void b() {\r\n            Log.d(&quot;tec-hack&quot;, &quot;AInner b invoke&quot;);\r\n        }\r\n    }\r\n}\r\n<\/code><\/pre><p>注意，暂且认为该类是系统类，我们无法在编译期对齐修改。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>如何构造一个AInner的子类对象？<\/li>\r\n<li>完成对A的inner成员变量替换。<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21409,"link":"https://wanandroid.com/wenda/show/21409","niceDate":"2022-02-28 00:00","niceShareDate":"2022-02-11 14:21","origin":"","prefix":"","projectLink":"","publishTime":1645977600000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1644560499000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 被声明为private final 的内部类，能生成一个子类对象吗？逆天篡改~","type":1,"userId":2,"visible":1,"zan":11},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前有聊过：<a href=\"https://www.wanandroid.com/wenda/show/18615\">每日一问 | 我们经常说到的 Android 脱糖指的是什么？<\/a>  已经有同学提到可能会影响到编译期间 Transform 的编写。<\/p>\r\n<p>今天就来详细了解下，例如比较常见的需求：<\/p>\r\n<p><strong>在编译期间通过字节码处理View防止重复点击<\/strong><\/p>\r\n<ol>\r\n<li>在该案例下，需要了解脱糖的时机以及流程么？<\/li>\r\n<li>脱糖对该案例会造成什么样的影响？<\/li>\r\n<li>对于导致的问题，如何处理呢？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20946,"link":"https://www.wanandroid.com/wenda/show/20946","niceDate":"2022-03-07 21:26","niceShareDate":"2021-12-25 18:39","origin":"","prefix":"","projectLink":"","publishTime":1646659580000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1640428781000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 脱糖对于Android 打包期间插桩的有什么影响？","type":0,"userId":2,"visible":0,"zan":1},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在我们学习 Java类加载流程的时候，一般都会提到：<\/p>\r\n<p>加载 -&gt; 连接 -&gt; 初始化 三个过程。<\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这三个过程中每个环节主要做哪些事？<\/li>\r\n<li>.class vs Class.forName() vs loadClass()  这三者有什么不同？可以结合三个过程来描述<\/li>\r\n<li>Android 中类加载有个 verify class的过程上述哪个流程会触发？什么情况下会出现 verify class error 情况？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":21251,"link":"https://www.wanandroid.com/wenda/show/21251","niceDate":"2022-02-11 14:22","niceShareDate":"2022-01-19 00:51","origin":"","prefix":"","projectLink":"","publishTime":1644560546000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1642524702000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 .class vs Class.forName() vs loadClass() 类加载傻傻分不清楚？","type":0,"userId":2,"visible":1,"zan":1},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在上一问中：<\/p>\r\n<p><a href=\"https://wanandroid.com/wenda/show/20535\">每日一问 | android hidden api 不是禁用反射，以及如何突破，「元反射」不行了？<\/a><\/p>\r\n<p>中，我也从中学到了很多，其实我预期的答案是小缘所回来的。但是，其他同学的回答完全超出预期，尤其是这个库<a href=\"https://github.com/LSPosed/AndroidHiddenApiBypass\">https://github.com/LSPosed/AndroidHiddenApiBypass<\/a> 里面的 UnSafe 操作太秀了。<\/p>\r\n<p>刚哥也提到 stub api 的方式，也能某些情况下解决问题。<\/p>\r\n<p>忽然想到一个问题：<\/p>\r\n<p>如果一个接口是 hidden 的，我们是否可以构造出其实现类？如果可以，有几种方式呢？<\/p>\r\n<p>更后，我们团队一直在招人，欢迎联系<a href=\"https://wanandroid.com/blog/show/2949\">招聘要求<\/a><\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20867,"link":"https://www.wanandroid.com/wenda/show/20867","niceDate":"2022-02-08 23:51","niceShareDate":"2021-12-19 17:15","origin":"","prefix":"","projectLink":"","publishTime":1644335483000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1639905347000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  | 如何构造一个 hide interface 的实现类？","type":0,"userId":2,"visible":1,"zan":2},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>出这个问题有两个原因：<\/p>\r\n<ol>\r\n<li>之前在公众号推文，很多同学认为android 9之后只要是反射都不被允许了，希望拨正这个观念；<\/li>\r\n<li>虽然已经有很多好文提到android hidden api如何突破，但是大多是都是基于android 9来测试的，实际上随着targetSDKVersion的提升，很多方案都失效了，包括「反射的反射」这个方案，所以我觉得还是可以讨论下；<\/li>\r\n<\/ol>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>hidden api是指不让使用反射吗？<\/li>\r\n<li>hidden api list在每个系统版本上，怎么知道哪些api被限制反射使用呢？<\/li>\r\n<li>hidden api 官方的限制思路是怎么样的？<\/li>\r\n<li>目前市面上突破android hidden api的方案，能够支持targetSDKVersion 提升到android 10 , 11, 12吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20535,"link":"https://wanandroid.com/wenda/show/20535","niceDate":"2022-02-08 23:51","niceShareDate":"2021-11-19 11:57","origin":"","prefix":"","projectLink":"","publishTime":1644335474000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1637294221000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | android hidden api 不是禁用反射，以及如何突破，「元反射」不行了？","type":0,"userId":2,"visible":1,"zan":21},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>Gson大家一定不陌生，在很多项目中都大规模使用。<\/p>\r\n<p>例如常见的：<\/p>\r\n<pre><code>网络请求\r\n    -&gt;返回Json数据\r\n    -&gt;Gson解析为对象\r\n    -&gt;渲染页面\r\n<\/code><\/pre><p>很多时候，历史项目包含很多Gson解析对象在UI线程的操作，或者说即使在子线程其实也会影响页面展现速度。<\/p>\r\n<p>大家都了解Gson对于对象的解析，如果不单独的配置TypeAdapter，那么其实内部是充满反射的。<\/p>\r\n<p>问题来了：<\/p>\r\n<p><strong>有没有什么低侵入的方案可以尽可能去除反射操作，从而提升运行效率？描述思路即可。<\/strong><\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":19623,"link":"https://wanandroid.com/wenda/show/19623","niceDate":"2021-12-02 00:50","niceShareDate":"2021-08-30 21:36","origin":"","prefix":"","projectLink":"","publishTime":1638377423000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1630330596000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Gson中序列化对象的操作有低侵入的优化方案吗？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>今天意外在崩溃上报平台发现一个异常为UndeclaredThrowableException，看名字就比较好奇，大家可以搜索下，尝试回答：<\/p>\r\n<ol>\r\n<li>什么时候会抛出此异常？<\/li>\r\n<li>为什么[1]中重新封装为此异常抛出，这么设计的原因是？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20514,"link":"https://www.wanandroid.com/wenda/show/20514","niceDate":"2021-12-02 00:50","niceShareDate":"2021-11-17 00:56","origin":"","prefix":"","projectLink":"","publishTime":1638377410000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1637081819000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 UndeclaredThrowableException 是什么异常？","type":0,"userId":2,"visible":1,"zan":2},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>问题如题：<\/p>\r\n<p>ViewGroup 的 measureChild 方法和 measureChildWithMargins 方法的区别是什么，如何在实际开发中决定选择使用哪一个？<\/p>\r\n<p>来源：<a href=\"https://wanandroid.com/wenda/show/8857?fid=833&amp;date=2021_10_12_09_13_15&amp;message=ViewGroup#msg_id2204\">可以从这里提问<\/a>，欢迎大家踊跃提问~<\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":20130,"link":"https://wanandroid.com/wenda/show/20130","niceDate":"2021-12-02 00:50","niceShareDate":"2021-10-12 20:20","origin":"","prefix":"","projectLink":"","publishTime":1638377400000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1634041255000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"【大家提问】 | ViewGroup 的 measureChild 方法和 measureChildWithMargins 方法的区别是什么？","type":0,"userId":2,"visible":1,"zan":9},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>关于 Activity 重建，我们探究几个问题：<\/p>\r\n<ol>\r\n<li>当前 app 正在前台运行，不在栈顶的 Activity 有可能会因为系统资源，例如内存等不足回收吗？<\/li>\r\n<li>当 app 处于后台运行，app 进程未被杀死，其内部的 Activity 会被回收吗？<\/li>\r\n<li>当 app 处于后台运行，app 的进程会被杀死吗？<\/li>\r\n<\/ol>\r\n<p>如果有能力，建议解释过程中可以配合源码，不一定要全部答出来~<\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18965,"link":"https://www.wanandroid.com/wenda/show/18965","niceDate":"2021-08-30 21:37","niceShareDate":"2021-07-15 00:27","origin":"","prefix":"","projectLink":"","publishTime":1630330636000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1626280047000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 关于 Activity 重建，值得探究的几个问题","type":0,"userId":2,"visible":1,"zan":19},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>了解应用启动相关代码的同学一定知道：<\/p>\r\n<p>我们的应用启动时，每个进程会对应一个ActivityThread对象，而Application对象在正常情况下也是每个进程只有一个？<\/p>\r\n<p>但是如果你看ActivityThread的源码，你会发现：<\/p>\r\n<pre><code>public final class ActivityThread {\r\n    final ArrayList&lt;Application&gt; mAllApplications\r\n                = new ArrayList&lt;Application&gt;();\r\n    ...\r\n}\r\n<\/code><\/pre><p><a href=\"https://cs.android.com/android/platform/superproject/+/master:frameworks/base/core/java/android/app/ActivityThread.java;l=237?q=ActivitYtHREAD&amp;sq=&amp;ss=android%2Fplatform%2Fsuperproject\">源码直达<\/a><\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>什么情况下一个ActivityThread对象，会对应多个Application对象，即mAllApplications.size() &gt; 1；<\/li>\r\n<li>如果找到了1的情况，支持这个目的是？<\/li>\r\n<\/ol>\r\n<blockquote>\r\n<p>本问题归因为好奇，硬说使用场景在一些插件化中会尝试构造Application会调用这个，但是这个肯定不是google的本意。<\/p>\r\n<\/blockquote>","descMd":"","envelopePic":"","fresh":false,"host":"","id":19550,"link":"https://wanandroid.com/wenda/show/19550","niceDate":"2021-08-30 21:36","niceShareDate":"2021-08-25 18:10","origin":"","prefix":"","projectLink":"","publishTime":1630330617000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1629886237000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 好奇ActivityThread中为什么会有一个 Application的集合？","type":0,"userId":2,"visible":1,"zan":6},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>今天我们来讨论下 Jetpack 中的 ViewModel:<\/p>\r\n<p>大家都知道 ViewModel 有一个特点就是能够在 Activity 发生重建时做数据的恢复。<\/p>\r\n<p>我们就针对这个「重建」与「恢复」问一些问题：<\/p>\r\n<ol>\r\n<li>ViewModel 在 Activity 发生旋转等配置发生变化所导致的重建，能恢复数据吗？<\/li>\r\n<li>如果 1 能，尝试从源码角度分析，数据存在哪？怎么存储的？怎么读取的？<\/li>\r\n<li>当 Activity 切换到后台，被系统杀死（进程存活），此时回到 Activity 导致的重建，ViewModel 的数据能恢复吗？为什么？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18930,"link":"https://www.wanandroid.com/wenda/show/18930","niceDate":"2021-08-25 18:11","niceShareDate":"2021-07-11 22:05","origin":"","prefix":"","projectLink":"","publishTime":1629886294000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1626012349000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | ViewModel 在什么情况下的「销毁重建」能够对数据进行无缝恢复？","type":0,"userId":2,"visible":1,"zan":30},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>在我们的印象里，如果构造一个 Dialog 传入一个非 Activiy 的 context，则可能会出现 bad token exception。<\/p>\r\n<p>今天我们就来彻底搞清楚这一块，问题来了：<\/p>\r\n<ol>\r\n<li>为什么传入一个非 Activity 的 context 会出现错误？<\/li>\r\n<li>传入的 context 一定要是 Activity 吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18281,"link":"https://www.wanandroid.com/wenda/show/18281","niceDate":"2021-07-11 22:06","niceShareDate":"2021-05-13 00:20","origin":"","prefix":"","projectLink":"","publishTime":1626012414000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1620836414000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Dialog 的构造方法的 context 必须传入 Activity吗？","type":0,"userId":2,"visible":1,"zan":23},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>更近一直在补一些 C/C++的知识，导致 Android 相关知识看的少了，导致每日一问憋半天憋不出来。<\/p>\r\n<p>还好，我又更新了...<\/p>\r\n<p>之前公众号推文的时候，推送到混淆的时候，经常会说到「脱糖」，也有同学在留言区问什么是脱糖呀？<\/p>\r\n<p>今天的问题就是为了带大家彻底搞清楚什么是脱糖：<\/p>\r\n<ol>\r\n<li>脱糖产生的原因是什么？<\/li>\r\n<li>脱糖在 D8 产生后发生了什么变化？<\/li>\r\n<li>脱糖我们需要关注吗？在我们做什么事情的时候可能会影响到呢？<\/li>\r\n<\/ol>\r\n<p>求解答~<\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18615,"link":"https://www.wanandroid.com/wenda/show/18615","niceDate":"2021-07-11 22:06","niceShareDate":"2021-06-14 22:56","origin":"","prefix":"","projectLink":"","publishTime":1626012397000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1623682607000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 我们经常说到的 Android 脱糖指的是什么？","type":0,"userId":2,"visible":1,"zan":14},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>更近聊到一种编译优化的方案，号称秒级别：<\/p>\r\n<ol>\r\n<li>每次拿到修改 java 文件，编译为 class；<\/li>\r\n<li>将 1 中的 class 转成 dex；<\/li>\r\n<li>push 到 sdcard，然后重启生效；<\/li>\r\n<\/ol>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>第一步中将特定的 Java 文件转成 class 如何操作？如何极快的操作？<\/li>\r\n<li>如果是 kotlin 文件呢？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18453,"link":"https://www.wanandroid.com/wenda/show/18453","niceDate":"2021-07-11 22:06","niceShareDate":"2021-05-28 00:28","origin":"","prefix":"","projectLink":"","publishTime":1626012386000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1622132918000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 极致的编译优化如何实现？ [更新]","type":0,"userId":2,"visible":1,"zan":12},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>之前看文章，经常看到一些分析 Dialog、PopupWindow的文章，有些文章分析如下：<\/p>\r\n<p><strong>Dialog有自己独立的Window，而PopupWindow没有，所以PopupWindow可以称之为子窗口，而 Dialog不是。<\/strong><\/p>\r\n<p>问题来了：<\/p>\r\n<ol>\r\n<li>这种说法合理吗？<\/li>\r\n<li>在Android中，有没有子窗口的概念呢？如果有到底应该以什么为标准呢？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18192,"link":"https://wanandroid.com/wenda/show/18192","niceDate":"2021-05-28 00:29","niceShareDate":"2021-05-06 00:15","origin":"","prefix":"","projectLink":"","publishTime":1622132956000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1620231346000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Android中的子窗口到底指的是什么？","type":0,"userId":2,"visible":1,"zan":16},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>对于 Intent 大家肯定都不陌生，今天我们聊一聊它的一个近亲：<strong>PendingIntent<\/strong><\/p>\r\n<p>官方对其描述为：<\/p>\r\n<p>A description of an Intent and target action to perform with it. <\/p>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>PendingIntent 仅仅是对 Intent 的一个封装吗？<\/li>\r\n<li>如果1 不是，那么为什么 PendingIntent与 Intent 有何不同，它的定位是什么样的呢？<\/li>\r\n<li>对于 2 的回答，如果从源码侧佐证？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":18072,"link":"https://www.wanandroid.com/wenda/show/18072","niceDate":"2021-05-28 00:29","niceShareDate":"2021-04-24 22:58","origin":"","prefix":"","projectLink":"","publishTime":1622132946000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1619276317000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 已经有了 Intent，那为啥还要 PendingIntent?","type":0,"userId":2,"visible":1,"zan":8},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>正常大家都清楚，当我们view发生一些必须要重新测量才能生效的属性的时候，我们会尝试触发view.requestLayout从而让整个view树发生重新测量与布局。<\/p>\r\n<p>今天的问题是:<\/p>\r\n<ol>\r\n<li>假设requestLayout的调用发生在灭屏/切home之后会立即触发吗？<\/li>\r\n<li>如果1不会立即触发，当我们回到应用，会自动重新触发一次requestLayout吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17956,"link":"https://wanandroid.com/wenda/show/17956","niceDate":"2021-05-06 00:16","niceShareDate":"2021-04-15 14:40","origin":"","prefix":"","projectLink":"","publishTime":1620231413000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1618468829000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | view.requestLayout如果在灭屏或者切home之后调用会怎么样？","type":0,"userId":2,"visible":1,"zan":17},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>这个问题很明确了，想必大家都能了解，我们经常在自定义 View 的时候，会发现 onMeasure 执行了多次？<\/p>\r\n<p>那么问题来了：<\/p>\r\n<p><strong>onMeasure 执行多次的原因有哪些呢？<\/strong><\/p>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17920,"link":"https://www.wanandroid.com/wenda/show/17920","niceDate":"2021-05-06 00:16","niceShareDate":"2021-04-13 00:30","origin":"","prefix":"","projectLink":"","publishTime":1620231402000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1618245050000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问  | onMeasure()多次执行原因？","type":0,"userId":2,"visible":1,"zan":12},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>大家应该都清楚app上内存是非常宝贵的资源，而Bitmap几乎是app里面占据内存更大的一个部分。<\/p>\r\n<p>不少同学也清楚，Bitmap占据的内存计算为：<\/p>\r\n<pre><code>宽 * 高 * 单个像素所需字节数\r\n<\/code><\/pre><p>今天有个很常规，但是你可能没有太关注的问题：<\/p>\r\n<ol>\r\n<li>Bitmap所占用的内存，是app的哪部分的内存？或者说app运行时可使用Java内存为512M，Bitmap占据的内存可以超过512M吗?<\/li>\r\n<li>问题1中所描述的，需要区分Android版本吗（5.0以下不考虑）？<\/li>\r\n<li>问题1，问题2如果都搞清楚，经常在一些blog看到这样的代码：设置fresco图片缓存空间为Java内存的白分比，例如1/4，合适吗？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17874,"link":"https://wanandroid.com/wenda/show/17874","niceDate":"2021-04-19 23:40","niceShareDate":"2021-04-07 14:57","origin":"","prefix":"","projectLink":"","publishTime":1618846801000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1617778650000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | 听说你做过内存优化 之 Bitmap内存占用到底在哪？","type":0,"userId":2,"visible":0,"zan":4},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>很多时候我们在自定义 View 的需要做动画的时候，我们可以依赖属性动画的回调周期性修改 自定义的属性值，然后调用 invalidate 方法实现。<\/p>\r\n<p>不过我还见过一个比较野的路子，它在 onDraw 里面直接修改属性，然后调用 invalidate() 方法。<\/p>\r\n<p>运行起来好像也没问题。<\/p>\r\n<p>那么问题来了：<\/p>\r\n<ol>\r\n<li>在 onDraw 里面调用 修改绘制相关属性（例如画圆，修改半径） invalidate() ，这种与属性动画的回调调用 invalidate()源码分析有什么区别？<\/li>\r\n<li>在 onDraw 里面调用  invalidate() 会存在什么问题？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17629,"link":"https://www.wanandroid.com/wenda/show/17629","niceDate":"2021-04-13 00:31","niceShareDate":"2021-03-15 00:43","origin":"","prefix":"","projectLink":"","publishTime":1618245076000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1615740191000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | onDraw 里面调用 invalidate 做动画，有什么问题？","type":0,"userId":2,"visible":1,"zan":13},{"apkLink":"","audit":1,"author":"xiaoyang","canEdit":false,"chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>关于kotlin的可空与非可空：<\/p>\r\n<ol>\r\n<li>在写代码的时候感觉是两种类型，那么他们在字节码上是不同的类型吗？<\/li>\r\n<li>方法的调用分为a.b(),a?.b(),a!!.b()，他们有什么区别？<\/li>\r\n<\/ol>","descMd":"","envelopePic":"","fresh":false,"host":"","id":17800,"link":"https://wanandroid.com/wenda/show/17800","niceDate":"2021-04-08 00:25","niceShareDate":"2021-03-30 21:12","origin":"","prefix":"","projectLink":"","publishTime":1617812734000,"realSuperChapterId":439,"selfVisible":0,"shareDate":1617109936000,"shareUser":"","superChapterId":440,"superChapterName":"问答","tags":[{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}],"title":"每日一问 | Kotlin 空 与 非空类型的一些疑问","type":0,"userId":2,"visible":1,"zan":4}]
         * offset : 0
         * over : false
         * pageCount : 7
         * size : 23
         * total : 153
         */

        private Integer curPage;
        private Integer offset;
        private Boolean over;
        private Integer pageCount;
        private Integer size;
        private Integer total;
        private List<DatasDTO> datas;

        public Integer getCurPage() {
            return curPage;
        }

        public void setCurPage(Integer curPage) {
            this.curPage = curPage;
        }

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        public Boolean isOver() {
            return over;
        }

        public void setOver(Boolean over) {
            this.over = over;
        }

        public Integer getPageCount() {
            return pageCount;
        }

        public void setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<DatasDTO> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasDTO> datas) {
            this.datas = datas;
        }

        public static class DatasDTO {
            /**
             * apkLink :
             * audit : 1
             * author : xiaoyang
             * canEdit : false
             * chapterId : 440
             * chapterName : 官方
             * collect : false
             * courseId : 13
             * desc : <p>前两天看公众号文章：<br><a href="https://mp.weixin.qq.com/s/XHbJ1L5_rdvKs3AjLCvGiA">分享一个困惑很久的问题：App前台，Activity会被回收吗？</a></p>
             <p>文章中源码分析阶段，看到了一些核心类：</p>
             <pre><code> ActivityRecord、TaskRecord、ActivityStack、ActivityDisplay、ActivityStackSupervisor
             </code></pre><p>绕起来有点晕。</p>
             <p>问题来了：</p>
             <ol>
             <li>这些类分别起到什么作用？</li>
             <li>有什么好的方式帮助记忆吗？</li>
             </ol>
             * descMd :
             * envelopePic :
             * fresh : true
             * host :
             * id : 21681
             * link : https://wanandroid.com/wenda/show/21681
             * niceDate : 1天前
             * niceShareDate : 2022-03-07 21:24
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1647332538000
             * realSuperChapterId : 439
             * selfVisible : 0
             * shareDate : 1646659440000
             * shareUser :
             * superChapterId : 440
             * superChapterName : 问答
             * tags : [{"name":"本站发布","url":"/article/list/0?cid=440"},{"name":"问答","url":"/wenda"}]
             * title : 每日一问 | ActivityRecord、TaskRecord、ActivityStack、ActivityDisplay、ActivityStackSupervisor 分别是干什么的？
             * type : 1
             * userId : 2
             * visible : 1
             * zan : 11
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
            private List<TagsDTO> tags;

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

            public List<TagsDTO> getTags() {
                return tags;
            }

            public void setTags(List<TagsDTO> tags) {
                this.tags = tags;
            }

            public static class TagsDTO {
                /**
                 * name : 本站发布
                 * url : /article/list/0?cid=440
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
