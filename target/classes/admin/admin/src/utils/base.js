const base = {
    get() {
        return {
            url : "http://localhost:8080/qiuduixunlianxinxi/",
            name: "qiuduixunlianxinxi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/qiuduixunlianxinxi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "球队训练信息管理系统"
        } 
    }
}
export default base
