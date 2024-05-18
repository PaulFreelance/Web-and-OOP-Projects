using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proiect3_RecunoastereMonede
{
    public class BackProp
    {
        private ReteaNeuron rn;
        private Set S;
        private double invatare;
        private double[] error;
        private double[,] dwij, dwjk;
        public double MeanSquareError { get; private set; }
        public BackProp(ReteaNeuron Rn, Set s)
        {
            S = s;
            rn = Rn;
            dwij = new double[rn.Intrari + 1, rn.Active];
            dwjk = new double[rn.Active + 1, rn.Iesiri];
        }
        public void Antrenare(double learningRate, int maxEpoca, double maxError)
        {
            invatare = learningRate;
            MeanSquareError = double.MaxValue;
            int Epocacurenta = 1;
            throw new Exception("Metoda trebuie implementata");
        }
        private void AntrenareEpoca()
        {
            double Eroaretotal = 0;
            error = new double[S.Output];
            for (int i = 0; i < S.Vector; i++)
            {
                double[] inputvector = new double[S.Input];
                for (int j = 0; j < S.Input; j++)
                    inputvector[i] = S.Data[i, j];
                rn.Propagate(inputvector);

                double[] outputvector = new double[rn.Iesiri];
                for (int k = 0; k < S.Output; k++)
                {
                    outputvector[k] = S.Data[i, rn.Intrari + i];
                    Backward(inputvector, outputvector);
                }
                for (int l = 0; l < S.Output; l++)
                    Eroaretotal += error[l] * error[l];


            }
            throw new Exception("Metoda trebuie implementata");
        }
        private void Backward(double[] inputvector, double[] outputvector)
        {
            throw new Exception("Metoda trebuie implementata");
        }
        private void ResetDeltaW()
        {
            for (int i = 0; i < rn.Intrari; i++)
                for (int j = 0; j < rn.Active; j++)
                    dwij[i, j] = 0;
            for (int j = 0; j < rn.Active; j++)
                for (int k = 0; k < rn.Iesiri; k++)
                    dwjk[j, k] = 0;
        }
        private void Update()
        {
            for (int j = 0; j < rn.Active; j++)
                for (int i = 0; i < rn.Intrari; i++)
                    rn.HiddenLayer[j].lungime[i] += dwij[i, j];
            for (int k = 0; k < rn.Iesiri; k++)
                for (int j = 0; j < rn.Active; j++)
                    rn.Output[k].lungime[j] += dwjk[j, k];
        }

        internal void Antrenare(object learningRate, object maxEpoca, object maxError)
        {
            throw new NotImplementedException();
        }
    }
}
