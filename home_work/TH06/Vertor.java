public class Vertor {
    protected int n;
    protected double[] mang = new double[n];
    public Vertor()
    {

    }
    public Vertor(int n)
    {
        this.n = n;
    }
    public Vertor(double[] mang, int n)
    {
        this.mang = mang;
        this.n = n;
    }

    public double dodai()
    {
        double x = 0;
        for(int i=0; i<n; i++)
        {
            x += mang[i] * mang [i];
        }
        return Math.sqrt(x);
    }

    public Vertor cong(Vertor x, Vertor y, Vertor z)
    {
        for(int i=0; i<n; i++)
        {
            z.mang[i] = x.mang[i] + y.mang[i];
        }
        return z;
    }

    public Vertor tru(Vertor x, Vertor y, Vertor z)
    {
        for(int i=0; i<n; i++)
        {
            z.mang[i] = x.mang[i] - y.mang[i];
        }
        return z;
    }

    public Vertor nhan(Vertor x, int m)
    {
        for(int i=0; i<n; i++)
        {
            x.mang[i] = x.mang[i] * m;
        }
        return x;
    }

    public Vertor chia(Vertor x, double m)
    {
        for(int i=0; i<n; i++)
        {
            x.mang[i] = x.mang[i] / m;
        }
        return x;
    }

    public Vertor vtdonvi(Vertor x)
    {
        return x.chia(x, x.dodai());
    }

    public String toString()
    {
        String s = "( ";
        for(int i=0; i<n; i++)
        {
            s += Double.toString(mang[i]) + " ";
        }
        s += ")";
        return s;
    }

    public void display()
    {
        System.out.print("Vector: ");
        for(int i=0; i<n; i++)
        {               
            System.out.print(mang[i] + " ");
        }
    }
}
