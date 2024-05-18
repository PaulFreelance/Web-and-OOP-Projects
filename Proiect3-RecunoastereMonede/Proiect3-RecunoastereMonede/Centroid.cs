using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Proiect3_RecunoastereMonede
{
    public class Centroid
    {
        private double[] _array;
        public double[] Array { get { return _array; } }

        private Color _color;
        public Color CentroidColor {get { return _color; } }
        public void Draw(PaintEventArgs e)
        {
            Graphics g = e.Graphics;
            g.FillEllipse(
            new SolidBrush(_color),
            (float)_array[0], (float)_array[1], 15, 15);

            foreach (double[] point in _closestPointsList)
            {
                g.DrawEllipse(new Pen(_color, 2.0f), (float)point[0], (float)point[1], 10, 10);
            }

        }
        private List<double[]> _oldPointsList;
        private List<double[]> _closestPointsList;
        public void addPoint(double[] close)
        {
            _closestPointsList.Add(close);
        }
        private static Random random = new Random();
         public Centroid(double[][] dataSet)
        {
            /*_color = Color.White;

            List<Tuple<double, double>> minMaxPoints;

            _array = new double[minMaxPoints.Count];
            int i = 0;
            foreach (Tuple<double, double> tuple in minMaxPoints)
            {
                double minimum = tuple.Item1;
                double maximum = tuple.Item2;
                double element = random.NextDouble() * (maximum - minimum) + minimum;
                _array[i] = element;
                i++;
            }**/

            _oldPointsList = new List<double[]>();
            _closestPointsList = new List<double[]>();
        }

    }
}
