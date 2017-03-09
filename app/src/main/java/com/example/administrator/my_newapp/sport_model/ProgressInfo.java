package com.example.administrator.my_newapp.sport_model;

import java.util.List;

/**
 * Created by Administrator on 2017/2/28.
 */
public class ProgressInfo  {


    @Override
    public String toString() {
        return "ProgressInfo{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }




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
                    "title='" + title + '\'' +
                    ", statuslist=" + statuslist +
                    ", list=" + list +
                    ", teammatch=" + teammatch +
                    '}';
        }
        private String title;
        private StatuslistBean statuslist;
        private List<ListBean> list;
        private List<TeammatchBean> teammatch;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public StatuslistBean getStatuslist() {
            return statuslist;
        }

        public void setStatuslist(StatuslistBean statuslist) {
            this.statuslist = statuslist;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public List<TeammatchBean> getTeammatch() {
            return teammatch;
        }

        public void setTeammatch(List<TeammatchBean> teammatch) {
            this.teammatch = teammatch;
        }

        public static class StatuslistBean {
            @Override
            public String toString() {
                return "StatuslistBean{" +
                        "st0='" + st0 + '\'' +
                        ", st1='" + st1 + '\'' +
                        ", st2='" + st2 + '\'' +
                        '}';
            }

            /**
             * st0 : 未开赛
             * st1 : 直播中
             * st2 : 已结束
             */


            private String st0;
            private String st1;
            private String st2;

            public String getSt0() {
                return st0;
            }

            public void setSt0(String st0) {
                this.st0 = st0;
            }

            public String getSt1() {
                return st1;
            }

            public void setSt1(String st1) {
                this.st1 = st1;
            }

            public String getSt2() {
                return st2;
            }

            public void setSt2(String st2) {
                this.st2 = st2;
            }
        }

        public static class ListBean {
            @Override
            public String toString() {
                return "ListBean{" +
                        "title='" + title + '\'' +
                        ", tr=" + tr +
                        ", bottomlink=" + bottomlink +
                        ", live=" + live +
                        ", livelink=" + livelink +
                        '}';
            }

            /**
             * title : 02-27 周一
             * tr : [{"time":"02/27 04:30","player1":"马刺","player2":"湖人","player1logo":"http://p7.qhmsg.com/t01865a1ad0b0987285.png?size=78x78","player2logo":"http://p8.qhmsg.com/t018b634f8a252b4177.png?size=78x78","player1logobig":"http://p7.qhmsg.com/t01865a1ad0b0987285.png?size=78x78","player2logobig":"http://p8.qhmsg.com/t018b634f8a252b4177.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=13","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469839","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469839%26title%3D%25E9%25A9%25AC%25E5%2588%25BAVS%25E6%25B9%2596%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=e65826&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469839","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469839%26title%3D%25E9%25A9%25AC%25E5%2588%25BAVS%25E6%25B9%2596%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=e65826&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","status":2,"score":"119-98","link1text":"视频集锦"},{"time":"02/27 04:30","player1":"太阳","player2":"雄鹿","player1logo":"http://p9.qhmsg.com/t01b949ab71ba5b6da6.png?size=78x78","player2logo":"http://p7.qhmsg.com/t010d8c56ac56f4de6b.png?size=78x78","player1logobig":"http://p9.qhmsg.com/t01b949ab71ba5b6da6.png?size=78x78","player2logobig":"http://p7.qhmsg.com/t010d8c56ac56f4de6b.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=21","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=15","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469840","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469840%26title%3D%25E5%25A4%25AA%25E9%2598%25B3VS%25E9%259B%2584%25E9%25B9%25BF%26ptag%3D360.onebox.schedule.nba&m=7fde21&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469840","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469840%26title%3D%25E5%25A4%25AA%25E9%2598%25B3VS%25E9%259B%2584%25E9%25B9%25BF%26ptag%3D360.onebox.schedule.nba&m=7fde21&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","status":2,"score":"96-100","link1text":"视频集锦"},{"time":"02/27 06:00","player1":"灰熊","player2":"掘金","player1logo":"http://p6.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logo":"http://p1.qhmsg.com/t01c366fdb3044d96db.png?size=78x78","player1logobig":"http://p6.qhmsg.com/t01c6cd06b91021cabb.png?size=78x78","player2logobig":"http://p1.qhmsg.com/t01c366fdb3044d96db.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=29","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=7","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469841","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469841%26title%3D%25E7%2581%25B0%25E7%2586%258AVS%25E6%258E%2598%25E9%2587%2591%26ptag%3D360.onebox.schedule.nba&m=4a10ae&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469841","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469841%26title%3D%25E7%2581%25B0%25E7%2586%258AVS%25E6%258E%2598%25E9%2587%2591%26ptag%3D360.onebox.schedule.nba&m=4a10ae&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","status":2,"score":"105-98","link1text":"视频集锦"},{"time":"02/27 06:00","player1":"爵士","player2":"奇才","player1logo":"http://p3.qhmsg.com/t01fd6c067295c676d3.png?size=78x78","player2logo":"http://p5.qhmsg.com/t010558d60306395e77.png?size=78x78","player1logobig":"http://p3.qhmsg.com/t01fd6c067295c676d3.png?size=78x78","player2logobig":"http://p5.qhmsg.com/t010558d60306395e77.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=26","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=27","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469842","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469842%26title%3D%25E7%2588%25B5%25E5%25A3%25ABVS%25E5%25A5%2587%25E6%2589%258D%26ptag%3D360.onebox.schedule.nba&m=bd4590&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469842","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469842%26title%3D%25E7%2588%25B5%25E5%25A3%25ABVS%25E5%25A5%2587%25E6%2589%258D%26ptag%3D360.onebox.schedule.nba&m=bd4590&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","status":2,"score":"102-92","link1text":"视频集锦"},{"time":"02/27 07:00","player1":"开拓者","player2":"猛龙","player1logo":"http://p0.qhmsg.com/t01fdabb4fd4f401729.png?size=78x78","player2logo":"http://p4.qhmsg.com/t0126c995f7a0e28ef3.png?size=78x78","player1logobig":"http://p0.qhmsg.com/t01fdabb4fd4f401729.png?size=78x78","player2logobig":"http://p4.qhmsg.com/t0126c995f7a0e28ef3.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=22","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=28","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469843","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469843%26title%3D%25E5%25BC%2580%25E6%258B%2593%25E8%2580%2585VS%25E7%258C%259B%25E9%25BE%2599%26ptag%3D360.onebox.schedule.nba&m=d47bbc&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469843","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469843%26title%3D%25E5%25BC%2580%25E6%258B%2593%25E8%2580%2585VS%25E7%258C%259B%25E9%25BE%2599%26ptag%3D360.onebox.schedule.nba&m=d47bbc&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","status":2,"score":"106-112","link1text":"视频集锦"},{"time":"02/27 07:00","player1":"凯尔特人","player2":"活塞","player1logo":"http://p4.qhmsg.com/t019f61e3222cd24332.png?size=78x78","player2logo":"http://p4.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player1logobig":"http://p4.qhmsg.com/t019f61e3222cd24332.png?size=78x78","player2logobig":"http://p4.qhmsg.com/t01a80ea5beeff44608.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=2","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=8","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469844","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469844%26title%3D%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BAVS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=39e2dd&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469844","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469844%26title%3D%25E5%2587%25AF%25E5%25B0%2594%25E7%2589%25B9%25E4%25BA%25BAVS%25E6%25B4%25BB%25E5%25A1%259E%26ptag%3D360.onebox.schedule.nba&m=39e2dd&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","status":2,"score":"104-98","link1text":"视频集锦"},{"time":"02/27 08:00","player1":"鹈鹕","player2":"雷霆","player1logo":"http://p7.qhmsg.com/t010415e17c8ec18459.png?size=78x78","player2logo":"http://p6.qhmsg.com/t0198101dee56f2e9e6.png?size=78x78","player1logobig":"http://p7.qhmsg.com/t010415e17c8ec18459.png?size=78x78","player2logobig":"http://p6.qhmsg.com/t0198101dee56f2e9e6.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=3","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=25","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469845","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469845%26title%3D%25E9%25B9%2588%25E9%25B9%2595VS%25E9%259B%25B7%25E9%259C%2586%26ptag%3D360.onebox.schedule.nba&m=20f998&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469845","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469845%26title%3D%25E9%25B9%2588%25E9%25B9%2595VS%25E9%259B%25B7%25E9%259C%2586%26ptag%3D360.onebox.schedule.nba&m=20f998&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","status":2,"score":"110-118","link1text":"视频集锦"},{"time":"02/27 10:30","player1":"黄蜂","player2":"快船","player1logo":"http://p2.qhmsg.com/t011105782c37d4f1c8.png?size=78x78","player2logo":"http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78","player1logobig":"http://p2.qhmsg.com/t011105782c37d4f1c8.png?size=78x78","player2logobig":"http://p7.qhmsg.com/t01ac22731d284b6005.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=30","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=12","link1url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469846","m_link1url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469846%26title%3D%25E9%25BB%2584%25E8%259C%2582VS%25E5%25BF%25AB%25E8%2588%25B9%26ptag%3D360.onebox.schedule.nba&m=3c7aca&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","link2text":"技术统计","link2url":"http://nba.stats.qq.com/nbascore/?mid=1469846","m_link2url":"http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469846%26title%3D%25E9%25BB%2584%25E8%259C%2582VS%25E5%25BF%25AB%25E8%2588%25B9%26ptag%3D360.onebox.schedule.nba&m=3c7aca&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5","status":2,"score":"121-124","link1text":"视频集锦"}]
             * bottomlink : [{"text":"常规赛赛程","url":"http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba"},{"text":"球队排名","url":"http://sports.qq.com/nba/standings/?ptag=360.onebox.schedule.nba"},{"text":"球员排名","url":"http://nba.stats.qq.com/stats/?ptag=360.onebox.schedule.nba"},{"text":"社区讨论","url":"http://sports.qq.com/fans/group.htm?mid=69"}]
             * live : [{"title":"11:30开赛 第2节进行中","player1":"森林狼","player2":"国王","player1info":"胜23负36西部12名","player2info":"胜25负34西部9名","player1logobig":"http://p7.qhmsg.com/t0101b9d3f51b24df5c.png?size=78x78","player2logobig":"http://p5.qhmsg.com/t0179411022c3587ba2.png?size=78x78","player1url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16","player2url":"http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23","player1location":"(客)","player2location":"(主)","status":1,"score":"34-31","liveurl":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469478"}]
             * livelink : [{"text":"视频直播","url":"http://sports.qq.com/kbsweb/game.htm?mid=100000:1469478"},{"text":"技术统计","url":"http://nba.stats.qq.com/nbascore/?mid=1469478"}]
             */


            private String title;
            private List<TrBean> tr;
            private List<BottomlinkBean> bottomlink;
            private List<LiveBean> live;
            private List<LivelinkBean> livelink;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<TrBean> getTr() {
                return tr;
            }

            public void setTr(List<TrBean> tr) {
                this.tr = tr;
            }

            public List<BottomlinkBean> getBottomlink() {
                return bottomlink;
            }

            public void setBottomlink(List<BottomlinkBean> bottomlink) {
                this.bottomlink = bottomlink;
            }

            public List<LiveBean> getLive() {
                return live;
            }

            public void setLive(List<LiveBean> live) {
                this.live = live;
            }

            public List<LivelinkBean> getLivelink() {
                return livelink;
            }

            public void setLivelink(List<LivelinkBean> livelink) {
                this.livelink = livelink;
            }

            public static class TrBean {
                @Override
                public String toString() {
                    return "TrBean{" +
                            "time='" + time + '\'' +
                            ", player1='" + player1 + '\'' +
                            ", player2='" + player2 + '\'' +
                            ", player1logo='" + player1logo + '\'' +
                            ", player2logo='" + player2logo + '\'' +
                            ", player1logobig='" + player1logobig + '\'' +
                            ", player2logobig='" + player2logobig + '\'' +
                            ", player1url='" + player1url + '\'' +
                            ", player2url='" + player2url + '\'' +
                            ", link1url='" + link1url + '\'' +
                            ", m_link1url='" + m_link1url + '\'' +
                            ", link2text='" + link2text + '\'' +
                            ", link2url='" + link2url + '\'' +
                            ", m_link2url='" + m_link2url + '\'' +
                            ", status=" + status +
                            ", score='" + score + '\'' +
                            ", link1text='" + link1text + '\'' +
                            '}';
                }

                /**
                 * time : 02/27 04:30
                 * player1 : 马刺
                 * player2 : 湖人
                 * player1logo : http://p7.qhmsg.com/t01865a1ad0b0987285.png?size=78x78
                 * player2logo : http://p8.qhmsg.com/t018b634f8a252b4177.png?size=78x78
                 * player1logobig : http://p7.qhmsg.com/t01865a1ad0b0987285.png?size=78x78
                 * player2logobig : http://p8.qhmsg.com/t018b634f8a252b4177.png?size=78x78
                 * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=24
                 * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=13
                 * link1url : http://sports.qq.com/kbsweb/game.htm?mid=100000:1469839
                 * m_link1url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469839%26title%3D%25E9%25A9%25AC%25E5%2588%25BAVS%25E6%25B9%2596%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=e65826&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5
                 * link2text : 技术统计
                 * link2url : http://nba.stats.qq.com/nbascore/?mid=1469839
                 * m_link2url : http://j.www.haosou.com/?u=http%3A%2F%2Fsports.qq.com%2Fkbsweb%2Fkbsshare%2Fgame.htm%3Fmid%3D100000%3A1469839%26title%3D%25E9%25A9%25AC%25E5%2588%25BAVS%25E6%25B9%2596%25E4%25BA%25BA%26ptag%3D360.onebox.schedule.nba&m=e65826&from=juhe&type=nba_new&juid=JH19e2ad6775611e63beceb758b76500d5
                 * status : 2
                 * score : 119-98
                 * link1text : 视频集锦
                 */



                private String time;
                private String player1;
                private String player2;
                private String player1logo;
                private String player2logo;
                private String player1logobig;
                private String player2logobig;
                private String player1url;
                private String player2url;
                private String link1url;
                private String m_link1url;
                private String link2text;
                private String link2url;
                private String m_link2url;
                private int status;
                private String score;
                private String link1text;

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer1logo() {
                    return player1logo;
                }

                public void setPlayer1logo(String player1logo) {
                    this.player1logo = player1logo;
                }

                public String getPlayer2logo() {
                    return player2logo;
                }

                public void setPlayer2logo(String player2logo) {
                    this.player2logo = player2logo;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getLink1url() {
                    return link1url;
                }

                public void setLink1url(String link1url) {
                    this.link1url = link1url;
                }

                public String getM_link1url() {
                    return m_link1url;
                }

                public void setM_link1url(String m_link1url) {
                    this.m_link1url = m_link1url;
                }

                public String getLink2text() {
                    return link2text;
                }

                public void setLink2text(String link2text) {
                    this.link2text = link2text;
                }

                public String getLink2url() {
                    return link2url;
                }

                public void setLink2url(String link2url) {
                    this.link2url = link2url;
                }

                public String getM_link2url() {
                    return m_link2url;
                }

                public void setM_link2url(String m_link2url) {
                    this.m_link2url = m_link2url;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public String getLink1text() {
                    return link1text;
                }

                public void setLink1text(String link1text) {
                    this.link1text = link1text;
                }
            }

            public static class BottomlinkBean {
                @Override
                public String toString() {
                    return "BottomlinkBean{" +
                            "text='" + text + '\'' +
                            ", url='" + url + '\'' +
                            '}';
                }

                /**
                 * text : 常规赛赛程
                 * url : http://sports.qq.com/nba/schedule/?ptag=360.onebox.schedule.nba
                 */


                private String text;
                private String url;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class LiveBean {
                /**
                 * title : 11:30开赛 第2节进行中
                 * player1 : 森林狼
                 * player2 : 国王
                 * player1info : 胜23负36西部12名
                 * player2info : 胜25负34西部9名
                 * player1logobig : http://p7.qhmsg.com/t0101b9d3f51b24df5c.png?size=78x78
                 * player2logobig : http://p5.qhmsg.com/t0179411022c3587ba2.png?size=78x78
                 * player1url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=16
                 * player2url : http://kbs.sports.qq.com/kbsweb/teams.htm?tid=23
                 * player1location : (客)
                 * player2location : (主)
                 * status : 1
                 * score : 34-31
                 * liveurl : http://sports.qq.com/kbsweb/game.htm?mid=100000:1469478
                 */



                private String title;
                private String player1;
                private String player2;
                private String player1info;
                private String player2info;
                private String player1logobig;
                private String player2logobig;
                private String player1url;
                private String player2url;
                private String player1location;
                private String player2location;
                private int status;
                private String score;
                private String liveurl;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getPlayer1() {
                    return player1;
                }

                public void setPlayer1(String player1) {
                    this.player1 = player1;
                }

                public String getPlayer2() {
                    return player2;
                }

                public void setPlayer2(String player2) {
                    this.player2 = player2;
                }

                public String getPlayer1info() {
                    return player1info;
                }

                public void setPlayer1info(String player1info) {
                    this.player1info = player1info;
                }

                public String getPlayer2info() {
                    return player2info;
                }

                public void setPlayer2info(String player2info) {
                    this.player2info = player2info;
                }

                public String getPlayer1logobig() {
                    return player1logobig;
                }

                public void setPlayer1logobig(String player1logobig) {
                    this.player1logobig = player1logobig;
                }

                public String getPlayer2logobig() {
                    return player2logobig;
                }

                public void setPlayer2logobig(String player2logobig) {
                    this.player2logobig = player2logobig;
                }

                public String getPlayer1url() {
                    return player1url;
                }

                public void setPlayer1url(String player1url) {
                    this.player1url = player1url;
                }

                public String getPlayer2url() {
                    return player2url;
                }

                public void setPlayer2url(String player2url) {
                    this.player2url = player2url;
                }

                public String getPlayer1location() {
                    return player1location;
                }

                public void setPlayer1location(String player1location) {
                    this.player1location = player1location;
                }

                public String getPlayer2location() {
                    return player2location;
                }

                public void setPlayer2location(String player2location) {
                    this.player2location = player2location;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getScore() {
                    return score;
                }

                public void setScore(String score) {
                    this.score = score;
                }

                public String getLiveurl() {
                    return liveurl;
                }

                public void setLiveurl(String liveurl) {
                    this.liveurl = liveurl;
                }
            }

            public static class LivelinkBean {
                /**
                 * text : 视频直播
                 * url : http://sports.qq.com/kbsweb/game.htm?mid=100000:1469478
                 */

                private String text;
                private String url;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }

        public static class TeammatchBean {
            /**
             * name : 老鹰
             * url : http://sports.qq.com/nba/schedule/?team=hawks
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
