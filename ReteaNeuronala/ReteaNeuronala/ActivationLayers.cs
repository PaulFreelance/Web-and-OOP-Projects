using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ReteaNeuronala
{
    public partial class ActivationLayers : Form
    {
        public ActivationLayers()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void Close_Click(object sender, EventArgs e)
        {
            Dispose();
        }
        //Input Function
        private void IF_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }
        //Activation Function
        private void AF_SelectedIndexChanged(object sender, EventArgs e)
        {
            Sigmoidala();
        }

        private void Sigmoidala()
        {
            throw new NotImplementedException();
        }

        public double Sigmoidala(double n)
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
