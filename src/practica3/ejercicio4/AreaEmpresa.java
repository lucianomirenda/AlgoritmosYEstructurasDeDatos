package practica3.ejercicio4;

public class AreaEmpresa {

    private String area;
    private int lag;

    public AreaEmpresa(int lag, String area) {
        this.area = area;
        this.lag = lag;
    }

    public int getLag() {
        return lag;
    }

    public void setLag(int lag) {
        this.lag = lag;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
