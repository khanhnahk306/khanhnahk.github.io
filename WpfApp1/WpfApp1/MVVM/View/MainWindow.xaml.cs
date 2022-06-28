using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WpfApp1
{
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        public void Log(string text)
        {
            string path = AppDomain.CurrentDomain.BaseDirectory + "LogFile.txt";
            if (System.IO.File.Exists(path))
            {
                System.IO.File.AppendAllText(path, " " + DateTime.Now.ToString() + " "+ text +  Environment.NewLine);
            }
            else { }
        }

        private void tb_displayFriendBox_TextChanged(object sender, TextChangedEventArgs e)
        {
             
        }
        private void Button_Click(object sender, RoutedEventArgs e)
        {
        }
        private void Click_Start_Logging(object sender, RoutedEventArgs e)
        {
            Log("start");
   
        }
    }
}
