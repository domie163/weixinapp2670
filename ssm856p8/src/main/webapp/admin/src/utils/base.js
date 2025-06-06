const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm856p8/",
            name: "ssm856p8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm856p8/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "优选驾考小程序"
        } 
    }
}
export default base
