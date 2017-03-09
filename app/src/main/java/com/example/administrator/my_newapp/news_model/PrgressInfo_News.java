package com.example.administrator.my_newapp.news_model;

import java.util.List;

/**
 * Created by Administrator on 2017/3/1.
 */
public class PrgressInfo_News {
    @Override
    public String toString() {
        return "PrgressInfo_News{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"309ffae81e301a92be05cbee3a369713","title":"上海共享汽车用户画像：高学历的80后、90后男性白领","date":"2017-03-01 22:14","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170301221451589.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_3_mwpm_03200403.jpeg"},{"uniquekey":"d0c961fb2543ce8e85301d52f2eb8253","title":"天津市委常委成其圣服用过量安眠药昏迷入院","date":"2017-03-01 22:02","category":"头条","author_name":"财经网","url":"http://mini.eastday.com/mobile/170301220237135.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170301/20170301220237_86a9219c8bd25d498c0fde4749da4173_1_mwpm_03200403.jpeg"},{"uniquekey":"8c16d86701ca8a7e297eab44f7110917","title":"法国温州商会会长胡镜平：跨境创业敢为人先 力行公益心怀大爱","date":"2017-03-01 21:57","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170301215747923.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301215747_785d5a2cde2733324e63d6cfa57fc9dc_1_mwpm_03200403.jpeg"},{"uniquekey":"6e0cfdf4aa49319849cc0b2c408a20af","title":"闽茶文化香溢巴黎","date":"2017-03-01 21:57","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170301215747729.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170301/20170301215747_79f433f930a925bac0bac7b643b98764_1_mwpm_03200403.jpeg"},{"uniquekey":"a559c1134a1d85fccd1e19e3a8115a87","title":"今日起，公积金贷款新政开始执行了！交了这么多年你知道怎么用吗？","date":"2017-03-01 21:41","category":"头条","author_name":"透明售房网湖州站","url":"http://mini.eastday.com/mobile/170301214151238.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301214151_480ba6046508842a16d9ab5971481418_1_mwpm_03200403.jpeg"},{"uniquekey":"21b5ff99ef85d871467bd596869f6d67","title":"冯远征谈\u201c艺考热\u201d： 明星和演员是两码事，小鲜肉IP热不会持久","date":"2017-03-01 21:39","category":"头条","author_name":"人民日报中央厨房","url":"http://mini.eastday.com/mobile/170301213901836.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170301/20170301213901_167fb88433411781e216ed6ae996a291_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170301/20170301213901_167fb88433411781e216ed6ae996a291_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170301/20170301213901_167fb88433411781e216ed6ae996a291_4_mwpm_03200403.jpeg"},{"uniquekey":"4d0f32791a01c7ef2298f30030d1c9b2","title":"宁波供应链创新学院启动硕士项目：上课横跨三大洲","date":"2017-03-01 21:38","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170301213847772.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170301/20170301213847_a27d5a0f2d3c2aaea3d9ef4cd71794e4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170301/20170301213847_a27d5a0f2d3c2aaea3d9ef4cd71794e4_2_mwpm_03200403.jpeg"},{"uniquekey":"381b5a41304e398063b59a2968e10000","title":"菊花一角值千元前景好? 然而这枚硬币估值高达300万","date":"2017-03-01 21:37","category":"头条","author_name":"猴子嘻哈","url":"http://mini.eastday.com/mobile/170301213726379.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170301/20170301_f51ffcb14a1f39c57dffe5bb4ff89f41_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170301/20170301_db21331756eaccfc243417a40b9b3ef7_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170301/20170301_c1793cef679e3f4244a9b6e3e89ef1e6_cover_mwpm_03200403.jpeg"},{"uniquekey":"57688344ffdc53c70f714bf9673afe41","title":"林志玲将嫁富豪,背后另有极其心酸的家庭因素","date":"2017-03-01 21:36","category":"头条","author_name":"闲聊八卦","url":"http://mini.eastday.com/mobile/170301213636182.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170301/20170301_0884225ade15c44b61b53c1d81fb3bf2_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170301/20170301_38d6abe0de3b9a3475e43a936df8bf0d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170301/20170301_5e345f9f4a491e3be27b0f69cdc88bf9_cover_mwpm_03200403.jpeg"},{"uniquekey":"492ca449f1dc4a9f0fefcffbb5734f0c","title":"命运的宠儿！一生好运多厄运少的3大生肖","date":"2017-03-01 21:36","category":"头条","author_name":"旅行有你陪伴着","url":"http://mini.eastday.com/mobile/170301213628467.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301_444f3e8b21b1094fdfbb6c108eecf469_mwpm_03200403.jpg"},{"uniquekey":"b4e62149ded77ab9dd427c0ebc5d3811","title":"住建部：我国首次启动卫星遥感监测全国所有城市违法建设","date":"2017-03-01 21:34","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170301213444737.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170301/20170301213444_eb01d60cf9aa273280f79fe11509a8d0_1_mwpm_03200403.jpeg"},{"uniquekey":"2ccdc77bc439b6892aebc4fc8a16e84c","title":"巴基斯坦总理：巴政府致力于全力推进中巴经济走廊建设","date":"2017-03-01 21:34","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170301213444345.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301213444_0d58daafd5a022c4df5d194abe174f46_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170301/20170301213444_0d58daafd5a022c4df5d194abe174f46_2_mwpm_03200403.jpeg"},{"uniquekey":"c8b1dc33df3f8de0e85e594ac16fd5a5","title":"内蒙古出台举措修护自治区内古长城：建工作站、开培训班","date":"2017-03-01 21:34","category":"头条","author_name":"中新网","url":"http://mini.eastday.com/mobile/170301213444201.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170301/20170301213444_9c27139d0d235f3d9072a49e29764c78_1_mwpm_03200403.jpeg"},{"uniquekey":"5f5221d4c143a9ec8c129d9c46c94f73","title":"无锡一高楼疑因大风导致水泥块坠落，路过女子被砸中身亡","date":"2017-03-01 21:34","category":"头条","author_name":"现代快报","url":"http://mini.eastday.com/mobile/170301213443758.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170301/20170301213443_04f8b4089f8f8167d0badfb0005bd631_1_mwpm_03200403.jpeg"},{"uniquekey":"5e7b10973f5a304e5d71cc5d1a34f43e","title":"华裔妻子游轮上消失 同行德国丈夫涉嫌谋杀被起诉","date":"2017-03-01 21:32","category":"头条","author_name":"红星新闻","url":"http://mini.eastday.com/mobile/170301213211061.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301213211_02a4bc36bd8b9248be83bede01914f53_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170301/20170301213211_02a4bc36bd8b9248be83bede01914f53_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170301/20170301213211_02a4bc36bd8b9248be83bede01914f53_3_mwpm_03200403.jpeg"},{"uniquekey":"6690b16cab701e90cb43d522d8ef7d4d","title":"马云怒开银行，银行睡不着了，这次马云再开医院，全国人民沸腾了","date":"2017-03-01 21:31","category":"头条","author_name":"科技互联网资讯","url":"http://mini.eastday.com/mobile/170301213151722.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170301/20170301_e444528293c3d0795b0f279726ea1317_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170301/20170301_c9a169d5d4a32256b70c6313a97109de_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170301/20170301_8e5398e6619f244f0d7714f92d44349b_cover_mwpm_03200403.jpeg"},{"uniquekey":"102ec60eb730d45ddd2fabbf58d77114","title":"特种钢材要求极高，打造航母\u201c钢筋铁骨\u201d","date":"2017-03-01 21:24","category":"头条","author_name":"微军事","url":"http://mini.eastday.com/mobile/170301212459560.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170301/20170301212459_b87ccebb3ad5ac548187fc50e8064785_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170301/20170301212459_b87ccebb3ad5ac548187fc50e8064785_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170301/20170301212459_b87ccebb3ad5ac548187fc50e8064785_3_mwpm_03200403.jpeg"},{"uniquekey":"f6b5e22a84ee71526bd4de67d2f3aa3c","title":"2017工资调整最新消息：事业单位是否会涨工资？","date":"2017-03-01 21:23","category":"头条","author_name":"南公爵无欢","url":"http://mini.eastday.com/mobile/170301212318826.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170301/20170301_9e33361ffea9ec5c96c6ab29ab4f1fd3_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170301/20170301_c1e6940b3751b03ba5b48a18f7c93d16_cover_mwpm_03200403.jpeg"},{"uniquekey":"79fc258ff61a577aad5c520144dde152","title":"全国\"两会\"将至 政协委员巩汉林连夜驻地报到","date":"2017-03-01 21:19","category":"头条","author_name":"北青网-北京青年报","url":"http://mini.eastday.com/mobile/170301211952107.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170301/20170301211952_6c85aa84b144df269a25e9b2521f1650_1_mwpm_03200403.png"},{"uniquekey":"de9f5b78ca2c98dac0521ff4b7cd0453","title":"抵制乐天这件事上，韩国群众也蛮卖力的","date":"2017-03-01 21:17","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170301211742076.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301211742_7ec5dae3ed18ceece362dfc73044cec4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170301/20170301211742_7ec5dae3ed18ceece362dfc73044cec4_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170301/20170301211742_7ec5dae3ed18ceece362dfc73044cec4_3_mwpm_03200403.jpeg"},{"uniquekey":"c6e8d0f99272ea90a2b208e485b90aae","title":"中国内地男演员实力排行榜 黄晓明上榜惹争议，第一名无人不服！","date":"2017-03-01 21:14","category":"头条","author_name":"星闻扒客","url":"http://mini.eastday.com/mobile/170301211435502.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170301/20170301_bceee6e8fc2b4b45942db64b63847a6d_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170301/20170301_b1f9cfb38057ab552d4f29743266113e_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170301/20170301_3f405b96a94260e00b50df28f0d89a51_cover_mwpm_03200403.jpeg"},{"uniquekey":"e966c9cf94deb43d39f55462c3d591c4","title":"揭秘\u201c谢阳遭酷刑\u201d真相：为迎合西方凭空捏造","date":"2017-03-01 21:12","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170301211200926.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301211200_40f2367c8cfad1f3057760db4fd0e40b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170301/20170301211200_40f2367c8cfad1f3057760db4fd0e40b_2_mwpm_03200403.jpeg"},{"uniquekey":"dafa0ab8df4d2e3d1441e9c541a1250d","title":"中国也有这样的，71岁天津白发奶奶，坚持健身11年活得像少女","date":"2017-03-01 21:11","category":"头条","author_name":"网红莫小溪","url":"http://mini.eastday.com/mobile/170301211154700.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170301/20170301_a7f12b730284a86042ae6dd9a3084133_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170301/20170301_a7646bd3359c1b271775b4e32c4f55a2_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170301/20170301_724cc9e541ec36d8379889c34eede9d8_cover_mwpm_03200403.jpeg"},{"uniquekey":"0904d51153fb24f17e7be97419e69f95","title":"周强：坚定不移地推进人民法院司法体制改革","date":"2017-03-01 21:03","category":"头条","author_name":"法制网","url":"http://mini.eastday.com/mobile/170301210324522.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170301/20170301210324_5998f5dee6fcd7d3888ec0f539c01a8a_1_mwpm_03200403.jpeg"},{"uniquekey":"912f4266dc31b7877c6174a8e7e80922","title":"欢乐升级！英国政要名人参加端煎饼乐跑大赛","date":"2017-03-01 21:03","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170301210308817.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170301/20170301210308_0284fc9e2d7cb097e89c713c1968b3d1_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170301/20170301210308_e89e26f4d444a383d4602a4300186137_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170301/20170301210308_ea68e7cab034d184f67ebe783ca4ff2a_3_mwpm_03200403.jpeg"},{"uniquekey":"3823f14bb5697d16f8be384b0813243c","title":"华为P10发布后震撼一幕：巨幅广告遍及巴塞罗那街头","date":"2017-03-01 20:57","category":"头条","author_name":"快科技","url":"http://mini.eastday.com/mobile/170301205729398.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170301/20170301205729_51753b2b921412bf5eeaefa925ad3dbf_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170301/20170301205729_51753b2b921412bf5eeaefa925ad3dbf_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170301/20170301205729_51753b2b921412bf5eeaefa925ad3dbf_3_mwpm_03200403.jpeg"},{"uniquekey":"aad01b5ae9cf4876836c0f37d148a9c8","title":"大清银币对上光绪元宝 究竟谁更胜一筹","date":"2017-03-01 20:56","category":"头条","author_name":"猴子嘻哈","url":"http://mini.eastday.com/mobile/170301205618885.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170301/20170301_674533b74d73de27217d20552afe878a_cover_mwpm_03200403.jpeg"},{"uniquekey":"49390187c6097c5c57fb074bb2b657f2","title":"墨西哥强硬回应美重修北美自贸协定：如不符合墨方利益将退出","date":"2017-03-01 20:56","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170301205616014.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301205616_ae142c1cf3d0fac07438e3cb53cf6d0c_1_mwpm_03200403.jpeg"},{"uniquekey":"b2fabb5d81143b667edbd0edc341ca5e","title":"中国财经内阁大换将","date":"2017-03-01 20:55","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170301205538002.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170301/20170301205538_bdc76f5c51af16e3fc9f0ae843660914_1_mwpm_03200403.jpeg"},{"uniquekey":"7c40967bd8fbf92b21238bd235b40c46","title":"她体重230斤的时候 杨树林娶了她现在她减110斤变女神","date":"2017-03-01 20:54","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/170301205416949.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301205416_c4426dae2437be33a8262cc9cf2ed288_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170301/20170301205416_c4426dae2437be33a8262cc9cf2ed288_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170301/20170301205416_c4426dae2437be33a8262cc9cf2ed288_3_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        /**
         * stat : 1
         * data : [{"uniquekey":"309ffae81e301a92be05cbee3a369713","title":"上海共享汽车用户画像：高学历的80后、90后男性白领","date":"2017-03-01 22:14","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170301221451589.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_3_mwpm_03200403.jpeg"},{"uniquekey":"d0c961fb2543ce8e85301d52f2eb8253","title":"天津市委常委成其圣服用过量安眠药昏迷入院","date":"2017-03-01 22:02","category":"头条","author_name":"财经网","url":"http://mini.eastday.com/mobile/170301220237135.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170301/20170301220237_86a9219c8bd25d498c0fde4749da4173_1_mwpm_03200403.jpeg"},{"uniquekey":"8c16d86701ca8a7e297eab44f7110917","title":"法国温州商会会长胡镜平：跨境创业敢为人先 力行公益心怀大爱","date":"2017-03-01 21:57","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170301215747923.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301215747_785d5a2cde2733324e63d6cfa57fc9dc_1_mwpm_03200403.jpeg"},{"uniquekey":"6e0cfdf4aa49319849cc0b2c408a20af","title":"闽茶文化香溢巴黎","date":"2017-03-01 21:57","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170301215747729.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170301/20170301215747_79f433f930a925bac0bac7b643b98764_1_mwpm_03200403.jpeg"},{"uniquekey":"a559c1134a1d85fccd1e19e3a8115a87","title":"今日起，公积金贷款新政开始执行了！交了这么多年你知道怎么用吗？","date":"2017-03-01 21:41","category":"头条","author_name":"透明售房网湖州站","url":"http://mini.eastday.com/mobile/170301214151238.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301214151_480ba6046508842a16d9ab5971481418_1_mwpm_03200403.jpeg"},{"uniquekey":"21b5ff99ef85d871467bd596869f6d67","title":"冯远征谈\u201c艺考热\u201d： 明星和演员是两码事，小鲜肉IP热不会持久","date":"2017-03-01 21:39","category":"头条","author_name":"人民日报中央厨房","url":"http://mini.eastday.com/mobile/170301213901836.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170301/20170301213901_167fb88433411781e216ed6ae996a291_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170301/20170301213901_167fb88433411781e216ed6ae996a291_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170301/20170301213901_167fb88433411781e216ed6ae996a291_4_mwpm_03200403.jpeg"},{"uniquekey":"4d0f32791a01c7ef2298f30030d1c9b2","title":"宁波供应链创新学院启动硕士项目：上课横跨三大洲","date":"2017-03-01 21:38","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170301213847772.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170301/20170301213847_a27d5a0f2d3c2aaea3d9ef4cd71794e4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170301/20170301213847_a27d5a0f2d3c2aaea3d9ef4cd71794e4_2_mwpm_03200403.jpeg"},{"uniquekey":"381b5a41304e398063b59a2968e10000","title":"菊花一角值千元前景好? 然而这枚硬币估值高达300万","date":"2017-03-01 21:37","category":"头条","author_name":"猴子嘻哈","url":"http://mini.eastday.com/mobile/170301213726379.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170301/20170301_f51ffcb14a1f39c57dffe5bb4ff89f41_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170301/20170301_db21331756eaccfc243417a40b9b3ef7_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170301/20170301_c1793cef679e3f4244a9b6e3e89ef1e6_cover_mwpm_03200403.jpeg"},{"uniquekey":"57688344ffdc53c70f714bf9673afe41","title":"林志玲将嫁富豪,背后另有极其心酸的家庭因素","date":"2017-03-01 21:36","category":"头条","author_name":"闲聊八卦","url":"http://mini.eastday.com/mobile/170301213636182.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170301/20170301_0884225ade15c44b61b53c1d81fb3bf2_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170301/20170301_38d6abe0de3b9a3475e43a936df8bf0d_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170301/20170301_5e345f9f4a491e3be27b0f69cdc88bf9_cover_mwpm_03200403.jpeg"},{"uniquekey":"492ca449f1dc4a9f0fefcffbb5734f0c","title":"命运的宠儿！一生好运多厄运少的3大生肖","date":"2017-03-01 21:36","category":"头条","author_name":"旅行有你陪伴着","url":"http://mini.eastday.com/mobile/170301213628467.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301_444f3e8b21b1094fdfbb6c108eecf469_mwpm_03200403.jpg"},{"uniquekey":"b4e62149ded77ab9dd427c0ebc5d3811","title":"住建部：我国首次启动卫星遥感监测全国所有城市违法建设","date":"2017-03-01 21:34","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170301213444737.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170301/20170301213444_eb01d60cf9aa273280f79fe11509a8d0_1_mwpm_03200403.jpeg"},{"uniquekey":"2ccdc77bc439b6892aebc4fc8a16e84c","title":"巴基斯坦总理：巴政府致力于全力推进中巴经济走廊建设","date":"2017-03-01 21:34","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170301213444345.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301213444_0d58daafd5a022c4df5d194abe174f46_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170301/20170301213444_0d58daafd5a022c4df5d194abe174f46_2_mwpm_03200403.jpeg"},{"uniquekey":"c8b1dc33df3f8de0e85e594ac16fd5a5","title":"内蒙古出台举措修护自治区内古长城：建工作站、开培训班","date":"2017-03-01 21:34","category":"头条","author_name":"中新网","url":"http://mini.eastday.com/mobile/170301213444201.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170301/20170301213444_9c27139d0d235f3d9072a49e29764c78_1_mwpm_03200403.jpeg"},{"uniquekey":"5f5221d4c143a9ec8c129d9c46c94f73","title":"无锡一高楼疑因大风导致水泥块坠落，路过女子被砸中身亡","date":"2017-03-01 21:34","category":"头条","author_name":"现代快报","url":"http://mini.eastday.com/mobile/170301213443758.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170301/20170301213443_04f8b4089f8f8167d0badfb0005bd631_1_mwpm_03200403.jpeg"},{"uniquekey":"5e7b10973f5a304e5d71cc5d1a34f43e","title":"华裔妻子游轮上消失 同行德国丈夫涉嫌谋杀被起诉","date":"2017-03-01 21:32","category":"头条","author_name":"红星新闻","url":"http://mini.eastday.com/mobile/170301213211061.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301213211_02a4bc36bd8b9248be83bede01914f53_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170301/20170301213211_02a4bc36bd8b9248be83bede01914f53_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170301/20170301213211_02a4bc36bd8b9248be83bede01914f53_3_mwpm_03200403.jpeg"},{"uniquekey":"6690b16cab701e90cb43d522d8ef7d4d","title":"马云怒开银行，银行睡不着了，这次马云再开医院，全国人民沸腾了","date":"2017-03-01 21:31","category":"头条","author_name":"科技互联网资讯","url":"http://mini.eastday.com/mobile/170301213151722.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170301/20170301_e444528293c3d0795b0f279726ea1317_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170301/20170301_c9a169d5d4a32256b70c6313a97109de_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170301/20170301_8e5398e6619f244f0d7714f92d44349b_cover_mwpm_03200403.jpeg"},{"uniquekey":"102ec60eb730d45ddd2fabbf58d77114","title":"特种钢材要求极高，打造航母\u201c钢筋铁骨\u201d","date":"2017-03-01 21:24","category":"头条","author_name":"微军事","url":"http://mini.eastday.com/mobile/170301212459560.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170301/20170301212459_b87ccebb3ad5ac548187fc50e8064785_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170301/20170301212459_b87ccebb3ad5ac548187fc50e8064785_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170301/20170301212459_b87ccebb3ad5ac548187fc50e8064785_3_mwpm_03200403.jpeg"},{"uniquekey":"f6b5e22a84ee71526bd4de67d2f3aa3c","title":"2017工资调整最新消息：事业单位是否会涨工资？","date":"2017-03-01 21:23","category":"头条","author_name":"南公爵无欢","url":"http://mini.eastday.com/mobile/170301212318826.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170301/20170301_9e33361ffea9ec5c96c6ab29ab4f1fd3_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170301/20170301_c1e6940b3751b03ba5b48a18f7c93d16_cover_mwpm_03200403.jpeg"},{"uniquekey":"79fc258ff61a577aad5c520144dde152","title":"全国\"两会\"将至 政协委员巩汉林连夜驻地报到","date":"2017-03-01 21:19","category":"头条","author_name":"北青网-北京青年报","url":"http://mini.eastday.com/mobile/170301211952107.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170301/20170301211952_6c85aa84b144df269a25e9b2521f1650_1_mwpm_03200403.png"},{"uniquekey":"de9f5b78ca2c98dac0521ff4b7cd0453","title":"抵制乐天这件事上，韩国群众也蛮卖力的","date":"2017-03-01 21:17","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170301211742076.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301211742_7ec5dae3ed18ceece362dfc73044cec4_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170301/20170301211742_7ec5dae3ed18ceece362dfc73044cec4_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170301/20170301211742_7ec5dae3ed18ceece362dfc73044cec4_3_mwpm_03200403.jpeg"},{"uniquekey":"c6e8d0f99272ea90a2b208e485b90aae","title":"中国内地男演员实力排行榜 黄晓明上榜惹争议，第一名无人不服！","date":"2017-03-01 21:14","category":"头条","author_name":"星闻扒客","url":"http://mini.eastday.com/mobile/170301211435502.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170301/20170301_bceee6e8fc2b4b45942db64b63847a6d_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170301/20170301_b1f9cfb38057ab552d4f29743266113e_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170301/20170301_3f405b96a94260e00b50df28f0d89a51_cover_mwpm_03200403.jpeg"},{"uniquekey":"e966c9cf94deb43d39f55462c3d591c4","title":"揭秘\u201c谢阳遭酷刑\u201d真相：为迎合西方凭空捏造","date":"2017-03-01 21:12","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170301211200926.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301211200_40f2367c8cfad1f3057760db4fd0e40b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170301/20170301211200_40f2367c8cfad1f3057760db4fd0e40b_2_mwpm_03200403.jpeg"},{"uniquekey":"dafa0ab8df4d2e3d1441e9c541a1250d","title":"中国也有这样的，71岁天津白发奶奶，坚持健身11年活得像少女","date":"2017-03-01 21:11","category":"头条","author_name":"网红莫小溪","url":"http://mini.eastday.com/mobile/170301211154700.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170301/20170301_a7f12b730284a86042ae6dd9a3084133_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170301/20170301_a7646bd3359c1b271775b4e32c4f55a2_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170301/20170301_724cc9e541ec36d8379889c34eede9d8_cover_mwpm_03200403.jpeg"},{"uniquekey":"0904d51153fb24f17e7be97419e69f95","title":"周强：坚定不移地推进人民法院司法体制改革","date":"2017-03-01 21:03","category":"头条","author_name":"法制网","url":"http://mini.eastday.com/mobile/170301210324522.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170301/20170301210324_5998f5dee6fcd7d3888ec0f539c01a8a_1_mwpm_03200403.jpeg"},{"uniquekey":"912f4266dc31b7877c6174a8e7e80922","title":"欢乐升级！英国政要名人参加端煎饼乐跑大赛","date":"2017-03-01 21:03","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170301210308817.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170301/20170301210308_0284fc9e2d7cb097e89c713c1968b3d1_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170301/20170301210308_e89e26f4d444a383d4602a4300186137_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170301/20170301210308_ea68e7cab034d184f67ebe783ca4ff2a_3_mwpm_03200403.jpeg"},{"uniquekey":"3823f14bb5697d16f8be384b0813243c","title":"华为P10发布后震撼一幕：巨幅广告遍及巴塞罗那街头","date":"2017-03-01 20:57","category":"头条","author_name":"快科技","url":"http://mini.eastday.com/mobile/170301205729398.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170301/20170301205729_51753b2b921412bf5eeaefa925ad3dbf_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170301/20170301205729_51753b2b921412bf5eeaefa925ad3dbf_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170301/20170301205729_51753b2b921412bf5eeaefa925ad3dbf_3_mwpm_03200403.jpeg"},{"uniquekey":"aad01b5ae9cf4876836c0f37d148a9c8","title":"大清银币对上光绪元宝 究竟谁更胜一筹","date":"2017-03-01 20:56","category":"头条","author_name":"猴子嘻哈","url":"http://mini.eastday.com/mobile/170301205618885.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170301/20170301_674533b74d73de27217d20552afe878a_cover_mwpm_03200403.jpeg"},{"uniquekey":"49390187c6097c5c57fb074bb2b657f2","title":"墨西哥强硬回应美重修北美自贸协定：如不符合墨方利益将退出","date":"2017-03-01 20:56","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170301205616014.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170301/20170301205616_ae142c1cf3d0fac07438e3cb53cf6d0c_1_mwpm_03200403.jpeg"},{"uniquekey":"b2fabb5d81143b667edbd0edc341ca5e","title":"中国财经内阁大换将","date":"2017-03-01 20:55","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170301205538002.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170301/20170301205538_bdc76f5c51af16e3fc9f0ae843660914_1_mwpm_03200403.jpeg"},{"uniquekey":"7c40967bd8fbf92b21238bd235b40c46","title":"她体重230斤的时候 杨树林娶了她现在她减110斤变女神","date":"2017-03-01 20:54","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/170301205416949.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170301/20170301205416_c4426dae2437be33a8262cc9cf2ed288_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170301/20170301205416_c4426dae2437be33a8262cc9cf2ed288_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170301/20170301205416_c4426dae2437be33a8262cc9cf2ed288_3_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }

            public DataBean(String thumbnail_pic_s, String url, String author_name, String title) {
                this.thumbnail_pic_s = thumbnail_pic_s;
                this.url = url;
                this.author_name = author_name;
                this.title = title;
            }

            /**
             * uniquekey : 309ffae81e301a92be05cbee3a369713
             * title : 上海共享汽车用户画像：高学历的80后、90后男性白领
             * date : 2017-03-01 22:14
             * category : 头条
             * author_name : 澎湃新闻
             * url : http://mini.eastday.com/mobile/170301221451589.html
             * thumbnail_pic_s : http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_1_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_2_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://06.imgmini.eastday.com/mobile/20170301/20170301221451_8b21eec22c6fffc5c8df264774dc9cc2_3_mwpm_03200403.jpeg
             */


            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
