import java.time.LocalDate;

public class Entity {

    private String BTKM;
    private String M0374;
    private LocalDate tarix = LocalDate.now();
    private String kimden;
    private String neUcun;
    private float mebleg;

    public String getBTKM() {
        return BTKM;
    }

    public void setBTKM(String BTKM) {
        this.BTKM = BTKM;
    }

    public String getM0374() {
        return M0374;
    }

    public void setM0374(String m0374) {
        M0374 = m0374;
    }

    public LocalDate getTarix() {
        return tarix;
    }

    public void setTarix(LocalDate tarix) {
        this.tarix = tarix;
    }

    public String getKimden() {
        return kimden;
    }

    public void setKimden(String kimden) {
        this.kimden = kimden;
    }

    public String getNeUcun() {
        return neUcun;
    }

    public void setNeUcun(String neUcun) {
        this.neUcun = neUcun;
    }

    public float getMebleg() {
        return mebleg;
    }

    public void setMebleg(float mebleg) {
        this.mebleg = mebleg;
    }
}
