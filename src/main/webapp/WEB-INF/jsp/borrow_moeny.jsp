<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html dir="ltr" lang="zh-CN" xml:lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="description" content="点融网为广大个人和微小企业提供便利的投融资服务。借款产品灵活、大额、费用低、手续快；投资方式人性友好、回报高、百分百本金保护！Dianrong.com provides online efficient investment and financing services for individuals and SMEs. Better rates, lower cost, faster way to borrowers and more flexible investment, higher returns, 100% principal protection to investors." />
    <meta name="keywords" content="P2P网贷,P2P网络贷款平台,P2P网络投资平台,P2P投资理财平台,网络贷款平台,团团赚,点融,点融网,点融官网" />
    <link rel="shortcut icon" href="static/images/favicon.ico" />
    <title>我要借款- borrow.html</title>
    <link href="static/css/bootstrap.min.css" rel="stylesheet" />
    <link href="static/css/components.css?ver=142682356" rel="stylesheet" />
    <link href="static/css/main.css?ver=142682356" rel="stylesheet" />
    <link href="static/css/new-home.css?ver=142682356" rel="stylesheet" />
    <style type="text/css">
        @media (min-width: 992px) {
            @font-face {
                font-family: 'proxima-nova';
                src: url('static/fonts/proximanova-regular-webfont.eot');
                src: url('static/fonts/proximanova-regular-webfont.eot?#iefix') format('embedded-opentype'),
                url('static/fonts/proximanova-regular-webfont.woff') format('woff'),
                url('static/fonts/proximanova-regular-webfont.ttf') format('truetype');
                font-weight: normal;
                font-style: normal;
            }

            @font-face {
                font-family: 'proxima-nova';
                src: url('static/fonts/proximanova-bold-webfont.eot');
                src: url('static/fonts/proximanova-bold-webfont.eot?#iefix') format('embedded-opentype'),
                url('static/fonts/proximanova-bold-webfont.woff') format('woff'),
                url('static/fonts/proximanova-bold-webfont.ttf') format('truetype');
                font-weight: bold;
                font-style: normal;
            }
        }
    </style>
    <!-- Add support for bootstrap in IE8 -->
    <!--[if lt IE 9]>
    <link href="static/css/ie8.css?ver=142682356" rel="stylesheet">
    <![endif]-->
    <!--[if IE 9]>
    <link href="static/css/ie9.css?ver=142682356" rel="stylesheet">
    <![endif]-->

</head>
<body>
<!--[if lt IE 8]>
<div class="alert alert-warning text-center" style="margin-bottom:0;">
    <p>你的浏览器不支持点融网的一些新特性，请升级你的浏览器至<a href="http://se.360.cn/">360浏览器</a>或<a href="http://browsehappy.com/">Chrome</a>。
    </p>
    <p>正在为你跳转到旧版网站...<a href="index.jsp">立即跳转</a></p>
    <p>2015年了，IE8老了...</p>
