package com.ycl.findstation.util;
import java.util.*;
/**
 * the helper class that stores the map of attribute and definitions
 * Note: this is not a complete list
 * @author yinchenli
 *
 */
public class WeatherElementHelper {
    
    private Map<String, String> map = new HashMap<>();
    
    public WeatherElementHelper(){
        this.map.put("PRCP", "Precipitation (tenths of mm)");
        this.map.put("SNOW", "Snowfall (mm)");
        this.map.put("SNWD", "SnowDepth (mm)");
        this.map.put("TMAX", "Maximum temperature (tenths of degrees C)");
        this.map.put("TMIN", "Minimum temperature (tenths of degrees C)");
        this.map.put("ACMH", "Average cloudiness midnight to midnight from manual observations (percent)");
        this.map.put("ACSC", "Average cloudiness sunrise to sunset from 30-second ceilometer data (percent)");
        this.map.put("ACSH", "Average cloudiness sunrise to sunset from manual observations (percent)");
        this.map.put("AWDR", "Average daily wind direction (degrees)");
        this.map.put("AWND", "Average daily wind speed (tenths of meters per second)");
        this.map.put("DAEV", "Number of days included in the multiday evaporation total (MDEV)");
        this.map.put("DAPR", "Number of days included in the multiday precipiation total (MDPR)");
        this.map.put("DASF", "Number of days included in the multiday snowfall total (MDSF)");
        this.map.put("DATN", "Number of days included in the multiday minimum temperature (MDTN)");
        this.map.put("DATX", "Number of days included in the multiday maximum temperature (MDTX)");
        this.map.put("DAWM", "Number of days included in the multiday wind movement(MDWM)");
        this.map.put("MNPN", "Daily minimum temperature of water in an evaporation pan (tenths of degrees C)");
        this.map.put("MXPN", "Daily maximum temperature of water in an evaporation pan (tenths of degrees C)");
        this.map.put("PGTM", "Peak gust time (hours and minutes, i.e., HHMM)");
        this.map.put("PSUN", "Daily percent of possible sunshine (percent)");
        this.map.put("THIC", "Thickness of ice on water (tenths of mm)");
        this.map.put("TOBS", "Temperature at the time of observation (tenths of degrees C)");
        this.map.put("TSUN", "Average Temperature");
        this.map.put("TAVG", "Daily total sunshine (minutes)");
        this.map.put("WDF1", "Direction of fastest 1-minute wind (degrees)");
        this.map.put("WDF2", "Direction of fastest 2-minute wind (degrees)");
        this.map.put("WDF5", "Direction of fastest 5-second wind (degrees)");
        this.map.put("WDFG", "Direction of peak wind gust (degrees)");
        this.map.put("WDFI", "Direction of highest instantaneous wind (degrees)");
        this.map.put("WDFM", "Fastest mile wind direction (degrees)");
        this.map.put("WDMV", "24-hour wind movement (km)");
        this.map.put("WESD", "Water equivalent of snow on the ground (tenths of mm)");
        this.map.put("WESF", "Water equivalent of snowfall (tenths of mm)");
        this.map.put("WSF1", "Fastest 1-minute wind speed (tenths of meters per second)");
        this.map.put("WSF2", "Fastest 2-minute wind speed (tenths of meters per second)");
        this.map.put("WSF5", "Fastest 5-second wind speed (tenths of meters per second)");
        this.map.put("WSFG", "Peak gust wind speed (tenths of meters per second)");
        this.map.put("WSFI", "Highest instantaneous wind speed (tenths of meters per second)");
        this.map.put("WSFM", "Fastest mile wind speed (tenths of meters per second)");
        this.map.put("WT01", "Fog, ice fog, or freezing fog (may include heavy fog)");
        this.map.put("WT02", "Heavy fog or heaving freezing fog (not always distinquished from fog)");
        this.map.put("WT03", "Thunder");
        this.map.put("WT04", "Ice pellets, sleet, snow pellets, or small hail ");
        this.map.put("WT05", "Hail (may include small hail)");
        this.map.put("WT06", "Glaze or rime");
        this.map.put("WT07", "Dust, volcanic ash, blowing dust, blowing sand, or blowing obstruction");
        this.map.put("WT08", "Smoke or haze");
        

    }
    
    public Map<String, String> getMap() {
        return this.map;
    }
    

    

}
