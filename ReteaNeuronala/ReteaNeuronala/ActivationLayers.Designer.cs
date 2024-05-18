
namespace ReteaNeuronala
{
    partial class ActivationLayers
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

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Close = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.IF = new System.Windows.Forms.ComboBox();
            this.AF = new System.Windows.Forms.ComboBox();
            this.OF = new System.Windows.Forms.ComboBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.numericTeta = new System.Windows.Forms.NumericUpDown();
            this.numericG = new System.Windows.Forms.NumericUpDown();
            ((System.ComponentModel.ISupportInitialize)(this.numericTeta)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.numericG)).BeginInit();
            this.SuspendLayout();
            // 
            // Close
            // 
            this.Close.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Close.Location = new System.Drawing.Point(151, 270);
            this.Close.Name = "Close";
            this.Close.Size = new System.Drawing.Size(75, 23);
            this.Close.TabIndex = 0;
            this.Close.Text = "Close";
            this.Close.UseVisualStyleBackColor = true;
            this.Close.Click += new System.EventHandler(this.Close_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(136, 40);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(119, 17);
            this.label1.TabIndex = 1;
            this.label1.Text = "Functia de intrare";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(136, 100);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(128, 17);
            this.label2.TabIndex = 2;
            this.label2.Text = "Functia de activare";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(136, 152);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(112, 17);
            this.label3.TabIndex = 3;
            this.label3.Text = "Functia de iesire";
            // 
            // IF
            // 
            this.IF.FormattingEnabled = true;
            this.IF.Location = new System.Drawing.Point(139, 72);
            this.IF.Name = "IF";
            this.IF.Size = new System.Drawing.Size(152, 24);
            this.IF.TabIndex = 4;
            this.IF.Text = "suma";
            this.IF.SelectedIndexChanged += new System.EventHandler(this.IF_SelectedIndexChanged);
            // 
            // AF
            // 
            this.AF.FormattingEnabled = true;
            this.AF.Items.AddRange(new object[] {
            "treapta",
            "sigmoidala",
            "tanh",
            "max"});
            this.AF.Location = new System.Drawing.Point(139, 125);
            this.AF.Name = "AF";
            this.AF.Size = new System.Drawing.Size(152, 24);
            this.AF.TabIndex = 5;
            this.AF.Text = "sigmoidal";
            this.AF.SelectedIndexChanged += new System.EventHandler(this.AF_SelectedIndexChanged);
            // 
            // OF
            // 
            this.OF.FormattingEnabled = true;
            this.OF.Location = new System.Drawing.Point(139, 185);
            this.OF.Name = "OF";
            this.OF.Size = new System.Drawing.Size(152, 24);
            this.OF.TabIndex = 6;
            this.OF.Text = "real";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(30, 207);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(37, 17);
            this.label4.TabIndex = 9;
            this.label4.Text = "Teta";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(278, 210);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(19, 17);
            this.label5.TabIndex = 10;
            this.label5.Text = "G";
            // 
            // numericTeta
            // 
            this.numericTeta.DecimalPlaces = 1;
            this.numericTeta.Hexadecimal = true;
            this.numericTeta.Location = new System.Drawing.Point(33, 227);
            this.numericTeta.Name = "numericTeta";
            this.numericTeta.Size = new System.Drawing.Size(120, 22);
            this.numericTeta.TabIndex = 11;
            this.numericTeta.Value = new decimal(new int[] {
            1,
            0,
            0,
            0});
            // 
            // numericG
            // 
            this.numericG.DecimalPlaces = 1;
            this.numericG.Location = new System.Drawing.Point(281, 230);
            this.numericG.Name = "numericG";
            this.numericG.Size = new System.Drawing.Size(120, 22);
            this.numericG.TabIndex = 12;
            this.numericG.Value = new decimal(new int[] {
            1,
            0,
            0,
            0});
            // 
            // ActivationLayers
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(415, 345);
            this.Controls.Add(this.numericG);
            this.Controls.Add(this.numericTeta);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.OF);
            this.Controls.Add(this.AF);
            this.Controls.Add(this.IF);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Close);
            this.Name = "ActivationLayers";
            this.Text = "ActivationLayers";
            ((System.ComponentModel.ISupportInitialize)(this.numericTeta)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.numericG)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Close;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.ComboBox IF;
        private System.Windows.Forms.ComboBox AF;
        private System.Windows.Forms.ComboBox OF;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.NumericUpDown numericTeta;
        private System.Windows.Forms.NumericUpDown numericG;
    }
}