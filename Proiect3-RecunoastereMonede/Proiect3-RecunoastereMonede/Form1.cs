using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.OleDb;
using Microsoft.Office.Interop.Excel;
using System.IO;
using ExcelDataReader;
using Accord.Math.Metrics;
using System.Globalization;
using ZedGraph;

namespace Proiect3_RecunoastereMonede
{
    public partial class Form1 : Form
    {
        private ReteaNeuron rn;
        private Set S;
        private double invatare;
        private double[] error;
        private BackProp back;
        //private List<double[]> dataset;
        private double[,] dwij, dwjk;
        public double MeanSquareError { get; private set; }
        
        public Form1()
        {
            InitializeComponent();
        }
        DataSet collection;
        private void Incarca_Click(object sender, EventArgs e)
        {
            using(OpenFileDialog dialog = new OpenFileDialog() { Filter="Excel Workbook|*.xls", ValidateNames = true })
            {
                if(dialog.ShowDialog() == DialogResult.OK)
                {
                    FileStream fileStream = File.Open(dialog.FileName, FileMode.Open, FileAccess.Read);
                    IExcelDataReader reader = ExcelReaderFactory.CreateBinaryReader(fileStream);
                    //reader = true;
                    collection = reader.AsDataSet();
                    dataGridViewValori.DataSource = collection.Tables[0];
                }
            }
        }
        private void comboBoxFileDate_SelectedIndexChanged(object sender, EventArgs e)
        {
           // System.Data.DataTable dt = collection[comboBoxFileDate.SelectedIndex.ToString()];
            //dataGridViewValori.DataSource = dt;
        }

        private void Proccess_Click(object sender, EventArgs e)
        {
            /*
            BackgroundWorker worker = new BackgroundWorker();
            worker.WorkerReportsProgress = true;*/
            CultureInfo ci = (CultureInfo)(CultureInfo.CurrentCulture.Clone());
            ci.NumberFormat.NumberDecimalSeparator = ".";
            int maxEpoca = Convert.ToInt32(textBoxEpoca.Text);
            int HiddenNeuron = Convert.ToInt32(comboBoxFileDate.Text);
            double learningRate = Convert.ToDouble(textBoxLearnRate.Text, ci);
            double maxError = Convert.ToDouble(textBoxError.Text, ci);
            rn = new ReteaNeuron(S.Input,HiddenNeuron,S.Output);
            back = new BackProp(rn,S);
            back.Antrenare(learningRate, maxEpoca, maxError);
            richTextBoxAntrenament.Text = string.Format("MSE={0:F3}\r\n\r\n", back.MeanSquareError);
            richTextBoxAntrenament.Text += "Rezultatul in urma atrenarii:\r\n\r\n";
            for(int i = 0; i < S.Vector; i++)
            {
                string s = "";
                double[] output = rn.Propagate(GetVectorFromDatabase(i));
                S.VectorReScale(output);
                for (int j = 0; j < S.Output; j++)
                    s += output[j].ToString("2") + "";
                richTextBoxAntrenament.Text += s + "\r\n";
            }
            richTextBoxAntrenament.Focus();

        }
        private double[] GetVectorFromDatabase(int i)
        {
            double[] d = new double[S.Input];
            for (int k = 0; k < S.Input; k++)
                d[k] = S.Data[i, k];
            return d;
        }
        private void buttonProp_Click(object sender, EventArgs e)
        {
            richTextBoxTestare.Clear();
            double[] test = GenerateTest();
            string s = "";
            for(int i = 0; i < S.Input; i++)
            {
                s += string.Format("{0:F0}", test[i]);
                
            }
            richTextBoxTestare.Text += s + "\r\n\r\n";
            double max = double.MinValue;
            int maxind = -1;
            S.VectorScale(test);
            double[] output = rn.Propagate(test);
            S.VectorReScale(output);
            s = "Iesire:\r";
            for (int i = 0; i < S.Output; i++)
            {
                s += string.Format("{0:F2}", output[i]);
                if (output[i] > max)
                {
                    max = output[i];
                    maxind = i;
                }
            }
            richTextBoxTestare.Text += s + "\r\n\r\n";
            richTextBoxTestare.Text += string.Format("", maxind);
            richTextBoxTestare.Focus();
        }

        private double[] GenerateTest()
        {
            throw new NotImplementedException();
        }
        Random random = new Random();
        private double[] RandomWalk(int points = 5, double start = 100, double mult = 50)
        {
            // return an array of difting random numbers
            double[] values = new double[points];
            values[0] = start;
            for (int i = 1; i < points; i++)
                values[i] = values[i - 1] + (random.NextDouble() - .5) * mult;
            return values;
        }

        GraphPane graphPane;

        private void DrawLine()
        {
            PointPairList pointPairs = new PointPairList();

            for(int angle = 0; angle <= 300; angle = angle+ 10)
            {
                double x = angle;
                double y = Math.Sin(Math.PI * x / 180.0);

                PointPair pointPair = new PointPair(x, y);

                pointPairs.Add(pointPair);
            }
            LineItem lineItem = graphPane.AddCurve("", pointPairs, Color.Blue, SymbolType.None);
            zedGraphControl1.AxisChange();
        }
        private void zedGraphControl1_Load(object sender, EventArgs e)
        {
            int pointCount = 100_000;
            double[] xs = RandomWalk(pointCount);
            double[] ys1 = RandomWalk(pointCount);

            zedGraphControl1.GraphPane.CurveList.Clear();

            var curve1 = zedGraphControl1.GraphPane.AddCurve("Series A", xs, ys1, Color.Blue);
            curve1.Line.IsAntiAlias = true;
            curve1.Symbol.IsVisible = false;

            zedGraphControl1.GraphPane.XAxis.ResetAutoScale(zedGraphControl1.GraphPane, CreateGraphics());
            zedGraphControl1.GraphPane.YAxis.ResetAutoScale(zedGraphControl1.GraphPane, CreateGraphics());
            zedGraphControl1.Refresh();
            DrawLine();
        }

        private double[] GenerateText(int j)
        {
            double[] n = new double[S.Input];
            return n;
        }
        public double Tahn(double n)
        {
            if (n < -45.0)
                return -1.0;
            else if (n > 45.0)
                return 1.0;
            else return Math.Tanh(n);
        }



    }
}
