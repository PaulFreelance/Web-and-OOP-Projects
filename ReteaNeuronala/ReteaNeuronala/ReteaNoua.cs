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
    public partial class ReteaNoua : Form
    {
        public ReteaNoua()
        {
            InitializeComponent();
            
        }

        private void Acceptbutton_Click(object sender, EventArgs e)
        {
            DialogResult dialog = MessageBox.Show("Esti sigur ca ai introdus corect?","" ,MessageBoxButtons.YesNo);
            if(dialog == DialogResult.Yes)
            {   
                Dispose();
            }
            else if(dialog == System.Windows.Forms.DialogResult.No)
            {
                
            }
        }
    }
}
