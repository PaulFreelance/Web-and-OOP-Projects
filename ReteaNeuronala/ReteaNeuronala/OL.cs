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
    public partial class OL : Form
    {
        public OL()
        {
            InitializeComponent();
        }

        private void Close_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void textBoxGin_TextChanged(object sender, EventArgs e)
        {
            ActivationLayers activation = new ActivationLayers();
            string i = textBoxGin.Text;
            InputLayers input = new InputLayers();
           // textBoxGin.Text = (input.numericX.Value + input.numericW.Value).ToString();
        }
    }
}
