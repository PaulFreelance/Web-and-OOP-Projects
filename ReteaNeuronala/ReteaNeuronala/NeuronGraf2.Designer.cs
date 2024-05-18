
namespace ReteaNeuronala
{
    partial class NeuronGraf2
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
            this.neuron = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // neuron
            // 
            this.neuron.BackColor = System.Drawing.SystemColors.Highlight;
            this.neuron.Location = new System.Drawing.Point(232, 49);
            this.neuron.Name = "neuron";
            this.neuron.Size = new System.Drawing.Size(75, 23);
            this.neuron.TabIndex = 0;
            this.neuron.UseVisualStyleBackColor = false;
            // 
            // NeuronGraf2
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.Controls.Add(this.neuron);
            this.Name = "NeuronGraf2";
            this.Size = new System.Drawing.Size(651, 397);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button neuron;
    }
}
