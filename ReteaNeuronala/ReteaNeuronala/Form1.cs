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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void ReteaNouaButton_Click(object sender, EventArgs e)
        {
            ReteaNoua reteaNoua = new ReteaNoua();
            reteaNoua.ShowDialog();
        }

        private void CreazaReteabutton_Click(object sender, EventArgs e)
        {
            if (!ecranretea.Controls.Contains(NeuronGraf.Graf))
            {
                ecranretea.Controls.Add(NeuronGraf.Graf);
                NeuronGraf.Graf.Dock = DockStyle.Fill;
                NeuronGraf.Graf.BringToFront();
            }
            else if (!ecranretea.Controls.Contains(NeuronGraf2.Graf2))
            {
                ecranretea.Controls.Add(NeuronGraf2.Graf2);
                NeuronGraf2.Graf2.Dock = DockStyle.Fill;
                NeuronGraf2.Graf2.BringToFront();
            }
        }

        private void Outputbutton_Click(object sender, EventArgs e)
        {
            OL oL = new OL();
            oL.ShowDialog();
        }
    }
}
