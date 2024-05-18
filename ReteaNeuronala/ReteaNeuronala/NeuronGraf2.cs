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
    public partial class NeuronGraf2 : UserControl
    {
        List<Button> buttons = null;
        private static NeuronGraf2 graf2;

        public static NeuronGraf2 Graf2
        {
            get
            {
                if (graf2 == null)
                    graf2 = new NeuronGraf2();
                return graf2;
            }
        }
        public NeuronGraf2()
        {
            InitializeComponent();

            buttons = new List<Button>() { neuron };
        }
    }
}
