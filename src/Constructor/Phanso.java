package Constructor;

public class Phanso {
    private int tuSo;
    private int mauSo;

    public Phanso() {
        tuSo = 0;
        mauSo = 1;
    }

    public Phanso(int tuSo) {
        this.tuSo = tuSo;
        mauSo = 1;
    }

    public Phanso(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private void rutGon() {
        int ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }

    private int uocChungLonNhat(int tuSo, int mauSo) {
        if (tuSo == 0 || mauSo == 0) {
            return 1;
        }

        tuSo = Math.abs(tuSo);

        for (int i = tuSo; i >= 1; i--) {
            if (tuSo % i == 0 && mauSo % i == 0) {
                return i;
            }
        }
        return 1;

    }

    public void output() {
        rutGon();
        if (mauSo == 1) {
            System.out.println("Kết quả là: " + tuSo);
        } else {
            System.out.println("Kết quả là: " + tuSo + "/" + mauSo);
        }
    }

    public Phanso copy() {
        return new Phanso(tuSo, mauSo);
    }

    public void cong(int value) {
        tuSo += value * mauSo;
        rutGon();
    }
}
