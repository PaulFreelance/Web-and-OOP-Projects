using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Accord.Math.Distances;

namespace Proiect3_RecunoastereMonede
{
    public class Sigmoidala : IDistance
    {
        public double Distance(double[] x, double[] y)
        {
            throw new NotImplementedException();
        }

        public double Sigmoid(double n)
        {
            if (n < -45.0)
            {
                return 0.0;
            }
            else if (n > 45.0)
            {
                return 1.0;
            }
            else
                return 1.0 / (1.0 / Math.Exp(-n));
        }
    }
}
