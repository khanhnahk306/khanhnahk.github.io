   M S B A M L   `   `   `  ����F  BChat_Client, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:WpfApp1WpfApp1  5   	   G(clr-namespace:Chat_Client.MVVM.ViewModelChat_Client.MVVM.ViewModel  5   	       WpfApp1.MainWindow   5   	   W SPresentationCore, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35e aSystem.Windows.Controls.Ribbon, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089R NWindowsBase, Version=6.0.2.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35F 9http://schemas.microsoft.com/winfx/2006/xaml/presentation     5   	   R NSystem.Xaml, Version=6.0.2.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:WpfApp1     5   	   >	viewmodel(clr-namespace:Chat_Client.MVVM.ViewModel     5   	     � Title$
  Chat��5	   	   $	��400��6   $	��800��6#    � DataContext 5      .  (Chat_Client.MVVM.ViewModel.MainViewModel  5   
   .��5      �  � ColumnDefinitions 5   
   �� 5      $	��200 �6   6-   �� 5      $	��600 �6   6-   .+�5   
   ]� .+�5      �� $
��Name��6   $	��Top=�6#   $��30��68   $��
10 10 10 0q�6D   6Z   �� 5      $	��Top=�6U   $��30��6j   $��
10 0 10 10q�6v   ��6   �� *
Username+ �� UpdateSourceTrigger$ PropertyChanged=�6�   �� 5      $��Connect��6   $	��Top=�6R   $��30��6g   $��10 10 10 10q�6s   ��6'   �� *ConnectToServerCommand+6�   �� 5      $��	10 0 10 2q�65   ��6   �� *Users+��5      �� 5      .R�5      �� ��6$   �� *
Username+6@   5      5      5       �� 5"   
   $��1��6   .+�5#      �� -   5        $��lv_DislayMessage��5#      $	��290��6P   $	��570��6]   $��0 10 0 0q�6i   ��6/   �� *
Messages+6~   �� 5$       �� Orientation$ 
Horizontal=�6   .+�5%      �� -   5        $��tb_WriteMessage��5%      $��50��6�   $	��480��6�   $��15 10 10 10q�6�   ��61   �� *	Message+$ PropertyChanged=�6�   �� 5&      -   5        $��btn_send��5&      $
��Send��6P   $��50��6t   $��80��6�   ��6)   �� *SendMessageCommand+6�   5'      5(      5*      5+      