using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proiect3_RecunoastereMonede
{
    public class Neuron : Sigmoidala
    {
        public double[] lungime { get; set; }
        public double Activare { get; private set; }
        private int lungimi;
        private static Random random = new Random();
        public Neuron(int lungimibias)
        {
            lungimi = lungimibias;
            lungime = new double[lungimi];
            for(int i = 0; i < lungimi; i++)
            {
                lungime[i] = Init();
            }
        }
        private double Init()
        {
            double j = 0;
            while (Math.Abs(j) < 1e-6)
            {
                j = random.NextDouble() / 5.0 - 0.1;
            }
            return j;
        }
        public void Activate(double[] x)
        {
            double k = 0;
            for(int i = 0; i < lungimi - 1; i++)
            {
                k += lungime[i] * x[i];
                k += lungime[lungimi - 1] * 1.0;
                Activare = Sigmoid(k);
            }
        }
    }
}
