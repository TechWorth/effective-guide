public class Alert extends Bulletin {
    public String cname, sname;
    public int dist;
    public Boolean x = true;

    public Alert(String cname, String sname, int dist, boolean x) {
        if (ticks <= 24) {
            this.sname = getStorm();
            this.cname = getCountryName();
            this.dist = getETA();
        }
    }

    public String getCountryName() {
        Country x = new Country();
        return x.getName();
    }

    public String getStorm() {
        Storm y = new Storm();
        return y.getName();

    }

    public int getETA() {
        Storm z = new Storm();
        if (ticks <= 24) {
            ticks = distance / speed;
            return ticks;
        }
    }
}