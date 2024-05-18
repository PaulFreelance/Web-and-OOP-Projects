using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proiect3_RecunoastereMonede
{
    public class ReteaNeuron
    {
        public int Intrari{ get; private set; }
        public int Active { get; private set; }
        public int Iesiri { get; private set; }

        public Neuron[] HiddenLayer { get; private set; }
        public Neuron[] Output { get; private set; }
        public ReteaNeuron(int intrari,int active,int iesiri)
        {
            Intrari = intrari;
            Active = active;
            Iesiri = iesiri;
            HiddenLayer = new Neuron[active];
            for(int j = 0; j < Active; j++)
            {
                HiddenLayer[j] = new Neuron(Intrari + 1);
            }
            Output = new Neuron[Iesiri];
            for(int k = 0; k < Iesiri; k++)
            {
                Output[k] = new Neuron(Active + 1);
            }
        }
        public double[] Propagate(double[] v)
        {
            Forward(v);
            double[] y = new double[Iesiri];
            for(int k = 0; k < Iesiri; k++)
            {
                y[k] = Output[k].Activare;
            }
            return y;
        }
        private void Forward(double[] inputvector)
        {
            throw new Exception("Aceasta metoda trebuie implementata");
        }
    }
}