</div>
<![endif]-->
<div class="wrapper borrower-landing">
    <!--header-->
    <header class="sl-header" ng-controller="HeaderCtrl" id="sl-header">
        <nav class="navbar navbar-inverse navbar-static-top site-nav" role="navigation">
            <div class="container">
                <!-- Contact info -->
                <ul class="nav navbar-nav site-nav-sns">
                    <li class="site-nav-sns-phone"><span class="navbar-text">客服热线：400-921-9218</span></li>
                    <li> <a href="#" class="icon-sns qq">
                        <div class="social-content">
                            <p class="social-title">点融网官方QQ群</p>
                            <p>141444867</p>
                        </div> </a> </li>
                    <li> <a href="http://weibo.com/dianrongwang" target="_blank" class="icon-sns weibo" rel="nofollow"></a> </li>
                    <li> <a href="#" class="icon-sns wechat">
                        <div class="social-content">
                            <p class="social-title">扫描关注微信公众号</p>
                            <p><img src="static/images/qr-code.jpg" /></p>
                        </div> </a> </li>
                </ul>
                <!-- For non-login users -->
                <ul id="nonLoginBar" class="nav navbar-nav navbar-right navbar-sm site-nav-login">
                    <li><a id="login-panel" href="login.jsp" rel="nofollow">登录</a></li>
                    <li><a id="create-account" href="reg.jsp" class="btn btn-sm" rel="nofollow">注册账户</a></li>
                </ul>
                <!-- For login users -->
                <ul class="nav navbar-nav navbar-right navbar-sm site-nav-user ng-cloak" ng-if="isAuthenticated()">
                    <!-- Shopping Cart Widget -->
                    <li ng-show="hasRole('LENDER')" class="dropdown shopping-cart-widget" ng-controller="CartSummaryCtrl">
                        <!-- Shopping Cart Widget: Not yet invested -->
                        <ul class="dropdown-menu" ng-show="cart.amountSum==0">
                            <li class="shopping-cart-empty"> <p>你还没有投标，查看<a href="market.jsp">热投项目</a>，立即开启投资之旅！</p> </li>
                        </ul>
                        <!-- Shopping Cart Widget: Invested -->
                        <ul class="dropdown-menu" ng-show="cart.amountSum!= 0" ng-controller="CartCtrl">
                            <li class="shopping-cart-title"> <span>投标 <strong>{{ cart.itemsCount }}笔</strong> </span> <span class="pull-right"> 总额<span ng-bind-html="cart.amountSum | slMoney"></span> </span> </li>
                            <li class="divider"></li>
                            <li ng-repeat="item in cart.items" class="shopping-cart-item" ng-mouseover="show=true" ng-mouseleave="show=false" ng-init="show=false"> <a href="#"> <span>{{item.loanTitle | slStringTruncate:18}}</span> <span ng-bind-html="item.amount | slMoney" ng-class="{hidden:show}"></span> <span data-toggle="modal" data-target="#deleteCartItem" class="sl-icon-trash hidden" ng-click="transId(item.loanId)" ng-class="{hidden:!show}"></span> </a> </li>
                            <li class="divider"></li>
                            <li class="shopping-cart-checkout"> <a id="checkout-shopping-cart" href="/market/checkout" class="btn btn-sm btn-primary btn-block btn-embossed">查看购物车</a> </li>
                        </ul> </li>
                    <!-- My Account Menu -->
                    <li class="dropdown"> <a href="member_info.html" class="dropdown-toggle hoverHeader" ng-show="session.firstLoaded &amp;&amp; session.actor.username" data-toggle="dropdown" data-hover="dropdown">素材火的账户 <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="member_info.jsp">我的账户</a></li>
                            <li><a href="#" ng-click="logout()">退出</a></li>
                        </ul> </li>
                </ul>
            </div>
        </nav>
        <div class="site-menu">
            <div class="header-navbar-container sl-nav-wrapper header-nav-container">
                <nav class="navbar navbar-static-top sl-navbar" role="navigation">
                    <div class="container">
                        <div class="navbar-header  col-xs-6">
                            <button type="button" class="navbar-toggle"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
                            <a class="navbar-brand" href="index.jsp"> <span class="sl-logo">点融网 - DianRong</span> </a>
                        </div>
                        <div class=" navbar-collapse navbar-ex1-collapse sl-nav">
                            <ul class="nav navbar-nav main-menu navbar-right">
                                <!--menus-->
                                <li class="main-link-list"> <a class="main-link" href="market.jsp"> <span class="main-link-text">我要投资</span> </a> </li>
                                <li class="main-link-list"> <a class="main-link" href="borrow.jsp"> <span class="main-link-text">我要借款</span> </a> </li>
                                <li class="main-link-list" ng-class="{active:isActive('/public/help-center')}"> <a class="main-link" href="help.jsp"> <span class="main-link-text">帮助中心</span> </a> </li>
                                <li class="main-link-list"> <a class="main-link" href="about.jsp"> <span class="main-link-text">关于我们</span> </a> </li>
                            </ul>
                        </div>
                        <!-- /.navbar-collapse -->
                    </div>
                </nav>
            </div>
            <!--secondaryNav-->
            <!--jumbotron-->

            </section>
