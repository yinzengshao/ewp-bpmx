
// +----------------------------------------------------------------------
// | Think.Admin
// +----------------------------------------------------------------------
// | 版权所有 2014~2017 广州楚才信息科技有限公司 [ http://www.cuci.cc ]
// +----------------------------------------------------------------------
// | 官方网站: http://think.ctolog.com
// +----------------------------------------------------------------------
// | 开源协议 ( https://mit-license.org )
// +----------------------------------------------------------------------
// | github开源项目：https://github.com/zoujingli/Think.Admin
// +----------------------------------------------------------------------

// 当前资源URL目录
var baseUrl = (function () {
    var scripts = document.scripts, src = scripts[scripts.length - 1].src;
    return src.substring(0, src.lastIndexOf("/") + 1);
})();

// RequireJs 配置参数
require.config({
    waitSeconds: 0,
    baseUrl: baseUrl,
    map: {'*': {css: baseUrl + '../plugins/require/require.css.js'}},
    paths: {
        // 自定义插件（源码自创建或已修改源码）
        'admin.plugs': ['plugs'],
        'admin.listen': ['listen'],
        'template': ['../plugins/template/template'],
        'pcasunzips': ['../plugins/jquery/pcasunzips'],
        // 开源插件(未修改源码)
        'pace': ['../plugins/jquery/pace.min'],
        'json': ['../plugins/jquery/json2.min'],
        'layui': ['../plugins/layui/layui'],
        'jquery': ['../plugins/jquery/jquery.min'],
        'base64': ['../plugins/jquery/base64.min'],
        'angular':['../plugins/angular  /angular.min'],
        'ckeditor': ['../plugins/ckeditor/ckeditor'],
        'websocket': ['../plugins/socket/websocket'],
        'bootstrap': ['../plugins/bootstrap/js/bootstrap.min'],
        'bootstrap.typeahead': ['../plugins/bootstrap/js/bootstrap3-typeahead.min'],
        'jquery.ztree': ['../plugins/ztree/jquery.ztree.all.min'],
        'jquery.masonry': ['../plugins/jquery/masonry.min'],
        'jquery.cookies': ['../plugins/jquery/jquery.cookie'],
    },
    shim: {
        'layui': {deps: ['jquery']},
        'ckeditor': {deps: ['jquery']},
        'websocket': {deps: [baseUrl + '../plugins/socket/swfobject.min.js']},
        'pcasunzips': {deps: ['jquery']},
        'admin.plugs': {deps: ['jquery', 'layui']},
        'admin.listen': {deps: ['jquery', 'jquery.cookies', 'admin.plugs']},
        'bootstrap': {deps: ['jquery']},
        'bootstrap.typeahead': {deps: ['bootstrap']},
        'jquery.ztree': {deps: ['jquery', 'css!' + baseUrl + '../plugins/ztree/zTreeStyle/zTreeStyle.css']},
        'jquery.cookies': {deps: ['jquery']},
        'jquery.masonry': {deps: ['jquery']},
    },
    deps: ['css!' + baseUrl + '../plugins/awesome/css/font-awesome.min.css'],
    // 开启debug模式，不缓存资源
    // urlArgs: "ver=" + (new Date()).getTime()
});

// UI框架初始化
PageLayout.call(this);
function PageLayout(callback, custom, basic) {
    window.WEB_SOCKET_SWF_LOCATION = baseUrl + "../plugins/socket/WebSocketMain.swf";
    require(basic || ['pace', 'jquery', 'layui', 'bootstrap'], function () {
        layui.config({dir: baseUrl + '../plugins/layui/'});
        layui.use(['layer', 'form'], function () {
            window.layer = layui.layer, window.form = layui.form;
            require(custom || ['admin.listen', 'ckeditor'], callback || false);
        });
    });
}
