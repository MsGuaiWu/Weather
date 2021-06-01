package com.cl.goodweather.bean;

import java.util.List;

public class WeatherResponse {

    private List<HeWeather6Bean> HeWeather6;

    public List<HeWeather6Bean> getHeWeather6() {
        return HeWeather6;
    }

    public void setHeWeather6(List<HeWeather6Bean> HeWeather6) {
        this.HeWeather6 = HeWeather6;
    }

    public static class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101280601","location":"深圳","parent_city":"深圳","admin_area":"广东省","cnty":"中国","lat":"22.54700089","lon":"114.08594513","tz":"+8.00"}
         * update : {"loc":"2021-02-09 16:51","utc":"2021-02-09 08:51"}
         * status : ok
         * now : {"cloud":"94","cond_code":"104","cond_txt":"阴","fl":"17","hum":"71","pcpn":"0.0","pres":"1008","tmp":"18","vis":"24","wind_deg":"90","wind_dir":"东风","wind_sc":"2","wind_spd":"8"}
         * daily_forecast : [{"cond_code_d":"104","cond_code_n":"307","cond_txt_d":"阴","cond_txt_n":"大雨","date":"2021-02-09","hum":"82","mr":"04:52","ms":"15:49","pcpn":"0.0","pop":"25","pres":"1006","sr":"06:58","ss":"18:17","tmp_max":"21","tmp_min":"14","uv_index":"2","vis":"11","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"},{"cond_code_d":"310","cond_code_n":"101","cond_txt_d":"暴雨","cond_txt_n":"多云","date":"2021-02-10","hum":"86","mr":"05:48","ms":"16:50","pcpn":"18.9","pop":"82","pres":"1006","sr":"06:57","ss":"18:18","tmp_max":"18","tmp_min":"14","uv_index":"2","vis":"24","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2021-02-11","hum":"71","mr":"06:38","ms":"17:50","pcpn":"0.0","pop":"25","pres":"1007","sr":"06:57","ss":"18:18","tmp_max":"23","tmp_min":"15","uv_index":"4","vis":"25","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2021-02-12","hum":"79","mr":"07:23","ms":"18:48","pcpn":"0.0","pop":"2","pres":"1008","sr":"06:56","ss":"18:19","tmp_max":"24","tmp_min":"16","uv_index":"6","vis":"25","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"},{"cond_code_d":"101","cond_code_n":"100","cond_txt_d":"多云","cond_txt_n":"晴","date":"2021-02-13","hum":"77","mr":"08:02","ms":"19:44","pcpn":"0.0","pop":"25","pres":"1007","sr":"06:55","ss":"18:20","tmp_max":"24","tmp_min":"17","uv_index":"6","vis":"25","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"},{"cond_code_d":"100","cond_code_n":"100","cond_txt_d":"晴","cond_txt_n":"晴","date":"2021-02-14","hum":"75","mr":"08:38","ms":"20:36","pcpn":"0.0","pop":"25","pres":"1005","sr":"06:55","ss":"18:20","tmp_max":"25","tmp_min":"17","uv_index":"6","vis":"25","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"},{"cond_code_d":"305","cond_code_n":"100","cond_txt_d":"小雨","cond_txt_n":"晴","date":"2021-02-15","hum":"81","mr":"09:12","ms":"21:28","pcpn":"1.0","pop":"55","pres":"1006","sr":"06:54","ss":"18:21","tmp_max":"22","tmp_min":"16","uv_index":"5","vis":"25","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"}]
         * hourly : [{"cloud":"97","cond_code":"101","cond_txt":"多云","dew":"15","hum":"83","pop":"43","pres":"1005","time":"2021-02-09 19:00","tmp":"17","wind_deg":"121","wind_dir":"东南风","wind_sc":"3-4","wind_spd":"13"},{"cloud":"97","cond_code":"305","cond_txt":"小雨","dew":"15","hum":"99","pop":"76","pres":"1006","time":"2021-02-09 22:00","tmp":"15","wind_deg":"98","wind_dir":"东风","wind_sc":"3-4","wind_spd":"14"},{"cloud":"92","cond_code":"101","cond_txt":"多云","dew":"13","hum":"90","pop":"25","pres":"1008","time":"2021-02-10 01:00","tmp":"15","wind_deg":"92","wind_dir":"东风","wind_sc":"3-4","wind_spd":"16"},{"cloud":"96","cond_code":"101","cond_txt":"多云","dew":"13","hum":"92","pop":"20","pres":"1007","time":"2021-02-10 04:00","tmp":"15","wind_deg":"56","wind_dir":"东北风","wind_sc":"1-2","wind_spd":"11"},{"cloud":"100","cond_code":"101","cond_txt":"多云","dew":"14","hum":"100","pop":"7","pres":"1005","time":"2021-02-10 07:00","tmp":"14","wind_deg":"7","wind_dir":"北风","wind_sc":"1-2","wind_spd":"9"},{"cloud":"100","cond_code":"101","cond_txt":"多云","dew":"13","hum":"81","pop":"7","pres":"1006","time":"2021-02-10 10:00","tmp":"17","wind_deg":"17","wind_dir":"东北风","wind_sc":"3-4","wind_spd":"13"},{"cloud":"100","cond_code":"305","cond_txt":"小雨","dew":"13","hum":"83","pop":"69","pres":"1007","time":"2021-02-10 13:00","tmp":"16","wind_deg":"52","wind_dir":"东北风","wind_sc":"3-4","wind_spd":"13"},{"cloud":"79","cond_code":"305","cond_txt":"小雨","dew":"14","hum":"85","pop":"60","pres":"1007","time":"2021-02-10 16:00","tmp":"16","wind_deg":"39","wind_dir":"东北风","wind_sc":"3-4","wind_spd":"13"}]
         * lifestyle : [{"type":"comf","brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},{"type":"drsg","brf":"较舒适","txt":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"type":"flu","brf":"极易发","txt":"将有一次强降温过程，天气寒冷，且空气湿度较大，极易发生感冒，请特别注意增加衣服保暖防寒。"},{"type":"sport","brf":"较适宜","txt":"阴天，较适宜进行各种户内外运动。"},{"type":"trav","brf":"适宜","txt":"天气较好，温度适宜，总体来说还是好天气哦，这样的天气适宜旅游，您可以尽情地享受大自然的风光。"},{"type":"uv","brf":"最弱","txt":"属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"},{"type":"cw","brf":"不宜","txt":"不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"},{"type":"air","brf":"较差","txt":"气象条件较不利于空气污染物稀释、扩散和清除，请适当减少室外活动时间。"}]
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private NowBean now;
        private List<DailyForecastBean> daily_forecast;
        private List<HourlyBean> hourly;
        private List<LifestyleBean> lifestyle;

        public BasicBean getBasic() {
            return basic;
        }

        public void setBasic(BasicBean basic) {
            this.basic = basic;
        }

        public UpdateBean getUpdate() {
            return update;
        }

        public void setUpdate(UpdateBean update) {
            this.update = update;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public NowBean getNow() {
            return now;
        }

        public void setNow(NowBean now) {
            this.now = now;
        }

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public List<HourlyBean> getHourly() {
            return hourly;
        }

        public void setHourly(List<HourlyBean> hourly) {
            this.hourly = hourly;
        }

        public List<LifestyleBean> getLifestyle() {
            return lifestyle;
        }

        public void setLifestyle(List<LifestyleBean> lifestyle) {
            this.lifestyle = lifestyle;
        }

        public static class BasicBean {
            /**
             * cid : CN101280601
             * location : 深圳
             * parent_city : 深圳
             * admin_area : 广东省
             * cnty : 中国
             * lat : 22.54700089
             * lon : 114.08594513
             * tz : +8.00
             */

            private String cid;
            private String location;
            private String parent_city;
            private String admin_area;
            private String cnty;
            private String lat;
            private String lon;
            private String tz;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getParent_city() {
                return parent_city;
            }

            public void setParent_city(String parent_city) {
                this.parent_city = parent_city;
            }

            public String getAdmin_area() {
                return admin_area;
            }

            public void setAdmin_area(String admin_area) {
                this.admin_area = admin_area;
            }

            public String getCnty() {
                return cnty;
            }

            public void setCnty(String cnty) {
                this.cnty = cnty;
            }

            public String getLat() {
                return lat;
            }

            public void setLat(String lat) {
                this.lat = lat;
            }

            public String getLon() {
                return lon;
            }

            public void setLon(String lon) {
                this.lon = lon;
            }

            public String getTz() {
                return tz;
            }

            public void setTz(String tz) {
                this.tz = tz;
            }
        }

        public static class UpdateBean {
            /**
             * loc : 2021-02-09 16:51
             * utc : 2021-02-09 08:51
             */

            private String loc;
            private String utc;

            public String getLoc() {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }

        public static class NowBean {
            /**
             * cloud : 94
             * cond_code : 104
             * cond_txt : 阴
             * fl : 17
             * hum : 71
             * pcpn : 0.0
             * pres : 1008
             * tmp : 18
             * vis : 24
             * wind_deg : 90
             * wind_dir : 东风
             * wind_sc : 2
             * wind_spd : 8
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class DailyForecastBean {
            /**
             * cond_code_d : 104
             * cond_code_n : 307
             * cond_txt_d : 阴
             * cond_txt_n : 大雨
             * date : 2021-02-09
             * hum : 82
             * mr : 04:52
             * ms : 15:49
             * pcpn : 0.0
             * pop : 25
             * pres : 1006
             * sr : 06:58
             * ss : 18:17
             * tmp_max : 21
             * tmp_min : 14
             * uv_index : 2
             * vis : 11
             * wind_deg : 0
             * wind_dir : 北风
             * wind_sc : 1-2
             * wind_spd : 3
             */

            private String cond_code_d;
            private String cond_code_n;
            private String cond_txt_d;
            private String cond_txt_n;
            private String date;
            private String hum;
            private String mr;
            private String ms;
            private String pcpn;
            private String pop;
            private String pres;
            private String sr;
            private String ss;
            private String tmp_max;
            private String tmp_min;
            private String uv_index;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCond_code_d() {
                return cond_code_d;
            }

            public void setCond_code_d(String cond_code_d) {
                this.cond_code_d = cond_code_d;
            }

            public String getCond_code_n() {
                return cond_code_n;
            }

            public void setCond_code_n(String cond_code_n) {
                this.cond_code_n = cond_code_n;
            }

            public String getCond_txt_d() {
                return cond_txt_d;
            }

            public void setCond_txt_d(String cond_txt_d) {
                this.cond_txt_d = cond_txt_d;
            }

            public String getCond_txt_n() {
                return cond_txt_n;
            }

            public void setCond_txt_n(String cond_txt_n) {
                this.cond_txt_n = cond_txt_n;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getPcpn() {
                return pcpn;
            }

            public void setPcpn(String pcpn) {
                this.pcpn = pcpn;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }

            public String getTmp_max() {
                return tmp_max;
            }

            public void setTmp_max(String tmp_max) {
                this.tmp_max = tmp_max;
            }

            public String getTmp_min() {
                return tmp_min;
            }

            public void setTmp_min(String tmp_min) {
                this.tmp_min = tmp_min;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getVis() {
                return vis;
            }

            public void setVis(String vis) {
                this.vis = vis;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class HourlyBean {
            /**
             * cloud : 97
             * cond_code : 101
             * cond_txt : 多云
             * dew : 15
             * hum : 83
             * pop : 43
             * pres : 1005
             * time : 2021-02-09 19:00
             * tmp : 17
             * wind_deg : 121
             * wind_dir : 东南风
             * wind_sc : 3-4
             * wind_spd : 13
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String dew;
            private String hum;
            private String pop;
            private String pres;
            private String time;
            private String tmp;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;

            public String getCloud() {
                return cloud;
            }

            public void setCloud(String cloud) {
                this.cloud = cloud;
            }

            public String getCond_code() {
                return cond_code;
            }

            public void setCond_code(String cond_code) {
                this.cond_code = cond_code;
            }

            public String getCond_txt() {
                return cond_txt;
            }

            public void setCond_txt(String cond_txt) {
                this.cond_txt = cond_txt;
            }

            public String getDew() {
                return dew;
            }

            public void setDew(String dew) {
                this.dew = dew;
            }

            public String getHum() {
                return hum;
            }

            public void setHum(String hum) {
                this.hum = hum;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPres() {
                return pres;
            }

            public void setPres(String pres) {
                this.pres = pres;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getTmp() {
                return tmp;
            }

            public void setTmp(String tmp) {
                this.tmp = tmp;
            }

            public String getWind_deg() {
                return wind_deg;
            }

            public void setWind_deg(String wind_deg) {
                this.wind_deg = wind_deg;
            }

            public String getWind_dir() {
                return wind_dir;
            }

            public void setWind_dir(String wind_dir) {
                this.wind_dir = wind_dir;
            }

            public String getWind_sc() {
                return wind_sc;
            }

            public void setWind_sc(String wind_sc) {
                this.wind_sc = wind_sc;
            }

            public String getWind_spd() {
                return wind_spd;
            }

            public void setWind_spd(String wind_spd) {
                this.wind_spd = wind_spd;
            }
        }

        public static class LifestyleBean {
            /**
             * type : comf
             * brf : 舒适
             * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
             */

            private String type;
            private String brf;
            private String txt;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }
}