</div>

        <div>
            <div class="page-header lead">
                借款信息
                <label class="label label-primary">信用标</label>
            </div>
            <form class="form-horizontal el-borrow-form" id="editForm" novalidate="novalidate" method="post" action="/borrow_apply.do">
                <div class="form-group">
                    <label class="col-sm-3 control-label">
                        借款金额
                    </label>
                    <div class="col-sm-3  input-group">
                        <input class="form-control" name="bidRequestAmount" id="bidRequestAmount"/>
                        <span class="input-group-addon">元</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">
                        借款利息
                    </label>
                    <div class="col-sm-3  input-group">
                        <input class="form-control" name="currentRate" value="5"/>
                        <span class="input-group-addon">%</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">
                        借款期限
                    </label>
                    <div class="col-sm-3 input-group">
                        <select class="form-control" name="monthes2Return">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="9">9</option>
                            <option value="12">12</option>
                        </select>
                        <span class="input-group-addon">月</span>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">
                        还款方式
                    </label>
                    <label class="radio-inline">
                        <input type="radio" value="0" checked="checked" name="returnType" />
                        按月分期
                    </label>
                    <label class="radio-inline">
                        <input type="radio" value="1" name="returnType" />
                        按月到期
                    </label>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">
                        最小投标
                    </label>
                    <div class="col-sm-3  input-group">
                        <input class="form-control" name="minBidAmount" />
                        <span class="input-group-addon">元</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">
                        招标天数
                    </label>
                    <div class="col-sm-3 input-group">
                        <select class="form-control" name="disableDays">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                        <span class="input-group-addon">天</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">
                        借款标题
                    </label>
                    <div class="col-sm-6 input-group">
                        <input name="title" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-3 control-label">
                        借款描述
                    </label>
                    <div class="col-sm-6  input-group">
                        <textarea name="description" rows="4" class="form-control" style="resize: none;"></textarea>
                    </div>
                </div>
                <div class="form-group">
                    <button class="btn btn-primary col-lg-offset-3" type="submit" data-loading-text="提交">
                        提交申请
                    </button>
                </div>
        </div>

