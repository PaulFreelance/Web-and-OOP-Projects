﻿
namespace ReteaNeuronala
{
    partial class NeuronGraf
    {
        /// <summary> 
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Component Designer generated code

        /// <summary> 
        /// Required method for Designer support - do not modify 
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.neuron = new System.Windows.Forms.Button();
            this.neuron2 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.button5 = new System.Windows.Forms.Button();
            this.button6 = new System.Windows.Forms.Button();
            this.button7 = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.reteaNouaBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.reteaNouaBindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // neuron
            // 
            this.neuron.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.neuron.Location = new System.Drawing.Point(39, 50);
            this.neuron.Margin = new System.Windows.Forms.Padding(3, 3, 3, 0);
            this.neuron.Name = "neuron";
            this.neuron.Size = new System.Drawing.Size(24, 23);
            this.neuron.TabIndex = 1;
            this.neuron.UseVisualStyleBackColor = false;
            this.neuron.LocationChanged += new System.EventHandler(this.neuron_Click);
            this.neuron.Click += new System.EventHandler(this.neuron_Click);
            // 
            // neuron2
            // 
            this.neuron2.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.neuron2.Location = new System.Drawing.Point(39, 165);
            this.neuron2.Margin = new System.Windows.Forms.Padding(3, 3, 3, 0);
            this.neuron2.Name = "neuron2";
            this.neuron2.Size = new System.Drawing.Size(24, 23);
            this.neuron2.TabIndex = 2;
            this.neuron2.UseVisualStyleBackColor = false;
            this.neuron2.Click += new System.EventHandler(this.neuron2_Click);
            // 
            // button2
            // 
            this.button2.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.button2.Location = new System.Drawing.Point(213, 19);
            this.button2.Margin = new System.Windows.Forms.Padding(3, 3, 3, 0);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(24, 23);
            this.button2.TabIndex = 3;
            this.button2.UseVisualStyleBackColor = false;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.button3.Location = new System.Drawing.Point(213, 120);
            this.button3.Margin = new System.Windows.Forms.Padding(3, 3, 3, 0);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(24, 23);
            this.button3.TabIndex = 4;
            this.button3.UseVisualStyleBackColor = false;
            this.button3.LocationChanged += new System.EventHandler(this.button3_Click);
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // button4
            // 
            this.button4.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.button4.Location = new System.Drawing.Point(213, 216);
            this.button4.Margin = new System.Windows.Forms.Padding(3, 3, 3, 0);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(24, 23);
            this.button4.TabIndex = 5;
            this.button4.UseVisualStyleBackColor = false;
            this.button4.Click += new System.EventHandler(this.button4_Click);
            // 
            // button5
            // 
            this.button5.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.button5.Location = new System.Drawing.Point(369, 73);
            this.button5.Margin = new System.Windows.Forms.Padding(3, 3, 3, 0);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(24, 23);
            this.button5.TabIndex = 6;
            this.button5.UseVisualStyleBackColor = false;
            this.button5.Click += new System.EventHandler(this.button5_Click);
            // 
            // button6
            // 
            this.button6.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.button6.Location = new System.Drawing.Point(369, 133);
            this.button6.Margin = new System.Windows.Forms.Padding(3, 3, 3, 0);
            this.button6.Name = "button6";
            this.button6.Size = new System.Drawing.Size(24, 23);
            this.button6.TabIndex = 7;
            this.button6.UseVisualStyleBackColor = false;
            this.button6.Click += new System.EventHandler(this.button6_Click);
            // 
            // button7
            // 
            this.button7.BackColor = System.Drawing.SystemColors.MenuHighlight;
            this.button7.Location = new System.Drawing.Point(369, 197);
            this.button7.Margin = new System.Windows.Forms.Padding(3, 3, 3, 0);
            this.button7.Name = "button7";
            this.button7.Size = new System.Drawing.Size(24, 23);
            this.button7.TabIndex = 8;
            this.button7.UseVisualStyleBackColor = false;
            this.button7.Click += new System.EventHandler(this.button7_Click);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.neuron);
            this.panel1.Controls.Add(this.button3);
            this.panel1.Controls.Add(this.button5);
            this.panel1.Controls.Add(this.button6);
            this.panel1.Controls.Add(this.button7);
            this.panel1.Controls.Add(this.neuron2);
            this.panel1.Controls.Add(this.button2);
            this.panel1.Controls.Add(this.button4);
            this.panel1.Location = new System.Drawing.Point(94, 61);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(453, 262);
            this.panel1.TabIndex = 9;
            this.panel1.Paint += new System.Windows.Forms.PaintEventHandler(this.panel1_Paint);
            // 
            // reteaNouaBindingSource
            // 
            this.reteaNouaBindingSource.DataSource = typeof(ReteaNeuronala.ReteaNoua);
            // 
            // NeuronGraf
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.Control;
            this.Controls.Add(this.panel1);
            this.Name = "NeuronGraf";
            this.Size = new System.Drawing.Size(667, 397);
            this.Load += new System.EventHandler(this.NeuronGraf_Load);
            this.panel1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.reteaNouaBindingSource)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.BindingSource reteaNouaBindingSource;
        private System.Windows.Forms.Button neuron;
        private System.Windows.Forms.Button neuron2;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button5;
        private System.Windows.Forms.Button button6;
        private System.Windows.Forms.Button button7;
        private System.Windows.Forms.Panel panel1;
    }
}
