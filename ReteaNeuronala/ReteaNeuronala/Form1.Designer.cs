
namespace ReteaNeuronala
{
    partial class Form1
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
            this.ReteaNouaButton = new System.Windows.Forms.Button();
            this.CreazaReteabutton = new System.Windows.Forms.Button();
            this.Outputbutton = new System.Windows.Forms.Button();
            this.HLbutton = new System.Windows.Forms.Button();
            this.layerslabel = new System.Windows.Forms.Label();
            this.ecranretea = new System.Windows.Forms.Panel();
            this.SuspendLayout();
            // 
            // ReteaNouaButton
            // 
            this.ReteaNouaButton.Location = new System.Drawing.Point(1, 2);
            this.ReteaNouaButton.Name = "ReteaNouaButton";
            this.ReteaNouaButton.Size = new System.Drawing.Size(118, 95);
            this.ReteaNouaButton.TabIndex = 0;
            this.ReteaNouaButton.Text = "Retea Noua";
            this.ReteaNouaButton.UseVisualStyleBackColor = true;
            this.ReteaNouaButton.Click += new System.EventHandler(this.ReteaNouaButton_Click);
            // 
            // CreazaReteabutton
            // 
            this.CreazaReteabutton.Location = new System.Drawing.Point(1, 114);
            this.CreazaReteabutton.Name = "CreazaReteabutton";
            this.CreazaReteabutton.Size = new System.Drawing.Size(118, 95);
            this.CreazaReteabutton.TabIndex = 1;
            this.CreazaReteabutton.Text = "Creare Retea";
            this.CreazaReteabutton.UseVisualStyleBackColor = true;
            this.CreazaReteabutton.Click += new System.EventHandler(this.CreazaReteabutton_Click);
            // 
            // Outputbutton
            // 
            this.Outputbutton.Location = new System.Drawing.Point(693, 2);
            this.Outputbutton.Name = "Outputbutton";
            this.Outputbutton.Size = new System.Drawing.Size(105, 33);
            this.Outputbutton.TabIndex = 2;
            this.Outputbutton.Text = "Output";
            this.Outputbutton.UseVisualStyleBackColor = true;
            this.Outputbutton.Click += new System.EventHandler(this.Outputbutton_Click);
            // 
            // HLbutton
            // 
            this.HLbutton.Location = new System.Drawing.Point(582, 2);
            this.HLbutton.Name = "HLbutton";
            this.HLbutton.Size = new System.Drawing.Size(105, 33);
            this.HLbutton.TabIndex = 3;
            this.HLbutton.Text = "HL";
            this.HLbutton.UseVisualStyleBackColor = true;
            // 
            // layerslabel
            // 
            this.layerslabel.AutoSize = true;
            this.layerslabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.layerslabel.Location = new System.Drawing.Point(182, 9);
            this.layerslabel.Name = "layerslabel";
            this.layerslabel.Size = new System.Drawing.Size(57, 17);
            this.layerslabel.TabIndex = 4;
            this.layerslabel.Text = "Layers";
            // 
            // ecranretea
            // 
            this.ecranretea.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.ecranretea.Location = new System.Drawing.Point(137, 41);
            this.ecranretea.Name = "ecranretea";
            this.ecranretea.Size = new System.Drawing.Size(651, 397);
            this.ecranretea.TabIndex = 5;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.ecranretea);
            this.Controls.Add(this.layerslabel);
            this.Controls.Add(this.HLbutton);
            this.Controls.Add(this.Outputbutton);
            this.Controls.Add(this.CreazaReteabutton);
            this.Controls.Add(this.ReteaNouaButton);
            this.Name = "Form1";
            this.Text = "Retea Neuronala";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button ReteaNouaButton;
        private System.Windows.Forms.Button CreazaReteabutton;
        private System.Windows.Forms.Button Outputbutton;
        private System.Windows.Forms.Button HLbutton;
        private System.Windows.Forms.Label layerslabel;
        private System.Windows.Forms.Panel ecranretea;
    }
}

