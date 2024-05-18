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
    public partial class NeuronGraf : UserControl
    {
        List<Button> buttons /*= new List<Button>*/ = null;
        private double input;
        
        private static NeuronGraf graf;

        public static NeuronGraf Graf
        {
            get
            {
                if (graf == null)
                    graf = new NeuronGraf();
                return graf;
            }
        }
        public NeuronGraf()
        {
            InitializeComponent();
            buttons = new List<Button>() { neuron, neuron2, button3, button4, button5, button6, button7 };
        }

        private void NeuronGraf_Load(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {
            
            Graphics graphics = this.panel1.CreateGraphics();
            Pen pen = new Pen(Color.Green, 2);
            //prim-mij
            PointF pointF = new PointF(39.0F, 50.0F);
            PointF pointF2 = new PointF(176.0F, 110.0F);
            graphics.DrawLine(pen,pointF,pointF2);
            e.Graphics.DrawLine(pen, pointF, pointF2);
            //prim-sus
            PointF pointF3 = new PointF(39.0F, 50.0F);
            PointF pointF4 = new PointF(176.0F, 19.0F);
            graphics.DrawLine(pen, pointF3, pointF4);
            e.Graphics.DrawLine(pen, pointF3, pointF4);
            //prim-jos
            PointF pointF5 = new PointF(39.0F, 50.0F);
            PointF pointF6 = new PointF(176.0F, 193.0F);
            graphics.DrawLine(pen, pointF5, pointF6);
            e.Graphics.DrawLine(pen, pointF5, pointF6);
            //doilea-sus
            PointF pointF7 = new PointF(27.0F, 152.0F);
            PointF pointF8 = new PointF(275.0F, -95.0F);
            graphics.DrawLine(pen, pointF7, pointF8);
            e.Graphics.DrawLine(pen, pointF7, pointF8);
            //doilea-mij
            PointF pointF9 = new PointF(27.0F, 152.0F);
            PointF pointF10 = new PointF(190.0F, 100.0F);
            graphics.DrawLine(pen, pointF9, pointF10);
            e.Graphics.DrawLine(pen, pointF9, pointF10);
            //doilea-jos
            PointF pointF11 = new PointF(27.0F, 152.0F);
            PointF pointF12 = new PointF(193.0F, 195.0F);
            graphics.DrawLine(pen, pointF11, pointF12);
            e.Graphics.DrawLine(pen, pointF11, pointF12);
            //mij-sus
            PointF pointF13 = new PointF(190.0F, 100.0F);
            PointF pointF14 = new PointF(330.0F, 55.0F);
            graphics.DrawLine(pen, pointF13, pointF14);
            e.Graphics.DrawLine(pen, pointF13, pointF14);
            //mij-jos
            PointF pointF15 = new PointF(165.0F, 100.0F);
            PointF pointF16 = new PointF(379.0F, 227.0F);
            graphics.DrawLine(pen, pointF15, pointF16);
            e.Graphics.DrawLine(pen, pointF15, pointF16);
            //jos-mijstanga
            PointF pointF17 = new PointF(166.0F, 189.0F);
            PointF pointF18 = new PointF(319.0F, 90.0F);
            graphics.DrawLine(pen, pointF17, pointF18);
            e.Graphics.DrawLine(pen, pointF17, pointF18);
            //jos-josstanga
            PointF pointF19 = new PointF(166.0F, 189.0F);
            PointF pointF20 = new PointF(314.0F, 165.0F);
            graphics.DrawLine(pen, pointF19, pointF20);
            e.Graphics.DrawLine(pen, pointF19, pointF20);
            //sus-mijstanga
            PointF pointF21 = new PointF(163.0F, 25.0F);
            PointF pointF22 = new PointF(344.0F, 165.0F);
            graphics.DrawLine(pen, pointF21, pointF22);
            e.Graphics.DrawLine(pen, pointF21, pointF22);
            //sus-susstanga
            PointF pointF23 = new PointF(163.0F, 25.0F);
            PointF pointF24 = new PointF(330.0F, 73.0F);
            graphics.DrawLine(pen, pointF23, pointF24);
            e.Graphics.DrawLine(pen, pointF23, pointF24);

        }
        //Input Layer
        private void neuron_Click(object sender, EventArgs e)
        {
            InputLayers inputLayers = new InputLayers();
            inputLayers.ShowDialog();
        }

        
        private void neuron2_Click(object sender, EventArgs e)
        {
            InputLayers inputLayers = new InputLayers();
            inputLayers.ShowDialog();
        }

        //Activation Layers
        private void button3_Click(object sender, EventArgs e)
        {
            ActivationLayers outputLayers = new ActivationLayers();
            outputLayers.ShowDialog();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ActivationLayers outputLayers = new ActivationLayers();
            outputLayers.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            ActivationLayers outputLayers = new ActivationLayers();
            outputLayers.ShowDialog();
        }

        //Output Layers
        private void button5_Click(object sender, EventArgs e)
        {
            ActivationLayers outputLayers = new ActivationLayers();
            outputLayers.ShowDialog();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            ActivationLayers outputLayers = new ActivationLayers();
            outputLayers.ShowDialog();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            ActivationLayers outputLayers = new ActivationLayers();
            outputLayers.ShowDialog();
        }

    }
}
