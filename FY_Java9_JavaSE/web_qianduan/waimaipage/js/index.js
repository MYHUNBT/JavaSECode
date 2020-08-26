window.onload = function () {
    document.onscroll = function () {
        // 获取滚动条的纵坐标值
        let s1 = document.documentElement.scrollTop; // pc端
        let s2 = document.body.scrollTop;  //移动端
        let scroll = (s1 == 0? s2:s1);
        // console.log(scroll);
        //视口宽度
        let height = document.documentElement.clientHeight;
        // console.log(width*0.12)
        if(scroll > height*0.12){
            search.style.position = 'fixed';
            search.style.top = 0;
            search.style.left = 0;
        }else {
            search.style.position = 'static';
        }
    }
}