/**
 * Created by Khadija on 3/29/2017.
 */
public class CitySearch {
    private int id;
    private String name;
    private double lat, lon;     //latitude/longitude of cities

    CitySearch(){
        this.id=0;
        this.lat=0;
        this.lon=0;
        this.name=null;
    }

    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String firstName) {
        this.name = firstName;
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
