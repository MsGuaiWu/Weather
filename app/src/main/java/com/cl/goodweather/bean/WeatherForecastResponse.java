package com.cl.goodweather.bean;

import java.util.List;

public class WeatherForecastResponse {

    private List<HeWeather6Bean> HeWeather6;

    public List<HeWeather6Bean> getHeWeather6() {
        return HeWeather6;
    }

    public void setHeWeather6(List<HeWeather6Bean> HeWeather6) {
        this.HeWeather6 = HeWeather6;
    }

    public static class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101280603","location":"福田","parent_city":"深圳","admin_area":"广东省","cnty":"中国","lat":"22.5410099","lon":"114.05095673","tz":"+8.00"}
         * update : {"loc":"2020-12-20 14:49","utc":"2020-12-20 06:49"}
         * status : ok
         * daily_forecast : [{"cond_code_d":"104","cond_code_n":"104","cond_txt_d":"阴","cond_txt_n":"阴","date":"2020-12-20","hum":"50","mr":"11:36","ms":"23:15","pcpn":"0.0","pop":"7","pres":"1015","sr":"06:59","ss":"17:44","tmp_max":"17","tmp_min":"11","uv_index":"4","vis":"25","wind_deg":"0","wind_dir":"北风","wind_sc":"3-4","wind_spd":"16"},{"cond_code_d":"104","cond_code_n":"101","cond_txt_d":"阴","cond_txt_n":"多云","date":"2020-12-21","hum":"48","mr":"12:11","ms":"00:00","pcpn":"0.0","pop":"3","pres":"1013","sr":"07:00","ss":"17:45","tmp_max":"18","tmp_min":"12","uv_index":"2","vis":"25","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"10"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2020-12-22","hum":"68","mr":"12:44","ms":"00:06","pcpn":"0.0","pop":"11","pres":"1010","sr":"07:00","ss":"17:45","tmp_max":"19","tmp_min":"14","uv_index":"4","vis":"24","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"},{"cond_code_d":"305","cond_code_n":"305","cond_txt_d":"小雨","cond_txt_n":"小雨","date":"2020-12-23","hum":"75","mr":"13:16","ms":"00:56","pcpn":"5.1","pop":"80","pres":"1009","sr":"07:00","ss":"17:46","tmp_max":"19","tmp_min":"15","uv_index":"1","vis":"24","wind_deg":"45","wind_dir":"东北风","wind_sc":"3-4","wind_spd":"16"},{"cond_code_d":"305","cond_code_n":"101","cond_txt_d":"小雨","cond_txt_n":"多云","date":"2020-12-24","hum":"78","mr":"13:48","ms":"01:45","pcpn":"1.0","pop":"55","pres":"1010","sr":"07:01","ss":"17:46","tmp_max":"20","tmp_min":"13","uv_index":"2","vis":"25","wind_deg":"45","wind_dir":"东北风","wind_sc":"1-2","wind_spd":"4"},{"cond_code_d":"101","cond_code_n":"101","cond_txt_d":"多云","cond_txt_n":"多云","date":"2020-12-25","hum":"79","mr":"14:21","ms":"02:34","pcpn":"0.0","pop":"4","pres":"1010","sr":"07:01","ss":"17:47","tmp_max":"20","tmp_min":"16","uv_index":"4","vis":"25","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"},{"cond_code_d":"305","cond_code_n":"101","cond_txt_d":"小雨","cond_txt_n":"多云","date":"2020-12-26","hum":"76","mr":"14:56","ms":"03:25","pcpn":"1.0","pop":"55","pres":"1006","sr":"07:02","ss":"17:48","tmp_max":"21","tmp_min":"17","uv_index":"1","vis":"24","wind_deg":"0","wind_dir":"北风","wind_sc":"1-2","wind_spd":"3"}]
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private List<DailyForecastBean> daily_forecast;

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

        public List<DailyForecastBean> getDaily_forecast() {
            return daily_forecast;
        }

        public void setDaily_forecast(List<DailyForecastBean> daily_forecast) {
            this.daily_forecast = daily_forecast;
        }

        public static class BasicBean {
            /**
             * cid : CN101280603
             * location : 福田
             * parent_city : 深圳
             * admin_area : 广东省
             * cnty : 中国
             * lat : 22.5410099
             * lon : 114.05095673
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
             * loc : 2020-12-20 14:49
             * utc : 2020-12-20 06:49
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

        public static class DailyForecastBean {
            /**
             * cond_code_d : 104
             * cond_code_n : 104
             * cond_txt_d : 阴
             * cond_txt_n : 阴
             * date : 2020-12-20
             * hum : 50
             * mr : 11:36
             * ms : 23:15
             * pcpn : 0.0
             * pop : 7
             * pres : 1015
             * sr : 06:59
             * ss : 17:44
             * tmp_max : 17
             * tmp_min : 11
             * uv_index : 4
             * vis : 25
             * wind_deg : 0
             * wind_dir : 北风
             * wind_sc : 3-4
             * wind_spd : 16
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
    }
}
