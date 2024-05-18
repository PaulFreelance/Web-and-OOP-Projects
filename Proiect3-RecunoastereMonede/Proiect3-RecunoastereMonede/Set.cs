using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proiect3_RecunoastereMonede
{
    public class Set
    {
        private ReteaNeuron rn;
        public double[,] Data { get; private set; }
        public int Vector { get; private set; }
        public int Output { get; private set; }
        public int Input { get; private set; }
        public Set(string file)
        {
            StreamReader sr = new StreamReader(file);
            string[] atrings = sr.ReadLine().Split("\t\r\n,;".ToCharArray(), StringSplitOptions.RemoveEmptyEntries);
            Input = Convert.ToInt32(atrings[0]);
            Output = Convert.ToInt32(atrings[1]);
            Vector = Convert.ToInt32(atrings[2]);
            Data = new double[Vector, Input + Output];
            for(int i = 0; i < Vector; i++)
            {
                atrings = sr.ReadLine().Split("\t\r\n.;".ToCharArray(), StringSplitOptions.RemoveEmptyEntries);
                for(int j = 0; j < atrings.Length; j++)
                {
                    Data[i, j] = Convert.ToDouble(atrings[j]);
                }
                
            }
            sr.Close();
        }
        public void Scale()
        {
            for (int i = 0; i < Vector; i++)
                for (int j = 0; j < Input + Output; j++)
                    Data[i, j] = Data[i, j] * 0.8 + 0.1;
        }
        public void VectorScale(double[] vect)
        {
            for(int i = 0; i < vect.Length; i++)
            {
                vect[i] = vect[i] * 0.8 + 0.1;
            }
        }
        public void VectorReScale(double[] vect)
        {
            for(int i = 0; i < vect.Length; i++)
            {
                vect[i] = (vect[i] - 0.1) / 0.8;
                if (vect[i] > 1)
                {
                    vect[i] = 1;
                }
                if (vect[i] < 0)
                {
                    vect[i] = 0;
                }
            }
        }
    }
}
