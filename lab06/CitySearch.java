/**
 * Created by Khadija on 3/29/2017.
 */
public class CitySearch {
    private int id;
    private String city;
    private double lat, lon;     //latitude/longitude of cities

    CitySearch(){
        this.id=0;
        this.lat=0;
        this.lon=0;
        this.city=null;
    }

    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }

    public String getcity() { return city; }
    public void setcity(String firstcity) {
        this.city = firstcity;
    }

    public double getLat() { return lat; }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLon() { return lon; }
    public void setLon(double lon) {
        this.lon = lon;
    }
}