<!--footer-->
<div class="bottom-menu bottom-menu-large bottom-menu-inverse sl-footer open-bottom footer-animate  footer-navbar" ng-cloak="">
    <div class="container inside-container">
        <div class="row">
            <div class="col-xs-4" ng-cloak="">
                <div class="navbar-brand">
                    <a href="#"><i class="image-sprites logo"></i></a>
                </div>
                <ul class="bottom-icons social-icons">
                    <li><a href="#" data-toggle="modal" data-target="#myModal" rel="nofollow"><span class="sl-icon-wechat"></span></a></li>
                    <li><a href="http://weibo.com/dianrongwang" target="_blank" rel="nofollow"><span class="sl-icon-weibo"></span></a></li>
                </ul>
                <div class="support-phone">
                    <span class="phone">咨询电话</span>
                    <h4 class="number">400-921-9218</h4>
                </div>
            </div>
            <div class="col-xs-7 col-xs-offset-1">
                <div class="row site-map">
                    <div class="col-xs-4">
                        <h6 class="title footer-home">公司信息</h6>
                        <ul class="bottom-links">
                            <li><a href="/public/about#/company">公司简介</a></li>
                            <li><a href="/public/about#/news">最新动态</a></li>
                            <li><a href="/public/about#/media">媒体报道</a></li>
                            <li><a href="/public/about#/job">招贤纳士</a></li>
                            <li><a href="/public/about#/contact">联系我们</a></li>
                            <li><a href="/blog/devBlog">点融新享</a></li>
                        </ul>
                    </div>
                    <div class="col-xs-4">
                        <h6 class="title footer-policy">相关政策</h6>
                        <ul class="bottom-links">
                            <li><a href="/public/rates-and-fees" target="_blank">费率说明</a></li>
                            <li><a href="/public/principal-protection" target="_blank">本金保障</a></li>
                            <li><a href="/public/terms-of-use" target="_blank">使用条款</a></li>
                            <li><a href="/public/terms-of-use?protocol=privacy-and-security" target="_blank">隐私保护</a></li>
                        </ul>
                    </div>
                    <div class="col-xs-4">
                        <h6 class="title footer-mobile">手机应用</h6>
                        <ul class="bottom-links">
                            <li><a href="https://itunes.apple.com/us/app/dian-rong-wang/id725186555?mt=8" target="_blank" ga-event="" ga-category="iosAppLink" ga-action="click" ga-label="footer" ga-value="trackValue" rel="nofollow">iPhone版下载</a></li>
                            <li><a href="http://app.mi.com/detail/56106" target="_blank" ga-event="" ga-category="androidAppLink" ga-action="click" ga-label="footer" ga-value="trackValue" rel="nofollow">Android版下载（测试版）</a></li>
                        </ul>
                        <div class="wechat" ng-cloak="">
                            <i class="image-sprites qr-code"></i>
                            <div class="description">
                                <span class="name">微信公众号</span>
                                <span>点融网</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="friend-links">
        <div class="container">
            <div class="col-xs-2">
                <p><span class="sl-icon-branch"></span>友情链接</p>
            </div>
            <div class="col-xs-10">
                <a href="http://iof.hexun.com/" target="_blank">和讯互联网金融</a>
                <a href="http://licai.cofool.com/" target="_blank">叩富理财 </a>
                <a href="http://www.jinfuzi.com/p2p/" target="_blank">金斧子理财</a>
                <a href="http://www.trustores.cn" target="_blank">香港保险</a>
                <a href="http://www.asiafinance.cn" target="_blank">金融导航</a>
                <a href="http://www.fxsol-uk.com" target="_blank">Fxsol官网</a>
                <a href="http://www.guijinshu.com" target="_blank">贵金属</a>
                <a href="http://www.dingniugu.com" target="_blank">顶牛股网</a>
                <a href="http://www.ucai123.com" target="_blank">航运指数</a>
                <a href="http://www.szjstz.cn/" target="_blank">金苏财富</a>
                <a href="http://www.myfund.com/" target="_blank">展恒基金</a>
                <a href="http://www.dianrong.com/caifu/" target="_blank">P2P理财</a>
            </div>
        </div>
    </div>
    <div class="container inside-container">
        <div class="credit" style="margin-top: 0;padding-top: 20px;">
            <div class="navbar copyright">
                <ul class="nav navbar-nav">
                    <li>&copy;2015 点融网</li>
                    <li>沪ICP备14028311号</li>
                    <li>上海点荣金融信息服务有限责任公司</li>
                </ul>
            </div>
            <div class="authentication-info">
                <a target="_blank" href="https://trustsealinfo.verisign.com/splash?form_file=fdf/splash.fdf&amp;dn=www.dianrong.com&amp;lang=zh_cn" rel="nofollow"><i class="image-sprites norton-logo"></i></a>

                <a id="__szfw_logo__" href="https://search.szfw.org/cert/l/CX20150107006323006821" target="_blank"><i class="image-sprites credit-logo"></i></a>

                <a target="_blank" href="http://www.itrust.org.cn/yz/pjwx.asp?wm=1062547634" rel="nofollow"><i class="image-sprites itrust-logo"></i></a>
            </div>
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal fade wechat-modal" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close sl-icon-cross" data-dismiss="modal" aria-hidden="true"></button>
                <h6 class="modal-title" id="myModalLabel">关注点融网官方微信</h6>
            </div>
            <div class="modal-body">
                <div class="wechat-subscription">
                    <h6>点融网订阅号</h6>
                    <p>了解各种点融咨询</p>
                    <img src="static/images/qrcode-dianrongapi.jpg" alt="点融网订阅号" />
                    <p>dianrongapi</p>
                </div>
                <div class="wechat-service">
                    <h6>点融网服务号</h6>
                    <p>查询投资情况</p>
                    <img src="static/images/qrcode-dianrongvip.jpg" alt="点融网服务号" />
                    <p>dianrongvip</p>
                </div>
            </div>
            <div class="modal-footer">
                添加方式：打开微信，点击″发现″菜单，使用″扫一扫″功能；或者在微信中点击&quot;联系人&quot;，添加以上英文账号名为好友。
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal-dialog -->
</div>
</body>
</html>