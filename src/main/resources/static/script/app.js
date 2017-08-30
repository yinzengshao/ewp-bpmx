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
        'layui': ['../plugins/layui/layui'],
        'ueditor': ['../plugins/ueditor/ueditor'],
        'template': ['../plugins/template/template'],
        'pcasunzips': ['../plugins/jquery/pcasunzips'],
        'laydate': ['../plugins/layui/laydate/laydate'],
        // 开源插件（未修改源码）
        'pace': ['../plugins/jquery/pace.min'],
        'json': ['../plugins/jquery/json2.min'],
        'citys': ['../plugins/jquery/jquery.citys'],
        'print': ['../plugins/jquery/jquery.PrintArea'],
        'base64': ['../plugins/jquery/base64.min'],
        'jquery': ['../plugins/jquery/jquery.min'],
        'websocket': ['../plugins/socket/websocket'],
        'bootstrap': ['../plugins/bootstrap/js/bootstrap.min'],
        'jquery.ztree': ['../plugins/ztree/jquery.ztree.all.min'],
        'bootstrap.typeahead': ['../plugins/bootstrap/js/bootstrap3-typeahead.min'],
        'zeroclipboard': ['../plugins/ueditor/third-party/zeroclipboard/ZeroClipboard.min'],
        'jquery.cookies': ['../plugins/jquery/jquery.cookie'],
        'jquery.masonry': ['../plugins/jquery/masonry.min'],

    },
    shim: {
        'citys': {deps: ['jquery']},
        'layui': {deps: ['jquery']},
        'laydate': {deps: ['jquery']},
        'bootstrap': {deps: ['jquery']},
        'pcasunzips': {deps: ['jquery']},
        'jquery.cookies': {deps: ['jquery']},
        'jquery.masonry': {deps: ['jquery']},
        'admin.plugs': {deps: ['jquery', 'layui']},
        'bootstrap.typeahead': {deps: ['jquery', 'bootstrap']},
        'websocket': {deps: [baseUrl + '../plugins/socket/swfobject.min.js']},
        'admin.listen': {deps: ['jquery', 'jquery.cookies', 'admin.plugs']},
        'jquery.ztree': {deps: ['jquery', 'css!' + baseUrl + '../plugins/ztree/zTreeStyle/zTreeStyle.css']},
    },
    deps: ['css!' + baseUrl + '../plugins/awesome/css/font-awesome.min.css'],
    // 开启debug模式，不缓存资源
    urlArgs: "ver=" + (new Date()).getTime()
});

window.WEB_SOCKET_SWF_LOCATION = baseUrl + "../plugins/socket/WebSocketMain.swf";
window.UEDITOR_HOME_URL = (window.ROOT_URL ? window.ROOT_URL + '/static/' : baseUrl) + 'plugins/ueditor/';

// UI框架初始化
require(['pace', 'jquery', 'layui', 'bootstrap', 'jquery.cookies'], function () {
    layui.config({dir: baseUrl + '../plugins/layui/'});
    layui.use(['layer', 'form'], function () {
        window.layer = layui.layer;
        window.form = layui.form;
        require(['admin.listen']);
    });
});